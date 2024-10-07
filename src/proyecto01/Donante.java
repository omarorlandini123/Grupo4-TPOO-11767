/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto01;

import java.util.Date;

/**
 *
 * @author NEISER
 */
public class Donante extends Persona {
    private String tipoDonacion;
    private double montoDonado;
    private Date fechaDonacion;

    public String getTipoDonacion() {
        return tipoDonacion;
    }

    public void setTipoDonacion(String tipoDonacion) {
        this.tipoDonacion = tipoDonacion;
    }

    public double getMontoDonado() {
        return montoDonado;
    }

    public void setMontoDonado(double montoDonado) {
        this.montoDonado = montoDonado;
    }

    public Date getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(Date fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }
}
