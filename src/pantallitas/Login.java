/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantallitas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    public Login() {
        //jframe
        JFrame ventana = new JFrame("Login - Sistema");
        ventana.setSize(400, 250); //tamaño de ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridBagLayout()); //usamos GridBagLayout centrar lo componentes

       //restricciones de componentes
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); //espaciado alrededor de los componentes
        gbc.anchor = GridBagConstraints.CENTER; //alinear al centro

        //componentes para el login
        JLabel lblUsuario = new JLabel("Usuario:");
        JTextField txtUsuario = new JTextField(15); 
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField(15);
        JButton btnIngresar = new JButton("Ingresar");

        //estilo de componentes
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));

        //añadir los componentes a ventana con GridBagLayout
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

        
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String adminUsuario = "admin";
                String adminPassword = "1234";
                String usuarioUsuario = "usuario";
                String usuarioPassword = "1234";

                //obtener los datos ingresados
                String usuarioIngresado = txtUsuario.getText();
                String passwordIngresado = new String(txtPassword.getPassword());

                //validamos los datos
                if (usuarioIngresado.equals(adminUsuario) && passwordIngresado.equals(adminPassword)) {
                    ventana.dispose();//cerramos ventana
                    new DashboardAdmin(); //abrimos el dashboard de administradores
                } else if (usuarioIngresado.equals(usuarioUsuario) && passwordIngresado.equals(usuarioPassword)) {
                    ventana.dispose();//cerramos ventana
                    new DashboardUsuario(); //abrimos el dashboard de usuarios
                } else {
                    //mensaje de error en caso no coincidan los datos
                    JOptionPane.showMessageDialog(ventana, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        ventana.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        ventana.setVisible(true);
    }

}
    
