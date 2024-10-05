/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un gerente a partir del empleado genérico.
 *
 * @author Oscar Cabrera
 */
public class Gerente extends Empleado {
    
    /**
     * Presupuesto que tiene asignado el Gerente de una área genérica para realizar ciertas cosas.
     */
    private float presupuesto;

    /**
     * Crea una nueva instancia de Gerente vacía.
     */
    public Gerente() {
    }
    
/*
    public Gerente(float presupuesto) {
        this.presupuesto = presupuesto;
    }
*/

    /**
     * Crea una nueva instancia de Gerente llena.
     * 
     * @param presupuesto Presupuesto que tiene asignado el Gerente de una área genérica para realizar ciertas cosas.
     * @param nombre Nombre del Empleado.
     * @param numEmpleado Número único e identificable del Empleado.
     * @param sueldo Sueldo que percibe el Empleado.
     */
    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    /**
     * Método que devuelve el presupuesto asignado al Gerente.
     * @return Presupuesto del que dispone el Gerente para realizar sus cosas.
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * Método que establece el presupuesto asignado al Gerente.
     * @param presupuesto Presupuesto del que dispone el Gerente para realizar sus cosas.
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
