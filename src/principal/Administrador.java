/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olla_comun;

import java.util.List;

/**
 *
 * @author ALEJANDRO
 */
public class Administrador {
    private String corre;
    private String contrasenia;
    private List< Administrador > administradorJef;

    public String getCorre() {
        return corre;
    }

    public void setCorre(String corre) {
        this.corre = corre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List< Administrador > getAdministradorJef() {
        return administradorJef;
    }

    public void setAdministradorJef(List< Administrador > AdministradorJef) {
        this.administradorJef = AdministradorJef;
    }
    
    
}
