package poop5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa a una persona.
 * 
 * @author Oscar Cabrera
 */
public class Persona {
    
    /**
     * Edad en años de la persona.
     */
    private int edad;
    
    /**
     * Altura en centímetros de la Persona.
     */
    private float altura;
    
    /**
     * Nombre de la Persona.
     */
    private String nombre;
    
    /**
     * Fecha de nacimiento de la Persona.
     */
    private Fecha fechaDeNacimiento;
    
    /**
     * A lo que se dedica la Persona.
     */
    String ocupacion;

    /**
     * Crea una nueva instancia de Persona vacía.
     */
    public Persona() {

    }

    /**
     * Crea una nueva instancia de Persona llena.
     * 
     * @param edad Edad en años de la persona.
     * @param altura Altura en centímetros de la Persona.
     * @param nombre Nombre de la Persona.
     * @param ocupacion Crea una nueva instancia de Persona vacía.
     */
    public Persona(int edad, float altura, String nombre, String ocupacion) {
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
    }

    /**
     * Método que devuelve la edad de la Persona.
     * @return La edad de la Persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que establece la edad de la Persona.
     * @param edad La edad de la Persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que devuelve la altura de la Persona.
     * @return La altura de la Persona.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Método que establece la altura de la Persona.
     * @param altura La altura de la Persona.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Método que devuelve el nombre de la Persona.
     * @return El nombre de la Persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de la Persona.
     * @param nombre El nombre de la Persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la fecha de nacimiento de la Persona.
     * @return La fecha de nacimiento de la Persona.
     */
    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Método que establece la fecha de nacimiento de la Persona.
     * @param fechaDeNacimiento La fecha de nacimiento de la Persona.
     */
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * Método que devuelve la ocupación de la Persona.
     * @return La ocupación de la Persona.
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * Método que establece la ocupación de la Persona.
     * @param ocupacion La ocupación de la Persona.
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * Método que hace comer a la Persona.
     * 
     * @return {@code true} si la Persona sí comió; {@code false} en caso contrario.
     */
    public boolean comer() {
        return true;
    }

    /**
     * Método que hace jugar a la Persona.
     * 
     * @return {@code true} si la Persona sí jugó; {@code false} en caso contrario.
     */
    public boolean jugar() {
        return true;
    }

    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", ocupacion=" + ocupacion + '}';
    }
}
