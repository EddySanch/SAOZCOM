package com.UI;

import javax.swing.table.TableColumnModel;

public class User_FRM extends javax.swing.JInternalFrame {

    //private final Cls_Productos CP;
    TableColumnModel columnModel;
    int num = 0;
    int x = 0;
    int y = 0;
//-----------------

    public User_FRM() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnl_footer = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        pnl_left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txt_user = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmb_role = new javax.swing.JComboBox<>();
        pnl_center = new javax.swing.JPanel();
        pnl_space = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        pnl_header1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        pnl_footer1 = new javax.swing.JPanel();
        bt_nuevo1 = new javax.swing.JButton();
        bt_guardar1 = new javax.swing.JButton();
        bt_actualizar1 = new javax.swing.JButton();
        bt_eliminar1 = new javax.swing.JButton();
        pnl_left1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtName1 = new javax.swing.JTextField();
        txt_surname1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_phone1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        user1 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        pass1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        role1 = new javax.swing.JComboBox<>();
        btn_register1 = new javax.swing.JButton();
        pnl_center1 = new javax.swing.JPanel();
        pnl_space1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_users1 = new javax.swing.JTable();

        setBorder(new javax.swing.border.MatteBorder(null));
        setClosable(true);
        setTitle("Productos");
        setMaximumSize(new java.awt.Dimension(1500, 1200));
        setPreferredSize(new java.awt.Dimension(1500, 900));

        jPanel1.setLayout(new java.awt.BorderLayout());

        pnl_header.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Administración de Usuarios");
        jPanel2.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/header.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Llene la información respectiva para registrar un usuario");
        jPanel8.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        pnl_header.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnl_header, java.awt.BorderLayout.PAGE_START);

        pnl_footer.setBackground(new java.awt.Color(255, 255, 255));

        btn_new.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/ic_nuevo.png"))); // NOI18N
        btn_new.setText("Nuevo");
        btn_new.setBorderPainted(false);
        btn_new.setContentAreaFilled(false);
        btn_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/ic_modificar.png"))); // NOI18N
        btn_edit.setText("Modificar");
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/ic_eliminar.png"))); // NOI18N
        btn_delete.setText("Eliminar");
        btn_delete.setBorderPainted(false);
        btn_delete.setContentAreaFilled(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/actualizar.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setContentAreaFilled(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/ic_grabar.png"))); // NOI18N
        btn_save.setText("Guardar");
        btn_save.setBorderPainted(false);
        btn_save.setContentAreaFilled(false);
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_footerLayout = new javax.swing.GroupLayout(pnl_footer);
        pnl_footer.setLayout(pnl_footerLayout);
        pnl_footerLayout.setHorizontalGroup(
            pnl_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_footerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_save)
                .addGap(38, 38, 38)
                .addComponent(btn_actualizar)
                .addGap(33, 33, 33)
                .addComponent(btn_new)
                .addGap(51, 51, 51)
                .addComponent(btn_edit)
                .addGap(65, 65, 65)
                .addComponent(btn_delete)
                .addContainerGap(1634, Short.MAX_VALUE))
        );
        pnl_footerLayout.setVerticalGroup(
            pnl_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_footerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnl_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_edit)
                    .addComponent(btn_new)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_save))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(pnl_footer, java.awt.BorderLayout.PAGE_END);

        pnl_left.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");

        txtName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtName.setBorder(null);

        txt_surname.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_surname.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Teléfono");

        txt_phone.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_phone.setBorder(null);
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Correo");

        txt_email.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_email.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Usuario");

        txt_user.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_user.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña");

        txt_pass.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_pass.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Rol");

        cmb_role.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cmb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));

        javax.swing.GroupLayout pnl_leftLayout = new javax.swing.GroupLayout(pnl_left);
        pnl_left.setLayout(pnl_leftLayout);
        pnl_leftLayout.setHorizontalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_leftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_surname)
                            .addComponent(jSeparator4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_phone)
                            .addComponent(jSeparator5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_email)
                            .addComponent(jSeparator6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_user)
                            .addComponent(jSeparator7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_pass)
                            .addComponent(jSeparator8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_leftLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cmb_role, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_leftLayout.setVerticalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_role)
                .addGap(86, 86, 86))
        );

        jPanel1.add(pnl_left, java.awt.BorderLayout.LINE_START);

        pnl_center.setLayout(new java.awt.BorderLayout());

        pnl_space.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_spaceLayout = new javax.swing.GroupLayout(pnl_space);
        pnl_space.setLayout(pnl_spaceLayout);
        pnl_spaceLayout.setHorizontalGroup(
            pnl_spaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        pnl_spaceLayout.setVerticalGroup(
            pnl_spaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        pnl_center.add(pnl_space, java.awt.BorderLayout.LINE_START);

        tbl_users.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_users);

        pnl_center.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnl_center, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jInternalFrame1.setBorder(new javax.swing.border.MatteBorder(null));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Productos");
        jInternalFrame1.setMaximumSize(new java.awt.Dimension(1500, 1200));
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(1500, 900));

        jPanel3.setLayout(new java.awt.BorderLayout());

        pnl_header1.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Administración de Usuarios");
        jPanel5.add(jLabel10, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Llene la información respectiva para registrar un usuario");
        jPanel10.add(jLabel11, java.awt.BorderLayout.CENTER);
        jPanel10.add(jSeparator9, java.awt.BorderLayout.PAGE_END);

        jPanel7.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        pnl_header1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.add(pnl_header1, java.awt.BorderLayout.PAGE_START);

        pnl_footer1.setBackground(new java.awt.Color(255, 255, 255));

        bt_nuevo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_nuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/ic_nuevo.png"))); // NOI18N
        bt_nuevo1.setText("Nuevo");
        bt_nuevo1.setBorderPainted(false);
        bt_nuevo1.setContentAreaFilled(false);
        bt_nuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevo1ActionPerformed(evt);
            }
        });

        bt_guardar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/ic_grabar.png"))); // NOI18N
        bt_guardar1.setText("Guardar");
        bt_guardar1.setBorderPainted(false);
        bt_guardar1.setContentAreaFilled(false);
        bt_guardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar1ActionPerformed(evt);
            }
        });

        bt_actualizar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_actualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/ic_modificar.png"))); // NOI18N
        bt_actualizar1.setText("Modificar");
        bt_actualizar1.setBorderPainted(false);
        bt_actualizar1.setContentAreaFilled(false);
        bt_actualizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualizar1ActionPerformed(evt);
            }
        });

        bt_eliminar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/ic_eliminar.png"))); // NOI18N
        bt_eliminar1.setText("Eliminar");
        bt_eliminar1.setBorderPainted(false);
        bt_eliminar1.setContentAreaFilled(false);
        bt_eliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_footer1Layout = new javax.swing.GroupLayout(pnl_footer1);
        pnl_footer1.setLayout(pnl_footer1Layout);
        pnl_footer1Layout.setHorizontalGroup(
            pnl_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_footer1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_nuevo1)
                .addGap(81, 81, 81)
                .addComponent(bt_guardar1)
                .addGap(98, 98, 98)
                .addComponent(bt_actualizar1)
                .addGap(75, 75, 75)
                .addComponent(bt_eliminar1)
                .addGap(23, 23, 23))
        );
        pnl_footer1Layout.setVerticalGroup(
            pnl_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_footer1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnl_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_eliminar1)
                    .addComponent(bt_actualizar1)
                    .addComponent(bt_guardar1)
                    .addComponent(bt_nuevo1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.add(pnl_footer1, java.awt.BorderLayout.PAGE_END);

        pnl_left1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nombre");

        txtName1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtName1.setBorder(null);

        txt_surname1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_surname1.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Apellidos");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Teléfono");

        txt_phone1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_phone1.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Correo");

        email1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        email1.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Usuario");

        user1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        user1.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Contraseña");

        pass1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        pass1.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Rol");

        role1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        role1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));

        btn_register1.setText("Registrar Usuario");

        javax.swing.GroupLayout pnl_left1Layout = new javax.swing.GroupLayout(pnl_left1);
        pnl_left1.setLayout(pnl_left1Layout);
        pnl_left1Layout.setHorizontalGroup(
            pnl_left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_left1Layout.createSequentialGroup()
                .addGroup(pnl_left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_left1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jSeparator10)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_surname1)
                            .addComponent(jSeparator11)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_phone1)
                            .addComponent(jSeparator12)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email1)
                            .addComponent(jSeparator13)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user1)
                            .addComponent(jSeparator14)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass1)
                            .addComponent(jSeparator15)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_left1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnl_left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(role1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_register1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_left1Layout.setVerticalGroup(
            pnl_left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_left1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(txtName1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(txt_surname1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator11, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(txt_phone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator12, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator13, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(user1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator14, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(pass1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(role1)
                .addGap(27, 27, 27)
                .addComponent(btn_register1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(pnl_left1, java.awt.BorderLayout.LINE_START);

        pnl_center1.setLayout(new java.awt.BorderLayout());

        pnl_space1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_space1Layout = new javax.swing.GroupLayout(pnl_space1);
        pnl_space1.setLayout(pnl_space1Layout);
        pnl_space1Layout.setHorizontalGroup(
            pnl_space1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnl_space1Layout.setVerticalGroup(
            pnl_space1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnl_center1.add(pnl_space1, java.awt.BorderLayout.LINE_START);

        tbl_users1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbl_users1);

        pnl_center1.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel3.add(pnl_center1, java.awt.BorderLayout.CENTER);

        jInternalFrame1.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jInternalFrame1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed

    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed


    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed

    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void bt_nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_nuevo1ActionPerformed

    private void bt_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_guardar1ActionPerformed

    private void bt_actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_actualizar1ActionPerformed

    private void bt_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_eliminar1ActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = (key >= 48 && key <= 57);
        if (!numeros) {
            evt.consume();
        }
        if (txt_phone.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_phoneKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_actualizar1;
    private javax.swing.JButton bt_eliminar1;
    private javax.swing.JButton bt_guardar1;
    private javax.swing.JButton bt_nuevo1;
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_delete;
    public javax.swing.JButton btn_edit;
    public javax.swing.JButton btn_new;
    private javax.swing.JButton btn_register1;
    public javax.swing.JButton btn_save;
    public javax.swing.JComboBox<String> cmb_role;
    private javax.swing.JTextField email1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField pass1;
    private javax.swing.JPanel pnl_center;
    private javax.swing.JPanel pnl_center1;
    private javax.swing.JPanel pnl_footer;
    private javax.swing.JPanel pnl_footer1;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_header1;
    private javax.swing.JPanel pnl_left;
    private javax.swing.JPanel pnl_left1;
    private javax.swing.JPanel pnl_space;
    private javax.swing.JPanel pnl_space1;
    private javax.swing.JComboBox<String> role1;
    public javax.swing.JTable tbl_users;
    private javax.swing.JTable tbl_users1;
    public javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_pass;
    public javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_phone1;
    public javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_surname1;
    public javax.swing.JTextField txt_user;
    private javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}
