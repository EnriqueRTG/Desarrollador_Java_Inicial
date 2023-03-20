/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase4;

import java.util.Scanner;

/**
 *
 * @author Enrique Torres
 */
public class Clase_4_Ejercicio1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicio 1-c
        int numero1 = 1, numero2 = 5, numero3 = -3;
        int numeros[] = {numero1, numero2, numero3};

        //char letraDeOrdenCaracter = 'a';
        //String letraDeOrdenString = "a";
        System.out.println("\nEjercicio 1-c: ");
        //int vectorDeNumerosOrdenados[] = ordenarNumeros(numero1, numero2, numero3, letraDeOrdenCaracter);
        //int vectorDeNumerosOrdenados[] = ordenarNumeros(numero1, numero2, numero3);
        //int vectorDeNumerosOrdenados[] = ordenarNumeros(letraDeOrdenCaracter);
        //int vectorDeNumerosOrdenados[] = ordenarNumeros();

        //int vectorDeNumerosOrdenados[] = ordenarNumeros(numero1, numero2, numero3, letraDeOrdenString);
        //int vectorDeNumerosOrdenados[] = ordenarNumeros(letraDeOrdenString);
        //int vectorDeNumerosOrdenados[] = ordenarNumeros(numeros, letraDeOrdenCaracter);
        //int vectorDeNumerosOrdenados[] = ordenarNumeros(numeros, letraDeOrdenString);
        int vectorDeNumerosOrdenados[] = ordenarNumeros(numeros);

        mostrarVectorDeNumeros(vectorDeNumerosOrdenados);
    }

    private static int[] ordenarNumeros(int numero1, int numero2, int numero3, char letraDeOrden) {
        int numeros[] = {numero1, numero2, numero3};
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
        mostrarMensajeTipoDeOrden(letraDeOrden);
        return numeros;
    }

    private static int[] ordenarNumeros(int numero1, int numero2, int numero3) {
        char letraDeOrdenCaracter = pedirLetraDeOrdenamientoCaracter();
        int numeros[] = {numero1, numero2, numero3};
        if (letraDeOrdenCaracter == 'a') {
            int i, j;
            int actual;
            for (i = 1; i < numeros.length; i++) {
                actual = numeros[i];
                for (j = i; j > 0 && numeros[j - 1] > actual; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[j] = actual;
            }
        } else if (letraDeOrdenCaracter == 'd') {
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
        mostrarMensajeTipoDeOrden(letraDeOrdenCaracter);
        return numeros;
    }

    private static int[] ordenarNumeros(char letraDeOrden) {
        String listaDeNumeros = pedirCadenaDeNumeros();
        int vectorDeNumerosCargados[] = cargarVectorDeNumeros(listaDeNumeros);
        if (letraDeOrden == 'a') {
            int i, j;
            int actual;
            for (i = 1; i < vectorDeNumerosCargados.length; i++) {
                actual = vectorDeNumerosCargados[i];
                for (j = i; j > 0 && vectorDeNumerosCargados[j - 1] > actual; j--) {
                    vectorDeNumerosCargados[j] = vectorDeNumerosCargados[j - 1];
                }
                vectorDeNumerosCargados[j] = actual;
            }
        } else if (letraDeOrden == 'd') {
            int i, j;
            int actual;
            for (i = 1; i < vectorDeNumerosCargados.length; i++) {
                actual = vectorDeNumerosCargados[i];
                for (j = i; j > 0 && vectorDeNumerosCargados[j - 1] < actual; j--) {
                    vectorDeNumerosCargados[j] = vectorDeNumerosCargados[j - 1];
                }
                vectorDeNumerosCargados[j] = actual;
            }
        }
        mostrarMensajeTipoDeOrden(letraDeOrden);
        return vectorDeNumerosCargados;
    }

    private static int[] ordenarNumeros() {
        String listaDeNumeros = pedirCadenaDeNumeros();
        int vectorDeNumerosCargados[] = cargarVectorDeNumeros(listaDeNumeros);
        char letraDeOrdenCaracter = pedirLetraDeOrdenamientoCaracter();
        if (letraDeOrdenCaracter == 'a') {
            int i, j;
            int actual;
            for (i = 1; i < vectorDeNumerosCargados.length; i++) {
                actual = vectorDeNumerosCargados[i];
                for (j = i; j > 0 && vectorDeNumerosCargados[j - 1] > actual; j--) {
                    vectorDeNumerosCargados[j] = vectorDeNumerosCargados[j - 1];
                }
                vectorDeNumerosCargados[j] = actual;
            }
        } else if (letraDeOrdenCaracter == 'd') {
            int i, j;
            int actual;
            for (i = 1; i < vectorDeNumerosCargados.length; i++) {
                actual = vectorDeNumerosCargados[i];
                for (j = i; j > 0 && vectorDeNumerosCargados[j - 1] < actual; j--) {
                    vectorDeNumerosCargados[j] = vectorDeNumerosCargados[j - 1];
                }
                vectorDeNumerosCargados[j] = actual;
            }
        }
        mostrarMensajeTipoDeOrden(letraDeOrdenCaracter);
        return vectorDeNumerosCargados;
    }

    private static int[] ordenarNumeros(int numero1, int numero2, int numero3, String letraDeOrden) {
        int numeros[] = {numero1, numero2, numero3};
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
        mostrarMensajeTipoDeOrden(letraDeOrden);
        return numeros;
    }

    private static int[] ordenarNumeros(String letraDeOrden) {
        String listaDeNumeros = pedirCadenaDeNumeros();
        int vectorDeNumerosCargados[] = cargarVectorDeNumeros(listaDeNumeros);
        if (letraDeOrden.equalsIgnoreCase("a")) {
            int i, j;
            int actual;
            for (i = 1; i < vectorDeNumerosCargados.length; i++) {
                actual = vectorDeNumerosCargados[i];
                for (j = i; j > 0 && vectorDeNumerosCargados[j - 1] > actual; j--) {
                    vectorDeNumerosCargados[j] = vectorDeNumerosCargados[j - 1];
                }
                vectorDeNumerosCargados[j] = actual;
            }
        } else if (letraDeOrden.equalsIgnoreCase("d")) {
            int i, j;
            int actual;
            for (i = 1; i < vectorDeNumerosCargados.length; i++) {
                actual = vectorDeNumerosCargados[i];
                for (j = i; j > 0 && vectorDeNumerosCargados[j - 1] < actual; j--) {
                    vectorDeNumerosCargados[j] = vectorDeNumerosCargados[j - 1];
                }
                vectorDeNumerosCargados[j] = actual;
            }
        }
        mostrarMensajeTipoDeOrden(letraDeOrden);
        return vectorDeNumerosCargados;
    }

    private static int[] ordenarNumeros(int[] numeros, char letraDeOrdenCaracter) {
        if (letraDeOrdenCaracter == 'a') {
            int i, j;
            int actual;
            for (i = 1; i < numeros.length; i++) {
                actual = numeros[i];
                for (j = i; j > 0 && numeros[j - 1] > actual; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[j] = actual;
            }
        } else if (letraDeOrdenCaracter == 'd') {
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
        mostrarMensajeTipoDeOrden(letraDeOrdenCaracter);
        return numeros;
    }

    private static int[] ordenarNumeros(int[] numeros, String letraDeOrdenString) {
        if (letraDeOrdenString.equalsIgnoreCase("a")) {
            int i, j;
            int actual;
            for (i = 1; i < numeros.length; i++) {
                actual = numeros[i];
                for (j = i; j > 0 && numeros[j - 1] > actual; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[j] = actual;
            }
        } else if (letraDeOrdenString.equalsIgnoreCase("b")) {
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
        mostrarMensajeTipoDeOrden(letraDeOrdenString);
        return numeros;
    }

    private static int[] ordenarNumeros(int[] numeros) {
        String letraDeOrdenString = pedirLetraDeOrdenamientoString();
        if (letraDeOrdenString.equalsIgnoreCase("a")) {
            int i, j;
            int actual;
            for (i = 1; i < numeros.length; i++) {
                actual = numeros[i];
                for (j = i; j > 0 && numeros[j - 1] > actual; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[j] = actual;
            }
        } else if (letraDeOrdenString.equalsIgnoreCase("b")) {
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
        mostrarMensajeTipoDeOrden(letraDeOrdenString);
        return numeros;
    }

    private static int[] cargarVectorDeNumeros(String lista) {
        int numerosIngresados[] = new int[3], aux = 0;
        for (String elemento : lista.split(" ")) {
            numerosIngresados[aux] = Integer.parseInt(elemento);
            aux++;
        }
        return numerosIngresados;
    }

    private static void mostrarVectorDeNumeros(int[] vector) {
        for (int numero : vector) {
            System.out.print(numero + " ");
        }
    }

    private static void mostrarMensajeTipoDeOrden(String letraDeOrdenamiento) {
        if (letraDeOrdenamiento.equalsIgnoreCase("a")) {
            System.out.print("El vector de numeros ordenados de forma ascendente: ");
        } else {
            System.out.print("El vector de numeros ordenados de forma descendente: ");
        }
    }

    private static void mostrarMensajeTipoDeOrden(char letraDeOrdenamiento) {
        if (letraDeOrdenamiento == 'a') {
            System.out.print("El vector de numeros ordenados de forma ascendente: ");
        } else {
            System.out.print("El vector de numeros ordenados de forma descendente: ");
        }
    }

    private static String pedirCadenaDeNumeros() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese 3 números separados por UN espacio: ");
        return scn.nextLine();
    }

    private static char pedirLetraDeOrdenamientoCaracter() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la letra 'a' o  la letra 'd' "
                + "(ascendente o descendente) sin las comillas para el "
                + "tipo de orden que se desea realizar en el vector de numeros: ");

        return scn.nextLine().charAt(0);
    }

    private static String pedirLetraDeOrdenamientoString() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la letra 'a' o  la letra 'd' "
                + "(ascendente o descendente) sin las comillas para el "
                + "tipo de orden que se desea realizar en el vector de numeros: ");

        return scn.nextLine();
    }

}
