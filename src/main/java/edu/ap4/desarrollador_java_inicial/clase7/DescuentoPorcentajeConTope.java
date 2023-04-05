/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase7;

import edu.ap4.desarrollador_java_inicial.clase5.DescuentoPorcentaje;
import java.time.LocalDate;

/**
 *
 * @author Enrique
 */
public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {

    private Double tope;

    public DescuentoPorcentajeConTope(Double tope, Double porcentaje, LocalDate comienzo, LocalDate fin) {
        super(porcentaje, comienzo, fin);
        this.setTope(tope);
    }

    public Double getTope() {
        return this.tope;
    }

    private void setTope(Double tope) {
        this.tope = tope;
    }

    @Override
    public Double descuento(Double montoSubtotal) {
        if (montoSubtotal * this.getPorcentaje() < this.getTope()) {
            return montoSubtotal * this.getPorcentaje();
        }
        return this.getTope();
    }

}
