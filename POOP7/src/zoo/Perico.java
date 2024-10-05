/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que representa a un perico que particulariza de un Ave, que a su vez particulariza de un Animal genérico.
 * Las acciones del perico se enfocan en explotar su habilidad para hablar y repetir palabras imitando la fonética de los humanos.
 * 
 * @author Oscar Cabrera
 */
public class Perico extends Ave {
    
    /**
     * Indica si el Perico tiene la capacidad de hablar.
     */
    private boolean puedeHablar;
    
    /**
     * Colección de palabras que el Perico es capaz de decir.
     */
    private ArrayList<String> vocabulario = new ArrayList<String>(Arrays.asList("Hola", "Adiós", "Ven aquí", "Buen chico", "Perico lindo", "Sí", "No", "Gracias", "Por favor"));
    
    /**
     * Longitud de las plumas de la cola del Perico medido en centímetros.
     */
    private float tamañoCola;
    
    /**
     * Nombre de la comida favorita del Perico.
     */
    private String preferenciaAlimentaria;
    
    /**
     * Longitud del pico del Perico medido en centímetros.
     */
    private float longitudPico;

    /**
     * Crea una nueva instancia de Perico vacía.
     */
    public Perico() {
    }

    /**
     * Crea una nueva instancia de Perico llena.
     * Infla explícitamente todos los atributos de la clase, incluyendo los pertinentes a sus superclases en la jerarquía de herencia.
     * 
     * @param puedeHablar Indica si el Perico tiene la capacidad de hablar.
     * @param tamañoCola Longitud de las plumas de la cola del Perico medido en centímetros.
     * @param preferenciaAlimentaria Nombre de la comida favorita del Perico.
     * @param longitudPico Longitud del pico del Perico medido en centímetros.
     * @param edad Edad en años que el Ave (Perico) tiene.
     * @param especie Nombre del tipo de especie a la que pertenece el Ave (Perico).
     * @param longitudAlas Longitud que tiene una sola ala del Ave (Perico), medida en centímetos exactos acotada mediante reondeo simétrico.
     * @param vuela Indica si el Ave (Perico) es capaz de volar.
     * @param colorPlumas Representación en color del color predominante en el plumaje del Ave (Perico).
     * @param nombre Nombre formal / científico del Animal (Ave).
     * @param grupoAnimal Grupo al que pertenece al animal (Ave), e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     * @param apodo Apodo que tiene el animal (Ave) "de cariño" al ser domesticado. Otros nombres informales.
     * @param estaVivo Indica si el animal (Ave) está vivo o no. Una vez establecido con {@code false} no puede volver a su estado de {@code true}.
     * @param numPatas Número de patas del animal (Ave).
     */
    public Perico(boolean puedeHablar, float tamañoCola, String preferenciaAlimentaria, float longitudPico, int edad, String especie, int longitudAlas, boolean vuela, String colorPlumas, String nombre, String grupoAnimal, String apodo, boolean estaVivo, int numPatas) {
        super(edad, especie, longitudAlas, vuela, colorPlumas, nombre, grupoAnimal, apodo, estaVivo, numPatas);
        this.puedeHablar = puedeHablar;
        this.tamañoCola = tamañoCola;
        this.preferenciaAlimentaria = preferenciaAlimentaria;
        this.longitudPico = longitudPico;
    }

    /**
     * Crea una nueva instancia de Perico "correcta".
     * 
     * Sólo necesita los datos específicos para un Animal (constructor superclase): Nombre, apodo. Y para Ave (constructor superclase): Edad, longitudAlas, colorPlumas.
     * El resto se inicializan directamente por el hecho de ser un Ave Perico.
     * 
     * @param puedeHablar Indica si el Perico tiene la capacidad de hablar.
     * @param tamañoCola Longitud de las plumas de la cola del Perico medido en centímetros.
     * @param preferenciaAlimentaria Nombre de la comida favorita del Perico.
     * @param longitudPico Longitud del pico del Perico medido en centímetros.
     * @param edad Edad en años que el Ave (Perico) tiene.
     * @param especie Nombre del tipo de especie a la que pertenece el Ave (Perico).
     * @param longitudAlas Longitud que tiene una sola ala del Ave (Perico), medida en centímetos exactos acotada mediante reondeo simétrico.
     * @param vuela Indica si el Ave (Perico) es capaz de volar.
     * @param colorPlumas Representación en color del color predominante en el plumaje del Ave (Perico).
     * @param nombre Nombre formal / científico del Animal (Ave).
     * @param apodo Apodo que tiene el animal (Ave) "de cariño" al ser domesticado. Otros nombres informales.
     */
    public Perico(boolean puedeHablar, float tamañoCola, String preferenciaAlimentaria, float longitudPico, int edad, String especie, int longitudAlas, boolean vuela, String colorPlumas, String nombre, String apodo) {
        super(edad, "Perico", longitudAlas, true, colorPlumas, nombre, apodo);
        this.puedeHablar = puedeHablar;
        this.tamañoCola = tamañoCola;
        this.preferenciaAlimentaria = preferenciaAlimentaria;
        this.longitudPico = longitudPico;
    }

    /**
     * Método que devuelve la capacidad de hablar del Perico.
     * @return {@code true} si el Perico sí es capaz de hablar, {@code false} en caso contrario.
     */
    public boolean isPuedeHablar() {
        return puedeHablar;
    }

    /**
     * Método que establece si el Perico es capaz de hablar.
     * @param puedeHablar Atributo que indica si el Perico es capaz de volar: {@code true} si el Perico es capaz de hablar, {@code false} en caso contrario.
     */
    public void setPuedeHablar(boolean puedeHablar) {
        this.puedeHablar = puedeHablar;
    }

    /**
     * Método que devuelve la lista de palabras que están en el vocabulario del Perico y que puede pronunciar.
     * @return La lista de palabras que están en el vocabulario del Perico.
     */
    public ArrayList<String> getVocabulario() {
        return vocabulario;
    }

    /**
     * Método que establece la lsita de palabras que están en el vocabulario del Perico y que puede pronunciar.
     * @param vocabulario Lita de palabras que están en el vocabulario del Perico.
     */
    public void setVocabulario(ArrayList<String> vocabulario) {
        this.vocabulario = vocabulario;
    }

    /**
     * Método que devuelve la longitud de las plumas de la cola del Perico.
     * @return La longitud de las plumas de la cola del Perico.
     */
    public float getTamañoCola() {
        return tamañoCola;
    }

    /**
     * Método que establece la longitud de las plumas de la cola del Perico.
     * @param tamañoCola La longitud de las plumas de la cola del Perico medida en centímetos.
     */
    public void setTamañoCola(float tamañoCola) {
        this.tamañoCola = tamañoCola;
    }

    /**
     * Método que devuelve el nombre de la comida favorita del Perico.
     * @return El nombre de la comida favorita del Perico.
     */
    public String getPreferenciaAlimentaria() {
        return preferenciaAlimentaria;
    }

    /**
     * Método que establece el nombre de la comida favorita del Perico.
     * @param preferenciaAlimentaria El nombre de la comida favorita del Perico.
     */
    public void setPreferenciaAlimentaria(String preferenciaAlimentaria) {
        this.preferenciaAlimentaria = preferenciaAlimentaria;
    }

    /**
     * Método que devuelve la longitud del pico del Perico medido en centímetros.
     * @return La longitud del pico del Perico medido en centímetros.
     */
    public float getLongitudPico() {
        return longitudPico;
    }

    /**
     * Método que establece la la longitud del pico del Perico medido en centímetros.
     * @param longitudPico La longitud del pico del Perico medido en centímetros.
     */
    public void setLongitudPico(float longitudPico) {
        this.longitudPico = longitudPico;
    }
    
    /**
     * Método que hace al Perico repetir una cierta palabra si y solo si: la palabra se encuentra previamente en su vocabulario, el Perico es capaz de hablar y el Perico está vivo.
     * @param palabra La palabra que el Perico debe repetir.
     */
    public void repetir(String palabra) {
        if( isEstaVivo() )
            if( puedeHablar )
                if( vocabulario.contains(palabra))
                    System.out.println("El perico repite: \"" + palabra + " " + palabra + "\"");
                else
                    System.out.println("El perico no conoce esa palabra y no es capaz de repetirla.");
            else
                System.out.println("El perico no tiene la capacidad de hablar.");
        else
            System.out.println("El perico ya no podrá repetir ninguna palabra porque ya no se encuentra con vida.");
    }
    
    /**
     * Método que hace al Perico añadir una nueva palabra a su vocabulario, siempre que no estuviera ya dentro.
     * @param palabra Palabra que el Perico añadirá a su vocabulario.
     */
    public void aprenderPalabra(String palabra) {
        if( vocabulario.contains(palabra) )
            System.out.println("El perico ya se sabía esa palabra.");
        else {
            vocabulario.add(palabra);
            System.out.println("El perico ha aprendido la nueva palabra.");
        }
    }
    
    /**
     * Método que hace al Perico realizar una acrobacia llamativa. Siempre hace la misma.
     */
    public void realizarAcrobacias() {
        System.out.println("¡El Perico da tres volteretas en el aire cuando hizo un salto demostrativo! Impresionante.");
    }

    /**
     * Método que imprime en pantalla de manera amigable el estado de todos los atributos del Perico.
     */
    @Override
    public void imprimirAve() {
        super.imprimirAve(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("\t ### Características de Perico ###"
                + "\n\tEs capaz de hablar: " + ( puedeHablar ? "Sí" : "No") 
                + "\n\tVocabulario: ");
        for (String palabra : vocabulario) {
            System.out.print(palabra + " ");
        }
        System.out.println("\n\tTamaño de su cola: " + tamañoCola + " [cm]"
                + "\n\tPreferencia alimentaria: " + preferenciaAlimentaria
                + "\n\tLongitu de su pico: " + longitudPico );
    }
    
    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "Perico{" + "puedeHablar=" + puedeHablar + ", tama\u00f1oCola=" + tamañoCola + ", preferenciaAlimentaria=" + preferenciaAlimentaria + ", longitudPico=" + longitudPico + '}';
    }
}
