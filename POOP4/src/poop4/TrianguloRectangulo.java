/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa a un triángulo rectángulo.
 * 
 * @author Oscar Cabrera
 */
public class TrianguloRectangulo{
    
    /**
     * Longitud en unidades cualesquiera del cateto A del TrianguloRectangulo.
     */
    float catetoA;
    
    /**
     * Longitud en unidades cualesquiera del cateto B del TrianguloRectangulo.
     */
    float catetoB;
    
    /**
     * Longitud de unidades cualesquiera de la hipotenusa del TrianguloRectangulo.
     */
    float hipotenusa;
    
    /**
     * Medida en grados del ángulo opuesto al cateto A del TrianguloRectangulo.
     */
    int anguloAlpha;
    
    /**
     * Medida en grados del ángulo opuesto al cateto B del TrianguloRectangulo.
     */
    int anguloBeta;

    
    /**
     * Crea una nueva instancia de TrianguloRectangulo vacía.
     */
    public TrianguloRectangulo() {

    }

    /**
     * Crea una nueva instancia de TrianguloRectangulo llena.
     * 
     * @param catetoA Longitud en unidades cualesquiera del cateto B del TrianguloRectangulo.
     * @param catetoB Longitud de unidades cualesquiera de la hipotenusa del TrianguloRectangulo.
     * @param hipotenusa Longitud de unidades cualesquiera de la hipotenusa del TrianguloRectangulo.
     * @param anguloAlpha Medida en grados del ángulo opuesto al cateto A del TrianguloRectangulo.
     * @param anguloBeta Medida en grados del ángulo opuesto al cateto B del TrianguloRectangulo.
     */
    public TrianguloRectangulo( float catetoA, float catetoB, float hipotenusa, int anguloAlpha, int anguloBeta){
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hipotenusa = hipotenusa;
        this.anguloAlpha = anguloAlpha;
        this.anguloBeta = anguloBeta;
    }

    /**
     * Método que calcula la hiponetusa del TrianguloRectangulo a partir de sus catetos utilizando el Teorema de Pitágoras.
     * 
     * @param a Primer cateto del TrianguloRectangulo.
     * @param b Segundo cateto del TrianguloRectangulo.
     * @return La medida calculada de la hipotenusa del TrianguloRectangulo.
     */
    float calcularHipotenusa( float a, float b ){
        float hipotenusa;

        hipotenusa = (float)Math.sqrt(a*a + b*b);

        System.out.println("La hipotenusa es :\t" + hipotenusa);

        return hipotenusa;
    }

    /**
     * Método que calcula si los lados de la instancia TrianguloRectangulo forman una teran pitagórica. Una terna pitagórica es aquella que satisface al Teorema de Pitágoras: a^2 + b^2 = c^2, para todo a, b, c perteneciente al conjunto de los números enteros.
     * 
     * @param a Primer cateto del TrianguloRectangulo.
     * @param b Segundo cateto del TrianguloRectangulo.
     * @param c Hipotenusa del TrianguloRectangulo.
     * @return {@code true} si, en efecto, los lados del TrianguloRectangulo forman una terna pitagórica; {@code false} si los lados del TrianguloRectangulo no forman una terna pitagórica.
     */
    boolean esTernaPitagorica(float a, float b, float c){
        boolean esTerna;

        esTerna = ( a == (int)a && b == (int)b && c == (int)c ) ? true : false;

        System.out.printf("El triángulo %s está formado por una terna pitagórica.%n", esTerna ? "SÍ" : "NO");

        return esTerna;
    }

    /**
     * Método que calcula el área del TrianguloRectangulo basado en la medida de sus catetos.
     * 
     * @param a Primer cateto del TrianguloRectangulo.
     * @param b Segundo cateto del TrianguloRectangulo.
     * @return La medida calculada del área del TrianguloRectangulo.
     */
    float calcularArea( float a, float b ){
        float area;

        area = a * b / 2;

        System.out.println("El área del tríangulo rectángulo con catetos " + a + " y " + b + " es :\t" + area);

        return area;
    }

    /**
     * Método que calcula el perímetro del TrianguloRectangulo basado en la medida sus lados.
     * 
     * @param a Primer cateto del TrianguloRectangulo.
     * @param b Segundo cateto del TrianguloRectangulo.
     * @param c La hipotenusa del TrianguloRectangulo.
     * @return La medida calculada del perímetro del TrianguloRectangulo.
     */
    float calcularPerimetro( float a, float b, float c){
        float perimetro;

        perimetro = a + b + c;

        System.out.println("El perímetro del rectángulo es :\t" + perimetro);

        return perimetro;
    }

    /**
     * Método que calcula si la instancia TrianguloRectangulo es al mismo tiempo un triángulo isósceles. En un único caso, la medida de ambos catetos es exactamente la misma.
     * 
     * @param a Primer cateto del TrianguloRectangulo.
     * @param b Segundo cateto del TrianguloRectangulo.
     * @param c Hipotenusa del TrianguloRectangulo.
     * @return {@code true} si, en efecto, el TrianguloRectangulo es al mismo tiemo un triángulo isósceles; {@code false} si el TrianguloRectangulo no es al mismo tiemo un triángulo isósceles
     */
    boolean esTrianguloIsosceles( float a, float b ){
        boolean esIsosceles;

        esIsosceles = (a == b) ? true : false;

        System.out.printf("El triángulo %s es isosceles.%n", esIsosceles ? "SÍ" : "NO");

        return esIsosceles;
    }
}