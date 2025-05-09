package com;

import com.clases.*;

public class Aplicacion {
    public static void main(String[] args) {
        // Crear instancia de la tienda
        TiendaElectronica tienda = new TiendaElectronica();

        // Instanciar productos
        Televisor tv1 = new Televisor("Smart TV LG", 499990, 2, 55, "4K");
        Televisor tv2 = new Televisor("Smart TV Samsung", 599990, 1, 65, "4K UHD");
        ComputadoraPortatil laptop1 = new ComputadoraPortatil("Laptop ASUS", 699990, 3, "ASUS", 16, "X123ASUS");
        ComputadoraPortatil laptop2 = new ComputadoraPortatil("Laptop Dell", 799990, 0, "Dell", 32, "D456789");

        // Agregar productos al inventario
        tienda.agregarProducto(tv1);
        tienda.agregarProducto(tv2);
        tienda.agregarProducto(laptop1);
        tienda.agregarProducto(laptop2);

        System.out.println("\n=== Inventario Inicial ===");
        tienda.mostrarProductos();

        // Realizar algunas ventas
        System.out.println("\n=== Ventas ===");
        tienda.realizarVenta("Smart TV LG");     // stock 1
        tienda.realizarVenta("Smart TV LG");     // stock 0
        tienda.realizarVenta("Smart TV LG");     // agotado
        tienda.realizarVenta("Laptop Dell");     // ya está agotada

        // Mostrar inventario actualizado
        System.out.println("\n=== Inventario Actualizado ===");
        tienda.mostrarProductos();
    }
}
