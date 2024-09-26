/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 * Clase principal que ejecuta mediante el método principal la lógica del programa para la práctica cuatro.
 * 
 * @author Oscar Cabrera
 */
public class POOP4 {

    /**
     * Método principal que da incio a la lógica de la aplicación.
     * 
     * Explora el uso de las clases desarrolladas.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto = new Punto(); // clase (tipo de dato) -> id de variable -> mètodo constructor // definir un punto
        punto.imprimePunto();
        Punto punto2 = new Punto(1, 2, "Punto 2"); // definir e inicializar un punto
        punto2.imprimePunto();

        // "inflar" un objeto (Llenarlo de información
        punto.x = 20;
        punto.y = 100;
        punto.nombre = "Punto 1";
        punto.imprimePunto();
        System.out.println(punto); // Imprime: El paquete donde está contenido, la clase del objeto "at" la referencia de la dirección donde está contenido
        // Vas a encontrar una entidad de tipo punto de todas las posibles por haber en la dirección POOP4 en la dirección de memoria -----.

        /*
         * Los proyectos van con mayúsculas todo. (POOP4)
         * El paquete debe ir todo con minúsculas. (poop4)
         * Las clases deben de ir con UpperCamelCase. (Punto)
         * Las variables se utilizan con lowerCamelCase.
         */

        Perro perro = new Perro();
        perro.imprimirPerro();
        Perro perro2 = new Perro("Cafe", "Lacio", 10, "Pug", 2);
        perro2.imprimirPerro();
        perro2.jugar();
        perro2.comer();
        perro2.correr();
        perro2.morder();
        perro2.saltar(2f, 3.5f, 5f);

        Alumno alumno = new Alumno();
        alumno.asistirAClase("EDAII");
        alumno.dormir(20);
        alumno.estudiar("pasar el primer examen de Probabilidad");
        alumno.leer("Data Structures and Algorithms in C");
        alumno.presentarExamen("Los cuatro pilares de la POO");

        Coche coche = new Coche();
        coche.acelerar(100);
        coche.frenar(80);
        coche.limpiarParabrisas();
        coche.prenderFaros();
        coche.prenderIntermitentes();

        Profesor profesor = new Profesor();
        profesor.calificarExamen("1er examen parcial de Juanito Alcachofa");
        profesor.calificarTarea("tarea 3 de Sutana Pérez");
        profesor.darClase(115);
        profesor.hacerExamen();
        profesor.tomarAsistencia("Armando, Belén, Cisco, Darla, Ernesto...");

        TrianguloRectangulo tr = new TrianguloRectangulo();
        tr.calcularArea(3.2f, 4.6f);
        tr.calcularHipotenusa(1f, 1f);
        tr.calcularPerimetro(3.6f, 4.8f, 6.0f);
        tr.esTernaPitagorica(3.0f, 4.0f, 5.0f);
        tr.esTrianguloIsosceles(3.5f, 3.5f);
    }
    
}