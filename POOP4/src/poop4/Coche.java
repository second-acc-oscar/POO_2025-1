/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

import java.util.Random;

/**
 * Clase que representa a un coche genérico.
 * 
 * @author Oscar Cabrera
 */
public class Coche {
    
    /**
     * Nombre de la marca que fabricó al Coche.
     */
    String marca;

    /**
     * Nombre del color principal del Coche.
     */
    String color;

    /**
     * Número de cilindros de potencia que tiene el Coche.
     */
    int cilindraje;

    /**
     * Número de ruedas que tiene el Coche.
     */
    int numeroDeRuedas;

    /**
     * Representación en cadena de las placas automovilísticas del Coche.
     */
    String placas;

    /**
     * Crea una nueva instancia de Coche vacía.
     */
    public Coche() {

    }

    /**
     * Crea una nueva instancia de Coche llena.
     * 
     * @param marca Nombre de la marca que fabricó al Coche.
     * @param color Nombre del color principal del Coche.
     * @param cilindraje Número de cilindros de potencia que tiene el Coche.
     * @param numeroDeRuedas Número de ruedas que tiene el Coche.
     * @param placas Placas automovilísticas del Coche.
     */
    public Coche ( String marca, String color, int cilindraje, int numeroDeRuedas, String placas ) {
        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
        this.numeroDeRuedas = numeroDeRuedas;
        this.placas = placas;
    }

    /**
     * Método que hace acelerar al Coche una cantidad de velocidad fija y pre-establecida.
     * 
     * @param velocidadActual Velocidad en kilómetros por hora que tiene el Coche antes de acelerar.
     * @return Velocidad en kilómetros por hora que tiene el Coche después de acelerar.
     */
    int acelerar( int velocidadActual ) {
        Random rm = new Random();

        int incremento = rm.nextInt(1, 9);
        velocidadActual += incremento;

        System.out.println("Aceleró " + incremento + " [km/h] para tener una velocidad final de " + velocidadActual + " [km/h].");

        return velocidadActual;
    }

    /**
     * Método que hace frenar al Coche una cantidad de velocidad fija y pre-establecida.
     * 
     * @param velocidadActual Velocidad en kilómetros por hora que tiene el Coche antes de frenar.
     * @return Valocidad en kilómetros por hora que tiene el Coche después de frenar.
     */
    int frenar ( int velocidadActual ) {
        Random rm = new Random();

        int decremento = (-1)*rm.nextInt(1, 9);
        velocidadActual += decremento;

        System.out.println("Frenó " + decremento + " [km/h] para tener una velocidad final de " + velocidadActual + " [km/h].");

        return velocidadActual;
    }

    /**
     * Método que hace al Coche encender sus faros (luces delanteras).
     * 
     * @return {@code true} si se encendieron efectivamente los faros del Coche, o {@code false} si no se encendieron los faros del Coche.
     */
    boolean prenderFaros() {
        Random rm = new Random();
        boolean seEncendieron = rm.nextBoolean();

        if(seEncendieron)
            System.out.println("Se encendieron los faros del coche.");
        else
            System.out.println("No se encendieron los faros del coche.");

        return seEncendieron;
    }

    /**
     * Método que hace al Coche encender sus luces intermitentes.
     * 
     * @return {@code true} si se encendieron efectivamente las luces intermitentes del Coche, o {@code false} si no se encendieron las luces intermitentes del Coche.
     */
    boolean prenderIntermitentes() {
        Random rm = new Random();
        boolean seEncendieron = rm.nextBoolean();

        if(seEncendieron)
            System.out.println("Se encendieron las intermitentes del coche.");
        else
            System.out.println("No se encendieron las intermitentes del coche.");

        return seEncendieron;
    }

    /**
     * Método que hace al Coche limpiar su parabrisas.
     * 
     * @return {@code true} si se activaron los limpiaparabrisas del coche, o {@code false} si no se activaron los limpiaparabrisas del Coche.
     */
    boolean limpiarParabrisas() {
        Random rm = new Random();
        boolean seLimpiaron = rm.nextBoolean();

        if(seLimpiaron)
            System.out.println("Se activaron los limpiaparabrisas del coche.");
        else
            System.out.println("No se activaron los limpiaparabrisas del coche.");

        return seLimpiaron;
    }
}
