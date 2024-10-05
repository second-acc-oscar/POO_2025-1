/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package instrumentos;

/**
 * Interfaz que define las acciones mínimas que deben de contener las instancias que sean (implementen) un instrumento musical.
 *
 * @author Oscar Cabrera
 */
public interface InstrumentoMusical {
    
    /**
     * Método que hace que el instrumento musical se toque.
     */
    public abstract void tocar();
    
    /**
     * Método que hace que el instrumento musical se afine.
     */
    public abstract void afinar();
    
    /**
     * Método que hace que el instrumento musical imprima qué tipo de instrumento (generalización) es.
     */
    public abstract String tipoDeInstrumento();
}
