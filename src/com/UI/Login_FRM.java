/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.UI;

import com.communication.UserDB;
import com.enums.AutenticationMessage;
import com.utilities.FrameUtilities;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author eddy2
 */
public class Login_FRM extends javax.swing.JFrame {

    int xMouse, yMouse;
    private boolean isFirsEnterKey = true;

    public Login_FRM() {
        initComponents();
        this.setLocationRelativeTo(this);
        FrameUtilities.adaptImagenToLbl(this, img_login, "src\\com\\assets\\iniciar-sesion.png");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        btn_close = new javax.swing.JPanel();
        lbl_close = new javax.swing.JLabel();
        img_login = new javax.swing.JLabel();
        lbl_iniciar_sesion = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        lbl_contrasenia = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_login = new javax.swing.JPanel();
        lbl_iniciar = new javax.swing.JLabel();
        img_saozcom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_header.setBackground(new java.awt.Color(255, 255, 255));
        pnl_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_headerMouseDragged(evt);
            }
        });
        pnl_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_headerMousePressed(evt);
            }
        });

        btn_close.setBackground(new java.awt.Color(255, 255, 255));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        lbl_close.setBackground(new java.awt.Color(255, 255, 255));
        lbl_close.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lbl_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_close.setText("X");
        lbl_close.setToolTipText("");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_closeLayout = new javax.swing.GroupLayout(btn_close);
        btn_close.setLayout(btn_closeLayout);
        btn_closeLayout.setHorizontalGroup(
            btn_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_close, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );
        btn_closeLayout.setVerticalGroup(
            btn_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_close, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 781, Short.MAX_VALUE))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbl_iniciar_sesion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_iniciar_sesion.setText("INICIAR SESIÓN");

        lbl_usuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lbl_usuario.setText("USUARIO");

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(153, 153, 153));
        txt_usuario.setText("Ingrese su nombre de usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usuarioFocusGained(evt);
            }
        });
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        lbl_contrasenia.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lbl_contrasenia.setText("CONTRASEÑA");

        txt_contrasenia.setForeground(new java.awt.Color(153, 153, 153));
        txt_contrasenia.setText("********");
        txt_contrasenia.setToolTipText("");
        txt_contrasenia.setBorder(null);
        txt_contrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_contraseniaFocusGained(evt);
            }
        });
        txt_contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contraseniaMousePressed(evt);
            }
        });
        txt_contrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_contraseniaKeyReleased(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(82, 197, 223));
        btn_login.setForeground(new java.awt.Color(82, 197, 223));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        lbl_iniciar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        lbl_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iniciar.setText("INICIAR SESIÓN");
        lbl_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_iniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_iniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_iniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_loginLayout = new javax.swing.GroupLayout(btn_login);
        btn_login.setLayout(btn_loginLayout);
        btn_loginLayout.setHorizontalGroup(
            btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_loginLayout.createSequentialGroup()
                .addComponent(lbl_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_loginLayout.setVerticalGroup(
            btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2)
                            .addComponent(txt_contrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_usuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_iniciar_sesion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_contrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(img_login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(img_login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_iniciar_sesion)
                .addGap(33, 33, 33)
                .addComponent(lbl_usuario)
                .addGap(18, 18, 18)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_contrasenia)
                .addGap(18, 18, 18)
                .addComponent(txt_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 500));

        img_saozcom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/Captura.PNG"))); // NOI18N
        img_saozcom.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        img_saozcom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.add(img_saozcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -20, 720, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void pnl_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnl_headerMousePressed

    private void pnl_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnl_headerMouseDragged

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void lbl_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseEntered
        btn_close.setBackground(Color.RED);
        lbl_close.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbl_closeMouseEntered

    private void lbl_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseExited
        btn_close.setBackground(Color.WHITE);
        lbl_close.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_closeMouseExited

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void lbl_iniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iniciarMouseEntered
        btn_login.setBackground(new Color(1, 62, 111));
    }//GEN-LAST:event_lbl_iniciarMouseEntered

    private void lbl_iniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iniciarMouseExited
        btn_login.setBackground(new Color(82, 197, 223));
    }//GEN-LAST:event_lbl_iniciarMouseExited

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        textHolderTxtUser();
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_contraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contraseniaMousePressed
        textHolderTxtPass();
    }//GEN-LAST:event_txt_contraseniaMousePressed

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked

    }//GEN-LAST:event_btn_loginMouseClicked

    private void lbl_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iniciarMouseClicked

        logIn();
    }//GEN-LAST:event_lbl_iniciarMouseClicked

    private void txt_usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usuarioFocusGained
        textHolderTxtUser();
    }//GEN-LAST:event_txt_usuarioFocusGained

    private void txt_contraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_contraseniaFocusGained
        textHolderTxtPass();
    }//GEN-LAST:event_txt_contraseniaFocusGained

    private void txt_contraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseniaKeyReleased
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (isFirsEnterKey) {
                logIn();
                isFirsEnterKey = false;
            } else {
                isFirsEnterKey = true;
            }
        }
    }//GEN-LAST:event_txt_contraseniaKeyReleased

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
            java.util.logging.Logger.getLogger(Login_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_FRM().setVisible(true);
            }
        });
    }

    private int validateFields() {

        if (txt_usuario.getText().equals("Ingrese su nombre de usuario")
                || txt_usuario.getText().isEmpty()) {
            return 1;
        }
        if (txt_contrasenia.getText().equals("********")
                || txt_contrasenia.getText().isEmpty()) {
            return 2;
        }
        return 3;
    }

    private void showMain() {
        JFrame main = new Main_FRM();
        //main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //main.setResizable(true);
        //main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        main.pack();
        main.setVisible(true);
    }

    private void textHolderTxtUser() {
        if (txt_usuario.getText().equals("Ingrese su nombre de usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.BLACK);
        }

        if (txt_contrasenia.getText().isEmpty()) {
            txt_contrasenia.setText("********");
            txt_contrasenia.setForeground(Color.GRAY);
        }

    }

    private void textHolderTxtPass() {
        if (txt_contrasenia.getText().equals("********")) {
            txt_contrasenia.setText("");
            txt_contrasenia.setForeground(Color.BLACK);
        }

        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su nombre de usuario");
            txt_usuario.setForeground(Color.GRAY);
        }

    }

    private void logIn() {
        int validate = validateFields();
        AutenticationMessage loginMessage;

        switch (validate) {
            case 1:
                JOptionPane.showMessageDialog(null, "Agregar un usuario válido", "Verificar campos", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Agregar una contraseña válida", "Verificar campos", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                loginMessage = new UserDB().login(txt_usuario.getText(), txt_contrasenia.getText());
                System.out.println(loginMessage);
                switch (loginMessage) {
                    case LOGIN_SUCCESFULL:
                        showMain();
                        this.dispose();
                        break;
                    case USER_NOPASS:
                        JOptionPane.showMessageDialog(null, "La contraseña es incorrecta", "Verificar los valores", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case NO_USER:
                        JOptionPane.showMessageDialog(null, "El usuario no existe", "Verificar los valores", JOptionPane.INFORMATION_MESSAGE);
                        break;

                }
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btn_close;
    private javax.swing.JPanel btn_login;
    private javax.swing.JLabel img_login;
    private javax.swing.JLabel img_saozcom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_contrasenia;
    private javax.swing.JLabel lbl_iniciar;
    private javax.swing.JLabel lbl_iniciar_sesion;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
