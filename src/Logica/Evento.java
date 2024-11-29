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

    public List<Producto> getProductoDistribuidos() {
        return productoDistribuidos;
    }

    public void setProductoDistribuidos(List<Producto> productoDistribuidos) {
        this.productoDistribuidos = productoDistribuidos;
    }
    
}
