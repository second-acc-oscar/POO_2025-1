/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

import java.util.Random;

/**
 * Clase que representa a un pastor aleman que particulariza de un Perro, que a su vez particulariza de un Animal genérico.
 * Las acciones del pastor aleman se centran en su entrenamiento (posible) para protección y patrullaje, siendo animal de protección.
 * 
 * @author Oscar Cabrera
 */
public class PastorAleman extends Perro {
    
    /**
     * Indica si el Perro recibió entrenamiento para protección y guardia.
     */
    private boolean entrenado;
    
    /**
     * Indica el nivel de entrenamiento que recibió el PastorAleman, en una escala 1-10.
     */
    private int nivelEntrenamiento;
    
    /**
     * Indica la fuerza de la mordida que tiene el PastorAleman, en un intervalo de números reales 1-100.
     */
    private float fuerzaMordida;
    
    /**
     * Indica el nivel de agresividad del PastorAleman en una escala 1-10.
     */
    private int nivelAgresividad;
    
    /**
     * Indica el nivel de compatibilidad social que tiene el PastorAleman para relacionarse con gente y con otros perros. Está dado en una escala 1-10.
     */
    private int compatibilidadSocial;

    /**
     * Crea una instancia de PastorAleman vacía.
     */
    public PastorAleman() {
    }

    /**
     * Crea una nueva instancia de PastorAleman llena.
     * Infla explícitamente todos los atributos de la clase, incluyendo los pertinentes a sus superclases en la jerarquía de herencia.
     * 
     * @param entrenado Indica si el perro recibió entrenamiento para protección y guardia.
     * @param nivelEntrenamiento Indica el nivel de entrenamiento que recibió el PastorAleman, en una escala 1-10.
     * @param fuerzaMordida Indica la fuerza de la mordida que tiene el PastorAleman, en un intervalo de números reales 1-100.
     * @param nivelAgresividad Indica el nivel de agresividad del PastorAleman en una escala 1-10.
     * @param compatibilidadSocial Indica el nivel de compatibilidad social que tiene el PastorAleman para relacionarse con gente y con otros perros. Está dado en una escala 1-10.
     * @param raza Tipo de raza del que es el Perro (PastorAleman).
     * @param color Representación en cadena del color predominante en el pelaje del Perro (PastorAleman).
     * @param nivelDeEnergia Nivel de energía que tiene el Perro (PastorAleman) en un instante del tiempo. Se admiten valores del 1-100.
     * @param peso Peso en kilogramos del Perro (PastorAleman).
     * @param estadoDeSalud Representación en cadena del estado de salud del que goza el Perro (PastorAleman).
     * @param nombre Nombre formal / científico del Animal (Perro).
     * @param grupoAnimal Grupo al que pertenece al animal (Perro), e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     * @param apodo Apodo que tiene el animal (Perro) "de cariño" al ser domesticado. Otros nombres informales.
     * @param estaVivo Indica si el animal (Perro) está vivo o no. Una vez establecido con {@code false} no puede volver a su estado de {@code true}.
     * @param numPatas Número de patas del animal (Perro). 
     */
    public PastorAleman(boolean entrenado, int nivelEntrenamiento, float fuerzaMordida, int nivelAgresividad, int compatibilidadSocial, String raza, String color, int nivelDeEnergia, float peso, String estadoDeSalud, String nombre, String grupoAnimal, String apodo, boolean estaVivo, int numPatas) {
        super(raza, color, nivelDeEnergia, peso, estadoDeSalud, nombre, grupoAnimal, apodo, estaVivo, numPatas);
        this.entrenado = entrenado;
        this.nivelEntrenamiento = nivelEntrenamiento;
        this.fuerzaMordida = fuerzaMordida;
        this.nivelAgresividad = nivelAgresividad;
        this.compatibilidadSocial = compatibilidadSocial;
    }

    /**
     * Crea una nueva instancia de PastorAleman "correcta".
     * 
     * Sólo necesita los datos específicos para un Animal (constructor superclase): Nombre, apodo. Y para Perro (constructor superclase): Nivel de energía, peso y estado de salud.
     * El resto se inicializan directamente por el hecho de ser un Perro PastorAleman.
     * 
     * @param entrenado Indica si el perro recibió entrenamiento para protección y guardia.
     * @param nivelEntrenamiento Indica el nivel de entrenamiento que recibió el PastorAleman, en una escala 1-10.
     * @param fuerzaMordida Indica la fuerza de la mordida que tiene el PastorAleman, en un intervalo de números reales 1-100.
     * @param nivelAgresividad Indica el nivel de agresividad del PastorAleman en una escala 1-10.
     * @param compatibilidadSocial Indica el nivel de compatibilidad social que tiene el PastorAleman para relacionarse con gente y con otros perros. Está dado en una escala 1-10.
     * @param nivelDeEnergia Nivel de energía que tiene el Perro (PastorAleman) en un instante del tiempo. Se admiten valores del 1-100.
     * @param peso Peso en kilogramos del Perro (PastorAleman).
     * @param estadoDeSalud Representación en cadena del estado de salud del que goza el Perro (PastorAleman).
     * @param nombre Nombre formal / científico del Animal (Perro).
     * @param apodo Apodo que tiene el animal (Perro) "de cariño" al ser domesticado. Otros nombres informales.
     */
    public PastorAleman(boolean entrenado, int nivelEntrenamiento, float fuerzaMordida, int nivelAgresividad, int compatibilidadSocial, int nivelDeEnergia, float peso, String estadoDeSalud, String nombre, String apodo) {
        super("Pastor Aleman", "Negro con marrón claro", nivelDeEnergia, peso, estadoDeSalud, nombre, apodo);
        this.entrenado = entrenado;
        this.nivelEntrenamiento = nivelEntrenamiento;
        this.fuerzaMordida = fuerzaMordida;
        this.nivelAgresividad = nivelAgresividad;
        this.compatibilidadSocial = compatibilidadSocial;
    }

    /**
     * Método que devuelve si el PastorAleman recibió entrenamiento para protección y guardia.
     * @return {@code true} si í lo recibió, {@code false} en caso contrario.
     */
    public boolean isEntrenado() {
        return entrenado;
    }

    /**
     * Método que establece si el PastorAleman recibió entrenamiento para protección y guardia.
     * @param entrenado {@code true} si í lo recibió, {@code false} en caso contrario.
     */
    public void setEntrenado(boolean entrenado) {
        this.entrenado = entrenado;
    }

    /**
     * Método que devuelve el nivel de entrenamiento del PastorAleman.
     * @return El nivel de entrenamiento del PastorAleman.
     */
    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    /**
     * Método que establece el nivel de entrenamiento del PastorAleman.
     * @param nivelEntrenamiento El nivel de entrenamiento del PastorAleman.
     */
    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    /**
     * Método que devuelve la fuerza de la mordida del PastorAleman.
     * @return La fuerza de la mordida del PastorAleman.
     */
    public float getFuerzaMordida() {
        return fuerzaMordida;
    }

    /**
     * Método que establece la fuerza de la mordida del PastorAleman.
     * @param fuerzaMordida La fuerza de la mordida del PastorAleman.
     */
    public void setFuerzaMordida(float fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    /**
     * Método que devuelve el nivel de agresividad del PastorAleman.
     * @return El nivel de agresividad del PastorAleman.
     */
    public int getNivelAgresividad() {
        return nivelAgresividad;
    }

    /**
     * Método que establece el nivel de agresividad del PastorAleman.
     * @param nivelAgresividad El nivel de agresividad del PastorAleman.
     */
    public void setNivelAgresividad(int nivelAgresividad) {
        this.nivelAgresividad = nivelAgresividad;
    }

    /**
     * Método que devuelve el grado de compatibilidad del PastorAleman.
     * @return El grado de compatibilidad del PastorAleman.
     */
    public int getCompatibilidadSocial() {
        return compatibilidadSocial;
    }

    /**
     * Método que establece el grado de compatibilidad del PastorAleman.
     * @param compatibilidadSocial El grado de compatibilidad del PastorAleman.
     */
    public void setCompatibilidadSocial(int compatibilidadSocial) {
        this.compatibilidadSocial = compatibilidadSocial;
    }
    
    /**
     * Método que hace al PastorAleman aprender un nuevo comando si y solo sí se cumple que: El PastorAleman está vivo (dependiendo del estado del atributo {@code estaVivo}), y si está entrenado para aprender nuevas órdenes (dependiendo del estado del atributo {@code entrenado}).
     * @param comando El comando que se quiere el PastorAleman aprenda.
     */
    public void entrenar( String comando ) {
        if( isEstaVivo() )
            if( isEntrenado() )
                System.out.println("El pastor alemán aprendió correctamente el comando " + comando + ".");
            else
                System.out.println("El pastor alemán intentó aprender el comando " + comando + ", pero no tiene el entrenamiento necesario para aprenderlo correctamente.");
        else
            System.out.println("El pastor alemán ya no puede aprender nuevas órdenes puesto que ya no está vivo.");
    }
    
    /**
     * Método que hace al PastorAleman proteger un territorio si y solo sí se cumple que: El PastorAleman está vivo (dependiendo del estado del atributo {@code estaVivo}), y si está entrenado para protección (dependiendo del estado del atributo {@code entrenado}).
     * @param territorio La porción de espacio (territorio) que se quiere el PastorAleman aprenda.
     */
    public void proteger( String territorio ) {
        if( isEstaVivo() )
            if( isEntrenado() )
                System.out.println("El pastor protege el territorio " + territorio + ".");
            else
                System.out.println("El pastor alemán intentó proteger el territorio " + territorio + ", pero no fue capaz porque no tiene el entrenamiento necesario.");
        else
            System.out.println("El pastor alemán ya no puede proteger un territorio puesto que ya no está vivo.");
    }
    
    /**
     * Método que hace al PastorAleman buscar un objeto si y solo sí se cumple que: El PastorAleman está vivo (dependiendo del estado del atributo {@code estaVivo}), y si está entrenado (dependiendo del estado del atributo {@code entrenado}).
     * @param objeto El objeto que se quiere el PastorAleman busque.
     */
    public void buscar( String objeto ) {
        Random rm = new Random();
        
        boolean encontrado = rm.nextBoolean();
        
        if( isEstaVivo() )
            if( isEntrenado() )
                if( encontrado )
                    System.out.println("¡El pastor alemán sí pudo hallar " + objeto + ".");
                else
                    System.out.println("El pastor alemán no fue capaz de hallar " + objeto + ".");
            else
                System.out.println("El pastor alemán intentó buscar el objeto " + objeto + ", pero no fue capaz porque no tiene el entrenamiento necesario.");
        else
            System.out.println("El pastor alemán ya no puede buscar ningún objeto puesto que ya no está vivo.");
    }

    /**
     * Método que imprime en pantalla de manera amigable el estado de todos los atributos del PastorAleman.
     */
    @Override
    public void imprimirPerro() {
        super.imprimirPerro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("\t ### Características de Dalmata ###"
                + "\n\t" + ( this.entrenado ? "Sí " : "No " ) + "está entrenado."
                + "\n\tNivel de entrenamiento: " + nivelEntrenamiento
                + "\n\tFuerza de su mordida: " + fuerzaMordida
                + "\n\tNivel de agresividad: " + nivelAgresividad
                + "\n\tComptatibilidad social: " + compatibilidadSocial );
    }

    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "PastorAleman{" + "entrenado=" + entrenado + ", nivelEntrenamiento=" + nivelEntrenamiento + ", fuerzaMordida=" + fuerzaMordida + ", nivelAgresividad=" + nivelAgresividad + ", compatibilidadSocial=" + compatibilidadSocial + '}';
    }
}
