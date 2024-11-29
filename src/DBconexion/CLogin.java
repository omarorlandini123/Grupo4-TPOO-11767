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
import pantallitas.FormMenuPrincipal;
import pantallitas.FormMenuUsuario;
import java.sql.*;
/**
 *
 * @author NEISER
 */
public class CLogin {
   public Usuario login(String user, String pass) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";
        Usuario usuarioLogueado = null;

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuarioLogueado = new Usuario();
                usuarioLogueado.setId(rs.getInt("id"));
                usuarioLogueado.setNombre(rs.getString("nombre"));
                usuarioLogueado.setActivo(rs.getBoolean("activo"));
                usuarioLogueado.setRol(rs.getString("rol"));
                }
        } catch (SQLException e) {
            System.err.println("Error en el login: " + e.getMessage());
        }
        return usuarioLogueado;
    }
      
}
      
