/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantallitas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import DBconexion.*;
import Logica.*;

public class Login {

    public Login() {
        // Crear ventana
        JFrame ventana = new JFrame("Login - Sistema");
        ventana.setSize(400, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridBagLayout());

        // Restricciones de layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        // Componentes
        JLabel lblUsuario = new JLabel("Usuario:");
        JTextField txtUsuario = new JTextField(15);
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField(15);
        JButton btnIngresar = new JButton("Ingresar");

        // Estilo
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));

        // Añadir componentes
        gbc.gridx = 0;
        gbc.gridy = 0;
        ventana.add(lblUsuario, gbc);

        gbc.gridx = 1;
        ventana.add(txtUsuario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        ventana.add(lblPassword, gbc);

        gbc.gridx = 1;
        ventana.add(txtPassword, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        ventana.add(btnIngresar, gbc);

        // Acción del botón Ingresar
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener datos ingresados
                String usuarioIngresado = txtUsuario.getText();
                String passwordIngresado = new String(txtPassword.getPassword());

                // Obtener la conexión a la base de datos
                Connection con = DatabaseConnection.getConnection();

                if (con != null) {
                    // Validar login usando CLogin
                    CLogin cl = new CLogin(con);  // Pasamos la conexión al constructor
                    Usuario usuario = cl.login(usuarioIngresado, passwordIngresado);

                    if (usuario != null) {
                        ventana.dispose(); // Cerrar ventana de login

                        // Redirigir según el rol
                        if (usuario.getRol().equals("ADMIN")) {
                            new DashboardAdmin(); // Abre Dashboard de Administrador
                        } else if (usuario.getRol().equals("USER")) {
                            new DashboardUsuario(); // Abre Dashboard de Usuario
                        }
                    } else {
                        // Mostrar error si no coincide
                        JOptionPane.showMessageDialog(ventana, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(ventana, "Error de conexión a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        ventana.setLocationRelativeTo(null); // Centrar ventana
        ventana.setVisible(true);
    }
}
