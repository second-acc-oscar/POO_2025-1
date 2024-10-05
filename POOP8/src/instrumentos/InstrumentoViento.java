/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumentos;

/**
 * Clase que representa la generalización para instrumentos musicales de viento, que considera las acciones mínimas que todo instrumento musical debe hacer.
 *
 * @author Oscar Cabrera
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

    /**
     * Crea una nueva instancia de IntrumentoViento vacía.
     */
    public InstrumentoViento() {
    }

    /**
     * Método que hace que el instrumento musical de viento se toque.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando Instrumento Musical");
    }

    /**
     * Método que hace que el instrumento musical de viento se afine.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando Instrumento de viento");
    }

    /**
     * Método que hace que el instrumento musical de viento imprima qué tipo de instrumento (generalización) es.
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("Instrumento Muical");
        return null;
    }
    
    /**
     * Método que parsea un objeto en una cadena.
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
}
