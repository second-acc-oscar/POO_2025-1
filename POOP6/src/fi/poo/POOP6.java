/*
 * Click nbfs //nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 * Clase principal que ejecuta mediante el método principal la lógica del programa para la práctica seis.
 * 
 * @author Oscar Cabrera
 */
public class POOP6 {
    
    /**
     * Método principal que da incio a la lógica de la aplicación.
     * 
     * Explora el uso de las clases desarrolladas.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Coche coche = new Coche();
        Coche coche2 = new Coche("azul", "Porche", "MX-669");
        
        System.out.println(coche);
        System.out.println(coche2);
    }
}
