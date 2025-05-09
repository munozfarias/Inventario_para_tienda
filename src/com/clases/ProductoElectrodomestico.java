package com.clases;

public class ProductoElectrodomestico {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Constructor completo
    public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Constructor sobrecargado
    public ProductoElectrodomestico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
    }
}
