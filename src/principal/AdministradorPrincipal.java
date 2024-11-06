/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Date;

/**
 *
 * @author NEISER
 */
public class AdministradorPrincipal extends Persona {
    private String rolAdministrativo;
    private Date fechaIngreso;
    private int nivelAcceso;

    public String getRolAdministrativo() {
        return rolAdministrativo;
    }

    public void setRolAdministrativo(String rolAdministrativo) {
        this.rolAdministrativo = rolAdministrativo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
