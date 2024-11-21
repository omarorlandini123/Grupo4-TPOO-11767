/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author NEISER
 */
public class Evento {
    private String nombreEvento;
    private Date fecha;
    private List<Voluntario> voluntariosParticipantes;
    private List<Donante> donantesParticipantes;
    private List<Producto> productoDistribuidos;

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Voluntario> getVoluntariosParticipantes() {
        return voluntariosParticipantes;
    }

    public void setVoluntariosParticipantes(List<Voluntario> voluntariosParticipantes) {
        this.voluntariosParticipantes = voluntariosParticipantes;
    }

    public List<Donante> getDonantesParticipantes() {
        return donantesParticipantes;
    }

    public void setDonantesParticipantes(List<Donante> donantesParticipantes) {
        this.donantesParticipantes = donantesParticipantes;
    }

    public List<Producto> getProductoDistribuidos() {
        return productoDistribuidos;
    }

    public void setProductoDistribuidos(List<Producto> productoDistribuidos) {
        this.productoDistribuidos = productoDistribuidos;
    }
    
}
