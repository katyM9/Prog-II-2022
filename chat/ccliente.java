/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author katy alvarado
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ccliente implements Runnable{
    
    private String host;
    private int puerto;
    private String mensaje;
    
    public ccliente(String host, int puerto, String mensaje){
        
        this.puerto= puerto;
        this.mensaje= mensaje;
        this.host= host;
        
    }
    
    
    
    @Override
    public void run() {

            DataOutputStream out;
            
         try {    
             
          Socket sc = new Socket(host, puerto); 
          
                 out= new DataOutputStream(sc.getOutputStream());
                 
                 out.writeUTF(mensaje);
                 
                 sc.close(); //error¿?
             } catch (IOException ex) {
            Logger.getLogger(ccliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }

}      
