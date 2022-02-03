/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utilities;

import com.enums.CRUDMessages;
import javax.swing.JOptionPane;

/**
 *
 * @author eddy2
 */
public class MessagesGUI {

    public static void showMessage(CRUDMessages message) {
        switch (message) {
            case EMPTY_FIELDS:
                JOptionPane.showMessageDialog(null, "No pueden haber campos vacios", "Campos Vacios", JOptionPane.INFORMATION_MESSAGE);
                break;
            case REGISTER_SUCCESFULLY:
                JOptionPane.showMessageDialog(null, "El usuario se ha registrado satisfactoriamente", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                break;
            case REGISTER_FAILED:
                JOptionPane.showMessageDialog(null, "El usuario se no se ha registrado, intentelo de nuevo", "Registro Fallido", JOptionPane.INFORMATION_MESSAGE);
                break;
            case UPDATE_SUCCESFULLY:
                JOptionPane.showMessageDialog(null, "El usuario se ha actualizado satisfactoriamente", "Actualización Exitoso", JOptionPane.INFORMATION_MESSAGE);
                break;
            case UPDATE_FAILED:
                JOptionPane.showMessageDialog(null, "El usuario se no se ha actualizado, intentelo de nuevo", "Actualización Fallida", JOptionPane.INFORMATION_MESSAGE);
            case DELETE_SUCCESFULLY:
                JOptionPane.showMessageDialog(null, "El usuario se ha eliminado satisfactoriamente", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                break;
            case DELETE_FAILED:
                JOptionPane.showMessageDialog(null, "El usuario se no se ha eliminado, intentelo de nuevo", "Eliminación Fallida", JOptionPane.INFORMATION_MESSAGE);
                break;
            case USER_EXIST:
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe, intente con otro", "Usuario existente", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
