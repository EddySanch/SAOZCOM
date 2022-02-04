/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers;

import com.UI.Main_FRM;
import com.UI.Material_FRM;
import com.classes.Material;
import com.communication.MaterialDB;
import com.enums.CRUDMessages;
import static com.enums.CRUDMessages.DELETE_SUCCESFULLY;
import static com.enums.CRUDMessages.SIATEL_EXIST;
import com.enums.DataBaseActions;
import static com.enums.DataBaseActions.DEFAULT;
import static com.enums.DataBaseActions.DELETE_REGISTER;
import static com.enums.DataBaseActions.EDIT_REGISTER;
import static com.enums.DataBaseActions.NEW_REGISTER;
import static com.enums.DataBaseActions.ROW_SELECTED;
import static com.enums.DataBaseActions.SAVE_REGITER;
import static com.enums.DataBaseActions.UPDATE_REGISTER;
import com.utilities.FrameUtilities;
import com.utilities.MessagesGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MaterialController implements ActionListener, MouseListener {

    private MaterialDB materialDB;
    private Material material;
    private Material_FRM material_FRM;
    private Main_FRM main;
    private CRUDMessages CRUDmsj;

    public MaterialController(Main_FRM main) {
        this.material_FRM = new Material_FRM();
        material = new Material();
        materialDB = new MaterialDB();
        this.main = main;
        FrameUtilities.OpenInternalFrame(material_FRM, this.main);
        addListeners();
        enableDisableButtons(DEFAULT);
    }

    private void addListeners() {
//Set Command to items
        material_FRM.btn_save.setActionCommand(SAVE_REGITER.toString());
        material_FRM.btn_actualizar.setActionCommand(UPDATE_REGISTER.toString());
        material_FRM.btn_new.setActionCommand(NEW_REGISTER.toString());
        material_FRM.btn_delete.setActionCommand(DELETE_REGISTER.toString());
        material_FRM.btn_edit.setActionCommand(EDIT_REGISTER.toString());
//Add the listeners to items
        material_FRM.btn_save.addActionListener(this);
        material_FRM.btn_actualizar.addActionListener(this);
        material_FRM.btn_new.addActionListener(this);
        material_FRM.btn_delete.addActionListener(this);
        material_FRM.btn_edit.addActionListener(this);
//Link table to listener
        material_FRM.tbl_materials.addMouseListener(this);
       updateTable();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DataBaseActions actions = DataBaseActions.valueOf(e.getActionCommand());

        switch (actions) {
            case SAVE_REGITER:
                if (validateFields()) {
                    CRUDmsj = materialDB.isSiatelRegistered(material_FRM.txt_siatel.getText());
                    MessagesGUI.showMessage(CRUDmsj == SIATEL_EXIST
                            ? SIATEL_EXIST : materialDB.registerMaterial(getMaterial()));
                    if (CRUDmsj != SIATEL_EXIST) {
                        clearFields();
                        updateTable();
                    }
                } else {
                    MessagesGUI.showMessage(CRUDMessages.EMPTY_FIELDS);
                }
                break;
            case EDIT_REGISTER:
                enableDisableButtons(EDIT_REGISTER);
                fillUserLabels(material);
                break;
            case UPDATE_REGISTER:
                if (validateFields()) {
                    CRUDmsj = materialDB.isSiatelRegisteredUpdate(material_FRM.txt_siatel.getText(), material.getId());
                    MessagesGUI.showMessage(CRUDmsj == SIATEL_EXIST ? SIATEL_EXIST : materialDB.updateMaterial(getMaterial()));
                    if (CRUDmsj != SIATEL_EXIST) {
                        enableDisableButtons(DEFAULT);
                        clearFields();
                        updateTable();
                    }
                } else {
                    MessagesGUI.showMessage(CRUDMessages.EMPTY_FIELDS);
                }
                break;
            case NEW_REGISTER:
                enableDisableButtons(DEFAULT);
                clearFields();
                updateTable();
                break;
            case DELETE_REGISTER:
                if (confimationMessaje("Confirmación de eliminación", material.getSiatel_code())) {
                    CRUDmsj = materialDB.deleteMaterial(material.getId());
                    MessagesGUI.showMessage(CRUDmsj);
                    if (CRUDmsj == DELETE_SUCCESFULLY) {
                        updateTable();
                        enableDisableButtons(DEFAULT);
                        clearFields();
                    }
                }
                break;

        }
    }

    private Material getMaterial() {
        material.setSiatel_code(material_FRM.txt_siatel.getText());
        material.setAx_code(material_FRM.txt_ax.getText());
        material.setDescription(material_FRM.txt_description.getText());
        material.setQuantity(Double.valueOf(material_FRM.txt_quantity.getText()));
        material.setUom(material_FRM.cmb_uom.getSelectedItem().toString());
        return material;
    }

    private Material getMaterialTbl(int fila) {
        material.setId(Integer.valueOf(material_FRM.tbl_materials.getValueAt(fila, 0).toString()));
        material.setSiatel_code(material_FRM.tbl_materials.getValueAt(fila, 1).toString());
        material.setAx_code(material_FRM.tbl_materials.getValueAt(fila, 2).toString());
        material.setDescription(material_FRM.tbl_materials.getValueAt(fila, 3).toString());
        material.setQuantity(Double.valueOf(material_FRM.tbl_materials.getValueAt(fila, 4).toString()));
        material.setUom(material_FRM.tbl_materials.getValueAt(fila, 5).toString());
        return material;
    }

    private void fillUserLabels(Material material) {
        material_FRM.txt_siatel.setText(material.getSiatel_code());
        material_FRM.txt_ax.setText(material.getAx_code());
        material_FRM.txt_description.setText(material.getDescription());
        material_FRM.txt_quantity.setText(String.valueOf(material.getQuantity()));
        material_FRM.cmb_uom.setSelectedItem(material.getUom());
    }

    private boolean validateFields() {
        if (material_FRM.txt_siatel.getText().isEmpty()) {
            return false;
        }
        if (material_FRM.txt_ax.getText().isEmpty()) {
            return false;
        }
        if (material_FRM.txt_description.getText().isEmpty()) {
            return false;
        }
        if (material_FRM.txt_quantity.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void clearFields() {
        material_FRM.txt_siatel.setText("");
        material_FRM.txt_ax.setText("");
        material_FRM.txt_description.setText("");
        material_FRM.txt_quantity.setText("");
        material_FRM.cmb_uom.setSelectedIndex(0);

    }

    private void updateTable() {
        try {
            material_FRM.tbl_materials.setModel(materialDB.getDataMaterial());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            int row = material_FRM.tbl_materials.rowAtPoint(e.getPoint());
            if (material_FRM.tbl_materials.rowAtPoint(e.getPoint()) > -1) {
                enableDisableButtons(ROW_SELECTED);
                getMaterialTbl(row);
                clearFields();
            }
        }
    }

    private void enableDisableButtons(DataBaseActions status) {
        FrameUtilities.enableDisableButtons(material_FRM.btn_save.getModel(), material_FRM.btn_actualizar.getModel(),
                material_FRM.btn_new.getModel(), material_FRM.btn_edit.getModel(), material_FRM.btn_delete.getModel(), status);
    }

    private boolean confimationMessaje(String title, String body) {
        Icon icon = new ImageIcon("src\\com\\assets\\delete_material.png");
        int res = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este material: " + body,
                title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        if (res == 0) {
            return true;
        } else {
            return false;
        }

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
