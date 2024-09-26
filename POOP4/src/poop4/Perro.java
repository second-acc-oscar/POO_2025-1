/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa a un perro genérico.
 * 
 * @author Oscar Cabrera
 */
public class Perro {
    
    /**
     * Nombre del color más representativo del Perro.
     */
    String color;

    /**
     * Tipo de pelaje que tiene el Perro.
     */
    String pelaje;

    /**
     * Tamaño del perro según lo siguiente:
     * <ul>
     *   <li>0-9 el perro se considera de tamaño chico.</li>
     *   <li>10-19 el perro se considera de tamaño mediano.</li>
     *   <li>20+ el perro se considera de tamaño grande.</li>
     * </ul>
     */
    int tamaño;

    /**
     * Nombre de la raza a la que pertenece el Perro.
     */
    String raza;

    /**
     * Número de años de vida del perro.
     */
    int edad;

    /**
     * Crea una nueva instancia de Perro vacía.
     */
    public Perro() {
        color = null;
        pelaje = null;
        tamaño = 0;
        raza = null;
        edad = 0;
    }

    /**
     * Crea una nueva instancia de Perro llena.
     * 
     * @param color Nombre del color más representativo del Perro.
     * @param pelaje Tipo de pejale que tiene el Perro.
     * @param tamaño Tamaño del Perro.
     * @param raza Nombre de la raza del Perro.
     * @param edad Número de años de vida del perro.
     */
    public Perro(String color, String pelaje, int tamaño, String raza, int edad) {
        this.color = color;
        this.pelaje = pelaje;
        this.tamaño = tamaño;
        this.raza = raza;
        this.edad = edad;
    }

    /**
     * Método que hace al perro jugar.
     */
    public void jugar() {
        System.out.println("¡Wuf wuf!");
    }

    /**
     * Método que hace al perro comer.
     * 
     * @return {@code true} Si el Perro comió efectivamente, {@code false} si el Perro no comió.
     */
    public boolean comer() {
        System.out.println("Estoy comiendo.");

        return true;
    }

    /**
     * Método que hace al perro correr.
     */
    public void correr() {
        System.out.println("Corro en el parque.");
    }

    /**
     * Método que hace al perro morder.
     */
    public void morder() {
        System.out.println("¡Grrrrr!");
    }

    /**
     * Método que hace al Perro saltar, desplazándose en coordenadas tridimensionales.
     * 
     * @param x Distancia hacia en frente que el Perro se desplazó al saltar.
     * @param y Distancia hacia los lados (derecha) que el Perro se desplazó al saltar.
     * @param z Distancia a lo alto que el Perro se desplazó al saltar.
     */
    public void saltar(float x, float y, float z) {
        System.out.println("Salté desplazándome " + x + " unidades hacia enfrente, " + y + " unidades a la derecha y " + z + " unidades hacia arriba.");
    }

    /**
     * Método que imprime en pantalla el estado de la instancia actual de Perro en su representación como cadena.
     */
    public void imprimirPerro() {
        System.out.println("PERRO"
                + "\n\tColor:\t" + color
                + "\n\tPelaje:\t" + pelaje
                + "\n\tTamaño:\t" + tamaño
                + "\n\tRaza:\t" + raza
                + "\n\tEdad:\t" + edad);
    }
}
