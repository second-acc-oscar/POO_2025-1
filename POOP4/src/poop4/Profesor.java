/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

import java.util.Random;

/**
 * Clase que representa a un profesor de la Facultad de Ingeniería (UNAM).
 * 
 * @author Oscar Cabrera
 */
public class Profesor {
    
    /**
     * El nombre del Profesor.
     */
    String nombre;
    
    /**
     * El nombre de la asignatura que imparte el Profesor. Puede impartir una única asignatura.
     */
    String materiaQueImparte;
    
    /**
     * Edad en años del Profesor.
     */
    int edad;
    
    /**
     * Sueldo mensual que percibe el Profesor.
     */
    float sueldo;
    
    /**
     * Número de años que tiene de experiencia como docente el Profesor.
     */
    int añosExperiencia;

    /**
     * Crea una nueva instancia de Profesor vacía.
     */
    public Profesor() {

    }

    /**
     * Crea una nueva instancia de profesor llena.
     * 
     * @param nombre Nombre del Profesor.
     * @param materiaQueImparte Nombre de la asignatura que imparte el Profesor.
     * @param edad Edad en años del Profesor.
     * @param sueldo Sueldo que percibe el Profesor.
     * @param añosExperiencia Número de años que tiene de experiencia como docente el Profesor.
     */
    public Profesor( String nombre, String materiaQueImparte, int edad, float sueldo, int añosExperiencia){
        this.nombre = nombre;
        this.materiaQueImparte = materiaQueImparte;
        this.edad = edad;
        this.sueldo = sueldo;
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * Método que hace al Profesor impartir una clase.
     * 
     * @param duracion Duración en minutos de la clase que impartirá el Profesor.
     */
    void darClase( int duracion ) {
        if(duracion < 60)
            System.out.println("La clase el día de hoy será más corta de lo normal, tengo un pendiente.");
        else
            if(duracion <= 120)
                System.out.println("Hemos acabado el día de hoy con la clase, la tarea la entregan la próxima clase.");
            else
                System.out.println("Bienvenidos a la conferencia del día de hoy.");
    }

    /**
     * Método que hace al Profesor calificar una tarea específica.
     * 
     * @param tarea Nombre de la tarea que el Profesor va a calificar.
     * @return La calificación que obtuvo la tarea calificada.
     */
    float calificarTarea( String tarea ) {
        Random rm = new Random();
        float calif = 0f;

        calif += rm.nextInt(1, 10) / 10;

        calif += rm.nextInt(6, 11);

        System.out.println("La tarea " + tarea + " obtuvo una calificación de " + calif + ".");

        return calif;
    }

    /**
     * Método que hace al Profesor pasar lista.
     * 
     * @param lista Lista de alumnos que el Profesor debe comprobar su asistencia.
     */
    void tomarAsistencia( String lista ) {
        System.out.println("Ya pasaron los quince minutos de tolerancia, vamos a pasar la lista de los siguientes alumnos: " + lista);
    }

    /**
     * Método que hace al Profesor aplicar un examen anunciando el nombre del mismo.
     * 
     * @return El nombre del examen que se va a aplicar.
     */
    String hacerExamen() {
        String examen = "Primer examen de POO.\n1. ¿Qué es la POO?\n2. ¿Cuálos son los cuatro pilares de la POO?\n3. ¿De qué trata la herencia?";

        System.out.println("El examen es el siguiente " + examen + ".");

        return examen;
    }

    /**
     * Método que hace al Profesor calificar un examen específico.
     * 
     * @param examen Nombre del examen que el Profesor va a calificar.
     * @return La calificación que obtuvo el examen calificado.
     */
    float calificarExamen( String examen ) {
        Random rm = new Random();
        float calif = 0f;

        calif += rm.nextInt(1, 10) / 10;

        calif += rm.nextInt(6, 11);

        System.out.println("El examen " + examen + " obtuvo una calificación de " + calif + ".");

        return calif;
    }
}