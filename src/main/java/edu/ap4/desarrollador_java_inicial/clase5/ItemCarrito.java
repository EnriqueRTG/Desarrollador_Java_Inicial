/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase5;

/**
 *
 * @author Enrique Torres
 */
public class ItemCarrito {

    private Producto producto;
    private Integer cantidad;

    public ItemCarrito(Producto producto, Integer cantidad) {
        this.setProducto(producto);
        this.setCantidad(cantidad);
    }

    public Producto getProducto() {
        return producto;
    }

    private void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    private void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double precio() {
        return this.getCantidad() * this.getProducto().getPrecio();
    }
    
    @Override
    public String toString(){
        return "Cantidad: " + this.getCantidad() + " | " + this.getProducto().toString() + " | Subtotal: " + this.precio();
    }

}
