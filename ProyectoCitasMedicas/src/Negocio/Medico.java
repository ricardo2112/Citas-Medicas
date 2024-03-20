
package Negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Medico {
    private int id;
    private String nombre;
    private String apellido;
    private String especialidad;
    private int consultorio;
    private String numeroTelefonico;
    private List<Horario> horarios; 
    public static List<Medico> listaMedicos;
    
    public Medico() {
    
    }

    public Medico(String nombre, String apellido, String especialidad, int consultorio, String numeroTelefonico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.numeroTelefonico = numeroTelefonico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    
    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public void registrar() {
        String consulta = "INSERT INTO Medico (apellido, nombre, especialidad, consultorio, telefono) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, this.getApellido());
            statement.setString(2, this.getNombre());
            statement.setString(3, this.getEspecialidad());
            statement.setInt(4, this.getConsultorio());
            statement.setString(5, this.getNumeroTelefonico());
            statement.executeUpdate();
            // Cerrar conexiones
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void actualizar() {
        String consulta = "UPDATE Medico SET apellido = ?, nombre = ?, especialidad = ?, consultorio = ?, telefono = ? WHERE id=?";
        try (Connection conexion = Conexion.getConexion();
             PreparedStatement statement = conexion.prepareStatement(consulta)) {
    
            statement.setString(1, this.getApellido());
            statement.setString(2, this.getNombre());
            statement.setString(3, this.getEspecialidad());
            statement.setInt(4, this.getConsultorio());
            statement.setString(5, this.getNumeroTelefonico());
            statement.setInt(6, this.getId());
            statement.executeUpdate();
    
        } catch (SQLException e) {
            System.err.println("Error al actualizar el medico: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        String consulta = "DELETE FROM Medico WHERE id=?";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);
            statement.executeUpdate();
            // Cerrar conexiones
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static List<Medico> getMedicos() {
        listaMedicos = new ArrayList<>();
        String consulta = "SELECT * FROM Medico";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Medico medico = new Medico();
                medico.setId(resultSet.getInt(1));
                medico.setApellido(resultSet.getString(2));
                medico.setNombre(resultSet.getString(3));
                medico.setEspecialidad(resultSet.getString(4));
                medico.setConsultorio(resultSet.getInt(5));
                medico.setNumeroTelefonico(resultSet.getString(6));
                medico.setHorarios(Horario.getHorarioPorMedico(medico));
                listaMedicos.add(medico);
            }
            // Cerrar conexiones
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return listaMedicos;
    }
    
    public static Medico getPorId(int id) {
        for (Medico medico : listaMedicos) {
            if (medico.getId() == id) {
                return medico;
            }
        }
        return null;
    }

    public static List<Medico> getPorEspecialidad(String especialidad){
        ArrayList<Medico> medicoPorEspecialidad = new ArrayList<>();
        for (Medico medico : listaMedicos) {
            if (medico.getEspecialidad().toLowerCase().contains(especialidad.toLowerCase())) {
                medicoPorEspecialidad.add(medico);
            }
        }
        return medicoPorEspecialidad;
    }

}
