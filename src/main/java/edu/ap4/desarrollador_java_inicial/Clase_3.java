/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial;

/**
 *
 * @author Enrique Torres
 */
public class Clase_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 1. Utilizando solo tipos primitivos, String (solo usar método length),
        vectores, iteraciones simples y condicionales, genere una clase por
        ejercicio que posea los siguientes métodos:

        a. Dado un String y una letra, que cuente la cantidad de apariciones 
        de la letra en el String*/
        System.out.println("Ejercicio 1-a): ");
        String string = "askda  askjdhasm uqjghweqwjba mas das";
        char letra = 's';
        int auxiliar = 0, contador = 0;
        while (auxiliar < string.length()) {
            if (string.charAt(auxiliar) == letra) {
                contador++;
            }
            auxiliar++;
        }
        System.out.println("La letra '" + letra + "' se repite " + contador
                + " en la cadena (" + string + ").");

        // b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        // mismos y los retorne en un vector de 3
        int num1 = 0, num2 = 5, num3 = -15;
        int numeros[] = new int[3];
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;

        // Ordenamiento por insercion
        int i, j;
        int actual;
        for (i = 1; i < numeros.length; i++) {
            actual = numeros[i];
            for (j = i; j > 0 && numeros[j - 1] > actual; j--) {
                numeros[j] = numeros[j - 1];
            }
            numeros[j] = actual;
        }

        System.out.println("Ejercicio 1-b): ");
        System.out.print("El vector de numeros ordenado de menor a mayor es"
                + "de la forma = [");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");

        // c. dado un vector de números, y un número X, que sume todos los 
        // números > X y retorne el resultado
        float vectorNumeros[] = {-52.1f, 21.32f, 0.14f, -13f, 85.84f};
        float numeroX = 1;
        float sumatoria = 0;

        for (int aux = 0; aux < vectorNumeros.length; aux++) {
            if (vectorNumeros[aux] > numeroX) {
                sumatoria += vectorNumeros[aux];
            }
        }

        System.out.println("Ejercicio 1-c): ");
        System.out.println("La sumatoria de los numeros mayores al numero "
                + numeroX + " es igual a " + sumatoria);

        // 2. Genere una clase que tenga los métodos para realizar la 
        // codificación y decodificación de un string, dado un número de desplazamiento
        System.out.println("Ejercicio 2: con desplazamiento 1");
        String cadena = "hola que tal";
        //“hola que tal” -> “ipmbarvfaubm”
        String nuevaCadena = "";
        for (int cont = 0; cont < cadena.length(); cont++) {
            int valorNuevaLetra = cadena.codePointAt(cont) + 1;
            char nuevaLetra = (char) valorNuevaLetra;
            if (valorNuevaLetra == 33) { //Caracteres ASCII imprimibles ESPACIO = 32 y ! = 33
                nuevaCadena = nuevaCadena.concat("a");
            } else {
                nuevaCadena = nuevaCadena.concat(String.valueOf(nuevaLetra));
            }
        }
        System.out.println("Nuevo String: " + nuevaCadena);

        System.out.println("Ejercicio 2: con desplazamiento 2");
        cadena = "hola que tal";
        //“hola que tal” -> “jqncbswgbvcn”
        nuevaCadena = "";
        for (int cont = 0; cont < cadena.length(); cont++) {
            int valorNuevaLetra = cadena.codePointAt(cont) + 2;
            char nuevaLetra = (char) valorNuevaLetra;
            if (valorNuevaLetra == 34) { //Caracteres ASCII imprimibles 34 = " y ESPACIO = 32
                nuevaCadena = nuevaCadena.concat("b");
            } else {
                nuevaCadena = nuevaCadena.concat(String.valueOf(nuevaLetra));
            }
        }

        System.out.println("Nuevo String: " + nuevaCadena);

        char letrass[] = {'a', 'b', 'c', 'd'};
        int numeross[] = new int[]{1, 37, 16};

        for (int in = 0; in < numeross.length; in++) {
            if (numeross[in] < 30) {
                System.out.println(letrass[in + 1]);
            } else {
                System.out.println(numeross[in]);
            }
        }

        System.out.println("hola que tal?".replace("hola", "chau").toUpperCase());

    }
}
