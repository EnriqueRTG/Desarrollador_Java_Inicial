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
public class DescuentoPorcentaje extends Descuento {
    
    private Double porcentaje;

    public DescuentoPorcentaje(Double porcentaje, LocalDate comienzo, LocalDate fin) {
        super(comienzo, fin);
        this.setPorcentaje(porcentaje);
    }

    public Double getPorcentaje() {
        return this.porcentaje;
    }

    private void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public Double descuento(Double montoSubtotal) {
        return montoSubtotal * this.getPorcentaje();
    }
    
}
