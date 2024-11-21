
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBconexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author NEISER
 */
public class DatabaseConnection {
    
     
    private static final String URL="jdbc:mysql://localhost:3306/olla_comun";
    private static final String USER="root";
    private static final String PASSWORD="admin";
    
    
    public static Connection getConnection(){
    Connection connection=null;
    
    try{
        connection= DriverManager.getConnection(URL,USER,PASSWORD);
        System.out.println("Connection established successfully.");
        
    }catch (SQLException e){
        e.printStackTrace();
    
    }
    return connection;
    }
     public static void main(String[] args) {
        // Llamar al método getConnection() para establecer la conexión
        Connection connection = getConnection();
        
        // Aquí puedes realizar operaciones con la conexión, por ejemplo:
        if (connection != null) {
            // Realizar consultas o actualizaciones
            System.out.println("Connection is ready to use.");
        } else {
            System.out.println("Connection failed.");
        }
     }
    
}

    