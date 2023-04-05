/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase7;

import edu.ap4.desarrollador_java_inicial.clase5.Carrito;
import edu.ap4.desarrollador_java_inicial.clase5.Descuento;
import edu.ap4.desarrollador_java_inicial.clase5.DescuentoFijo;
import edu.ap4.desarrollador_java_inicial.clase5.DescuentoPorcentaje;
import edu.ap4.desarrollador_java_inicial.clase5.ItemCarrito;
import edu.ap4.desarrollador_java_inicial.clase5.Producto;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 *
 * @author Enrique Torres
 */
public class Clase_7 {

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

            LocalDate fechaDescuento = LocalDate.of(2023, 06, 15);

            Descuento descPorc = generarDescuento("fijo"); //fijo o porcentaje o tope

            System.out.println(carritoDeCompra.toString());

            System.out.println("Decuento: " + mostrarDescuento(carritoDeCompra, descPorc));

            System.out.println("Monto total del carrito con descuento del" +     : " + carritoDeCompra.precio(descPorc));

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

    private static Descuento generarDescuentoFijo(double fijo, LocalDate comienzo, LocalDate fin) {
        return new DescuentoFijo(fijo, comienzo, fin);
    }

    private static Descuento generarDescuentoPorcentaje(double porcentaje, LocalDate comienzo, LocalDate fin) {
        return new DescuentoPorcentaje(porcentaje, comienzo, fin);
    }

    private static Descuento generarDescuentoPorcentajeConTope(double tope, double porcentaje, LocalDate comienzo, LocalDate fin) {
        return new DescuentoPorcentajeConTope(tope, porcentaje, comienzo, fin);
    }

    private static Double mostrarDescuento(Descuento descuentoRealizado, double montoSubtotal) {
        return descuentoRealizado.descuento(montoSubtotal);
    }

    private static Descuento generarDescuento(String tipo) {
        if (tipo.equalsIgnoreCase("fijo")) {
            return generarDescuentoFijo();
        } else if (tipo.equalsIgnoreCase("porcentaje")) {
            return generarDescuentoPorcentaje();
        } else if (tipo.equalsIgnoreCase("tope")) {
            return generarDescuentoPorcentajeConTope();
        } else {
            return new DescuentoFijo();
        }
    }

}
