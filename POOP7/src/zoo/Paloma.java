/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

import java.util.Random;

/**
 * Clase que representa a una paloma que particulariza de un Ave, que a su vez particulariza de un Animal genérico.
 * Las acciones de la paloma se centran en su habilidad de fungir como paloma mensajera.
 * 
 * @author Oscar Cabrera
 */
public class Paloma extends Ave {
    
    /**
     * Describe la capacidad de navegación que tiene la Paloma. Admite valores del uno al diez y de éste dependerá qué tan eficiente sea la Paloma para entregar mensajes.
     */
    private int capacidadNavegacion;
    
    /**
     * Indica si la Paloma está entrenada para hacer de paloma mensajera y transportar mensajes de un lugar a otro.
     */
    private boolean entrenadaMensajera;
    
    /**
     * Longitud de las plumas de la cola del Perico medido en centímetros.
     */
    private float tamañoCola;
    
    /**
     * Describe la capacidad de cargar cosas pesadas que tiene la Paloma. Admite valores del uo al diez y de éste dependerá qué tan eficiente sea la Paloma para entregar mensajes.
     */
    private int capacidadCarga;
    
    /**
     * Número clave identificador único con la que cuenta la Paloma una vez iniciada como paloma mensajera.
     */
    private int identificadorUnico;

    /**
     * Crea una nueva instancia de Paloma vacía.
     */
    public Paloma() {
    }

    /**
     * Crea una nuva instancia de Paloma llena.
     * Infla explícitamente todos los atributos de la clase, incluyendo los pertinentes a sus superclases en la jerarquía de herencia.
     * 
     * @param capacidadNavegacion Describe la capacidad de navegación que tiene la Paloma. Admite valores del uno al diez y de éste dependerá qué tan eficiente sea la Paloma para entregar mensajes.
     * @param entrenadaMensajera Indica si la Paloma está entrenada para hacer de paloma mensajera y transportar mensajes de un lugar a otro.
     * @param tamañoCola Longitud de las plumas de la cola del Perico medido en centímetros.
     * @param capacidadCarga Describe la capacidad de cargar cosas pesadas que tiene la Paloma. Admite valores del uo al diez y de éste dependerá qué tan eficiente sea la Paloma para entregar mensajes.
     * @param identificadorUnico Número clave identificador único con la que cuenta la Paloma una vez iniciada como paloma mensajera.
     * @param edad Edad en años que el Ave (Paloma) tiene.
     * @param especie Nombre del tipo de especie a la que pertenece el Ave (Paloma).
     * @param longitudAlas Longitud que tiene una sola ala del Ave (Paloma), medida en centímetos exactos acotada mediante reondeo simétrico.
     * @param vuela Indica si el Ave (Paloma) es capaz de volar.
     * @param colorPlumas Representación en color del color predominante en el plumaje del Ave (Paloma).
     * @param nombre Nombre formal / científico del Animal (Ave).
     * @param grupoAnimal Grupo al que pertenece al animal (Ave), e.g. mamíferos, peces, anfibios, insectos, ovíparos...
     * @param apodo Apodo que tiene el animal (Ave) "de cariño" al ser domesticado. Otros nombres informales.
     * @param estaVivo Indica si el animal (Ave) está vivo o no. Una vez establecido con {@code false} no puede volver a su estado de {@code true}.
     * @param numPatas Número de patas del animal (Ave).
     */
    public Paloma(int capacidadNavegacion, boolean entrenadaMensajera, float tamañoCola, int capacidadCarga, int identificadorUnico, int edad, String especie, int longitudAlas, boolean vuela, String colorPlumas, String nombre, String grupoAnimal, String apodo, boolean estaVivo, int numPatas) {
        super(edad, especie, longitudAlas, vuela, colorPlumas, nombre, grupoAnimal, apodo, estaVivo, numPatas);
        this.capacidadNavegacion = capacidadNavegacion;
        this.entrenadaMensajera = entrenadaMensajera;
        this.tamañoCola = tamañoCola;
        this.capacidadCarga = capacidadCarga;
        this.identificadorUnico = identificadorUnico;
    }

    /**
     * Crea una nueva instancia de Perico "correcta".
     * 
     * Sólo necesita los datos específicos para un Animal (constructor superclase): Nombre, apodo. Y para Ave (constructor superclase): Edad, longitudAlas, colorPlumas.
     * El resto se inicializan directamente por el hecho de ser un Ave Paloma.
     * 
     * @param capacidadNavegacion Describe la capacidad de navegación que tiene la Paloma. Admite valores del uno al diez y de éste dependerá qué tan eficiente sea la Paloma para entregar mensajes.
     * @param entrenadaMensajera Indica si la Paloma está entrenada para hacer de paloma mensajera y transportar mensajes de un lugar a otro.
     * @param tamañoCola Longitud de las plumas de la cola del Perico medido en centímetros.
     * @param capacidadCarga Describe la capacidad de cargar cosas pesadas que tiene la Paloma. Admite valores del uo al diez y de éste dependerá qué tan eficiente sea la Paloma para entregar mensajes.
     * @param identificadorUnico Número clave identificador único con la que cuenta la Paloma una vez iniciada como paloma mensajera.
     * @param edad Edad en años que el Ave (Perico) tiene.
     * @param especie Nombre del tipo de especie a la que pertenece el Ave (Perico).
     * @param longitudAlas Longitud que tiene una sola ala del Ave (Perico), medida en centímetos exactos acotada mediante reondeo simétrico.
     * @param vuela Indica si el Ave (Perico) es capaz de volar.
     * @param colorPlumas Representación en color del color predominante en el plumaje del Ave (Perico).
     * @param nombre Nombre formal / científico del Animal (Ave).
     * @param apodo Apodo que tiene el animal (Ave) "de cariño" al ser domesticado. Otros nombres informales.
     */
    public Paloma(int capacidadNavegacion, boolean entrenadaMensajera, float tamañoCola, int capacidadCarga, int identificadorUnico, int edad, String especie, int longitudAlas, boolean vuela, String colorPlumas, String nombre, String apodo) {
        super(edad, "Paloma", longitudAlas, true, colorPlumas, nombre, apodo);
        this.capacidadNavegacion = capacidadNavegacion;
        this.entrenadaMensajera = entrenadaMensajera;
        this.tamañoCola = tamañoCola;
        this.capacidadCarga = capacidadCarga;
        this.identificadorUnico = identificadorUnico;
    }

    /**
     * Método que devuelve el valor de la capacidad de navegación de la Paloma.
     * @return El valor de la capacidad de navegación de la Paloma.
     */
    public int getCapacidadNavegacion() {
        return capacidadNavegacion;
    }

    /**
     * Método que establece el valor de la capacidad de navegación de la Paloma.
     * @param capacidadNavegacion El valor de la capacidad de navegación de la Paloma.
     */
    public void setCapacidadNavegacion(int capacidadNavegacion) {
        this.capacidadNavegacion = capacidadNavegacion;
    }

    /**
     * Método que devuelve si la Paloma tiene el entrenamiento para hacer de paloma mensajera.
     * @return {@code true} si está entrenada para ser paloma mensajera, {@code false} si no está entrenada.
     */
    public boolean isEntrenadaMensajera() {
        return entrenadaMensajera;
    }

    /**
     * Mëtodo que establece si la Paloma tiene el entrenamiento para hacer de paloma mensajera.
     * @param entrenadaMensajera {@code true} si está entrenada para ser paloma mensajera, {@code false} si no está entrenada.
     */
    public void setEntrenadaMensajera(boolean entrenadaMensajera) {
        this.entrenadaMensajera = entrenadaMensajera;
    }

    /**
     * Método que devuelve la longitud de las plumas de la cola de la Paloma.
     * @return La longitud de las plumas de la cola de la Paloma.
     */
    public float getTamañoCola() {
        return tamañoCola;
    }

    /**
     * Método que establece la longitud de las plumas de la cola de la Paloma.
     * @param tamañoCola La longitud de las plumas de la cola de la Paloma medida en centímetos.
     */
    public void setTamañoCola(float tamañoCola) {
        this.tamañoCola = tamañoCola;
    }

    /**
     * Método que devuelve el valor de la capacidad de carga de la Paloma.
     * @return El valor de la capacidad de carga de la Paloma.
     */
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Método que establece el valor de la capacidad de carga de la Paloma.
     * @param capacidadCarga El valor de la capacidad de carga de la Paloma.
     */
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Método que devuelve el identificador único de la Paloma como mensajera.
     * @return El identificador único de la Paloma como mensajera.
     */
    public int getIdentificadorUnico() {
        return identificadorUnico;
    }

    /**
     * Método que establece el identificador único de la Paloma como mensajera.
     * @param identificadorUnico El identificador único de la Paloma como mensajera.
     */
    public void setIdentificadorUnico(int identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }
    
    /**
     * Método que hace la Paloma mensajera llevar un mensaje específico a un lugar destin.
     * Sólo funciona si: La paloma está entrenada como mensajera, la Paloma está viva y es capaz de llevar el mensaje (basado en su capacidad de navegación y capacidad de carga).
     * 
     * @param destino Nombre del lugar al que la Paloma debe llevar el mensaje.
     * @param mensaje
     * @return {@code true} si la Paloma sí pudo llevar el mensaje, o {@code false} si no fue capaz de entregarlo.
     */
    public boolean llevarMensaje(String destino, String mensaje) {
        if( isEstaVivo() )
            if( entrenadaMensajera ) {
                Random rm = new Random();
                int dificultadTrayecto, pesoMensaje;
                dificultadTrayecto = rm.nextInt(10, 1);
                pesoMensaje = rm.nextInt(10, 1);
                
                if( dificultadTrayecto <= capacidadNavegacion && pesoMensaje <= capacidadCarga ) {
                    System.out.println("La Paloma pudo entregar correctamente el paquete.");
                    return true;
                }
                else
                    System.out.println("La Paloma no fue capaz de entregar correctamente el paquete.");
            }
            else
                System.out.println("La Paloma no es capaz de entregar el paquete puesto que no ha recibido entrenamiento.");
        else
            System.out.println("La Paloma ya no puede entregar ningún paquete puesto que ya no está viva.");
        
        return false;
    }
    
    /**
     * Método que hace a una Paloma volar a otro lugar donde se conoce el valor de la distancia en metros del detino.
     * Sólo es capaz de volar si la Paloma está viva.
     * @param distancia Distancia en metros a la que se encuentra el destino al que debe volar la Paloma.
     */
    public void volarA(float distancia) {
        if( isEstaVivo() )
            System.out.println("La Paloma recorrió los " + distancia + " metros y llegó a su destino.");
        else
            System.out.println("La Paloma ya no puede volar a ningún destino porque ya no está viva.");
    }
    
    /**
     * Método que hace a la Paloma regresar a su hogar a partir de su último destino.
     */
    public void regresarACasa() {
        if( isEstaVivo() )
            System.out.println("La Paloma decidió que es hora de volver a casa.");
        else
            System.out.println("La Paloma se encuentra en su hogar permanente porque ya no está con vida.");
    }

    /**
     * Método que imprime en pantalla de manera amigable el estado de todos los atributos de la Paloma.
     */
    @Override
    public void imprimirAve() {
        super.imprimirAve(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("\t ### Características de Paloma ###"
                + "\n\tCapacidad de navegación: " + capacidadNavegacion
                + "\n\tEntrenada como mensajera: " + ( entrenadaMensajera ? "Sí" : "No")
                + "\n\tTamaño de su cola: " + tamañoCola
                + "\n\tCapacidad de carga: " + capacidadCarga
                + "\n\tIdentificador: " + identificadorUnico );
    }

    /**
     * Método que parsea un objeto en una cadena.
     * 
     * @return Los atributos del objeto en cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "Paloma{" + "capacidadNavegacion=" + capacidadNavegacion + ", entrenadaMensajera=" + entrenadaMensajera + ", tama\u00f1oCola=" + tamañoCola + ", capacidadCarga=" + capacidadCarga + ", identificadorUnico=" + identificadorUnico + '}';
    }
}
