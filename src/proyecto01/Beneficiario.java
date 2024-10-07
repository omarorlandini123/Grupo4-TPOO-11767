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
public class Beneficiario extends Persona {
    private Date fechaRegistro;
    private String necesidadEspecifica;
    private String Estado;

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNecesidadEspecifica() {
        return necesidadEspecifica;
    }

    public void setNecesidadEspecifica(String necesidadEspecifica) {
        this.necesidadEspecifica = necesidadEspecifica;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
