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
public class Voluntario extends Persona{
    private int horasDisponible;
    private Date fechaIngreso;
    private String areaTrabajoP;

    public int getHorasDisponible() {
        return horasDisponible;
    }

    public void setHorasDisponible(int horasDisponible) {
        this.horasDisponible = horasDisponible;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getAreaTrabajoP() {
        return areaTrabajoP;
    }

    public void setAreaTrabajoP(String areaTrabajoP) {
        this.areaTrabajoP = areaTrabajoP;
    }
    
    
}
