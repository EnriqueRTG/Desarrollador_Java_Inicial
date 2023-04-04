/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase5;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Enrique Torres
 */
public class Producto {

    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private Double precio;

    private static final Double minPrecio = 0.1;

    public Producto(String nombre) {
        this.setNombre(nombre);
        this.setFechaAlta(LocalDate.now());
        this.setPrecio(minPrecio);
    }

    public Producto(String nombre, String descripcion) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setFechaAlta(LocalDate.now());
        this.setPrecio(minPrecio);
    }

    public Producto(String nombre, String descripcion, Double precio) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setFechaAlta(LocalDate.now());
        this.setPrecio(precio);
    }

    public Producto(String nombre, Double precio) {
        this.setNombre(nombre);
        this.setFechaAlta(LocalDate.now());
        this.setPrecio(precio);
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    private void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public static Double getMinPrecio() {
        return minPrecio;
    }

    public void modificarNombre(String nuevoNombre) {
        this.setNombre(nuevoNombre);
    }

    public void modificarDescripcion(String nuevaDescripcion) {
        this.setDescripcion(nuevaDescripcion);
    }

    public void modificarPrecio(Double nuevoPrecio) {
        this.setPrecio(nuevoPrecio);
    }

    public void mostrarNombre() {
        System.out.println(this.getNombre());
    }

    public void mostrarDescripcion() {
        System.out.println(this.getDescripcion());
    }

    public void mostrarFechaAlta() {
        System.out.println(this.getFechaAlta());
    }

    public void mostrarPrecio() {
        System.out.println(this.getPrecio());
    }

    public void mostrarDetalle() {
        this.mostrarNombre();
        this.mostrarDescripcion();
        this.mostrarPrecio();
        this.mostrarFechaAlta();
    }

    @Override
    public String toString() {
        return "Producto: " + this.getNombre() + " | Precio: " + this.getPrecio();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.getNombre());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.getNombre(), other.getNombre());
    }

}
