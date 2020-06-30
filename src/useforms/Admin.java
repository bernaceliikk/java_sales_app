/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useforms;

import javax.swing.JOptionPane;
import models.CategoryModel;
import models.PersonModel;
import models.ProductModel;
import props.Category;
import useutils.Util;

/**
 *
 * @author hakan
 */
public class Admin extends javax.swing.JFrame {

    CategoryModel cmd = new CategoryModel();
    PersonModel pmd = new PersonModel();
    ProductModel prmd = new ProductModel();
    

    // ids
    int cid = -1;
    int pid = -1;
    int prid = -1; 

    public Admin() {
        initComponents();
        lblTitle.setText(Util.us.getUname());
        categoryResultRefresh();
        personResultRefresh();
        productResultRefresh();
        
        int selectIndex = cmbCategory.getSelectedIndex();
        getCid = cmd.cls.get(selectIndex).getCid();
    }

    private void categoryResultRefresh() {
        cmd.categoryAllResult();
        tblCategory.setModel(cmd.categoryTable());
        cmbCategory.setModel(cmd.categoryCombobox());
    }

    private void personResultRefresh() {
        pmd.personAllResult();
        tblPerson.setModel(pmd.personTable());
    }
    
    private void productResultRefresh() {
        prmd.productAllResult("", 1);
        tblProduct.setModel(prmd.productTable());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtCategoryTitle = new useutils.PlcHolderTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtpaddress = new javax.swing.JTextArea();
        txtpsurname = new useutils.PlcHolderTextField();
        txtpname = new useutils.PlcHolderTextField();
        txtpmail = new useutils.PlcHolderTextField();
        txtpphone = new useutils.PlcHolderTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        txtprprice = new useutils.PlcHolderTextField();
        txtprshelf = new useutils.PlcHolderTextField();
        txtprtitle = new useutils.PlcHolderTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtprnote = new javax.swing.JTextArea();
        cmbCategory = new javax.swing.JComboBox<>();
        txtprstock = new useutils.PlcHolderTextField();
        txtprbarcode = new useutils.PlcHolderTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        curTypeCom = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(724, 633));
        setMinimumSize(new java.awt.Dimension(724, 633));
        setResizable(false);

        lblTitle.setText("Admin");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Yönetimi"));

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCategoryMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategory);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCategoryTitle.setToolTipText("");
        txtCategoryTitle.setPlaceholder("Kategori Adı");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCategoryTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtCategoryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Personel Yönetimi"));

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPersonMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblPerson);

        txtpaddress.setColumns(20);
        txtpaddress.setRows(5);
        jScrollPane4.setViewportView(txtpaddress);

        txtpsurname.setToolTipText("");
        txtpsurname.setPlaceholder("Soyadı");

        txtpname.setToolTipText("");
        txtpname.setPlaceholder("Adı");

        txtpmail.setToolTipText("");
        txtpmail.setPlaceholder("Mail");

        txtpphone.setToolTipText("");
        txtpphone.setPlaceholder("Telefon");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpmail, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(12, 12, 12)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(29, 29, 29))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Yönetimi"));

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProductMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblProduct);

        txtprprice.setToolTipText("Fiyat");
        txtprprice.setPlaceholder("Fiyat");

        txtprshelf.setToolTipText("Raf");
        txtprshelf.setPlaceholder("Raf");

        txtprtitle.setToolTipText("Ürün Başlığı");
        txtprtitle.setPlaceholder("Ürün Başlığı");

        txtprnote.setColumns(20);
        txtprnote.setRows(5);
        jScrollPane5.setViewportView(txtprnote);

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoryİtemStateChanged(evt);
            }
        });

        txtprstock.setToolTipText("Stok");
        txtprstock.setPlaceholder("Stok");

        txtprbarcode.setToolTipText("Fiyat");
        txtprbarcode.setPlaceholder("Barkod");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        curTypeCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Türk Lirası", "Dolar", "Euro" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtprtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprprice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(curTypeCom, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtprbarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprshelf, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprstock, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprshelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprbarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curTypeCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTitle)
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String catTitle = txtCategoryTitle.getText().trim();
        int statu = cmd.categoryInsert(catTitle);
        if (statu > 0) {
            categoryResultRefresh();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (pid > -1) {
            
            String uusername = JOptionPane.showInputDialog(rootPane, "Lütfen kullanıcı adı giriniz");
            String upassword = JOptionPane.showInputDialog(rootPane, "Lütfen şifre giriniz");
            
            if (uusername != null && upassword != null) {
                
                String nameSurname = txtpname.getText().trim() + " " + txtpsurname.getText().trim();
                int statu = pmd.personPassworInsert(nameSurname, uusername, upassword);
                if (statu > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Şifre ataması başarılı!");
                    pid = -1;
                }
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (cid > -1) {
            String ctitle = txtCategoryTitle.getText().trim();
            int statu = cmd.categoryUpdate(cid, ctitle);
            if (statu > 0) {
                categoryResultRefresh();
                cid = -1;
                txtCategoryTitle.setText("");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (cid > -1) {
            int deleteStatu = JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinizden emin misiniz?", null, JOptionPane.YES_NO_OPTION);
            if (deleteStatu == 0) {
                int statu = cmd.categoryDelete(cid);
                if (statu > 0) {
                    categoryResultRefresh();
                    cid = -1;
                    txtCategoryTitle.setText("");
                }
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String n = txtpname.getText().trim();
        String s = txtpsurname.getText().trim();
        String m = txtpmail.getText().trim();
        String t = txtpphone.getText().trim();
        String a = txtpaddress.getText().trim();

        int statu = pmd.personInsert(n, s, m, t, a);
        if (statu > 0) {
            personResultRefresh();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (pid > -1) {
            int deleteStatu = JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinizden emin misiniz?", null, JOptionPane.YES_NO_OPTION);
            if (deleteStatu == 0) {
                int statu = pmd.personDelete(pid);
                if (statu > 0) {
                    personResultRefresh();
                    pid = -1;
                    txtpname.setText("");
                    txtpsurname.setText("");
                    txtpmail.setText("");
                    txtpphone.setText("");
                    txtpaddress.setText("");
                }
            }
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        String n = txtpname.getText().trim();
        String s = txtpsurname.getText().trim();
        String m = txtpmail.getText().trim();
        String t = txtpphone.getText().trim();
        String a = txtpaddress.getText().trim();

        int updateStatu = pmd.personUpdate(pid, n, s, m, t, a);
        if (updateStatu > 0) {
            personResultRefresh();
            pid = -1;
            txtpname.setText("");
            txtpsurname.setText("");
            txtpmail.setText("");
            txtpphone.setText("");
            txtpaddress.setText("");
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        
        String prtitle = txtprtitle.getText().trim();
        String prprice = txtprprice.getText().trim();
        String prbarcode = txtprbarcode.getText().trim();
        String prshelf = txtprshelf.getText().trim();
        String prstock = txtprstock.getText().trim();
        String prnote = txtprnote.getText().trim();
        
        
        int statu = prmd.productInsert(getCid, prtitle, Double.parseDouble(prprice), prbarcode, prshelf, Integer.parseInt(prstock), prnote, curTypeCom.getSelectedIndex() );
        if ( statu > 0 ) {
            productResultRefresh();
            txtprtitle.setText("");
            txtprprice.setText("");
            txtprbarcode.setText("");
            txtprshelf.setText("");
            txtprstock.setText("");
            txtprnote.setText("");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        //public int productUpdate(int prid, int prcid, String prtitle, double prprice, String prbarcode, String prshelf, int prstock, String prnote) {
        String prtitle = txtprtitle.getText().trim();
        String prprice = txtprprice.getText().trim();
        String prbarcode = txtprbarcode.getText().trim();
        String prshelf = txtprshelf.getText().trim();
        String prstock = txtprstock.getText().trim();
        String prnote = txtprnote.getText().trim();
        
        int statu = prmd.productUpdate(prid, getCid, prtitle, Double.parseDouble(prprice), prbarcode, prshelf, Integer.parseInt(prstock), prnote);
        if (statu > 0) {
            prid = -1;
            productResultRefresh();
            txtprtitle.setText("");
            txtprprice.setText("");
            txtprbarcode.setText("");
            txtprshelf.setText("");
            txtprstock.setText("");
            txtprnote.setText("");
        } 
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        if (prid > -1) {
            int deleteStatu = JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinizden emin misiniz?", null, JOptionPane.YES_NO_OPTION);
            if (deleteStatu == 0) {
                int statu = prmd.productDelete(prid);
                if (statu > 0) {
                    prid = -1;
                    productResultRefresh();
                    txtprtitle.setText("");
                    txtprprice.setText("");
                    txtprbarcode.setText("");
                    txtprshelf.setText("");
                    txtprstock.setText("");
                    txtprnote.setText("");
                }
            }
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tblCategoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMousePressed
        int row = tblCategory.getSelectedRow();
        cid = (int) tblCategory.getValueAt(row, 0);
        String ctitle = String.valueOf(tblCategory.getValueAt(row, 1));
        txtCategoryTitle.setText(ctitle);
    }//GEN-LAST:event_tblCategoryMousePressed

    private void tblPersonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonMousePressed

        int row = tblPerson.getSelectedRow();
        pid = (int) tblPerson.getValueAt(row, 0);

        String n = String.valueOf(tblPerson.getValueAt(row, 1));
        String s = String.valueOf(tblPerson.getValueAt(row, 2));
        String m = String.valueOf(tblPerson.getValueAt(row, 3));
        String t = String.valueOf(tblPerson.getValueAt(row, 4));
        String a = String.valueOf(tblPerson.getValueAt(row, 5));

        txtpname.setText(n);
        txtpsurname.setText(s);
        txtpaddress.setText(a);
        txtpmail.setText(m);
        txtpphone.setText(t);


    }//GEN-LAST:event_tblPersonMousePressed

    int getCid = -1;
    private void cmbCategoryİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoryİtemStateChanged
        int selectIndex = cmbCategory.getSelectedIndex();
        getCid = cmd.cls.get(selectIndex).getCid();
    }//GEN-LAST:event_cmbCategoryİtemStateChanged

    private void tblProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMousePressed
        
        int row = tblProduct.getSelectedRow();
        prid = (int) tblProduct.getValueAt(row, 0);
        int selectGetCid = (int) tblProduct.getValueAt(row, 1);
        
        String t = String.valueOf(tblProduct.getValueAt(row, 2));
        String p = String.valueOf(tblProduct.getValueAt(row, 3));
        String b = String.valueOf(tblProduct.getValueAt(row, 4));
        String r = String.valueOf(tblProduct.getValueAt(row, 5));
        String s = String.valueOf(tblProduct.getValueAt(row, 6));
        String n = String.valueOf(tblProduct.getValueAt(row, 7));

        
        txtprtitle.setText(t);
        txtprprice.setText(p);
        txtprbarcode.setText(b);
        txtprshelf.setText(r);
        txtprstock.setText(s);
        txtprnote.setText(n);
        
        int i = 0;
        for( Category c : cmd.cls ) {
            if (c.getCid() == selectGetCid ) {
               cmbCategory.setSelectedIndex(i);
               break;
            }
            i++;
        } 
        
       
    }//GEN-LAST:event_tblProductMousePressed

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> curTypeCom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTable tblProduct;
    private useutils.PlcHolderTextField txtCategoryTitle;
    private javax.swing.JTextArea txtpaddress;
    private useutils.PlcHolderTextField txtpmail;
    private useutils.PlcHolderTextField txtpname;
    private useutils.PlcHolderTextField txtpphone;
    private useutils.PlcHolderTextField txtprbarcode;
    private javax.swing.JTextArea txtprnote;
    private useutils.PlcHolderTextField txtprprice;
    private useutils.PlcHolderTextField txtprshelf;
    private useutils.PlcHolderTextField txtprstock;
    private useutils.PlcHolderTextField txtprtitle;
    private useutils.PlcHolderTextField txtpsurname;
    // End of variables declaration//GEN-END:variables
}
