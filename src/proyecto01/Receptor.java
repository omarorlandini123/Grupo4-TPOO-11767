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
public class Receptor extends Persona{
    private Date fechaUrecepcion;
    private String tipoProductoR;
    private int cantidadAlimentos;

    public Date getFechaUrecepcion() {
        return fechaUrecepcion;
    }

    public void setFechaUrecepcion(Date fechaUrecepcion) {
        this.fechaUrecepcion = fechaUrecepcion;
    }

    public String getTipoProductoR() {
        return tipoProductoR;
    }

    public void setTipoProductoR(String tipoProductoR) {
        this.tipoProductoR = tipoProductoR;
    }

    public int getCantidadAlimentos() {
        return cantidadAlimentos;
    }

    public void setCantidadAlimentos(int cantidadAlimentos) {
        this.cantidadAlimentos = cantidadAlimentos;
    }
    
}
