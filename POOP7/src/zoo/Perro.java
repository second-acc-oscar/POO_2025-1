/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 * Clase que representa a un Perro que particulariza de un Animal genérico.
 *
 * @author Oscar Cabrera
 */
public class Perro extends Animal {
    
    /**
     * Tipo de raza del que es el Perro.
     */
    private String raza;
    
    /**
     * Representación en cadena del color predominante en el pelaje del Perro.
     */
    private String color;
    
    /**
     * Nivel de energía que tiene el Perro en un instante del tiempo. Se admiten valores del 1-100.
     */
    private int nivelDeEnergia;
    
    /**
     * Peso en kilogramos del Perro.
     */
    private float peso;
    
    /**
     * Representación en cadena del estado de salud del que goza el Perro.
     */
    private String estadoDeSalud;

    /**
     * Crea una nueva instancia de Perro vacía.
     */
    public Perro() {
    }

    /**
     * Crea una nueva instancia de Perro llena.
     * Infla todos los atributos de la clase explícitamente, incluyendo los pertinentes a sus superclases en la jerarquía de herencia.
     * 
     * @param raza Tipo de raza del que es el Perro.
     * @param color Representación en cadena del color predominante en el pelaje del Perro.
     * @param nivelDeEnergia Nivel de energía que tiene el Perro en un instante del tiempo. Se admiten valores del 1-100.
     * @param peso Peso en kilogramos del Perro.
     * @param estadoDeSalud Representación en cadena del estado de salud del que goza el Perro.
     * @param nombre Nombre formal / científico del Animal (Perro).
     * @param grupoAnimal Grupo al que pertenece al animal (Perro), e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     * @param apodo Apodo que tiene el animal (Perro) "de cariño" al ser domesticado. Otros nombres informales.
     * @param estaVivo Indica si el animal (Perro) está vivo o no. Una vez establecido con {@code false} no puede volver a su estado de {@code true}.
     * @param numPatas Número de patas del animal (Perro).
     */
    public Perro(String raza, String color, int nivelDeEnergia, float peso, String estadoDeSalud, String nombre, String grupoAnimal, String apodo, boolean estaVivo, int numPatas) {
        super(nombre, grupoAnimal, apodo, estaVivo, numPatas);
        this.raza = raza;
        this.color = color;
        this.nivelDeEnergia = nivelDeEnergia;
        this.peso = peso;
        this.estadoDeSalud = estadoDeSalud;
    }

    /**
     * Crea una instancia de Perro "correcta".
     * 
     * Sólo necesita los datos específicos para un Animal (constructor superclase): Nombre, apodo.
     * El resto se inicializan directamente por el hecho de ser un Perro.
     * 
     * @param raza Tipo de raza del que es el Perro.
     * @param color Representación en cadena del color predominante en el pelaje del Perro.
     * @param nivelDeEnergia Nivel de energía que tiene el Perro en un instante del tiempo. Se admiten valores del 1-100.
     * @param peso Peso en kilogramos del Perro.
     * @param estadoDeSalud Representación en cadena del estado de salud del que goza el Perro.
     * @param nombre Nombre formal / científico del Animal (Perro).
     * @param apodo Apodo que tiene el animal (Perro) "de cariño" al ser domesticado. Otros nombres informales.
     */
    public Perro(String raza, String color, int nivelDeEnergia, float peso, String estadoDeSalud, String nombre, String apodo) {
        super(nombre, "Mamífero", apodo, true, 4);
        this.raza = raza;
        this.color = color;
        this.nivelDeEnergia = nivelDeEnergia;
        this.peso = peso;
        this.estadoDeSalud = estadoDeSalud;
    }

    /**
     * Método que devuelve la raza del Perro.
     * @return La raza del Perro.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Método que establece la raza del Perro.
     * @param raza La raza del Perro.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Método que devuelve el color del Perro.
     * @return El color del Perro.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que establece el color del Perro.
     * @param color El color del Perro.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que devuelve el nivel de energía del Perro.
     * @return El nivel de energía del Perro.
     */
    public int getNivelDeEnergia() {
        return nivelDeEnergia;
    }

    /**
     * Método que establece el nivel de energía del Perro.
     * @param nivelDeEnergia El nivel de energía del Perro.
     */
    public void setNivelDeEnergia(int nivelDeEnergia) {
        this.nivelDeEnergia = nivelDeEnergia;
    }

    /**
     * Método que devuelve el peso del Perro.
     * @return El peso del Perro.
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Método que establece el peso del Perro.
     * @param peso El peso del Perro.
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Método que devuelve el estado de salud del Perro.
     * @return El estado de salud del Perro.
     */
    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    /**
     * Método que establece el estado de salud del Perro.
     * @param estadoDeSalud el estado de salud del Perro.
     */
    public void setEstadoDeSalud(String estadoDeSalud) {
        this.estadoDeSalud = estadoDeSalud;
    }
    
    /**
     * Método que hace al Perro ladrar.
     * 
     * Únicamente si está vivo, ésto decidido mediante el estado del atributo {@code estaVivo}.
     */
    public void ladrar() {
        if( this.isEstaVivo() )
            System.out.println("¡Wuaf, wuaf!");
        else
            System.out.println("El perro no puede ladrar porque no está vivo.");
    }

    /**
     * Método que hace al Perro dormir una cierta cantidad de tiempo constante.
     * 
     * Únicamente si está vivo, ésto decidido mediante el estado del atributo {@code estaVivo}.
     */
    public void dormir() {
        if( this.isEstaVivo() )
            System.out.println("El Perro duerme plácidamente.");
        else
            System.out.println("El Perro ya se encuentra en el sueño eterno.");
    }
    
    /**
     * Método que hace al Perro jugar con un juguete específico.
     * 
     * Únicamente si está vivo, ésto decidido mediante el estado del atributo {@code estaVivo}.
     * 
     * @param juguete Nombre del juguete con el que el Perro va a jugar.
     */
    public void jugar(String juguete) {
        if( this.isEstaVivo() )
            System.out.println("El Perro " + this.getNombre() + ", " + this.getApodo() + " juega con su juguete " + juguete + ".");
        else
            System.out.println("El Perro no puede jugar porque ya no está vivo.");
    }
    
    /**
     * Método que imprime en pantalla de manera amigable el estado de todos los atributos del Perro.
     */
    public void imprimirPerro() {
        System.out.println("\nEl Perro " + this.getNombre() + " tiene las siguientes características:"
                + "\n\t ### Características de Animal ###"
                + "\n\tGrupo animal: " + this.getGrupoAnimal()
                + "\n\tApodo: " + this.getApodo()
                + "\n\tEstá " + ( this.isEstaVivo() ? "vivo" : "muerto" )
                + "\n\tNúmero de patas: " + this.getNumPatas() 
                + "\n\t### Características de Perro ###"
                + "\n\tRaza: " + getRaza()
                + "\n\tColor del pelaje: " + getColor()
                + "\n\tNivel de energía: " + getNivelDeEnergia()
                + "\n\tPeso: " + getPeso()
                + "\n\tEstado de salud: " + getEstadoDeSalud() );
    }

    /**
     * Hace el que el Animal se desplace en ninguna dirección en específico una cantidad especificada en metros.
     * Como el Animal es un Perro, se indica claramente que se desplaza caminando.
     * 
     * Únicamente se realiza correctamente cuando el estado de su atributo {@code estaVivo} se encuentra en {@code true}. En ambos casos se indica en pantalla.
     * 
     * @param distancia Cantidad en metros que el Animal se va a desplazar, cambiando su posición hacia una única dirección cualesquiera.
     */
    @Override
    public void moverse(float distancia) {
        super.moverse(distancia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if( super.isEstaVivo() )
            System.out.println("Como es un perro, caminó los " + distancia + " metros.");
    }

    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "Perro{" + "raza=" + raza + ", color=" + color + ", nivelDeEnergia=" + nivelDeEnergia + ", peso=" + peso + ", estadoDeSalud=" + estadoDeSalud + '}';
    }
}
