/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumentos;

/**
 * Clase que representa la generalizacón en una flauta de un instrumento de viento en general. (Particularización)
 *
 * @author Oscar Cabrera
 */
public class Flauta extends InstrumentoViento {

    /**
     * Crea una nueva instancia de Flauta vacía.
     */
    public Flauta() {
    }

    /**
     * Método que hace que la Flauta se toque.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando Flauta");
    }

    /**
     * Método que hace que la Flauta se afine.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando Flauta");
    }
    
    /**
     * Método que hace que la Flauta imprima qué tipo de instrumento (generalización) es.
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }

    /**
     * Método que parsea un objeto en una cadena.
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "Flauta{" + '}';
    }
}
