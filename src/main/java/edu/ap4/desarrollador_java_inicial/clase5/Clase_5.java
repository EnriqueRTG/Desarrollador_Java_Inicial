/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Enrique Torres
 */
public class Clase_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String direccionArchivoEntrada = "C:\\Users\\Enrique\\Documents\\"
                + "NetBeansProjects\\Desarrollador_Java_Inicial\\src\\main\\"
                + "java\\edu\\ap4\\desarrollador_java_inicial\\clase5\\listaProductos.txt";

        try {
            String listaDeProductos = obtenerListaDeProductos(direccionArchivoEntrada);

            int numeroDeProductosEnLista = cantidadDeProductos(listaDeProductos);

            ItemCarrito[] arrayDeItems = generarArrayDeItems(numeroDeProductosEnLista);

            int iterador = 0;
            for (String atributosDeProducto : listaDeProductos.split(",")) {
                arrayDeItems[iterador] = generarItemCarrito(generarAtributos(atributosDeProducto));
                iterador++;
            }

            Carrito carritoDeCompra = generarCarrito(arrayDeItems);

            System.out.println(carritoDeCompra.toString());

            System.out.println("Monto total del carrito: " + carritoDeCompra.precio());

        } catch (IOException ex) {
            System.out.println("Error en la lectura del archivo!");
        }

    }

    private static ItemCarrito generarItemCarrito(String[] atributos) {
        Integer cantidad = Integer.valueOf(atributos[0]);
        String precio = atributos[1];
        String nombre = atributos[2];
        return new ItemCarrito(generarProducto(nombre, precio), cantidad);
    }

    private static Producto generarProducto(String atributoNombre, String atributoPrecio) {
        Double precio;
        precio = Double.valueOf(atributoPrecio);
        return new Producto(atributoNombre, precio);
    }

    private static String obtenerListaDeProductos(String direccionDelArchivo) throws IOException {
        String lista = "";
        Path archivoDeEntrada = Paths.get(direccionDelArchivo);
        for (String linea : Files.readAllLines(archivoDeEntrada)) {
            lista = linea;
        }
        return lista;
    }

    private static String[] generarAtributos(String atributosDeProducto) {
        String[] atributos = new String[3];
        int contador = 0;
        for (String atributo : atributosDeProducto.split(" ")) {
            atributos[contador] = atributo;
            contador++;
        }
        return atributos;
    }

    private static ItemCarrito[] generarArrayDeItems(int tamanio) {
        return new ItemCarrito[tamanio];
    }

    private static Carrito generarCarrito(ItemCarrito[] arrayDeItems) {
        return new Carrito(arrayDeItems);
    }

    private static int cantidadDeProductos(String listaDeProductos) {
        int tamanio = 0;
        for (String atributosDeProducto : listaDeProductos.split(",")) {
            tamanio++;
        }
        return tamanio;
    }

}
