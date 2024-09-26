/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Clase que representa una fecha en el calendario tradicional.
 * 
 * @author Oscar Cabrera
 */
class Fecha {
    
    /**
     * Número del día de la Fecha según el mes.
     */
    private int dia;
    
    /**
     * Número del mes de la Fecha según el año.
     */
    private int mes;
    
    /**
     * Número del año de la Fecha.
     */
    private int anio;

    /**
     * Crea una nueva instancia de Fecha vacía.
     */
    public Fecha() {

    }

    /**
     * Crea una nueva instancia de Fecha llena.
     * 
     * @param dia Día de la Fecha.
     * @param mes Mes de la Fecha.
     * @param anio Año de la Fecha.
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Método que devuelve el día de la Fecha.
     * @return El día de la Fecha.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Método que establece el día de la Fecha.
     * @param dia El día de la Fecha.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Método que devuelve el mes de la Fecha.
     * @return El mes de la Fecha.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Método que establece el mes de la Fecha.
     * @param mes El mes de la Fecha.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Método que devuelve el año de la Fecha.
     * @return El año de la Fecha.
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Método que establece el año de la Fecha.
     * @param anio El año de la Fecha.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Imprime en pantalla la información de la instancia Fecha en el formato DIA-MES-AÑO.
     * @return La representación en cadena de la instancia Fecha.
     */
    public String imprimirFecha() {
        String fecha = dia + "-" + mes + "-" + anio;
        return fecha;
    }
}
