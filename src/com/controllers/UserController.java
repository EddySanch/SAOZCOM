/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers;

import com.UI.Main_FRM;
import com.UI.User_FRM;
import com.classes.User;
import com.communication.UserDB;
import com.enums.DataBaseActions;
import static com.enums.DataBaseActions.CANCEL;
import static com.enums.DataBaseActions.DELETE_REGISTER;
import static com.enums.DataBaseActions.NEW_REGISTER;
import static com.enums.DataBaseActions.SAVE_REGITER;
import static com.enums.DataBaseActions.UPDATE_REGISTER;
import com.utilities.FrameUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UserController implements ActionListener, MouseListener {

    private UserDB userDB;
    private User user;
    private User_FRM user_FRM;
    private Main_FRM main;

    public UserController(Main_FRM main) {
        this.user_FRM = new User_FRM();
        userDB = new UserDB();
        this.main = main;
        FrameUtilities.OpenInternalFrame(user_FRM, this.main);
        addListeners();
    }

    private void addListeners() {
//Set Command to items
        user_FRM.btn_save.setActionCommand(SAVE_REGITER.toString());
        user_FRM.btn_cancel.setActionCommand(CANCEL.toString());
        user_FRM.btn_new.setActionCommand(NEW_REGISTER.toString());
        user_FRM.btn_delete.setActionCommand(DELETE_REGISTER.toString());
        user_FRM.btn_edit.setActionCommand(UPDATE_REGISTER.toString());
//Add the listeners to items
        user_FRM.btn_save.addActionListener(this);
        user_FRM.btn_cancel.addActionListener(this);
        user_FRM.btn_new.addActionListener(this);
        user_FRM.btn_delete.addActionListener(this);
        user_FRM.btn_edit.addActionListener(this);
//Link table to listener
        user_FRM.tbl_users.addMouseListener(this);
        try {
            user_FRM.tbl_users.setModel(userDB.getDataUser());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DataBaseActions actions = DataBaseActions.valueOf(e.getActionCommand());

        switch (actions) {
            case SAVE_REGITER:
                userDB.registerUser(getUser());

                break;

        }
    }

    private User getUser() {
        user = new User();
        user.setName(user_FRM.txtName.getText());
        user.setLastname(user_FRM.txtName.getText());
        user.setPhone(user_FRM.txtName.getText());
        user.setEmail(user_FRM.txtName.getText());
        user.setUsername(user_FRM.txtName.getText());
        user.setPass(user_FRM.txtName.getText());
        user.setRole(user_FRM.cmb_role.getSelectedItem().toString());
        return user;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
