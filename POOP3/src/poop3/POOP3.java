/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.text.SimpleDateFormat;

/**
 * Clase principal que ejecuta mediante el método principal la lógica del programa para la práctica tres.
 * 
 * @author Oscar Cabrera
 */
public class POOP3 {

    /**
     * Método principal que da incio a la lógica de la aplicación.
     * 
     * Explora el uso de: for-each, strings, wrappers, colecciones y utilerías: ArrayList, Hashtable, Enumerator, Math, Date, Calendar, SimpleDateFormat.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        int nums1[]; // Forma heredada de C
        int[] nums2 = {1,2,3,4,5};
        int[] nums3 = new int[5];
        int[] nums4; // Forma recomendada
        nums4 = new int[5];

        System.out.println("########## for each ##########");

        for(int temp : nums2) {
            System.out.println("Cuenta: " + temp);
        }

        for (int i = 0; i < nums4.length; i++) {
            nums4[i] = i * 10;
        }

        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }

        System.out.println("########## String ##########");

        String cadena = new String("Hola mundo"); // Forma "Canónica"
        System.out.println(cadena);
        String cadena1 = "Hola mundo de forma recomendada"; // Forma recomendada (Inicializarla como un dato primitivo)
        System.out.println(cadena1);

        String nombre = "Oscar";
        String apellido = "Cabrera";
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre + " " + apellido);
        String nombreCompleto = nombre + apellido;
        System.out.println(nombreCompleto);

        System.out.println("########## Wrapper ##########");

        int a = 4;
        Integer b = new Integer(4);
        System.out.println(b);
        Integer c = 4;
        System.out.println(c);
        Integer d = a;
        String cadena3 = d.toString();
        String cadena4 = 4 + "";
        System.out.println(cadena3);
        System.out.println(cadena4);

        System.out.println("########## Colecciones ##########"); // Las colecciones guardar referencias, no datos. Los primitivos sí almacenan datos.
        System.out.println("########## ArrayList ##########"); // Puede tener elementos duplicados y mantiene el orden de inserción.

        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(1, 10);
        System.out.println(miArrayList.size());
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        miArrayList.add(77);
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        System.out.println(miArrayList.size());

        System.out.println("########## HashTable ##########"); // (¿Set?) No mantiene un orden de inserción y no permite elementos duplicados.
        Hashtable<Integer, String> miTabla = new Hashtable<Integer, String>();
        miTabla.put(1, "uno");
        miTabla.put(55566778, "Antonio");
        miTabla.put(44778899,"Diana");
        System.out.println("Elementos en tabla: " + miTabla.size());

        System.out.println("########## Enumerador ##########"); // Asigna un ìndice de manera aleatoria a los elementos de un conjunto. La naturaleza de los conjuntos es que no mantiene un orden de inserción. "El conjunto no tiene orden, así que hay que asignarle uno."

        Integer llave;
        String valor;

        Enumeration<Integer> enumeradorLlaves = miTabla.keys(); // Enumerar las claves.
        while(enumeradorLlaves.hasMoreElements()) {
            llave = enumeradorLlaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println(llave + " " + valor);
        }

        System.out.println(Math.PI);
        Date dia = new Date();
        System.out.println(dia);

        // Calendar
        // Realizar un diccionario (una palabra y definirla) en una tabla Hash. (La clave es es la palabra)
        // Realizar una agenda con cinco registros guardando el nombre de la persona y su cumpleaños utlizando la clase Calendar. Imprimir todos los elementos.

        System.out.println("########## Diccionario ##########");

        Hashtable<String, String> diccionario = new Hashtable<String, String>();

        diccionario.put("petricor", "m. Olor a tierra mojada, normalmente residual de la lluvia en zonas boscosas.");
        diccionario.put("imperterrito", "adj. Dicho usualmente de una persona, imperturbable en lo que hace.");
        diccionario.put("zozobrar", "intr. Peligrar la embarcación por contraste y fuerza de la marea.");
        diccionario.put("pericia", "f. Astucia, sabiduría y experiencia en alguna actividad o disciplina.");
        diccionario.put("recalcitrante", "adj. Terco, obstinado. | Persona que no cambia de opinión, aún cuando sabe que está equivocada.");

        Enumeration<String> enumeradorDiccionario = diccionario.keys();

        String palabra, definicion;

        System.out.println("El diccionario contiene las siguientes entradas:");
        while(enumeradorDiccionario.hasMoreElements()) {
            palabra = enumeradorDiccionario.nextElement();
            definicion = diccionario.get(palabra);
            System.out.println(palabra + " : " + definicion);
        }

        System.out.println("########## Agenda ##########");

        Hashtable<String, Calendar> agenda = new Hashtable<String, Calendar>();

        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(Calendar.MONTH, Calendar.APRIL);
        fecha1.set(Calendar.DAY_OF_MONTH, 8);
        agenda.put("Mariela Mejia", fecha1);

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(Calendar.MONTH, Calendar.MARCH);
        fecha2.set(Calendar.DAY_OF_MONTH, 25);
        agenda.put("Jairo García", fecha2);

        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(Calendar.MONTH, Calendar.MAY);
        fecha3.set(Calendar.DAY_OF_MONTH, 8);
        agenda.put("Moranchel Manjarrez", fecha3);

        Calendar fecha4 = Calendar.getInstance();
        fecha4.set(Calendar.MONTH, Calendar.OCTOBER);
        fecha4.set(Calendar.DAY_OF_MONTH, 1);
        agenda.put("Andrea Leilani", fecha4);

        Calendar fecha5 = Calendar.getInstance();
        fecha5.set(Calendar.MONTH, Calendar.NOVEMBER);
        fecha5.set(Calendar.DAY_OF_MONTH, 15);
        agenda.put("Valeria Iñiguez", fecha5);

        Enumeration<String> enumeradorAgenda = agenda.keys();

        String nombreAmigo;
        Calendar cumpleaños;
        int mesCumpleaños, diaCumpleaños;

        System.out.println("Las personas en la agenda son:");
        while(enumeradorAgenda.hasMoreElements()) {
            nombreAmigo = enumeradorAgenda.nextElement();
            cumpleaños = agenda.get(nombreAmigo);
            mesCumpleaños = cumpleaños.get(Calendar.MONTH) + 1; // MONTH + 1 porque los meses van de 0 a 11
            diaCumpleaños = cumpleaños.get(Calendar.DAY_OF_MONTH);
            System.out.println("Persona : " + nombreAmigo + "\t\tCumpleaños (M/D) : " + mesCumpleaños + " / " + diaCumpleaños);
        }

        System.out.println("************* Math **************");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));

        System.out.println("************* Date **************");
        Date hoy = new Date();
        System.out.println(hoy);

        System.out.println("************* Calendario **************");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);

        System.out.println("************* Formato de date **************");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));

        System.out.println("************* Formato de calendar **************");

        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
        fechaActual += (calendarioHoy.get(Calendar.MONTH)+1) + " de ";
        fechaActual += calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
        
    }
    
}
