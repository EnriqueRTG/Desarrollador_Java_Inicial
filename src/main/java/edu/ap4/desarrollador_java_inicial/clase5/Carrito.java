/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase5;

import java.time.LocalDate;

/**
 *
 * @author Enrique Torres
 */
public class Carrito {

    private LocalDate fecha;
    private ItemCarrito items[];

    public Carrito(ItemCarrito[] items) {
        this.setFecha(LocalDate.now());
        this.setItems(items);
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ItemCarrito[] getItems() {
        return items;
    }

    private void setItems(ItemCarrito[] items) {
        this.items = items;
    }

    public Double precio() {
        Double base = 0.0;
        for (int i = 0; i < this.getItems().length; i++) {
            base = base + this.items[i].precio();
        }
        return base;
    }

    public Double precio(Descuento descuento) {
        Double base = 0.0;
        for (int i = 0; i < this.getItems().length; i++) {
            base = base + this.items[i].precio();
        }
        return base - descuento.descuento(base);
    }
    
    @Override
    public String toString(){
        String listaDeProductos = "";
        for(ItemCarrito item: this.getItems()){
             listaDeProductos = listaDeProductos.concat(item.toString() + "\n");
        }
        return listaDeProductos;
    }

}
