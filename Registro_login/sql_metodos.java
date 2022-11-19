/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
//import com.sun.jdi.connect.spi.Connection; ////
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Connection; //
  

 
public class sql_metodos {
    
    public static ConexionBD conexion= new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNumero=0;
    
    
    
    
    public int guardar(String nombre, String apellidos, String correo, String contraseña){
    
        int resultado=0;
        Connection conexion= null;
        
        String sentencia_guardar = ("INSERT INTO usuarios(nombre,apellidos,correo,contraseña) VALUES(?,?,?,?)");
        
        try{
            conexion= ConexionBD.conectar();
            
            sentencia_preparada= conexion.prepareStatement(sentencia_guardar);  
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);
            
            resultado= sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            
            conexion.close();
            
        }catch(SQLException e){
            
           // System.out.println(e);
        }
        
      
        return resultado;
    }
    
    
    public static String BuscarNombre(String correo){
        
        String busqueda_nombre= null;
        Connection conexion = null; 
        
        try{
            conexion = ConexionBD.conectar();
            String sentencia_buscar= ("SELECT nombre, apellidos FROM usuarios WHERE correo= '"+correo+"'");
            sentencia_preparada= conexion.prepareStatement(sentencia_buscar); 
            resultado= sentencia_preparada.executeQuery();
            
            if(resultado.next()){
                String nombre= resultado.getString("nombre");
                String apellidos= resultado.getString("apellidos");
                busqueda_nombre=( nombre +" "+ apellidos) ;
                conexion.close();
               
            }
            
                    
        }catch (SQLException e){
         //   System.out.println(e);
        }
        
        return busqueda_nombre;
        
        }
        
    
    public static String buscarUsuarioRegistrado (String correo, String contraseña){
    
        String busqueda_usuario= null;
        Connection conexion= null;
        
        try{
            conexion= ConexionBD.conectar();
            String sentencia_buscar_usuario= ("SELECT nombre, correo, contraseña FROM usuarios WHERE correo= '" +correo+ "' && contraseña= '" +contraseña+ "'");         
            sentencia_preparada= conexion.prepareStatement(sentencia_buscar_usuario);
            
            resultado=sentencia_preparada.executeQuery();
            
            if(resultado.next()){
            busqueda_usuario= "Usuario encontrado";
            }else{
            busqueda_usuario= "Usuario NO encontrado";
            }
            
            conexion.close();
            
        }catch (SQLException e){
         //   System.out.println(e);
        }
        return busqueda_usuario;
    }
    
    
}
    






























/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author katy alvarado
 */
/*
public class sql_metodos {
    
    Connection conexion = new Connection;
    
    String usuario ="root";
    String contraseña ="root";
    String bd ="loginbased";
    String ip ="localhost";  
    String puerto ="3306";
 
    
    String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
        try{
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "la conexion se ha realizado con éxito");
            
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "error: "+e.toString());
        
        }
        return conexion;
    }
    
    //public static ConexionBD= new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNumero=0;
    
    
        public int guardar(String nombre, String apellidos, String correo, String contraseña){
    
        int resultado=0;
       // Connection conexion= null;
        
        String sentencia_guardar = ("INSERT INTO usuarios(nombre,apellidos,correo,contraseña) VALUES(?,?,?,?)");
        
        try{
            conexion= ConexionBD.conectar();
            
            sentencia_preparada= conexion.prepareStatement(sentencia_guardar);  
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);
            
            resultado= sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            
            conexion.close();
            
        }catch(SQLException e){
            
           // System.out.println(e);
        }
        
      
        return resultado;
    }
    
    
    public static String BuscarNombre(String correo){
        
        String busqueda_nombre= null;
        Connection conexion = null; 
        
        try{
            conexion = ConexionBD.conectar();
            String sentencia_buscar= ("SELECT nombre, apellidos FROM usuarios WHERE correo= '"+correo+"'");
            sentencia_preparada= conexion.prepareStatement(sentencia_buscar); 
            resultado= sentencia_preparada.executeQuery();
            
            if(resultado.next()){
                String nombre= resultado.getString("nombre");
                String apellidos= resultado.getString("apellidos");
                busqueda_nombre=( nombre +" "+ apellidos) ;
                conexion.close();
               
            }
            
                    
        }catch (SQLException e){
         //   System.out.println(e);
        }
        
        return busqueda_nombre;
        
        }
        
    
    public static String buscarUsuarioRegistrado (String correo, String contraseña){
    
        String busqueda_usuario= null;
        Connection conexion= null;
        
        try{
            
            conexion=  ConexionBD.conectar();
            
            String sentencia_buscar_usuario= ("SELECT nombre, correo, contraseña FROM usuarios WHERE correo= '" +correo+ "' && contraseña= '" +contraseña+ "'");         
            sentencia_preparada= conexion.prepareStatement(sentencia_buscar_usuario);
            
            resultado=sentencia_preparada.executeQuery();
            
            if(resultado.next()){
            busqueda_usuario= "Usuario encontrado";
            }else{
            busqueda_usuario= "Usuario NO encontrado";
            }
            
            conexion.close();
            
        }catch (SQLException e){
         //   System.out.println(e);
        }
        return busqueda_usuario;
        
    }
    
    
    
    
    
    
 } */  


    
    
    

    
    
