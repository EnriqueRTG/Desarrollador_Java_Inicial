/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Enrique Torres
 */
public class Clase_4_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        //Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir
        //si es una codificación o decodificación, el valor del desplazo,
        //y 2 archivos, uno para la entrada y otro para la salida.
        //Que por pantalla solo indique si terminó o no correctamente,
        //los resultados deben estar en el archivo de salida
        System.out.println("Ejercicio 3: ");

        String direccionArchivoEntrada = "C:\\Users\\Enrique\\Documents\\"
                + "NetBeansProjects\\Desarrollador_Java_Inicial\\src\\main\\"
                + "java\\edu\\ap4\\desarrollador_java_inicial\\clase4\\entrada.txt";
        Path archivoDeSalida = Paths.get("C:\\Users\\Enrique\\Documents\\"
                + "NetBeansProjects\\Desarrollador_Java_Inicial\\src\\main\\"
                + "java\\edu\\ap4\\desarrollador_java_inicial\\clase4\\salida.txt");

        char letraOperacion = 'd'; //c-codificacion o  d-decodificacion
        int valorDeDesplazamiento = 1;

        realizarOperacionConManipulacionDeArchivos(letraOperacion, valorDeDesplazamiento, direccionArchivoEntrada, archivoDeSalida);
    }

    private static void realizarOperacionConManipulacionDeArchivos(char letraDeOperacion, int valorDeDesplazamiento,
            String direccionDeArchivoDeEntrada, Path rutaDeArchivoDeSalida) {
        try {

            if (letraDeOperacion == 'c') {
                String textoObtenido = obtenerTextoDeArchivoDeEntrada(direccionDeArchivoDeEntrada);
                String textoOperado = operarTexto(letraDeOperacion, textoObtenido, valorDeDesplazamiento);

                if (!existeArchivoDeSalida(rutaDeArchivoDeSalida)) {
                    boolean operacionDeCreacion = crearArchivoDeSalida(rutaDeArchivoDeSalida);
                    boolean operacionDeEscritura = guardarTextoOperadoEnArchivoDeSalida(textoOperado, rutaDeArchivoDeSalida);
                    mostrarMensajeDeOperacionConcluida(operacionDeCreacion, operacionDeEscritura);
                } else {
                    boolean operacionDeEscritura = guardarTextoOperadoEnArchivoDeSalida(textoOperado, rutaDeArchivoDeSalida);
                    mostrarMensajeDeOperacionConcluida(operacionDeEscritura);
                }
            } else {
                String textoObtenido = obtenerTextoDeArchivoDeEntrada(rutaDeArchivoDeSalida);
                String textoOperado = operarTexto(letraDeOperacion, textoObtenido, valorDeDesplazamiento);
                if (!existeArchivoDeSalida(rutaDeArchivoDeSalida)) {
                    boolean operacionDeCreacion = crearArchivoDeSalida(rutaDeArchivoDeSalida);
                    boolean operacionDeEscritura = guardarTextoOperadoEnArchivoDeSalida(textoOperado, rutaDeArchivoDeSalida);
                    mostrarMensajeDeOperacionConcluida(operacionDeCreacion, operacionDeEscritura);
                } else {
                    boolean operacionDeEscritura = guardarTextoOperadoEnArchivoDeSalida(textoOperado, rutaDeArchivoDeSalida);
                    mostrarMensajeDeOperacionConcluida(operacionDeEscritura);
                }
            }

        } catch (IOException ex) {
            System.out.println("No se realizo la operacion de manipulacion de Archivos");
        }
    }

    private static String obtenerTextoDeArchivoDeEntrada(String direccionDeArchivoDeEntrada) throws IOException {
        String textoObtenido = "";
        Path archivoDeEntrada = Paths.get(direccionDeArchivoDeEntrada);
        for (String linea : Files.readAllLines(archivoDeEntrada)) {
            textoObtenido = linea;
        }
        return textoObtenido;
    }
    
    private static String obtenerTextoDeArchivoDeEntrada(Path direccionDeArchivoDeEntrada) throws IOException {
        String textoObtenido = "";
        Path archivoDeEntrada = direccionDeArchivoDeEntrada;
        for (String linea : Files.readAllLines(archivoDeEntrada)) {
            textoObtenido = linea;
        }
        return textoObtenido;
    }

    private static String operarTexto(char letraDeOperacion, String textoObtenido, int valorDeDesplazamiento) {
        return (letraDeOperacion == 'c') ? codificandoTexto(textoObtenido, valorDeDesplazamiento) : decodificandoTexto(textoObtenido, valorDeDesplazamiento);
    }

    private static String codificandoTexto(String textoParaCodificar, int valorDeDesplazamiento) {
        String nuevoTextoCodificado = "";
        for (int cont = 0; cont < textoParaCodificar.length(); cont++) {
            int valorNuevaLetra = textoParaCodificar.codePointAt(cont) + valorDeDesplazamiento;
            char nuevaLetra = (char) valorNuevaLetra;
            nuevoTextoCodificado = nuevoTextoCodificado.concat(String.valueOf(nuevaLetra));
        }
        return nuevoTextoCodificado;
    }

    private static String decodificandoTexto(String textoParaDecodificar, int valorDeDesplazamiento) {
        String nuevoTextoDecodificado = "";
        for (int cont = 0; cont < textoParaDecodificar.length(); cont++) {
            int valorNuevaLetra = textoParaDecodificar.codePointAt(cont) - valorDeDesplazamiento;
            char nuevaLetra = (char) valorNuevaLetra;
            nuevoTextoDecodificado = nuevoTextoDecodificado.concat(String.valueOf(nuevaLetra));
        }
        return nuevoTextoDecodificado;
    }

    private static boolean existeArchivoDeSalida(Path archivoDeSalida) {
        return Files.exists(archivoDeSalida);
    }

    private static boolean crearArchivoDeSalida(Path archivoDeSalida) {
        try {
            Files.createFile(archivoDeSalida);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    private static boolean guardarTextoOperadoEnArchivoDeSalida(String textoParaGuardar, Path rutaDelArchivo) {
        try {
            Files.writeString(rutaDelArchivo, textoParaGuardar);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    private static void mostrarMensajeDeOperacionConcluida(boolean creacionDeArchivoDeSalida, boolean guardadoDeTexto) {
        if (creacionDeArchivoDeSalida && guardadoDeTexto) {
            System.out.println("Operacion finalizada correctamente!");
        } else {
            System.out.println("Error en la creacion del archivo de salida o en el guardado de la informacion!!!");
        }
    }

    private static void mostrarMensajeDeOperacionConcluida(boolean guardadoDeTexto) {
        if (guardadoDeTexto) {
            System.out.println("Operacion finalizada correctamente!");
        } else {
            System.out.println("Error en el guardado de la informacion!!!");
        }
    }

}
