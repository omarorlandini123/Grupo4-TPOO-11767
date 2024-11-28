/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantallitas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardAdmin {

    public DashboardAdmin() {
        //jframe
        JFrame ventana = new JFrame("Dashboard - Administrador");
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); 

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10)); 

        //creamos botones
        JButton btnGestionUsuarios = new JButton("Gestionar Usuarios");
        JButton btnGestionEventos = new JButton("Gestionar Eventos");
        JButton btnGestionProductos = new JButton("Gestionar Productos");
        JButton btnGestionProveedores = new JButton("Gestionar Proveedores");
        JButton btnSalir = new JButton("Salir");

        //agregamos botones al panel
        panel.add(btnGestionUsuarios);
        panel.add(btnGestionEventos);
        panel.add(btnGestionProductos);
        panel.add(btnGestionProveedores);
        panel.add(btnSalir);

      
        ventana.add(panel);

       //agregamos accion al gestion usuarios
        btnGestionUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestionUsuario ventana = new GestionUsuario();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

       //agregamos accion al boton gestion eventos
        btnGestionEventos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestionEventos ventana = new GestionEventos();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

       //agregamos accion al boton gestion productos
        btnGestionProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestionProductos ventana = new GestionProductos();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

       
        btnGestionProveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               GestionProveedores ventana = new GestionProveedores();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

       //agregamos accion al boton salir
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose(); //cierra ventana
            }
        });

       
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new DashboardAdmin(); 
    }
}
