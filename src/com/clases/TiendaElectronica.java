package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    // Constructor
    public TiendaElectronica() {
        listaDeProductos = new ArrayList<>();
    }

    // Método para agregar producto 
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Mostrar productos
    public void mostrarProductos() {
        if (listaDeProductos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        for (ProductoElectrodomestico producto : listaDeProductos) {
            System.out.println("---------------");
            producto.mostrarInformacion();
        }
    }

    // Buscar producto por nombre
    public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    // Realizar una venta
    public void realizarVenta(String nombreProducto) {
        ProductoElectrodomestico producto = buscarProducto(nombreProducto);

        if (producto == null) {
            System.out.println("Producto no encontrado.");
        } else if (producto.getCantidadDisponible() > 0) {
            producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
            System.out.println("Venta realizada. Nuevo stock: " + producto.getCantidadDisponible());
        } else {
            System.out.println("Producto agotado.");
        }
    }
}
