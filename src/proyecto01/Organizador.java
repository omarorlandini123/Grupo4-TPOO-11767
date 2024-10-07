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
public class Organizador extends Persona {
    
    private Date fechaIngreso;
    private int cantidadVoluntarios;

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getCantidadVoluntarios() {
        return cantidadVoluntarios;
    }

    public void setCantidadVoluntarios(int cantidadVoluntarios) {
        this.cantidadVoluntarios = cantidadVoluntarios;
    }
}
