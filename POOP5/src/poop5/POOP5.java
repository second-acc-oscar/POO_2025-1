/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Clase principal que ejecuta mediante el método principal la lógica del programa para la práctica cinco.
 * 
 * @author Oscar Cabrera
 */
public class POOP5 {

    /**
     * Método principal que da incio a la lógica de la aplicación.
     * 
     * Explora el uso de las clases desarrolladas.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.setRadio(4f);
        System.out.println("Radio : " + circulo.getRadio());
        circulo.calcularArea();
        circulo.calcularPerimetro();
        // Explicar ejercicio borrando el constructor vacìo de la clase Circulo con excepción el ejecutar el código principal
        // Por qué obligatoriamente se necesita del constructor vacío

        Fecha fecha = new Fecha();

        Persona Rodrigo = new Persona();
        Rodrigo.setEdad(18);
        Rodrigo.setAltura(1.7f);
        Rodrigo.setNombre("Ceròn Noriega");
        Rodrigo.setOcupacion("Estudiante");
        Rodrigo.setFechaDeNacimiento(fecha);

        System.out.println(Rodrigo);
    }
    
}