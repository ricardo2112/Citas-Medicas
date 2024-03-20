
package Negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Horario {
    private int id;
    private int dia;
    private LocalTime hora;
    
    public Horario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime horas) {
        this.hora = horas;
    }
    
    public void registrar(Medico medico){
        String consulta = "INSERT INTO Horario (idMedico, dia, hora) VALUES (?, ?, ?)";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, medico.getId());
            statement.setInt(2, getDia());
            statement.setTime(3, java.sql.Time.valueOf(getHora()));
            statement.executeUpdate();
            
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    public void eliminar(int idMedico, int dia){
        String consulta = "DELETE FROM Horario WHERE idMedico = ? AND dia = ?";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, idMedico);
            statement.setInt(2, dia);
            statement.executeUpdate();
            
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
   
    
    public static List<Horario> getHorarioPorDia(Medico medico, int dia){
        List<Horario> diaAtencion = new ArrayList<>();
        String consulta = "SELECT * FROM Horario WHERE idMedico = ? AND dia = ?";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, medico.getId());
            statement.setInt(2, dia);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Horario atencion = new Horario();
                atencion.setDia(resultSet.getInt("dia"));
                atencion.setHora(resultSet.getTime("hora").toLocalTime());
                diaAtencion.add(atencion);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return diaAtencion;
    }
    
    public static List<Horario> getHorarioPorMedico(Medico medico){
        List<Horario> diaAtencion = new ArrayList<>();
        String consulta = "SELECT * FROM Horario WHERE idMedico = ?";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, medico.getId());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Horario atencion = new Horario();
                atencion.setDia(resultSet.getInt("dia"));
                atencion.setHora(resultSet.getTime("hora").toLocalTime());
                diaAtencion.add(atencion);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return diaAtencion;
    }
    
    public boolean estaDentroHorario(LocalDate fechaSolicitada, LocalTime horaSolicitada){
        return fechaSolicitada.getDayOfWeek().getValue() == this.dia && horaSolicitada.equals(this.hora);
    }

}

    
    

