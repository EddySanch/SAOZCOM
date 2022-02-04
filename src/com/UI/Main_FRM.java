/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.UI;

import com.controllers.MaterialController;
import com.controllers.UserController;
import com.utilities.FrameUtilities;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author eddy2
 */
public class Main_FRM extends javax.swing.JFrame {

    /**
     * Creates new form Example
     */
    public Main_FRM() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {

        }

        initComponents();
        FrameUtilities.extender(this);
        UserController user = new UserController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_usuers = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btn_material = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btn_entry = new javax.swing.JPanel();
        Entradas = new javax.swing.JLabel();
        container = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(5, 10, 46));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_usuers.setBackground(new java.awt.Color(5, 10, 46));
        btn_usuers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuersMouseExited(evt);
            }
        });
        btn_usuers.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/user.png"))); // NOI18N
        jLabel1.setText("Usuarios");
        btn_usuers.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(btn_usuers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, 10));

        btn_material.setBackground(new java.awt.Color(5, 10, 46));
        btn_material.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_materialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_materialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_materialMouseExited(evt);
            }
        });
        btn_material.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/material.png"))); // NOI18N
        jLabel2.setText(" Material");
        btn_material.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(btn_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, 10));

        btn_entry.setBackground(new java.awt.Color(5, 10, 46));
        btn_entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_entryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_entryMouseExited(evt);
            }
        });
        btn_entry.setLayout(new java.awt.BorderLayout());

        Entradas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Entradas.setForeground(new java.awt.Color(255, 255, 255));
        Entradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/input.png"))); // NOI18N
        Entradas.setText("Entradas");
        Entradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntradasMouseEntered(evt);
            }
        });
        btn_entry.add(Entradas, java.awt.BorderLayout.CENTER);

        jPanel2.add(btn_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 30));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usuersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuersMouseEntered
        btn_usuers.setBackground(new Color(25, 29, 74));
    }//GEN-LAST:event_btn_usuersMouseEntered

    private void btn_usuersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuersMouseExited
        btn_usuers.setBackground(new Color(5, 10, 46));
    }//GEN-LAST:event_btn_usuersMouseExited

    private void btn_materialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materialMouseEntered
       btn_material.setBackground(new Color(25, 29, 74));
    }//GEN-LAST:event_btn_materialMouseEntered

    private void btn_materialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materialMouseExited
         btn_material.setBackground(new Color(5, 10, 46));
    }//GEN-LAST:event_btn_materialMouseExited

    private void EntradasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradasMouseEntered

    private void btn_entryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entryMouseExited
        btn_entry.setBackground(new Color(25, 29, 74));
    }//GEN-LAST:event_btn_entryMouseExited

    private void btn_entryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entryMouseEntered
       btn_entry.setBackground(new Color(25, 29, 74));
    }//GEN-LAST:event_btn_entryMouseEntered

    private void btn_usuersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuersMouseClicked
         UserController userController = new UserController(this);
    }//GEN-LAST:event_btn_usuersMouseClicked

    private void btn_materialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materialMouseClicked
        MaterialController materialController = new MaterialController(this);
    }//GEN-LAST:event_btn_materialMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_FRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entradas;
    private javax.swing.JPanel btn_entry;
    private javax.swing.JPanel btn_material;
    private javax.swing.JPanel btn_usuers;
    public javax.swing.JDesktopPane container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
