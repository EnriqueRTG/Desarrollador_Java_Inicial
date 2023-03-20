/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase4;

/**
 *
 * @author Enrique Torres
 */
public class Clase_4_Ejercicio1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio 1-a
        System.out.println("Ejercicio 1-a: ");
        int numero1 = 1, numero2 = 5, numero3 = -3;
        char letraDeOrden = 'd'; // a-ascendente, d-descendente

        int vectorDeNumerosOrdenados[] = ordenarNumeros(numero1, numero2, numero3, letraDeOrden);
        mostrarMensajeTipoDeOrden(letraDeOrden);
        mostrarVectorDeNumeros(vectorDeNumerosOrdenados);
    }

    private static void mostrarVectorDeNumeros(int[] vector) {
        for (int numero : vector) {
            System.out.print(numero + " ");
        }
    }

    private static void mostrarMensajeTipoDeOrden(char letraDeOrdenamiento) {
        if (letraDeOrdenamiento == 'a') {
            System.out.print("El vector de numeros ordenados de forma ascendente: ");
        } else {
            System.out.print("El vector de numeros ordenados de forma descendente: ");
        }
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
        return numeros;
    }

}
