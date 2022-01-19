/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.communication;

import com.connection.ConnectionBD;
import com.enums.AutenticationMessage;
import static com.enums.AutenticationMessage.BD_ERROR;
import static com.enums.AutenticationMessage.LOGIN_SUCCESFULL;
import static com.enums.AutenticationMessage.NO_USER;
import static com.enums.AutenticationMessage.USER_NOPASS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author eddy2
 */
public class UserBD {

    Connection conn;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public UserBD() {
    }

   

    public AutenticationMessage login(String user, String pass) {
        String query = "select * from user where username = ?";
        try {

            conn = new ConnectionBD().getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, user);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                if (resultSet.getString("username").equals(user)
                        && resultSet.getString("pass").equals(pass)) {
                    return LOGIN_SUCCESFULL;
                } else {
                    return USER_NOPASS;
                }
            } else {
                return NO_USER;

            }

        } catch (Exception e) {
            return BD_ERROR;
        }
    }

}
