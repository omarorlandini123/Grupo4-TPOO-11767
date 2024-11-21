/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author NEISER
 */
public class Proveedor {
    private String empresa;
    private String tipoSuministro;
    private List<Producto> productoSuministrados;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipoSuministro() {
        return tipoSuministro;
    }

    public void setTipoSuministro(String tipoSuministro) {
        this.tipoSuministro = tipoSuministro;
    }

    public List<Producto> getProductoSuministrados() {
        return productoSuministrados;
    }

    public void setProductoSuministrados(List<Producto> productoSuministrados) {
        this.productoSuministrados = productoSuministrados;
    }
}
