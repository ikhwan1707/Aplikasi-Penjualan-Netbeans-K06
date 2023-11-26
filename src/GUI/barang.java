/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Controllers.BarangController;
import Controllers.JenisBarangController;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class barang extends javax.swing.JPanel {

    private BarangController b = new BarangController();
    private JenisBarangController jb = new JenisBarangController();
    private DefaultTableModel view = new DefaultTableModel();
    
    /**
     * Creates new form dashboard
     */
    public barang() {
        initComponents();
        loadData(b.index());
        loadDataCombo();
        kosong();
        SetEnabledFalse();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
    }
    
     private void loadData(List<String[]> dataJenis) {
        view.getDataVector().removeAllElements();
        view.fireTableDataChanged();

        if (tbBarang.getColumnCount() == 0) {
            tbBarang.setModel(view);
            view.addColumn("Kode Barang");
            view.addColumn("Nama Barang");
            view.addColumn("Kode Jenis");
            view.addColumn("Nama Jenis");
            view.addColumn("Harga Net");
            view.addColumn("Harga Jual");
            view.addColumn("Stok");
        }

        for (String[] item : dataJenis) {
            view.addRow(new Object[]{
                item[0],
                item[1],
                item[2],
                item[3],
                item[4],
                item[5],
                item[6],
            });
        }
    }
     
    private void loadDataCombo() {
        for (String[] item : jb.index()) {
            comboKdJenis.addItem(item[0]);
        }
    }
        private void kosong (){
        kdBarang.setText(null);
        namaBarang.setText(null);
        jenisBarang.setText(null);
        hargaNet.setText(null);
        hargaJual.setText(null);
        stok.setText(null);
    }
     
     public void SetEnabledFalse(){
        kdBarang.setEnabled(false);
        namaBarang.setEnabled(false);
        comboKdJenis.setEnabled(false);
        jenisBarang.setEnabled(false);
        hargaNet.setEnabled(false);
        hargaJual.setEnabled(false);
        stok.setEnabled(false);
    }
     
    public void SetEnabledTrue(){
        kdBarang.setEnabled(true);
        namaBarang.setEnabled(true);
        comboKdJenis.setEnabled(true);
        jenisBarang.setEnabled(true);
        hargaNet.setEnabled(true);
        hargaJual.setEnabled(true);
        stok.setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kdBarang = new javax.swing.JTextField();
        namaBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jenisBarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hargaNet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        btnAddNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tbData = new javax.swing.JScrollPane();
        tbBarang = new javax.swing.JTable();
        hargaJual = new javax.swing.JTextField();
        comboKdJenis = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(692, 0));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(692, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Barang");

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Kode Jenis Barang");

        jLabel5.setText("Nama Jenis Barang");

        jenisBarang.setEditable(false);
        jenisBarang.setEnabled(false);

        jLabel6.setText("Harga Net");

        jLabel7.setText("Harga Jual");

        jLabel8.setText("Stok");

        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });

        tbBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBarangMouseClicked(evt);
            }
        });
        tbData.setViewportView(tbBarang);

        comboKdJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kode Jenis" }));
        comboKdJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKdJenisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(namaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(kdBarang)
                                            .addComponent(jenisBarang)
                                            .addComponent(comboKdJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(63, 63, 63)
                                                .addComponent(stok))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(32, 32, 32)
                                                .addComponent(hargaNet, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(btnAddNew)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnSave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancel)))))
                        .addGap(0, 191, Short.MAX_VALUE))
                    .addComponent(tbData, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(hargaNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboKdJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNew)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(tbData, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        b.store(namaBarang.getText(), comboKdJenis.getSelectedItem().toString(), hargaNet.getText(), hargaJual.getText(), stok.getText());
        loadData(b.index());
        
        SetEnabledFalse();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        btnAddNew.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if ("".equals(kdBarang.getText()) || "".equals(namaBarang.getText()) || "".equals(comboKdJenis.getSelectedItem().toString()) || "".equals(hargaNet.getText()) || "".equals(hargaJual.getText()) || "".equals(stok.getText()) ) {

        } else {
            b.update(kdBarang.getText(), namaBarang.getText(), comboKdJenis.getSelectedItem().toString(),hargaNet.getText(), hargaJual.getText(), stok.getText());
        }

        kdBarang.setText("");
        namaBarang.setText("");
        comboKdJenis.setSelectedItem("");
        hargaNet.setText("");
        hargaJual.setText("");
        stok.setText("");
        
        loadData(b.index());
        
        SetEnabledFalse();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        btnAddNew.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDataMouseClicked

    private void tbBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBarangMouseClicked
        // TODO add your handling code here:
        int baris = tbBarang.getSelectedRow();
        
        if (baris == -1) {
            return;
        }
        
        String id = tbBarang.getValueAt(baris, 0).toString();
        String nb = tbBarang.getValueAt(baris, 1).toString();
        String kd = tbBarang.getValueAt(baris, 2).toString();
        String nj = tbBarang.getValueAt(baris, 3).toString();
        String hn = tbBarang.getValueAt(baris, 4).toString();
        String hj = tbBarang.getValueAt(baris, 5).toString();
        String s = tbBarang.getValueAt(baris, 6).toString();
        kdBarang.setText(id);
        namaBarang.setText(nb);
        
        comboKdJenis.setSelectedItem(kd);
        jenisBarang.setText(nj);
        hargaNet.setText(hn);
        hargaJual.setText(hj);
        stok.setText(s);
        
        SetEnabledTrue();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        btnCancel.setEnabled(true);
        btnAddNew.setEnabled(false);
    }//GEN-LAST:event_tbBarangMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        b.delete(kdBarang.getText());
        loadData(b.index());
        
        SetEnabledFalse();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        btnAddNew.setEnabled(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        // TODO add your handling code here:
        SetEnabledTrue();
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(true);
        btnAddNew.setEnabled(false);
        jenisBarang.setEnabled(false);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        kosong();
        SetEnabledFalse();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
        btnAddNew.setEnabled(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void comboKdJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKdJenisActionPerformed
        // TODO add your handling code here:
        if (comboKdJenis.getSelectedIndex() == 0) {
            jenisBarang.setText("");
        } else {
            String[] item = jb.show(comboKdJenis.getSelectedItem().toString());
             jenisBarang.setText(item[1]);
        }
    }//GEN-LAST:event_comboKdJenisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboKdJenis;
    private javax.swing.JTextField hargaJual;
    private javax.swing.JTextField hargaNet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jenisBarang;
    private javax.swing.JTextField kdBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField stok;
    private javax.swing.JTable tbBarang;
    private javax.swing.JScrollPane tbData;
    // End of variables declaration//GEN-END:variables
}
