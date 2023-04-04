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
public class DescuentoFijo extends Descuento {
    
    private Double monto;

    public DescuentoFijo(Double monto, LocalDate comienzo, LocalDate fin) {
        super(comienzo, fin);
        this.setMonto(monto);
    }
    
    public Double getMonto() {
        return this.monto;
    }

    private void setMonto(Double monto) {
        this.monto = monto;
    }
    
    @Override
    public Double descuento(Double montoSubtotal) {
        return this.getMonto();
    }

}
