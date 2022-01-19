/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author eddy2
 */
public class ConnectionBD {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/saozcomdb";
    private static Connection conn;

    public ConnectionBD() {
        conn = null;
    }

    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error oon la base de datos", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    public void desconectar() {
        try {
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al cerrar la conexion con la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }

}
