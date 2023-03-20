/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Enrique Torres
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String archivo = "C:\\Users\\Enrique\\Desktop\\Argentina Programa 4.0 - Java\\Clase-3\\Clase 3.txt";
        
        try {
            for (String linea : Files.readAllLines(Paths.get(archivo))) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        }

        try {
            Files.writeString(Paths.get(archivo), "\nNueva linea generado por escritura");
        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo");
        }

    }

}
