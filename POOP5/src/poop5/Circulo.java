/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Clase que represesnta a un círculo.
 *
 * @author Oscar Cabrera
 */
public class Circulo {
    
    // Atributos

    /**
     * Constante pi a tres dígitos.
     */
    final float PI = 3.14f; 
    // Que esté en mayúsculas significa que no es una variable, sino una constante (modificador final)
    
    /**
     * Longitud del radio en unidades cualesquiera del Circulo.
     */
    private float radio;

    // Mètodos constructores

    /**
     * Crea una nueva instancia de Circulo vacía.
     */
    public Circulo() {

    }

    /**
     * Crea una nueva instancia de Circulo vacía.
     * 
     * @param radio Longitud del radio del círculo.
     */
    public Circulo(float radio) {
        this.radio = radio;
    }

    // Métodos de servicio (Getters y Setters)
    // Por buenas prácticas primero se ponen los get, y luego los set

    /**
     * Método que devuelve radio del Circulo.
     * @return El radio del Circulo.
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Método que establece el radio del Circulo.
     * @param radio El radio del Circulo.
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    // Mètodos de acción

    /**
     * Método que calcula y muestra en pantalla el área de la instancia Círculo.
     */
    void calcularArea() {
        System.out.println("Àrea : " + (PI * this.radio * this.radio));
    }

    /**
     * Método que calcula y muestra en pantalla el perímetro de la instancia Circulo.
     */
    void calcularPerimetro() {
        System.out.println("Perímetro : " + (PI * 2 * this.radio));
    }
    
}