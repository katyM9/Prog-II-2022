/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propiaexception;

/**
 *
 * @author katy alvarado
 */
public class PropiaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usuario, contraseña, confcontraseña;
        
        usuario= "Katy Alvarado";
        contraseña= "abc";
        confcontraseña= "123";
        
        MiHelper h =new MiHelper();
        
        try{
        
            h.validarcontraseña(contraseña, confcontraseña);
            System.out.println("Usuario registrado con exito\n Bienvenido(a) "+usuario);
           
        }catch(MyException e){
        
           // System.out.println("Error al registrar el usuario, : "+e.getMessage());
           e.printStackTrace();
        }
        
        
       
      
    }
    
}
