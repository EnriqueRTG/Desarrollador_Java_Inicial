/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Enrique Torres
 */
public class Clase_4_Ejercicio2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String direccionDelArchivo = "C:\\Users\\Enrique\\Documents\\NetBeansProjects\\Desarrollador_Java_Inicial\\src\\main\\java\\edu\\ap4\\desarrollador_java_inicial\\clase4\\numeros.txt";
            String tipoDeOperacion = "s"; //parametro de operacion s-suma u otro valor para multiplicacion ver linea 40
            String numerosListados = "";

            for (String lineas : Files.readAllLines(Paths.get(direccionDelArchivo))) {
                numerosListados = numerosListados.concat(lineas);
            }
            
            double resultado = realizarOperacion(numerosListados,tipoDeOperacion);
            mostrarMensajeDeOperacion(tipoDeOperacion, resultado);
            
        } catch (IOException ex) {
            System.out.println("Error al intentar leer el archivo \"numeros.txt\"!!!");
        }
    }

    public static double realizarOperacion(String listaDeNumeros, String letraTipoDeOperacion) {
        return (letraTipoDeOperacion.equalsIgnoreCase("s")) ? sumar(listaDeNumeros) : multiplicar(listaDeNumeros);
    }

    public static double sumar(String listaDeNumeros) {
        double resultado = 0;
        for (String numero : listaDeNumeros.split(" ")) {
            resultado += Double.parseDouble(numero);
        }
        return resultado;
    }

    public static double multiplicar(String listaDeNumeros) {
        double resultado = 1;
        for (String numero : listaDeNumeros.split(" ")) {
            resultado *= Double.parseDouble(numero);
        }
        return resultado;
    }

    public static void mostrarMensajeDeOperacion(String tipoDeOperacion, double resultadoDeOperacion) {
        String operacion = ("s".equalsIgnoreCase(tipoDeOperacion))? "SUMA":"MULTIPLICACION";
        System.out.print("El resultado de la operacion de " + operacion + " es igual a: " + resultadoDeOperacion);
    }

}
