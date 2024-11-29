/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBconexion;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Logica.*;
import pantallitas.*;
import java.sql.ResultSet;
/**
 *
 * @author NEISER
 */
public class LoginExtra  extends Usuario {
    public String getTextoLista() {
    return String.format("ID: %-5d | Nombre: %-20s | Usuario: %-15s | Rol: %-10s | Activo: %-5s", 
                         getId(), getNombre(), getUsuario(), getRol(), isActivo() ? "Sí" : "No");
}

  public LoginExtra(ResultSet rs) {
    try {
        setId(rs.getInt("id"));
        setNombre(rs.getString("nombre"));
        setUsuario(rs.getString("usuario"));
        setActivo(rs.getBoolean("activo"));
        setRol(rs.getString("rol"));
    } catch (Exception e) {
        System.err.println("Error al crear Usuario desde ResultSet: " + e.getMessage());
    }
}


   public static List<Usuario> fromResultSet(ResultSet rs) {
    List<Usuario> usuarios = new ArrayList<>();
    try {
        while (rs.next()) {
            usuarios.add(new LoginExtra(rs));  // Usamos el constructor que toma el ResultSet
        }
    } catch (Exception e) {
        System.err.println("Error al convertir ResultSet a lista de Usuarios: " + e.getMessage());
    }
    return usuarios;
}

}
