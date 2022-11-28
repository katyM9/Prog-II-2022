/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap6_ej18;
import java.util.Scanner;

/**
 *
 * @author katy alvarado
 */
public class Cap6_ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner datos = new Scanner(System.in);
       
        System.out.print("INGRESE EL TAMAÑO DEL CUADRADO QUE DESEE: ");
        int n = datos.nextInt();
       
        if(n >= 0 && n<=20) {
 
            for(int i = 0; i < n; i++) {
                System.out.print("*");}

            System.out.println();
           
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int a = 0; a < n-2; a++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           

            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else {
            System.out.println("DEBE INGRESAR UN NUMERO QUE ESTE ENTRE 0 Y 20");
        }
               
  
    }
        
    }
    

