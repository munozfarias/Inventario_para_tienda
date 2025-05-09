package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    private String marca;
    private int memoriaRAM; // en GB
    private String numeroSerie;

    // Constructor que inicializa los atributos del padre y los propios
    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible,
                               String marca, int memoriaRAM, String numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.numeroSerie = numeroSerie;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Sobrescribimos mostrarInformacion
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // información del producto base
        System.out.println("Marca: " + marca);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Número de Serie: " + numeroSerie);
    }
}