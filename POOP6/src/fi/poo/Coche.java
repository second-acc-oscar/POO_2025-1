/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 * Clase que representa a un Coche genérico.
 * 
 * @author Oscar Cabrera
 */
public class Coche {
    
    /**
     * Nombre del color pincipal del Coche.
     */
    private String color;
    
    /**
     * Nombre de la marca que fabricó al Coche.
     */
    private String marca;
    
    /**
     * Representación en cadena de las placas automovilísticas del Coche.
     */
    private String placa;

    /**
     * Crea una nueva instancia de Coche vacía.
     */
    public Coche() {
    }

  
    /**
     * Crea una nueva instancia de Coche llena.
     * 
     * @param color El color principal del Coche.
     * @param marca Nombre de la marca que fabricó al Coche.
     * @param placa Placas automovilísticas del Coche.
     */
    public Coche(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }

    /**
     * Método que devuelve el color del Coche.
     * @return El color del Coche.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que establece el color del Coche.
     * @param color El color del Coche.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que devuelve la marca del Coche.
     * @return La marca del Coche.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método que establece la marca del Coche.
     * @param marca La marca del Coche.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método que devuelve la placa del Coche.
     * @return La placa del Coche.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método que establece la marca del Coche.
     * @param placa La placa del Coche.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /**
     * Método que hace acelera el Coche.
     */
    public void acelerar() {
        System.out.println("Estoy acelerando.");
    }
    
    /**
     * Método que hace que frene el Coche.
     */
    public void frenar() {
        System.out.println("Frenar");
    }
    
    /**
     * Método que carga una cosa en el Coche.
     * 
     * @param cosa Lo que va a cargar el coche.
     * @return Lo que va a cargar el coche.
     */
    public String carga(String cosa) {
        System.out.println("Estoy cargando " + cosa);
        return cosa;
    }

    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
    }
}
