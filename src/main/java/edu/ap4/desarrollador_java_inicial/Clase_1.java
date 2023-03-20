/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial;

/**
 *
 * @author Enrique Torres
 */
public class Clase_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Introducción a Algoritmos y Java
        // 1. Vamos a practicar operaciones básicas con números
        // a. Utilizando la sentencia while, imprima todos los números entre 2 
        // variables “a” y “b”.
        int numeroInicio = -11;
        int numeroFin = 9;

        int numeroAuxiliar = numeroInicio;
        System.out.println("Ejercicio 1-a): ");
        while (numeroAuxiliar <= numeroFin) {
            System.out.print(numeroAuxiliar + ", ");
            numeroAuxiliar++;
        }

        // b. A lo anterior, solo muestre los números pares
        numeroAuxiliar = numeroInicio;
        System.out.println("\nEjercicio 1-b): ");
        while (numeroAuxiliar <= numeroFin) {
            if (numeroAuxiliar % 2 == 0) {
                System.out.print(numeroAuxiliar + ", ");
            }
            numeroAuxiliar++;
        }

        // c. A lo anterior, con una variable extra, elija si se deben mostrar 
        // los números pares o impares
        numeroAuxiliar = numeroInicio;
        boolean siPares = true;
        System.out.println("\nEjercicio 1-c): ");
        while (numeroAuxiliar <= numeroFin) {
            if (numeroAuxiliar % 2 == 0 && siPares) {
                System.out.print(numeroAuxiliar + ", ");
            }
            numeroAuxiliar++;
        }

        // d. Utilizando la sentencia for, hacer lo mismo que en (b) 
        // pero invirtiendo el orden
        System.out.println("\nEjercicio 1-d): ");
        for (int i = numeroFin; numeroInicio <= i; i--) {
            System.out.print(i + ", ");
        }

        // 2. Dado el siguiente texto, vamos a atacar el siguiente problema: 
        // “determinar si una persona pertenece al segmento de ingresos altos”.
        // d. Finalmente, vea si puede resolver el problema utilizando código Java.
        System.out.println("\nEjercicio 2-d): ");
        int ingresos = 400000;
        int cantidadAutos = 3;
        boolean antiguedadMenorCinco = false;
        int cantidadInmuebles = 2;
        boolean embarcacion = true, aeronave = false, activosSocietarios = false;
        if ((ingresos >= 489083) || (cantidadAutos >= 3 && antiguedadMenorCinco) || (cantidadInmuebles >= 3)
                || embarcacion || aeronave || activosSocietarios) {
            System.out.println("Pertenece al segmento de Ingresos Altos");
        } else {
            System.out.println("Pertenece a otro segmento de Ingresos");
        }
    }
}