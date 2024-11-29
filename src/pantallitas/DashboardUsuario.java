/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantallitas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardUsuario {

    public DashboardUsuario() {
        
        //jframe
        JFrame ventana = new JFrame("Dashboard - Usuario");
        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(2, 1, 10, 10));

        //botones dashboardUsuario
        JButton btnPerfil = new JButton("Mi Perfil");
        JButton btnConsultarEventos = new JButton("Consultar Eventos");

        //agregar listener para los botones
        btnPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 pantallaPerfilUsuario ventana = new pantallaPerfilUsuario();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        btnConsultarEventos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 pantallaEventosUsuario ventana = new pantallaEventosUsuario();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        //agregar botone al panel
        menuPanel.add(btnPerfil);
        menuPanel.add(btnConsultarEventos);

        //titulo del panel
        JLabel titulo = new JLabel("Bienvenido, Usuario", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        ventana.add(titulo, BorderLayout.NORTH);

        //centrar el menu en el panel
        ventana.add(menuPanel, BorderLayout.CENTER);

        //visibilidad de la ventaan
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new DashboardUsuario(); 
    }
}

