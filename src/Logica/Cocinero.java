/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Cocinero {
    private String especialidad;
    private boolean certificado;
    private List<String> recetas;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    public List<String> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<String> recetas) {
        this.recetas = recetas;
    }
}
