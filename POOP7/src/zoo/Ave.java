/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 * Clase que representa a un Ave que particulariza de un Animal genérico. 
 *
 * @author Oscar Cabrera
 */
public class Ave extends Animal {
    
    /**
     * Edad en años que el Ave tiene.
     */
    private int edad;
    
    /**
     * Nombre del tipo de especie a la que pertenece el Ave.
     */
    private String especie;
    
    /**
     * Longitud que tiene una sola ala del Ave, medida en centímetos exactos acotada mediante reondeo simétrico.
     */
    private int longitudAlas;
    
    /**
     * Indica si el Ave es capaz de volar.
     */
    private boolean vuela;
    
    /**
     * Representación en color del color predominante en el plumaje del Ave.
     */
    private String colorPlumas;

    /**
     * Crea una nueva instancia de Ave vacía.
     */
    public Ave() {
    }

    /**
     * Crea una nueva instancia de Ave llena.
     * Infla explícitamente todos los atributos de la clase, incluyendo los pertinentes a sus superclases en la jerarquía de herencia.
     * 
     * @param edad Edad en años que el Ave tiene.
     * @param especie Nombre del tipo de especie a la que pertenece el Ave.
     * @param longitudAlas Longitud que tiene una sola ala del Ave, medida en centímetos exactos acotada mediante reondeo simétrico.
     * @param vuela Indica si el Ave es capaz de volar.
     * @param colorPlumas Representación en color del color predominante en el plumaje del Ave.
     * @param nombre Nombre formal / científico del Animal (Ave).
     * @param grupoAnimal Grupo al que pertenece al animal (Ave), e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     * @param apodo Apodo que tiene el animal (Ave) "de cariño" al ser domesticado. Otros nombres informales.
     * @param estaVivo Indica si el animal (Ave) está vivo o no. Una vez establecido con {@code false} no puede volver a su estado de {@code true}.
     * @param numPatas Número de patas del animal (Ave).
     */
    public Ave(int edad, String especie, int longitudAlas, boolean vuela, String colorPlumas, String nombre, String grupoAnimal, String apodo, boolean estaVivo, int numPatas) {
        super(nombre, grupoAnimal, apodo, estaVivo, numPatas);
        this.edad = edad;
        this.especie = especie;
        this.longitudAlas = longitudAlas;
        this.vuela = vuela;
        this.colorPlumas = colorPlumas;
    }
    
    /**
     * Crea una nueva instancia de Ave "correcta".
     * 
     * Sólo necesita los datos específicos para un Animal (constructor superclase): Nombre, apodo.
     * El resto se inicializan directamente por el hecho de ser un Ave.
     * 
     * @param edad Edad en años que el Ave tiene.
     * @param especie Nombre del tipo de especie a la que pertenece el Ave.
     * @param longitudAlas Longitud que tiene una sola ala del Ave, medida en centímetos exactos acotada mediante reondeo simétrico.
     * @param vuela Indica si el Ave es capaz de volar.
     * @param colorPlumas Representación en color del color predominante en el plumaje del Ave.
     * @param nombre Nombre formal / científico del Animal (Ave).
     * @param apodo Apodo que tiene el animal (Ave) "de cariño" al ser domesticado. Otros nombres informales.
     */
    public Ave(int edad, String especie, int longitudAlas, boolean vuela, String colorPlumas, String nombre, String apodo) {
        super(nombre, "Ovíparo", apodo, true, 2);
        this.edad = edad;
        this.especie = especie;
        this.longitudAlas = longitudAlas;
        this.vuela = vuela;
        this.colorPlumas = colorPlumas;
    }

    /**
     * Método que devuelve la edad del Ave.
     * @return La edad del Ave.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que establece la edad del Ave.
     * @param edad La edad del Ave en años.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que devuelve la representación en cadena del tipo de especie a la que pertenece el Ave.
     * @return La representación en cadena del tipo de especia a la que pertenece el Ave.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Método que establece la especie a la que pertenece el Ave.
     * @param especie La especia a la que pertenece el Ave.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Método que devuelve la longitud de las alas del Ave.
     * @return La longitud de las alas del Ave.
     */
    public int getLongitudAlas() {
        return longitudAlas;
    }

    /**
     * Método que establece la longitud de las alas del Ave medida en centímetos exactos acotada mediante reondeo simétrico.
     * @param longitudAlas La longitud de las alas del Ave  medida en centímetos exactos acotada mediante reondeo simétrico..
     */
    public void setLongitudAlas(int longitudAlas) {
        this.longitudAlas = longitudAlas;
    }

    /**
     * Método que devuelve la capacidad de volar del Ave.
     * @return {@code true} si el Ave sí es capaz de volar, {@code false} en caso contrario.
     */
    public boolean isVuela() {
        return vuela;
    }

    /**
     * Método que establece si el Ave es capaz de volar.
     * @param vuela Atributo que indica si el ave es capaz de volar: {@code true} si el Ave es capaz de volar, {@code false} en caso contrario.
     */
    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    /**
     * Método que devuelve el color predominante en las plumas del Ave.
     * @return El color predominante en las plumas del Ave.
     */
    public String getColorPlumas() {
        return colorPlumas;
    }

    /**
     * Método que establece el color predominante en las plumas del Ave.
     * @param colorPlumas El nombre del color predominante en las plumas del Ave.
     */
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    /**
     * Método que hace al Ave cantar una melodía.
     * 
     * Únicamente si está viva, ésto decidido mediante el estado del atributo {@code estaVivo}. En cuyo caso se indicará en la salida del método.
     */
    public void cantar() {
        if( super.isEstaVivo() )
            System.out.println("El ave canta una melodiosa armonía.");
        else
            System.out.println("El ave no es capaz de cantar, puesto que ya no tiene vida.");
    }
    
    /**
     * Método que imprime en pantalla de manera amigable el estado de todos los atributos del Ave.
     */
    public void imprimirAve() {
        System.out.println("\nEl Ave " + this.getNombre() + " tiene las siguientes características:"
                + "\n\t ### Características de Animal ###"
                + "\n\tGrupo animal: " + this.getGrupoAnimal()
                + "\n\tApodo: " + this.getApodo()
                + "\n\tEstá " + ( this.isEstaVivo() ? "vivo" : "muerto" )
                + "\n\tNúmero de patas: " + this.getNumPatas() 
                + "\n\t### Características de Ave ###"
                + "\n\tEdad: " + getEdad()
                + "\n\tEspecie: " + getEspecie()
                + "\n\tLongitud de sus alas: " + getLongitudAlas() + " [m]"
                + "\n\t" + ( this.isVuela() ? "Sí" : "No" ) + "es capaz de volar."
                + "\n\tColor de sus plumas: " + getColorPlumas() );
    }

    @Override
    public void alimentarse() {
        super.alimentarse(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if( super.isEstaVivo() )
            System.out.println("Como es un Ave, se alimenta comiendo semillas.");
    }
    
    /**
     * Hace el que el Animal se desplace en ninguna dirección en específico una cantidad especificada en metros.
     * Como el Animal es un Ave, a veces se desplaza caminando, y otra volando; ésto dependiendo de la distancia.
     * 
     * Únicamente se realiza correctamente cuando el estado de su atributo {@code estaVivo} se encuentra en {@code true}. En ambos casos se indica en pantalla.
     * 
     * @param distancia Cantidad en metros que el Animal se va a desplazar, cambiando su posición hacia una única dirección cualesquiera.
     */
    @Override
    public void moverse(float distancia) {
        super.moverse( distancia ); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if( super.isEstaVivo() )
            if( distancia > 100 )
                if( vuela )
                    System.out.println("Como es un ave y sí puede volar y el trayecto es muy largo, recorrió los " + distancia + " metros volando.");
                else
                    System.out.println("Como es un ave debió cruzar los " + distancia + " metros volando porque son muchos, pero como no puede volar lo hizo caminando.");
            else
                System.out.println("Como la distancia es muy corta, el ave hizo el trayecto de los " + distancia + " metros caminando.");
    }
    
    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "Ave{" + "edad=" + edad + ", especie=" + especie + ", longitudAlas=" + longitudAlas + ", vuela=" + vuela + ", colorPlumas=" + colorPlumas + '}';
    }
}