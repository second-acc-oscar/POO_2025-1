/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 * Clase que representa a un Animal en su expresión más general.
 *
 * @author Oscar Cabrera
 */
public class Animal {
    
    /**
     * Nombre formal / científico del Animal.
     */
    private String nombre;
    
    /**
     * Grupo al que pertenece al animal, e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     */
    private String grupoAnimal;
    
    /**
     * Apodo que tiene el animal "de cariño" al ser domesticado. Otros nombres informales.
     */
    private String apodo;
    
    /**
     * Indica si el animal está vivo o no. Una vez establecido con {@code false} no puede volver a su estado de {@code true}.
     */
    private boolean estaVivo;
    
    /**
     * Número de patas del animal.
     */
    private int numPatas;

    /**
     * Crea una nueva instancia de Animal vacía.
     */
    public Animal() {
    }

    /**
     * Crea una nueva instancia de Animal llena.
     * 
     * @param nombre Nombre formal / científico del Animal.
     * @param grupoAnimal Grupo al que pertenece al animal, e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     * @param apodo Apodo que tiene el animal "de cariño" al ser domesticado. Otros nombres informales.
     * @param estaVivo Indica si el animal está vivo o no. Una vez establecido con {@code false} no puede volver a su estado de {@code true}.
     * @param numPatas Número de patas del animal.
     */
    public Animal(String nombre, String grupoAnimal, String apodo, boolean estaVivo, int numPatas) {
        this.nombre = nombre;
        this.grupoAnimal = grupoAnimal;
        this.apodo = apodo;
        this.estaVivo = estaVivo;
        this.numPatas = numPatas;
    }

    /**
     * Método que devuelve el nombre del Animal.
     * @return El nombre del Animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del Animal.
     * @param nombre Nombre formal / científico del Animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el grupo animal al que pertenece el Animal.
     * @return El grupo animal al que pertenece el Animal.
     */
    public String getGrupoAnimal() {
        return grupoAnimal;
    }

    /**
     * Método que establece el grupo animal al que pertenece el Animal.
     * @param grupoAnimal Grupo al que pertenece al animal, e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     */
    public void setGrupoAnimal(String grupoAnimal) {
        this.grupoAnimal = grupoAnimal;
    }

    /**
     * Método que devuelve el apodo del Animal.
     * @return El apodo del Animal.
     */
    public String getApodo() {
        return apodo;
    }

    /**
     * Método que establece el apodo del Animal.
     * @param apodo Apodo que tiene el animal "de cariño" al ser domesticado. Otros nombres informales.
     */
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    /**
     * Método que devuelve el estado de vivo o muerto del Animal.
     * @return {@code true} si el Animal aún se encuentra vivo; {@code false} en caso contrario.
     */
    public boolean isEstaVivo() {
        return estaVivo;
    }

    /**
     * Método que establece si el Animal está vivo.
     * @param estaVivo Indica si el animal está vivo o no.
     */
    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    /**
     * Método que devuelve el número de patas del Animal.
     * @return El número de patas del Animal.
     */
    public int getNumPatas() {
        return numPatas;
    }

    /**
     * Método que establece el número de patas que tiene el Animal.
     * @param numPatas Número de patas del animal.
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    /**
     * Hace que el Animal respire profundamente si se encuentra vivo (atributo {@code estaVivo} establecido en {@code true}, en caso contrario lo indica.
     */
    public void respirar() {
        if( estaVivo ){
            System.out.println("El animal respira pacíficamente.");
        }
        else
            System.out.println("El animal no respira más porque ya está muerto.");
    }
    
    /**
     * Hace que el animal se muera, cambia el estado de su atributo {@code estaVivo} de {@code true} a {@code false}, y si ya estaba en {@code false} no hace nada. En ambos casos lo indica.
     */
    public void morirse() {
        if( estaVivo ) {
            estaVivo = false;
            System.out.println("El animal " + nombre + " ha cumplido su tiempo en el ciclo de vida, y ha fenecido.");
        }
        else
            System.out.println("El animal " + nombre + " ya estaba muerto.");
    }
    
    /**
     * Hace que el animal coma, indica en pantalla si se concretó correctamente o no, dependiendo del estado de su atributo {@code estaVivo}, si se encuentra en {@code false} no hace nada.
     */
    public void alimentarse() {
        if( estaVivo ) {
            System.out.println("El animal se alimenta para poder seguir haciendo sus actividades del día.");
        }
        else
            System.out.println("El animal no es capaz de alimentarse más, puesto que no está vivo.");
    }
    
    /**
     * Hace el que el Animal se desplace en ninguna dirección en específico una cantidad especificada en metros.
     * 
     * Únicamente se realiza correctamente cuando el estado de su atributo {@code estaVivo} se encuentra en {@code true}. En ambos casos se indica en pantalla.
     * 
     * @param distancia Cantidad en metros que el Animal se va a desplazar, cambiando su posición hacia una única dirección cualesquiera.
     */
    public void moverse(float distancia) {
        if( estaVivo ) {
            System.out.println("El animal se desplazó " + distancia + " metros.");
        }
    }

    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", grupoAnimal=" + grupoAnimal + ", apodo=" + apodo + ", estaVivo=" + estaVivo + ", numPatas=" + numPatas + '}';
    }
}