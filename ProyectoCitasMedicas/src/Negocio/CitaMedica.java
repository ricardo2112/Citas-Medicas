
package Negocio;

import static Negocio.Horario.getHorarioPorDia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CitaMedica {
    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private Paciente paciente;
    private Medico medico;
    public static List<CitaMedica> listaCitasMedicas;

    public CitaMedica() {
    }

    public CitaMedica(int id, LocalDate fecha, LocalTime hora, Paciente paciente, Medico medico) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public void registrar(){
        String consulta = "INSERT INTO CitaMedica (idPaciente, idMedico, fechaCita, hora) VALUES (?, ?, ?, ?)";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, this.paciente.getIdCedula());
            statement.setInt(2, this.medico.getId());
            statement.setDate(3, java.sql.Date.valueOf(this.fecha));
            statement.setTime(4, java.sql.Time.valueOf(this.hora));
            statement.executeUpdate();
            conexion.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
    }
    
    public void cambiarHorario(LocalDate fechaNueva, LocalTime horaNueva){
        String consulta = "UPDATE CitaMedica SET fechaCita = ?, hora = ? WHERE id = ?";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setDate(1, java.sql.Date.valueOf(fechaNueva));
            statement.setTime(2, java.sql.Time.valueOf(horaNueva));
            statement.setInt(3, this.id);
            statement.executeUpdate();
            
            conexion.close();
            statement.close();
            getFechasReservadas(medico);
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
    
    public void cancelarCita(int id){
        String consulta = "DELETE FROM CitaMedica WHERE id = ?";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);
            statement.executeUpdate();
            
            conexion.close();
            statement.close();
            getFechasReservadas(medico);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static List<CitaMedica> getCitasMedicas(){
        listaCitasMedicas = new ArrayList<>();
        String consulta = "SELECT id, idPaciente, idMedico, fechaCita, hora FROM CitaMedica ORDER BY fechaCita desc";
        try {
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {                
                CitaMedica citaMedica = new CitaMedica();
                citaMedica.setId(resultSet.getInt(1));
                citaMedica.setPaciente(Paciente.getPorId(resultSet.getString(2)));
                citaMedica.setMedico(Medico.getPorId(resultSet.getInt(3)));
                citaMedica.setFecha(LocalDate.parse(resultSet.getString(4)));
                citaMedica.setHora(LocalTime.parse(resultSet.getString(5)));
                listaCitasMedicas.add(citaMedica);
            }
            conexion.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return listaCitasMedicas;
    }
    
    public static CitaMedica getCitaPorId(int id){
        for (CitaMedica citaMedica : listaCitasMedicas) {
            if (citaMedica.getId() == id) {
                return citaMedica;
            }
        }
        return null;
    }
    
    public static List<CitaMedica> getCitasMedicasPorPaciente(String idPaciente){
        List<CitaMedica> citasPaciente = new ArrayList<>();
        for (CitaMedica citaMedica : listaCitasMedicas) {
            if (citaMedica.getPaciente().getIdCedula().contains(idPaciente)) {
                citasPaciente.add(citaMedica);
            }
        }
        citasPaciente.sort(Comparator.comparing(CitaMedica::getFecha)); // Sort by date
        return citasPaciente;
    }

    public static List<CitaMedica> getCitasMedicasPorMedico(String nombreCompleto) {
        List<CitaMedica> citasMedico = new ArrayList<>();
        for (CitaMedica citaMedica : listaCitasMedicas) {
            String nombreMedico = citaMedica.getMedico().getNombre().toLowerCase() +" "+ citaMedica.getMedico().getApellido().toLowerCase(); // Convertir a minúsculas
            if (nombreMedico.contains(nombreCompleto.toLowerCase())) {
                citasMedico.add(citaMedica);
            }
        }
        citasMedico.sort(Comparator.comparing(CitaMedica::getFecha)); // Ordenar por fecha
        return citasMedico;
    }
    
    public static List<CitaMedica> getFechasReservadas(Medico medico){
        List<CitaMedica> fechasReservadas = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        try {
            String consulta = "SELECT fechaCita, hora FROM CitaMedica WHERE idMedico = ?";
            Connection conexion = Conexion.getConexion();
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, medico.getId());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                CitaMedica citaMedica = new CitaMedica();
                citaMedica.setFecha(resultSet.getDate("fechaCita").toLocalDate());
                citaMedica.setHora(resultSet.getTime("hora").toLocalTime());
                if (citaMedica.getFecha().isAfter(fechaActual) || citaMedica.getFecha().equals(fechaActual)) {
                    fechasReservadas.add(citaMedica);
                }
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return fechasReservadas;
    }
   
    public static List<LocalTime> getHorasDisponibles(LocalDate fecha, Medico medico) {
        List<LocalTime> horasDisponibles = new ArrayList<>();

        int diaSemana = fecha.getDayOfWeek().getValue();// Obtener el día de la semana para la fecha especificada
        List<Horario> horarioDia = getHorarioPorDia(medico, diaSemana);// Obtener el horario de atención del médico para el día específico
        List<CitaMedica> fechasReservadas = getFechasReservadas(medico);// Obtener las fechas reservadas para el médico
        List<LocalTime> horasAtencion = new ArrayList<>();// Crear una lista de todas las horas disponibles en el horario del médico
        
        for (Horario horario : horarioDia) {
            horasAtencion.add(horario.getHora());
        }
        // Filtrar las horas disponibles eliminando las horas reservadas
        for (CitaMedica cita : fechasReservadas) {
            if (cita.getFecha().isEqual(fecha)) {
                horasAtencion.remove(cita.getHora());
            }
        }
        horasDisponibles.addAll(horasAtencion);
        return horasDisponibles;
    }
    
    public boolean esFechaPasada(LocalDate fecha, LocalTime hora){
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        return fecha.isBefore(fechaActual) || (fecha.equals(fechaActual) && hora.isBefore(horaActual));
    }
}
