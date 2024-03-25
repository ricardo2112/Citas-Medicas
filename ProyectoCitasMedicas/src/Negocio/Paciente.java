
package Negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Paciente {
    private String idCedula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String numeroTelefonico;
    public static List<Paciente> listaPacientes;

    public Paciente() {
    }

    public Paciente(String idCedula, String nombre, String apellido, LocalDate fechaNacimiento, String numeroTelefonico) {
        this.idCedula = idCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefonico = numeroTelefonico;
    }
    
    public String getIdCedula() {
        return idCedula;
    }

    public void setIdCedula(String idCedula) {
        this.idCedula = idCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    
    public void registrar(){
        String consulta = "INSERT INTO Paciente (cedula, apellido, nombre, fechaNacimiento, telefono) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, this.idCedula);
            statement.setString(2, this.apellido);
            statement.setString(3, this.nombre);
            statement.setDate(4, Date.valueOf(this.fechaNacimiento));
            statement.setString(5, this.numeroTelefonico);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "El paciente ha sido guardado correctamente.", "Citas Médicas", JOptionPane.INFORMATION_MESSAGE);
            //Cerrar conexiones
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            if (e.toString().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "El paciente ya se encuentra registrado", "Citas Médicas", JOptionPane.ERROR_MESSAGE);
            }
            System.err.println(e);
        }
    }
    
    public void actualizar() {
        String consulta = "UPDATE Paciente SET apellido = ?, nombre = ?, fechaNacimiento = ?, telefono = ? WHERE cedula = ?";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, this.apellido);
            statement.setString(2, this.nombre);
            statement.setDate(3, Date.valueOf(this.fechaNacimiento));
            statement.setString(4, this.numeroTelefonico);
            statement.setString(5, this.idCedula);
            statement.executeUpdate();
            //Cerrar conexiones
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(String cedula){
        String consulta = "DELETE FROM Paciente WHERE cedula = ?";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, cedula);
            statement.executeUpdate();
            //Cerrar conexiones
            conexion.close();
            statement.close();
            JOptionPane.showMessageDialog(null, "El paciente ha sido eliminado con éxito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            if (e.toString().contains("DELETE RESTRICT ON UPDATE CASCADE")) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar un paciente con citas médicas registradas.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
            System.err.println(e);
        }
    }
    
    public static List<Paciente> getPacientes(){
        listaPacientes = new ArrayList<>();
        String consulta = "SELECT * FROM Paciente";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdCedula(resultSet.getString(1));
                paciente.setApellido(resultSet.getString(2));
                paciente.setNombre(resultSet.getString(3));
                paciente.setFechaNacimiento(resultSet.getDate(4).toLocalDate()); // Convert java.sql.Date to java.time.LocalDate
                paciente.setNumeroTelefonico(resultSet.getString(5));
                listaPacientes.add(paciente);
                
            }
            //Cerrar conexiones
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return listaPacientes;
    }
    
    public static Paciente getPorId(String cedula){
        for (Paciente paciente : listaPacientes) {
            if (paciente.getIdCedula().equals(cedula)) {
                return paciente;
            }
        }
        return null;
    }
    
    public boolean esCedulaValida() {
        String cedula = getIdCedula();

        // Verificar la longitud de la cédula
        if (cedula.length() != 10)
            return false;

        // Verificar que todos los caracteres sean dígitos
        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(cedula.charAt(i)))
                return false;
        }

        // Verificar el código de la provincia
        int codigoProvincia = Integer.parseInt(cedula.substring(0, 2));
        if (codigoProvincia < 1 || codigoProvincia > 24)
            return false;

        // Verificar el dígito verificador
        int suma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cedula.charAt(i));
            if (i % 2 == 0) {
                digito *= 2;
                if (digito > 9)
                    digito -= 9;
            }
            suma += digito;
        }
        int digitoCalculado = 10 - (suma % 10);
        if (digitoCalculado == 10)
            digitoCalculado = 0;
        int digitoProvisto = Character.getNumericValue(cedula.charAt(9));
        
        return digitoCalculado == digitoProvisto;
    }

}



