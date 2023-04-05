/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase7;

import edu.ap4.desarrollador_java_inicial.clase5.Descuento;
import java.time.LocalDate;

/**
 *
 * @author Enrique
 */
public class DescuentoPorcentajeConTope extends Descuento {
    
    private Double fijo;

    public DescuentoPorcentajeConTope(Double fijo, LocalDate comienzo, LocalDate fin) {
        super(comienzo, fin);
        this.setFijo(fijo);
    }

    public Double getFijo() {
        return fijo;
    }

    private void setFijo(Double fijo) {
        this.fijo = fijo;
    }

    @Override
    public Double descuento(Double montoSubtotal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
