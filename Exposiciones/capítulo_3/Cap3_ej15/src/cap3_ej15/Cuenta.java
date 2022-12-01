/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap3_ej15;
 
/**
 *
 * @author katy alvarado
 */

    public class Cuenta{
    private String nombre; 
    private double saldo;
 
    public Cuenta(String nombre, double saldo)
    { 
    this.nombre = nombre; 

    if (saldo > 0.0) 
    this.saldo = saldo; 
    }

    public void depositar(double montoDeposito)
    {
    if (montoDeposito > 0.0) 
    saldo = saldo + montoDeposito;
    }

    public double obtenerSaldo()
    {
    return saldo;
    }

    public void establecerNombre(String nombre)
    {
    this.nombre = nombre;
    }

    public String obtenerNombre()
    {
    return nombre; 
    } 
} 