/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propiaexception;

/**
 *
 * @author katy alvarado
 */
public class MiHelper {
    
    MiHelper(){
        
    }
    
    public void validarcontraseña(String contraseña, String confcontraseña) throws MyException{
     
        if(contraseña.equals(confcontraseña)==false){
        
            throw new MyException("Las claves no coinciden.");
        }
        if(contraseña.length()<5){
            
            throw new MyException("Debe ingresar 5 caracteres como minimo");
        }

    }
}

