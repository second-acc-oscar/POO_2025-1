/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

import java.util.Random;

/**
 * Clase que representa a un alumno de la Facultad de Ingeniería (UNAM).
 * 
 * @author Oscar Cabrera
 */
public class Alumno {
   
/**
 * El nombre del alumno.
 */
String nombre;

/**
 * El número de cuenta (9 dígitos) del alumno.
 */
int numeroDeCuenta;

/**
 * Valor del promedio general del alumno.
 */
float promedioGeneral;

/**
 * Número de las materias que el alumno está cursando en el momento actual.
 */
int materiasCursando;

/**
 * Estado del alumno como regular (en avance curricular).
 */
boolean esRegular;

/**
 * Crea una nueva instancia de Alumno vacía.
 */
public Alumno(){
    
}

/**
 * Crea una nueva instancia de Alumno llena.
 * 
 * @param nombre El nombre de la nueva instancia de Alumno.
 * @param numeroDeCuenta El número de cuenta de la nueva instancia de Alumno.
 * @param promedioGeneral El promedio general de la nueva instancia de Alumno.
 * @param materiasCursando El número de materias que está cursando la nueva instancia de Alumno.
 * @param esRegular El estado de la nueva instancia de Alumno como regular en su avance de materias.
 */
public Alumno( String nombre, int numeroDeCuenta, float promedioGeneral, int materiasCursando, boolean esRegular ){
    this.nombre = nombre;
    this.numeroDeCuenta = numeroDeCuenta;
    this.promedioGeneral = promedioGeneral;
    this.materiasCursando = materiasCursando;
    this.esRegular = esRegular;
}

/**
 * Método que hace al Alumno estudiar con un objetivo en específico.
 * 
 * @param objetivo La idea objetivo por la cual el alumno está estudiando.
 * @return {@code true} si el Alumno cumplió su objetivo en la sesión de estudio, o {@code false} si el Alumno <b>no<\b> cumplió su objetivo en la sesión de estudio.
 */
boolean estudiar( String objetivo ) {
    Random rm = new Random();

    System.out.println("Estudiando para cumplir " + objetivo);

    return rm.nextInt(10) <= 6;
}

/**
 * Método que hace que el alumno duerma cierto número de minutos.
 * 
 * @param minutos Tiempo en minutos que el alumno va a dormir.
 */
void dormir( int minutos ) {
    if(minutos <= 60)
        System.out.println("Hora de una siesta de " + minutos + " minutos.");
    else
        System.out.println("Ya es hora de dormir " +  minutos + " minutos.");
}

/**
 * Método que hace al alumno leer un libro en específico.
 * 
 * @param libro Título del libro que el alumno va a leer.
 */
void leer( String libro ) {
    System.out.println("Es hora de leer un rato para estudiar sobre " + libro + ".");
}

/**
 * Método que hace al alumno presentar un examen específico.
 * 
 * @param examen Nombre del examen que el alumno va a presentar.
 * @return La calificación obtenida por el alumno en el examen especificado.
 */
float presentarExamen( String examen ) {
    Random rm = new Random();
    float calif = 0f;

    calif += rm.nextInt(1, 11) / 10;

    calif += rm.nextInt(6, 11);

    System.out.println("Presenté el examen " + examen + " con calificación de " + calif + ".");

    return calif;
}

/**
 * Mëtodo que hace al alumno asistir a una clase específica.
 * 
 * @param clase Nombre de la clase a la que el alumno a a asistir.
 */
void asistirAClase( String clase ) {
    System.out.println("Hora de asistir a la clase " + clase);
}
}