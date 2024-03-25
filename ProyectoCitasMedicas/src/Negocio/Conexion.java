package Negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    static Connection con = null;
    static Statement statement;
    static ResultSet resultset;
    static PreparedStatement preparedS;
    
    //SIRVE PARA REALIZAR LA CONEXION HACIA LA BASE DE DATOS.
    public static Connection getConexion(){      
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/citasmedicas";
            String user = "root";
            String password = "$itasMedicas21";         
            
            con = DriverManager.getConnection(url, user, password);
            statement = con.createStatement();
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "NO FUE POSIBLE CONECTARSE \n " + e);
            return null;
        }
    }
}
