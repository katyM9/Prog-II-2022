/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author katy alvarado
 */
public class Sservidor extends Observable implements Runnable{


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private int puerto;
    
    public Sservidor (int puerto){
        
        this.puerto= puerto;
        
        
    }
    

    @Override
    public void run() {
        
         ServerSocket servidor =null;
            Socket sc= null;
            
            DataInputStream in;
            //DataOutputStream out; supuesto error
            
            
     try {        
            servidor= new ServerSocket(puerto);
            
            System.out.println("servidor iniciado");
            
            while(true){
                
                sc= servidor.accept();
                
                System.out.println("cliente conectado");
                
                in= new DataInputStream(sc.getInputStream());
               
                String mensaje = in.readUTF();//queda a la espera
                
                System.out.println(mensaje);
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                
               // sc.close();error
                
                System.out.println("cliente desconectado");//error
                
                
            }
        
      } catch (IOException ex) {
            Logger.getLogger(Sservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
