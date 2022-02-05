/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.communication;

import com.classes.Material;
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
import static com.enums.CRUDMessages.SIATEL_EXIST;
import static com.enums.CRUDMessages.SIATEL_NO_EXIST;
import static com.enums.CRUDMessages.UPDATE_FAILED;
import static com.enums.CRUDMessages.UPDATE_SUCCESFULLY;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eddy2
 */
public class MaterialDB {

    private Connection conn;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private DefaultTableModel defaultTbl;

    public MaterialDB() {
    }

    private DefaultTableModel setTitleTable() {
        defaultTbl = new DefaultTableModel();
        defaultTbl.addColumn("ID");
        defaultTbl.addColumn("Código SIATEL");
        defaultTbl.addColumn("Código AX");
        defaultTbl.addColumn("Descripción");
        defaultTbl.addColumn("Cantidad");
        defaultTbl.addColumn("Unidad de medida");
        return defaultTbl;
    }

    public DefaultTableModel getDataMaterial() throws SQLException {
        String query = "Select * from material;";
        try {
            setTitleTable();
            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            Object[] material = new Object[6];
            while (resultSet.next()) {
                material[0] = resultSet.getInt(1);
                material[1] = resultSet.getString(2);
                material[2] = resultSet.getString(3);
                material[3] = resultSet.getString(4);
                material[4] = resultSet.getFloat(5);
                material[5] = resultSet.getString(6);
                defaultTbl.addRow(material);

            }

        } catch (Exception e) {
            System.err.println("Error al obtener los datos : " + e.getCause());
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

    public CRUDMessages isSiatelRegistered(String siatel) {
        String query = "select * from material where siatel_code = ?";
        try {

            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, siatel);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return SIATEL_EXIST;
            } else {
                return SIATEL_NO_EXIST;
            }

        } catch (Exception e) {
            System.out.println(e);
            return CRUDMessages.BD_ERROR;

        }
    }

    public CRUDMessages isSiatelRegisteredUpdate(String user, int id) {
        String query = "select * from material where siatel_code = ? and id != ?";
        try {

            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, user);
            preparedStatement.setInt(2, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return SIATEL_EXIST;
            } else {
                return SIATEL_NO_EXIST;
            }

        } catch (Exception e) {
            System.out.println(e);
            return CRUDMessages.BD_ERROR;

        }
    }

    public CRUDMessages registerMaterial(Material material) {
        int result = 0;
        String query = "INSERT INTO material VALUES(0,?,?,?,?,?);";
        try {
            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, material.getSiatel_code());
            preparedStatement.setString(2, material.getAx_code());
            preparedStatement.setString(3, material.getDescription());
            preparedStatement.setDouble(4, material.getQuantity());
            preparedStatement.setString(5, material.getUom());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result == 1 ? REGISTER_SUCCESFULLY : REGISTER_FAILED;
    }

    public CRUDMessages updateMaterial(Material material) {
        int result = 0;
        String query = "UPDATE material SET siatel_code = ?, ax_code = ?, description = ?, quantity = ?, uom = ? where id = ?;";
        try {
            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, material.getSiatel_code());
            preparedStatement.setString(2, material.getAx_code());
            preparedStatement.setString(3, material.getDescription());
            preparedStatement.setDouble(4, material.getQuantity());
            preparedStatement.setString(5, material.getUom());
            preparedStatement.setInt(6, material.getId());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result == 1 ? UPDATE_SUCCESFULLY : UPDATE_FAILED;
    }

    public CRUDMessages deleteMaterial(int id) {
        int result = 0;
        String query = "DELETE FROM material where id = ?;";
        try {
            conn = ConnectionBD.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result == 1 ? DELETE_SUCCESFULLY : DELETE_FAILED;
    }

}
