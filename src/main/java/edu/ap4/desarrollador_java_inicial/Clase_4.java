/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial;

import java.util.Scanner;

/**
 *
 * @author Enrique Torres
 */
public class Clase_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1-a
        if (args.length > 0 && 4 == args.length) {
            System.out.println("Ejercicio 1-a: ");
            int vectorDeNumeros[] = cargarVectorDeNumeros(args);
            String letraDeOrden = args[args.length - 1];

            if (letraDeOrden.equalsIgnoreCase("a")) {
                mostrarMensajeTipoDeOrden(letraDeOrden);
                mostrarVectorDeNumeros(ordenarVectorNumeros(vectorDeNumeros, letraDeOrden));
            } else if (letraDeOrden.equalsIgnoreCase("d")) {
                mostrarMensajeTipoDeOrden(letraDeOrden);
                mostrarVectorDeNumeros(ordenarVectorNumeros(vectorDeNumeros, letraDeOrden));
            } else {
                mostrarMensajeDeErrorDeLetra();
                mostrarVectorDeNumeros(vectorDeNumeros);
            }

        } else if (args.length < 4 && args.length > 0) {
            System.out.println("Ejercicio 1-a: ");
            mostrarMensajeDeFaltaDeArgumentos();
            mostrarArgumentosPasados(args);

        } else {
            System.out.println("Ejercicio 1-a: ");
            mostrarMensajeSinArgumentos();
        }

        // b. haga lo mismo, pero solicitando los parámetros de a uno por consola
        System.out.println("\nEjercicio 1-b: ");

        String listaElementos = pedirCadenaDeNumeros();
        int vectorDeNumeros[] = cargarVectorDeNumeros(listaElementos);

        String letraDeOrden = pedirLetraDeOrdenamiento();

        while (noEsLetraDeOrdenamiento(letraDeOrden)) {
            letraDeOrden = pedirLetraDeOrdenamiento();
        }

        mostrarMensajeTipoDeOrden(letraDeOrden);
        mostrarVectorDeNumeros(ordenarVectorNumeros(vectorDeNumeros, letraDeOrden));

        // Ejercicio 1-c
        System.out.println("\nEjercicio 1-c: ");
        if (args.length > 0 && 4 == args.length) {

            int vectorDeNumerosCargados[] = cargarVectorDeNumeros(args);
            String letraParaOrdenar = args[args.length - 1];

            while (noEsLetraDeOrdenamiento(letraParaOrdenar)) {
                letraParaOrdenar = pedirLetraDeOrdenamiento();
            }

            mostrarMensajeTipoDeOrden(letraParaOrdenar);
            mostrarVectorDeNumeros(ordenarVectorNumeros(vectorDeNumerosCargados, letraParaOrdenar));

        } else if (args.length < 4 && args.length > 0) {
            mostrarMensajeDeFaltaDeArgumentos();
            mostrarArgumentosPasados(args);

        } else {
            mostrarMensajeSinArgumentos();
            String listaDeNumeros = pedirCadenaDeNumeros();
            int vectorDeNumerosCargados[] = cargarVectorDeNumeros(listaDeNumeros);

            String letraParaOrdenar = pedirLetraDeOrdenamiento();

            while (noEsLetraDeOrdenamiento(letraParaOrdenar)) {
                letraParaOrdenar = pedirLetraDeOrdenamiento();
            }

            mostrarMensajeTipoDeOrden(letraParaOrdenar);
            mostrarVectorDeNumeros(ordenarVectorNumeros(vectorDeNumerosCargados, letraParaOrdenar));
        }
    }

    public static int[] ordenarVectorNumeros(int[] numeros, String letraDeOrden) {
        if (letraDeOrden.equalsIgnoreCase("a")) {
            int i, j;
            int actual;
            for (i = 1; i < numeros.length; i++) {
                actual = numeros[i];
                for (j = i; j > 0 && numeros[j - 1] > actual; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[j] = actual;
            }
        } else if (letraDeOrden.equalsIgnoreCase("d")) {
            int i, j;
            int actual;
            for (i = 1; i < numeros.length; i++) {
                actual = numeros[i];
                for (j = i; j > 0 && numeros[j - 1] < actual; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[j] = actual;
            }
        }
        return numeros;
    }

    public static int[] ordenarVectorNumeros(int[] numeros, char letraDeOrden) {
        if (letraDeOrden == 'a') {
            int i, j;
            int actual;
            for (i = 1; i < numeros.length; i++) {
                actual = numeros[i];
                for (j = i; j > 0 && numeros[j - 1] > actual; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[j] = actual;
            }
        } else if (letraDeOrden == 'd') {
            int i, j;
            int actual;
            for (i = 1; i < numeros.length; i++) {
                actual = numeros[i];
                for (j = i; j > 0 && numeros[j - 1] < actual; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[j] = actual;
            }
        }
        return numeros;
    }

    public static int[] cargarVectorDeNumeros(String[] args) {
        int numerosIngresados[] = new int[3];
        for (int aux = 0; aux < args.length - 1; aux++) {
            numerosIngresados[aux] = Integer.parseInt(args[aux]);
        }
        return numerosIngresados;
    }

    public static int[] cargarVectorDeNumeros(String lista) {
        int numerosIngresados[] = new int[3], aux = 0;
        for (String elemento : lista.split(" ")) {
            numerosIngresados[aux] = Integer.parseInt(elemento);
            aux++;
        }
        return numerosIngresados;
    }

    public static void mostrarVectorDeNumeros(int[] vector) {
        for (int numero : vector) {
            System.out.print(numero + " ");
        }
    }

    public static void mostrarArgumentosPasados(String[] args) {
        for (String argumento : args) {
            System.out.print(argumento);
        }
    }

    public static String pedirCadenaDeNumeros() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese 3 números separados por UN espacio: ");
        return scn.nextLine();
    }

    public static String pedirLetraDeOrdenamiento() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la letra 'a' o  la letra 'd' "
                + "(ascendente o descendente) sin las comillas para el "
                + "tipo de orden que se desea realizar en el vector de numeros: ");

        return scn.nextLine();
    }

    public static void mostrarMensajeTipoDeOrden(String letraDeOrdenamiento) {
        if (letraDeOrdenamiento.equalsIgnoreCase("a")) {
            System.out.println("El vector de numeros ordenados de forma ascendente: ");
        } else {
            System.out.println("El vector de numeros ordenados de forma descendente: ");
        }
    }

    public static void mostrarMensajeDeErrorDeLetra() {
        System.out.println("El valor ingresado de tipo de orden no corresponde a 'a'(ascendente) o a 'd'(descente)");
    }

    public static void mostrarMensajeDeFaltaDeArgumentos() {
        System.out.println("Falta ingresar algun/os parametro/s!");
        System.out.print("Los ingresados son: ");
    }

    public static void mostrarMensajeSinArgumentos() {
        System.out.println("Sin Argumentos! Debe ingresar parametros.");
    }

    public static boolean noEsLetraDeOrdenamiento(String letraDeOrden) {
        return (!letraDeOrden.equalsIgnoreCase("a") && !letraDeOrden.equalsIgnoreCase("d"));
    }

}
