/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
EJERCICIO 3.15 (Eliminar código duplicado en el método main) En la clase PruebaCuenta de la figura 3.9, el método main
contiene seis instrucciones (líneas 13-14, 15-16, 28-29, 30-31, 40-41 y 42-43), cada una de las cuales muestra en 
pantalla el nombre y saldo de un objeto Cuenta. Estudie estas instrucciones y notará que difieren sólo en el objeto 
Cuenta que se está manipulando: cuenta1 o cuenta2. En este ejercicio definirá un nuevo método mostrarCuenta que
M03_DEITEL_COMO-PROGRAMAR-EN-JAVA_SE_10ED_C3_069-100_3802-1.indd 98 5/4/16 11:27 AM
Marcando la diferencia 99
contiene una copia de esa instrucción de salida. El parámetro del método será un objeto Cuenta y el método imprimirá en pantalla el nombre y saldo de ese objeto. Después usted sustituirá las seis instrucciones duplicadas en main con
llamadas a mostrarCuenta, pasando como argumento el objeto Cuenta específico a mostrar en pantalla.
Modifique la clase PruebaCuenta de la figura 3.9 para declarar el siguiente método mostrarCuenta después de
la llave derecha de cierre de main y antes de la llave derecha de cierre de la clase PruebaCuenta
 */
package cap3_ej15;
import java.util.Scanner;
/**
 *
 * @author katy alvarado
 */

public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        // muestra el saldo inicial de cada objeto
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        /*System.out.printf("Saldo de %s: $%.2f%n",
        cuenta1.obtenerNombre(), cuenta1.obtenerSaldo()); 
        cuenta1.obtenerSaldo();
        System.out.printf("Saldo de %s: $%.2f%n%n",
        cuenta2.obtenerNombre(), cuenta2.obtenerSaldo()); 
        cuenta2.obtenerSaldo();*/

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
        montoDeposito);
        cuenta1.depositar(montoDeposito);

        // muestra los saldos
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        /*System.out.printf("Saldo de %s: $%.2f%n",
        cuenta1.obtenerNombre(), cuenta1.obtenerSaldo()); 
        cuenta1.obtenerSaldo();
        System.out.printf("Saldo de %s: $%.2f%n%n",
        cuenta2.obtenerNombre(), cuenta2.obtenerSaldo()); 
        cuenta2.obtenerSaldo();*/

        System.out.print("Escriba el monto a depositar para cuenta2: "); 
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
        montoDeposito);
        cuenta2.depositar(montoDeposito); 

        // muestra los saldos
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        /*System.out.printf("Saldo de %s: $%.2f%n",cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        cuenta1.obtenerSaldo();
        System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        cuenta2.obtenerSaldo();*/
        } // fin de main
    public static void mostrarCuenta(Cuenta cuentaAMostrar){
        System.out.printf("Saldo de %s: $%.2f%n",cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo()); 
        cuentaAMostrar.obtenerSaldo();
        //System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    }
    
 }
