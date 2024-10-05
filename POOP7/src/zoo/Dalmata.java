/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

import java.util.Random;

/**
 * Clase que representa a un dálmata que particulariza de un Perro, que a su vez particulariza de un Animal genérico.
 * Las acciones del dálmata se centran en su capacidad para hacer de perro guardián y de compañía.
 * 
 * @author Oscar Cabrera
 */
public class Dalmata extends Perro {
    
    /**
     * Colección que incluye los posibles temperamentos que puede tener el Dalmata.
     */
    private static final String[] POSIBLES_TEMPERAMENTOS = {"Enérgico", "Amistoso", "Leal", "Alerto", "Independiente", "Sensible", "Inteligente", "Obstinado" , "Juguetón", "Territorial", "Ansioso", "Sociable", "Reservado"};

    /**
     * Número de manchas de color negro que tiene el Dalmata en todo su cuerpo.
     */
    private int manchas;
    
    /**
     * Tonalidad del blanco que tiene el Dalmata en su color base (detrás de las manchas).
     */
    private String colorBase;
    
    /**
     * Nombre del temperamente que describe al Dalmata.
     * 
     * Es exclusivamente uno de los posibles temperamentos contenidos en {@code POSIBLES_TEMPERAMENTOS}.
     */
    private String temperamento;
    
    /**
     * Nombre de la persona que el el dueño legal del Dalmata, si es que tiene.
     */
    private String dueño;

    /**
     * Crea una nueva instancia de Dalmata vacía.
     */
    public Dalmata() {
    }

    /**
     * Crea una nueva instancia de Dalmata llena.
     * Infla explícitamente todos los atributos de la clase, incluyendo los pertinentes a sus superclases en la jerarquía de herencia.
     * 
     * @param manchas Número de manchas de color negro que tiene el Dalmata en todo su cuerpo.
     * @param colorBase Tonalidad del blanco que tiene el Dalmata en su color base (detrás de las manchas).
     * @param seleccionTemperamento @param seleccionTemperamento El índice del temperamento de la colección {@code POSIBLES_TEMPERAMENTOS} que se quiere asocial al Dalmata.
     * @param dueño Nombre de la persona que el el dueño legal del Dalmata, si es que tiene.
     * @param raza Tipo de raza del que es el Perro (Dalmata).
     * @param color Representación en cadena del color predominante en el pelaje del Perro (Dalmata).
     * @param nivelDeEnergia Nivel de energía que tiene el Perro (Dalmata) en un instante del tiempo. Se admiten valores del 1-100.
     * @param peso Peso en kilogramos del Perro (Dalmata).
     * @param estadoDeSalud Representación en cadena del estado de salud del que goza el Perro (Dalmata).
     * @param nombre Nombre formal / científico del Animal (Perro).
     * @param grupoAnimal Grupo al que pertenece al animal (Perro), e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     * @param apodo Apodo que tiene el animal (Perro) "de cariño" al ser domesticado. Otros nombres informales.
     * @param estaVivo Indica si el animal (Perro) está vivo o no. Una vez establecido con {@code false} no puede volver a su estado de {@code true}.
     * @param numPatas Número de patas del animal (Perro).
     */
    public Dalmata(int manchas, String colorBase, int seleccionTemperamento, String dueño, String raza, String color, int nivelDeEnergia, float peso, String estadoDeSalud, String nombre, String grupoAnimal, String apodo, boolean estaVivo, int numPatas) {
        super(raza, color, nivelDeEnergia, peso, estadoDeSalud, nombre, grupoAnimal, apodo, estaVivo, numPatas);
        this.manchas = manchas;
        this.colorBase = colorBase;
        this.setTemperamento( seleccionTemperamento );
        this.dueño = dueño;
    }
    
    /**
     * Crea una nueva instancia de Dalmata "correcta".
     * 
     * Sólo necesita los datos específicos para un Animal (constructor superclase): Nombre, apodo. Y para Perro (constructor superclase): Nivel de energía, peso y estado de salud.
     * El resto se inicializan directamente por el hecho de ser un Perro Dalmata.
     * 
     * @param manchas Número de manchas de color negro que tiene el Dalmata en todo su cuerpo.
     * @param colorBase Tonalidad del blanco que tiene el Dalmata en su color base (detrás de las manchas).
     * @param seleccionTemperamento @param seleccionTemperamento El índice del temperamento de la colección {@code POSIBLES_TEMPERAMENTOS} que se quiere asocial al Dalmata.
     * @param dueño Nombre de la persona que el el dueño legal del Dalmata, si es que tiene.
     * @param nivelDeEnergia Nivel de energía que tiene el Perro (Dalmata) en un instante del tiempo. Se admiten valores del 1-100.
     * @param peso Peso en kilogramos del Perro (Dalmata).
     * @param estadoDeSalud Representación en cadena del estado de salud del que goza el Perro (Dalmata).
     * @param nombre Nombre formal / científico del Animal (Perro).
     * @param apodo Apodo que tiene el animal (Perro) "de cariño" al ser domesticado. Otros nombres informales.
     */
    public Dalmata(int manchas, String colorBase, int seleccionTemperamento, String dueño, int nivelDeEnergia, float peso, String estadoDeSalud, String nombre, String apodo) {
        super("Dalmata", colorBase + " con manchas negras", nivelDeEnergia, peso, estadoDeSalud, nombre, apodo);
        this.manchas = manchas;
        this.colorBase = colorBase;
        this.setTemperamento( seleccionTemperamento );
        this.dueño = dueño;
    }

    /**
     * Método que devuelve la lista con los posibles temperamentos que pueden describir al Dalmata.
     * @return El de cadenas que representan los posibles temperamentos que pueden desribir al Dalmata.
     */
    public String[] getPOSIBLES_TEMPERAMENTOS() {
        return POSIBLES_TEMPERAMENTOS;
    }

    /**
     * Mëtodo que devuelve el número de manchas del Dalmata.
     * @return El número de manchas del Dalmata.
     */
    public int getManchas() {
        return manchas;
    }

    /**
     * Método que establece el número de manchas del Dalmata.
     * @param manchas Número de manchas del Dalmata.
     */
    public void setManchas(int manchas) {
        this.manchas = manchas;
    }

    /**
     * Mëtodo que devuelve la tonalidad del blanco que tiene el Dalmata en su color base (detrás de las manchas).
     * @return La tonalidad del blanco que tiene el Dalmata en su color base.
     */
    public String getColorBase() {
        return colorBase;
    }

    /**
     * Método que establece la tonalidad del blanco que tiene el Dalmata en su color base (detrás de las manchas).
     * @param colorBase La tonalidad del blanco que tiene el Dalmata en su color base (detrás de las manchas).
     */
    public void setColorBase(String colorBase) {
        this.colorBase = colorBase;
    }

    /**
     * Mëtodo que devuelve el temperamento que describe al Dalmata.
     * @return El temperamento que describe al Dalmata.
     */
    public String getTemperamento() {
        return temperamento;
    }

    /**
     * Método que establece el temperamento que describe al Dalmata.
     * 
     * Ya que el temperamento debe ser estrictamente uno de los establecidos en {@code POSIBLES_TEMPERAMENTOS}, recibe como argumento un número entero que representa el índice de temperameto que se quiere asocial al Dalmata.
     * Si se recibe un número inválido, se seleccionará un temperamento al azar.
     * 
     * @param seleccionTemperamento El índice del temperamento de la colección {@code POSIBLES_TEMPERAMENTOS} que se quiere asocial al Dalmata.
     */
    public void setTemperamento(int seleccionTemperamento) {
        if( seleccionTemperamento >= 0 && seleccionTemperamento < 13)
            this.temperamento = POSIBLES_TEMPERAMENTOS[ seleccionTemperamento ];
        else {
            Random rm = new Random();
            int idx = rm.nextInt(13);
            this.temperamento = POSIBLES_TEMPERAMENTOS[ idx ];
        }
    }

    /**
     * Mëtodo que devuelve el nombre del dueño legal del Dalmata, si es que tiene.
     * @return El nombre del dueño legal del Dalmata.
     */
    public String getDueño() {
        return dueño;
    }

    /**
     * Método que establece al dueño legal del Dalmata, si es que tiene.
     * @param dueño El dueño legal del Dalmata.
     */
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    
    /**
     * Método que hace al Dalmata patrullar alrededor de su hogar para protegerlo de posibles amenazas, si es que el Dalmata se encuentra vivo, ésto se decide cuando dependiendo del estado de su atributo {@code estaVivo}, si se encuentra en {@code true}. En ambos casos se indica en pantalla. 
     */
    public void patrullar() {
        if( isEstaVivo() )
            System.out.println("El Dalmata patrulla para proteger su hogar de posibles amenazas.");
        else
            System.out.println("El Dalmata ya no puede patrullar porque ya no está vivo.");
    }
    
    /**
     * Método que reubica al Dalmata con su nuevo dueño por cualquier circunstancia no especificada.
     * @param dueño El nombre del nuevo dueño legal del Dalmata.
     */
    public void asignarDueño( String dueño ) {
        System.out.println("El anterior dueño del Dalmata, " + getDueño() + " dejó de serlo. En cambio el Dalmata tiene por dueño ahora a " + dueño);
        setDueño( dueño );
    }

    /**
     * Método que hace al Dalmata dormir una cierta cantidad de tiempo constante.
     * 
     * Únicamente si está vivo, ésto decidido mediante el estado del atributo {@code estaVivo}.
     */
    @Override
    public void dormir() {
        super.dormir(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if( isEstaVivo() )
            System.out.println("El Dalmata es uno de los animales más activos durante el sueño, en estos momentos sueña con correr por el campo.");
    }

    /**
     * Método que imprime en pantalla de manera amigable el estado de todos los atributos del Dalmata.
     */
    @Override
    public void imprimirPerro() {
        super.imprimirPerro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("\t ### Características de Dalmata ###"
                + "\n\tNúmero de manchas: " + this.getManchas()
                + "\n\tTonalidad del blanco de su color base: " + this.getColorBase()
                + "\n\tTemperamento: " + this.getTemperamento()
                + "\n\tDueño: " + this.getDueño() );
    }
    
    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "Dalmata{" + "manchas=" + manchas + ", colorBase=" + colorBase + ", temperamento=" + temperamento + ", due\u00f1o=" + dueño + '}';
    }
}
