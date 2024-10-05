/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

import figuras.*;
import instrumentos.*;
import meses.*;

/**
 * Clase principal que ejecuta mediante el método principal la lógica del programa para la práctica ocho.
 *
 * @author Oscar Cabrera
 */
public class POOP8 {

    /**
     * Método principal que da inicio a la lógica del programa realizado para la Práctica 8.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        mainFiguras();
        mainInstrumentos();
    }
    
    /**
     * Método que hace prueba de las clases desarrolladas en el paquete {@code figuras}.
     */
    public static void mainFiguras() {
        System.out.println("############ Herencia (Figuras) ############");
        
        // Poligono poligono1 = new Poligono();
        Poligono poligono1 = new Triangulo();
        Triangulo triangulo1 = new Triangulo();
        Cuadrilatero cuadrilatero1 = new Cuadrilatero();
        
        System.out.println(poligono1);
        System.out.println(triangulo1);
        System.out.println(cuadrilatero1);
        
        System.out.println( "El área del triangulo1 es: " + triangulo1.area() );
        System.out.println("El perimetro del triangulo1 es: " + triangulo1.perimetro() );
        
        Triangulo triangulo2 = new Triangulo(60, 60, 60, 5, 5, 5, 5, 7.5f);
        
        System.out.println("El perimetro del triangulo2 es: " + triangulo2.perimetro() );
        System.out.println( "El área del triangulo2 es: " + triangulo2.area() );
        
        Cuadrilatero cuadrilatero2 = new Cuadrilatero(90, 90, 5, 5, 5, 5, 5, 5);
        
        System.out.println("El perímetro del cuadrilatero1 es: " + cuadrilatero1.area() );
        System.out.println("El area del cuadrilatero1 es: " + cuadrilatero1.perimetro() );
        
        System.out.println("############ Polimorfismo de objetos (Figuras) ############");
    
/*
        Poligono poligono2 = new Poligono();
        System.out.println("poligono2: " + poligono2 );
*/
        
        Poligono poligono2;
        Triangulo triangulo3 = new Triangulo();
        System.out.println("triangulo3: " + triangulo3 );
        poligono2 = triangulo3;
        System.out.println("triangulo3: " + triangulo3 );
        
        Cuadrilatero cuadrilatero3 = new Cuadrilatero();
        System.out.println("cuadrilatero2: " + cuadrilatero2 );
        
        Object object1 = new Object();
        System.out.println("object1: " + object1 );
        object1 = cuadrilatero3;
        System.out.println("cuadrilatero2: " + cuadrilatero2 );
        
        identificarFiguras( poligono1 );
        identificarFiguras( poligono2 );
        // identificarFiguras( object1 );
    }
    
    /**
     * Método que hace prueba de las clases desarrolladas en el paquete {@code instrumentos}.
     */
    public static void mainInstrumentos() {
        System.out.println("############ Instrumentos ############");
        
        Flauta flauta = new Flauta();
        flauta.tocar();
        flauta.afinar();
        flauta.tipoDeInstrumento();
    }
    
    /**
     * Método que hace prueba de las clases desarrolladas en el paquete {@code meses}.
     */
    public static void mainMeses() {
        System.out.println("############ Meses ############");
        
        System.out.println( Math.PI );
        System.out.println( Meses.UNO );
        System.out.println( Meses.MESES[ Meses.TRES ] );
    }
    
    /**
     * Método que, dada una instancia de Poligono, imprime a qué particularización pertenece de entre las desarrolladas en la práctica: Triangulo o Cuadrilatero. El resultado lo imprime en pantalla.
     * 
     * @param poligono La instancia de Poligono que se quiere evaluar.
     */
    public static void identificarFiguras( Poligono poligono ) {
        if( poligono instanceof Triangulo )
            System.out.println("Instancia de Triangulo.");
        else
            if( poligono instanceof Cuadrilatero )
                System.out.println("Instancia de Cuadrilatero.");
    }
}
