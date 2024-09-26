/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa un punto en un plano cartesiano.
 * 
 * @author Oscar Cabrera
 */
public class Punto {
    
    /**
     * Coordenada en el eje de las abcisas del Punto.
     */
    int x;
    
    /**
     * Coordenada en el eje de las ordenadas del Punto.
     */
    int y;
    
    /**
     * Nombre del Punto.
     */
    String nombre;
    
    // El compilador automáticamente asigna un constructor vacío cuando no está definido
    // Por buena pràctica, definir siempre el vacìo y el lleno
    
    /**
     * Crea una nueva instancia de Punto vacía.
     */
    public Punto() {
        x = 0;
        y = 0;
        nombre = null;
    }
    
    /**
     * Crea una nueva instancia de Punto llena.
     * 
     * @param x Coordenada en el eje de las abscisas del Punto.
     * @param y Coordenada en el eje de las ordenadas del Punto.
     * @param nombre Nombre del punto.
     */
    public Punto(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }
    
    /**
     * Imprime en pantalla la información de la instancia Punto.
     */
    public void imprimePunto() {
        System.out.print("Nombre:\t" + nombre +"\t( x = " + x + " , y = " + y + " )\n");
    }
}
