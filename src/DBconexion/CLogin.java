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
import java.sql.Statement;
import DBconexion.LoginExtra;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CLogin {

    private Connection connection;
     private Statement statement;
    public CLogin(Connection con) {
        try {
            connection = con;
            statement = con.createStatement();
        } catch (Exception s) {
            System.err.println(s.getMessage());
        }
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
          try {
            String query = "Select * from usuarios";
            ResultSet resultSet = statement.executeQuery(query);
            return LoginExtra.fromResultSet(resultSet);
        } catch (Exception s) {
            System.err.println(s.getMessage());
            return null;
        }
    }

    // Insertar un nuevo usuario
    public boolean insertarUsuario(Usuario usuario) {
        String queryIns = ""
                + "INSERT INTO `olla_comun`.`usuarios`\n"
                + "(`nombre`,\n"
                + "`usuario`,\n"
                + "`clave`,\n"
                + "`dni`,\n"
                + "`activo`)\n"
                + "`rol`)\n"
                + "VALUES\n"
                + "('" + usuario.getNombre() + "',\n"
                + "'" + usuario.getUsuario()+ "',\n"
                + "'" + usuario.getContra()+ "',\n"
                + usuario.getDocumento()+ ",\n"
                + usuario.isActivo()+ ",\n"
                + "'" + usuario.getRol()+ "');";
       try {
            int executeIns = statement.executeUpdate(queryIns);
            if (executeIns > 0) {
                System.out.println("SE INSERTÓ EL NUEVO REGISTRO");
                return true;
            } else {
                System.err.println("No se pudo insertar");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    // Actualizar datos del usuario
    public boolean actualizarUsuario(Usuario usuario) {
          String queryUpd = ""
                + "update usuarios "
                + "set "
                + "nombre = '" + usuario.getNombre() + "' ,"
                + "usuario= '" + usuario.getUsuario()+ "', "
                + "clave = '" + usuario.getContra()+ "', "
                + "dni = " + usuario.getDocumento()+ ", "
                + "activo = '" + usuario.isActivo()+ "' "
                + "rol = '" + usuario.getRol()+ "' "
                + "where id = " + usuario.getId();
        
        try {
            int executeUpdate = statement.executeUpdate(queryUpd);
            if (executeUpdate > 0) {
                System.out.println("SE ACTUALIZó el correo");
                return true;
            } else {
                System.err.println("No se pudo actualizar");
            }

        } catch (Exception s) {
            System.err.println(s.getMessage());
        }
        return false;
    }

    public boolean eliminarUsuario(Usuario usuario) {
     String queryDel = ""
                + "DELETE FROM `olla_comun`.`usuarios`\n"
                + "WHERE id = " + usuario.getId();
  try {
            int executeDel = statement.executeUpdate(queryDel);
            if (executeDel > 0) {
                System.out.println("SE ELIMINÓ EL NUEVO REGISTRO");
                return true;
            } else {
                System.err.println("No se pudo eliminar");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
}


    // Buscar usuarios por nombre o usuario
    public List<Usuario> buscarUsuarios(String criterio) {
       try {
        String query = "SELECT * FROM usuarios WHERE nombre LIKE '%" + criterio + "%' OR dni LIKE '%" + criterio + "%'";
        ResultSet resultSet = statement.executeQuery(query);
        return LoginExtra.fromResultSet(resultSet);
    } catch (Exception e) {
        System.err.println(e.getMessage());
        return new ArrayList<>();
    }
    }
}

      
