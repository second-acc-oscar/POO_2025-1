/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase que representa la generalización en un Cuadrilatero de un Poligono general.
 *
 * @author Oscar Cabrera
 */
public class Cuadrilatero extends Poligono {
    
    /**
     * Àngulo asociado al primer par de ángulos del Cuadrilatero.
     */
    private int alfa;
    
    /**
     * Ángulo asociado sesgundo par de ángulos del Cuadrilatero.
     */
    private int beta;
    
    /**
     * Uno de los lados del Cuadrilatero. Lado a.
     */
    private float a;
    
    /**
     * Uno de los lados del Cuadrilatero. Lado b.
     */
    private float b;
    
    /**
     * Uno de los lados del Cuadrilatero. Lado c.
     */
    private float c;
    
    /**
     * Uno de los lados del Cuadrilatero. Lado d.
     */
    private float d;
    
    /**
     * Valor de la base del Cuadrilatero.
     */
    private float base;
    
    /**
     * Valor de la altura del Cuadrilatero.
     */
    private float altura;

    /**
     * Crea una nueva instancia de Cuadrilatero vacía.
     */
    public Cuadrilatero() {
    }

    /**
     * Crea una nueva instancia de Cuadrilatero llena.
     * 
     * @param alfa Àngulo asociado al primer par de ángulos del Cuadrilatero.
     * @param beta Ángulo asociado sesgundo par de ángulos del Cuadrilatero.
     * @param a Uno de los lados del Cuadrilatero. Lado a.
     * @param b Uno de los lados del Cuadrilatero. Lado b.
     * @param c Uno de los lados del Cuadrilatero. Lado c.
     * @param d Uno de los lados del Cuadrilatero. Lado d.
     * @param base Valor de la base del Cuadrilatero.
     * @param altura Valor de la altura del Cuadrilatero.
     */
    public Cuadrilatero(int alfa, int beta, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Método que devuelve el primer par de ángulos del Cuadrilatero. Ánglos alfa.
     * @return El par de ángulos alfa del Cuadrilatero.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Método que establece el primer par de ángulos del Cuadrilatero. Ánglos alfa.
     * @param alfa El ángulo alfa del Cuadrilatero.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Método que devuelve el segundo par de ángulos del Cuadrilatero. Ángulos beta.
     * @return El par de ángulos beta del Cuadrilatero.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Método que establece el segundo par de ángulos del Cuadrilatero. Ánglos beta.
     * @param beta El ángulo beta del Cuadrilatero.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    } 
    
    /**
     * Método que devuelve el lado 'a' del Cuadrilatero.
     * @return El lado 'a' del Cuadrilatero.
     */
    public float getA() {
        return a;
    }

    /**
     * Método que establece el lado 'a' del Cuadrilatero.
     * @param a El lado 'a' del Cuadrilatero.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Método que devuelve el lado 'b' del Cuadrilatero.
     * @return El lado 'b' del Cuadrilatero.
     */
    public float getB() {
        return b;
    }

    /**
     * Método que establece el lado 'b' del Cuadrilatero.
     * @param b El lado 'b' del Cuadrilatero.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Método que devuelve el lado 'c' del Cuadrilatero.
     * @return El lado 'c' del Cuadrilatero.
     */
    public float getC() {
        return c;
    }

    /**
     * Método que establece el lado 'c' del Cuadrilatero.
     * @param c El lado 'c' del Cuadrilatero.
     */
    public void setC(float c) {
        this.c = c;
    }
 
    /**
     * Método que devuelve el lado 'd' del Cuadrilatero.
     * @return El lado 'd' del Cuadrilatero.
     */
    public float getD() {
        return d;
    }

    /**
     * Método que establece el lado 'd' del Cuadrilatero.
     * @param d El lado 'd' del Cuadrilatero.
     */
    public void setD(float d) {
        this.d = d;
    }

    /**
     * Método que devuelve la base del Cuadrilatero.
     * @return La base del Cuadrilatero.
     */
    public float getBase() {
        return base;
    }

    /**
     * Método que establece la base del Cuadrilatero.
     * @param base La base del Cuadrilatero.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Método que devuelve la altura del Cuadrilatero.
     * @return La altura del Cuadrilatero.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Método que establece la altura del Cuadrilatero.
     * @param altura La altura del Cuadrilatero.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Método que devuelve y calcula el perímetro del Cuadrilatero.
     * @return El perimetro del Cuadrilatero.
     */
    @Override
    public float perimetro() {
        return a + b + c + d;
    }

    /**
     * Método que devuelve y calcula el área del Cuadrilatero.
     * @return El área del Cuadrilatero.
     */
    @Override
    public float area() {
        return 2 * base + 2 * altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }
}
