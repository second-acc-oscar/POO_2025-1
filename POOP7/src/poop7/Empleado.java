/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un empleado genérico.
 *
 * @author Oscar Cabrera
 */
public class Empleado extends Object {
    
    /**
     * El nombre del Empleado.
     */
    private String nombre;
    
    /**
     * El número de empleado asociado a Empleado. Es unico e identificable.
     */
    private int numEmpleado;
    
    /**
     * El sueldo que percibe el Empleado.
     */
    private float sueldo;

    /**
     * Crea una nueva instancia de Empleado vacia.
     */
    public Empleado() {
    }

    /**
     * Crea una nueva instancia de Empleado llena.
     * 
     * @param nombre Nombre del Empleado.
     * @param numEmpleado Número único e identificable del Empleado.
     * @param sueldo Sueldo que percibe el Empleado.
     */
    public Empleado(String nombre, int numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    /**
     * Método que devuelve el nombre del Empleado.
     * 
     * @return El nombre del Empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del Empleado.
     * 
     * @param nombre El nombre del Empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el número de empleado del Empleado.
     * 
     * @return El número de empleado del Empleado.
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Método que establece el número de empleado del Empleado.
     * 
     * @param numEmpleado El número de empleado del Empleado.
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Método que devuelve el sueldo del Empleado.
     * 
     * @return El sueldo del Empleado.
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * Método que establece el sueldo del Empleado.
     * 
     * @param sueldo El sueldo del Empleado.
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Método que hace que el sueldo de un Empleado se incremente porcentualmente.
     * 
     * @param porcentajeDeAumento Porcentaje de incremento que se verá reflejado en el sueldo del empleado.
     */
    public void aumentarSueldo(int porcentajeDeAumento) {
        sueldo += sueldo * porcentajeDeAumento / 100;
    }

    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}