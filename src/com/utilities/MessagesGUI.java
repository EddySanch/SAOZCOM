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
                JOptionPane.showMessageDialog(null, "No pueden haber campos vacios", "Campos Vacios", 0);
                break;
            case REGISTER_SUCCESFULLY :
               
                break;
        }

    }
}
