package com.clases;

public class Televisor extends ProductoElectrodomestico {
    private double tamañoPantalla; 
    private String resolucion;     

    // Constructor que inicializa atributos de la clase padre e hijo
    public Televisor(String nombre, double precio, int cantidadDisponible, double tamañoPantalla, String resolucion) {
        super(nombre, precio, cantidadDisponible); 
        this.tamañoPantalla = tamañoPantalla;
        this.resolucion = resolucion;
    }

    // Getters y Setters adicionales
    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    // Sobrescribimos el método mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // muestra info de ProductoElectrodomestico
        System.out.println("Tamaño de Pantalla: " + tamañoPantalla + " pulgadas");
        System.out.println("Resolución: " + resolucion);
    }
}
