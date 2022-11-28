/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propiaexception;

/** 
 *
 * @author katy alvarado
 */
public class MyException extends Exception{
    
    public static final long serialVersionUID= 700L;
    
    public MyException(String mensaje){
        
        super(mensaje);
    }
    
}
