/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.communication;

import com.classes.User;
import com.connection.ConnectionBD;
import com.enums.AutenticationMessage;
import static com.enums.AutenticationMessage.BD_ERROR;
import static com.enums.AutenticationMessage.LOGIN_SUCCESFULL;
import static com.enums.AutenticationMessage.NO_USER;
import static com.enums.AutenticationMessage.USER_NOPASS;
import com.enums.CRUDMessages;
import static com.enums.CRUDMessages.DELETE_FAILED;
import static com.enums.CRUDMessages.DELETE_SUCCESFULLY;
import static com.enums.CRUDMessages.REGISTER_FAILED;
import static com.enums.CRUDMessages.REGISTER_SUCCESFULLY;
import static com.enums.CRUDMessages.UPDATE_FAILED;
import static com.enums.CRUDMessages.UPDATE_SUCCESFULLY;
import static com.enums.CRUDMessages.USER_EXIST;
import static com.enums.CRUDMessages.USER_NO_EXIST;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eddy2
 */
public class UserDB {

    private Connection conn;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private DefaultTableModel defaultTbl;

    public UserDB() {
    }

    private DefaultTableModel setTitleTable() {
        defaultTbl = new DefaultTableModel();
        defaultTbl.addColumn("ID");
        defaultTbl.addColumn("Nombre");
        defaultTbl.addColumn("Apellidos");
        defaultTbl.addColumn("Teléfono");
        defaultTbl.addColumn("Correo");
        defaultTbl.addColumn("Usuario");
        defaultTbl.addColumn("Contraseña");
        defaultTbl.addColumn("Rol");
        return defaultTbl;
    }

    public DefaultTableModel getDataUser() throws SQLException {
        String query = "Select * from user";
        try {
            setTitleTable();
            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            Object[] user = new Object[8];
            while (resultSet.next()) {
                user[0] = resultSet.getInt(1);
                user[1] = resultSet.getString(2);
                user[2] = resultSet.getString(3);
                user[3] = resultSet.getString(4);
                user[4] = resultSet.getString(5);
                user[5] = resultSet.getString(6);
                user[6] = resultSet.getString(7);
                user[7] = resultSet.getString(8);
                defaultTbl.addRow(user);

            }

        } catch (Exception e) {
            System.err.println("Error al obtener los datos : " + e.getMessage());
        }
        return defaultTbl;
    }

    public AutenticationMessage login(String user, String pass) {
        String query = "select * from user where user = ?";
        try {

            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                if (resultSet.getString("user").equals(user)
                        && resultSet.getString("pass").equals(pass)) {
                    return LOGIN_SUCCESFULL;
                } else {
                    return USER_NOPASS;
                }
            } else {
                return NO_USER;

            }

        } catch (Exception e) {
            System.out.println(e);
            return BD_ERROR;
        }
    }

    public CRUDMessages isUserRegistered(String user) {
        String query = "select * from user where user = ?";
        try {

            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return USER_EXIST;
            } else {
                return USER_NO_EXIST;
            }

        } catch (Exception e) {
            System.out.println(e);
            return CRUDMessages.BD_ERROR;

        }
    }

    public CRUDMessages isUserRegisteredUpdate(String user, int id) {
        String query = "select * from user where user = ? and id != ?";
        try {

            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, user);
            preparedStatement.setInt(2, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return USER_EXIST;
            } else {
                return USER_NO_EXIST;
            }

        } catch (Exception e) {
            System.out.println(e);
            return CRUDMessages.BD_ERROR;

        }
    }

    public CRUDMessages registerUser(User usuer) {
        int result = 0;
        String query = "INSERT INTO user VALUES(0,?,?,?,?,?,?,?);";
        try {
            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, usuer.getName());
            preparedStatement.setString(2, usuer.getLastname());
            preparedStatement.setString(3, usuer.getPhone());
            preparedStatement.setString(4, usuer.getEmail());
            preparedStatement.setString(5, usuer.getUsername());
            preparedStatement.setString(6, usuer.getPass());
            preparedStatement.setString(7, usuer.getRole());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result == 1 ? REGISTER_SUCCESFULLY : REGISTER_FAILED;
    }

    public CRUDMessages updateUser(User user) {
        int result = 0;
        String query = "UPDATE USER SET name = ?, lastname = ?, phone = ?, email = ?, user = ?, pass = ?, role = ? where id = ?;";
        try {
            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLastname());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getUsername());
            preparedStatement.setString(6, user.getPass());
            preparedStatement.setString(7, user.getRole());
            preparedStatement.setInt(8, user.getId());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result == 1 ? UPDATE_SUCCESFULLY : UPDATE_FAILED;
    }

    public CRUDMessages deleteUser(int id) {
        int result = 0;
        String query = "DELETE FROM USER where id = ?;";
        try {
            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeUpdate();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result == 1 ? DELETE_SUCCESFULLY : DELETE_FAILED;
    }

}
