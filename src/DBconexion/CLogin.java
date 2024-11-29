/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBconexion;
import Logica.Usuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.ResultSet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CLogin {

    private Connection connection;

    public CLogin(Connection con) {
        this.connection = con;
    }

    // Validar login
    public Usuario login(String username, String password) {
        String query = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setActivo(rs.getBoolean("activo"));
                usuario.setRol(rs.getString("rol"));
                return usuario;
            }
        } catch (SQLException e) {
            System.err.println("Error al validar login: " + e.getMessage());
        }
        return null;
    }

    // Obtener lista de usuarios
    public List<Usuario> getUsuarios() {
        String query = "SELECT * FROM usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setActivo(rs.getBoolean("activo"));
                usuario.setRol(rs.getString("rol"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener usuarios: " + e.getMessage());
        }
        return usuarios;
    }

    // Insertar un nuevo usuario
    public boolean insertarUsuario(Usuario usuario) {
        String query = "INSERT INTO usuarios (nombre, usuario, clave, activo, rol) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getUsuario());
            ps.setString(3, usuario.getContra());
            ps.setBoolean(4, usuario.isActivo());
            ps.setString(5, usuario.getRol());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar usuario: " + e.getMessage());
        }
        return false;
    }

    // Actualizar datos del usuario
    public boolean actualizarUsuario(Usuario usuario) {
        String query = "UPDATE usuarios SET nombre = ?, clave = ?, activo = ?, rol = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContra());
            ps.setBoolean(3, usuario.isActivo());
            ps.setString(4, usuario.getRol());
            ps.setInt(5, usuario.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al actualizar usuario: " + e.getMessage());
        }
        return false;
    }

    public boolean eliminarUsuario(Usuario usuario) {
    String queryDel = "DELETE FROM usuarios WHERE id = ?";

    try (PreparedStatement ps = connection.prepareStatement(queryDel)) {
        ps.setInt(1, usuario.getId());  // Usamos el ID del Usuario para la eliminación
        int executeDel = ps.executeUpdate();
        if (executeDel > 0) {
            System.out.println("SE ELIMINÓ EL USUARIO");
            return true;
        } else {
            System.err.println("No se pudo eliminar el usuario");
        }
    } catch (SQLException e) {
        System.err.println("Error al eliminar usuario: " + e.getMessage());
    }
    return false;
}


    // Buscar usuarios por nombre o usuario
    public List<Usuario> buscarUsuarios(String criterio) {
        String query = "SELECT * FROM usuarios WHERE nombre LIKE ? OR usuario LIKE ?";
        List<Usuario> usuarios = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, "%" + criterio + "%");
            ps.setString(2, "%" + criterio + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setActivo(rs.getBoolean("activo"));
                usuario.setRol(rs.getString("rol"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar usuarios: " + e.getMessage());
        }
        return usuarios;
    }
}

      
