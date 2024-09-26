/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 * Clase principal que ejecuta mediante el método principal la lógica del programa para la práctica dos.
 * 
 * @author Oscar Cabrera
 */
public class POOP2 {

    /**
     * Método principal que da incio a la lógica de la aplicación.
     * 
     * Explora el uso de: Impresión de información, switch, while, do-while, for,  y for-each.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Hola, mundo!");
        System.out.println("Hola, mundo!"); // sout + TAB

        System.out.println("######### If ########"); // Separados de secciones dentro del programa

        int a = 5, b = 3;

        if (a > b) { // ifelse + TAB
            System.out.println("a es mayor que b.");
        } else {
            System.out.println("b es mayor que a.");
        }

        System.out.println("######### If ########");

        if (menor(a,b)) {
            System.out.println("a es menor que b.");
        } else {
            System.out.println("b es menor que a.");
        }

        System.out.println("######### Switch ########");

        int dia = 4;
        switch (dia) { // sw + TAB
            case 1:
                System.out.println("Lunes.");
                break;
            case 2:
                System.out.println("Martes.");
                break;
            case 3:
                System.out.println("Miércoles.");
                break;
            case 4:
                System.out.println("Jueves.");
                break;
            case 5:
                System.out.println("Viernes.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
            case 7:
                System.out.println("Domingo.");
                break;
            default:
                System.out.println("No es un día de la semana.");
        }

        System.out.println("######### Switch ########");

        char vocal = 'a';
        switch (vocal) {
            case 'a':
                System.out.println("Se seleccionó la vocal a.");
                break;
            case 'e':
                System.out.println("Se seleccionó la vocal e.");
                break;
            case 'i':
                System.out.println("Se seleccionó la vocal i.");
                break;
            case 'o':
                System.out.println("Se seleccionó la vocal o.");
                break;
            case 'u':
                System.out.println("Se seleccionó la vocal u.");
                break;
            default:
                System.out.println("No es una vocal.");
        }

        System.out.println("######### While ########");

        int n = 0;
        while (n < 10) { // wh + TAB
            System.out.println("Contando hacia arriba n = " + n);
            n++;
        }
        while (n>0) {
            System.out.println("Contando hacia abajo n = " + n);
            n--;
        }
        System.out.println("n="+n);

        System.out.println("######### Do-While ########");

        do { // dowhile + TAB
            System.out.println("Contando hacia abajo n = " + n);
            n--;
        } while (n > 0);

        System.out.println("######### For ########");

        for (int i = 0; i < 10; i++) { // fori + TAB
            System.out.println("Contando hacia arriba "+i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }

        System.out.println("######### For ########");

        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene " + numElementos + " elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene " + numElementos + " posiciones");
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i * 10;
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2 [" + i + "] = " + miArreglo2[i]);
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje " + j + "%");
        }

        System.out.println("######### For-Each ########");

        for (int i : miArreglo2) { // fore + TAB
            System.out.println("Hackeando la nasa " + i + "%");
        }
    }

/*    private static boolean menor(int a, int b) { // Click derecho en el error por método no creado
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } */
    
    /**
     * Método que devuelve el resultado de evaluar si el primer número indicado, es menor al segundo´número indicado. Trabaja con enteros.
     * @param a Primer número a evaluar. Se quiere saber si es el menor.
     * @param b Segundo número a evaluar. Se queire saber si es el mayor.
     * @return 
     */
    private static boolean menor(int a, int b) {
        return a < b;
    }
}
