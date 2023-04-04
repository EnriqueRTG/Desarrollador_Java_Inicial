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
public abstract class Descuento {
    
    private LocalDate comienzo;
    private LocalDate fin;

    public Descuento(LocalDate comienzo, LocalDate fin) {
        this.setComienzo(comienzo);
        this.setFin(fin);
    }

    public LocalDate getComienzo() {
        return this.comienzo;
    }

    private void setComienzo(LocalDate comienzo) {
        this.comienzo = comienzo;
    }

    public LocalDate getFin() {
        return this.fin;
    }

    private void setFin(LocalDate fin) {
        this.fin = fin;
    }
    
    public abstract Double descuento(Double montoSubtotal);
    
}
