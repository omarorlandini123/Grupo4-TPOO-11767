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
    private Administrador administrador;
    private Producto producto;
    private Cocinero cocinero;
    private List<Voluntario> listaVoluntarios;

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

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cocinero getCocinero() {
        return cocinero;
    }

    public void setCocinero(Cocinero cocinero) {
        this.cocinero = cocinero;
    }

    public List<Voluntario> getListaVoluntarios() {
        return listaVoluntarios;
    }

    public void setListaVoluntarios(List<Voluntario> listaVoluntarios) {
        this.listaVoluntarios = listaVoluntarios;
    }
   

   
    
}
