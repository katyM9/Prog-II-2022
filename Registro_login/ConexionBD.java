/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author katy alvarado
 */
public class ConexionBD {
    
    public static String url= "jdbc:mysql://localhost:3306/loginbased";
    public static String usuario= "root";
    public static String contraseña="root";
    public static String clase= "com.mysql.jc.jdbc.Driver";
    
    
    
    public static Connection conectar(){
        
        Connection conexion =null;
        
        try{
            
            //Class.forName(clase);
            conexion = DriverManager.getConnection(url,usuario,contraseña);
           // conexion= Driver
            System.out.println("conexion establecida");
            
            
       // }catch (e){
            System.out.println();
        
    }   catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return conexion;
    
    }

  
    
}
