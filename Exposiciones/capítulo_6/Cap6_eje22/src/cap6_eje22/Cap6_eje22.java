/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap6_eje22;

import java.util.Scanner;

/**
 *
 * @author katy alvarado
 */
public class Cap6_eje22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner grados =  new Scanner(System.in);
       double celcius, fah;
        
       System.out.print("DIGITE GRADOS CELCIUS PARA CONVERTIRLOS A FARENHEIT: ");
        celcius = grados.nextDouble();
        fah = (celcius * 9/5) + 32;
        System.out.println( celcius + " GRADOS CELCIUS EQUIVALE A " + fah + " GRADOS FARENHEIT.");
    
        
    }
    
}
