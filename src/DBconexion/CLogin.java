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
import pantallitas.PantallaLogeo;
/**
 *
 * @author NEISER
 */
public class CLogin {
    
     public Logica.Usuario validaUsuario(JTextField usuario, JPasswordField contrasenia) {
        Logica.Usuario usuarioAutenticado = null;
        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            DBconexion.DatabaseConnection objetoConexion = new DBconexion.DatabaseConnection();
            String consulta = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";
            ps = objetoConexion.getConnection().prepareStatement(consulta);
            String contra = String.valueOf(contrasenia.getPassword());
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                usuarioAutenticado = new Logica.Usuario();
                usuarioAutenticado.setIdUsuario(rs.getInt("idusuarios")); 
                usuarioAutenticado.setUsuario(rs.getString("usuario"));
                usuarioAutenticado.setContraseña(rs.getString("clave"));
                usuarioAutenticado.setRol(rs.getString("rol"));
                usuarioAutenticado.setActivo(rs.getBoolean("activo"));
                
               
                if (!usuarioAutenticado.isActivo()) {
                    JOptionPane.showMessageDialog(null, "Este usuario está desactivado.");
                    return null;
                }
                
               
                abrirFormularioPorRol(usuarioAutenticado.getRol());
                
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuarioAutenticado.getUsuario());
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario es INCORRECTO, VUELVA A INTENTAR");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
        return usuarioAutenticado; 
    }

    public void abrirFormularioPorRol(String rol) {
        try {
            switch (rol.toLowerCase()) {
                case "administrador":
                    FormMenuPrincipal menuAdmin = new FormMenuPrincipal();
                    menuAdmin.setVisible(true);
                    break;
                    
                case "usuario":
                    FormMenuUsuario menuUsuario = new FormMenuUsuario();
                    menuUsuario.setVisible(true);
                    break;
                    
            
                default:
                    JOptionPane.showMessageDialog(null, "Rol no reconocido: " + rol);
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el formulario: " + e.toString());
        }
    }
}
