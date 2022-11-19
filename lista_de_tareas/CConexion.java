/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author katy alvarado
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario ="root";
    String contraseña ="root";
    String bd ="bdclases";
    String ip ="localhost";  
    String puerto ="3306";
 
    
    String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "la conexion se ha realizado con éxito");
            
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "error: "+e.toString());
        
        }
        return conectar;
    }
    
    
    
}
