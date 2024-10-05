/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import zoo.*;

/**
 * Clase principal que ejecuta mediante el método principal la lógica del programa para la práctica siete.
 *
 * @author Oscar Cabrera
 */
public class POOP7 {

    /**
     * Mètodo principal que da inicio a la lógica de la aplicación.
     * 
     * @param args Argumentos en la línea de comandos.
     */
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado( "Emiliano", 342674, 20000f);
        Empleado empleado2 = new Empleado( "Axe", 58241, 30000f);
        System.out.println(empleado);
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        Gerente gerente1 = new Gerente(1000, "Oscar", 321, 40000f);
        System.out.println(gerente1);
        
        Gerente gerente2 = new Gerente();
        System.out.println(gerente2);
        gerente2.setPresupuesto(100);
        System.out.println(gerente2);
        gerente2.setNombre("Alan");
        System.out.println(gerente2);
        System.out.println(gerente2.getNombre());
        
        System.out.println("\n#################### ZOO ####################");
        
        
    }
}
