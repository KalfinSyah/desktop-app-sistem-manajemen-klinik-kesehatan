package com.kelompok8.sistemmanajemenklinikkesehatan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kalfi
 */
public class AturKetersediaanObatDanPelayananPemberianObatMenu extends javax.swing.JFrame {
    private Connection connection;

    public AturKetersediaanObatDanPelayananPemberianObatMenu(Connection connection) {
        initComponents();
        this.connection = connection;
        setTitle("ATUR KETERSEDIAAN OBAT DAN PELAYANAN PEMBERIAN OBAT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        populateTableObat();
        populateTablePasien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jFrame2 = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();

        jLabel1.setText("NAMA OBAT");

        jLabel4.setText("STOK");

        jButton6.setText("TAMBAH OBAT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel9.setText("HARGA");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jSpinner3))))
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("NAMA OBAT");

        jLabel6.setText("STOK");

        jButton7.setText("UPDATE OBAT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setText("HARGA");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jSpinner4))))
                .addContainerGap())
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("KEMBALI KE MAIN MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TAMBAH OBAT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("UPDATE OBAT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("BERIKAN OBAT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAMA OBAT", "STOK", "HARGA/STOK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAMA PASIEN", "KELUHAN", "BPJS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel10.setText("TABEL PASIEN YANG SUDAH BERTEMU DOKTER TETAPI BELUM DIBERI OBAT");

        jLabel11.setText("TABEL OBAT");

        jLabel14.setText("JUMLAH UANG PENERIMA OBAT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(461, 461, 461)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new MainMenu(this.connection);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFrame1.setVisible(true);
        jFrame1.setLocationRelativeTo(this);
        jFrame1.setResizable(false);
        jFrame1.pack();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Klik pada obat yang ingin dipilih!", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int idObat = (Integer) model.getValueAt(selectedRow, 0);
            String query = "SELECT * FROM obat WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idObat);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                jTextField6.setText(resultSet.getString("namaobat"));
                jSpinner4.setValue(resultSet.getInt("stok"));
                jSpinner2.setValue(resultSet.getInt("harga"));
            }

            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        jFrame2.setVisible(true);
        jFrame2.setLocationRelativeTo(this);
        jFrame2.setResizable(false);
        jFrame2.pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            DefaultTableModel modelT1 = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel modelT2 = (DefaultTableModel) jTable2.getModel();
            int selectedObatRow = jTable1.getSelectedRow();
            int selectedPasienRow = jTable2.getSelectedRow();
            if (selectedObatRow == -1) {
                JOptionPane.showMessageDialog(this, "Klik pada obat yang ingin dipilih!", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (selectedPasienRow == -1) {
                JOptionPane.showMessageDialog(this, "Klik pada pasien yang ingin dipilih!", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;                
            }
            int idObat = (Integer) modelT1.getValueAt(selectedObatRow, 0);
            String namaObat = (String) modelT1.getValueAt(selectedObatRow, 1);
            int stok = (Integer) modelT1.getValueAt(selectedObatRow, 2);
            int hargaObat = (Integer) modelT1.getValueAt(selectedObatRow, 3);
            int uangPasien = (Integer) jSpinner5.getValue();
            int idPasien = (Integer) modelT2.getValueAt(selectedPasienRow, 0);
            String namaPasien = (String) modelT2.getValueAt(selectedPasienRow, 1);            
            String keluhan = (String) modelT2.getValueAt(selectedPasienRow, 2);            
            String bpjs = (String) modelT2.getValueAt(selectedPasienRow, 3);

            
            if (stok <= 0){
                JOptionPane.showMessageDialog(this, "Stok obat kosong!", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (bpjs.equals("TIDAK")) {
                if (uangPasien < hargaObat) { 
                    JOptionPane.showMessageDialog(this, "Uang pasien kurang : Rp."+(hargaObat-uangPasien), "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                hargaObat = 0;
            }

            // Update obat
            String updateObatSQL = "UPDATE obat SET stok = (stok - 1) WHERE id = ?";
            PreparedStatement updateObatStatement = connection.prepareStatement(updateObatSQL);
            updateObatStatement.setInt(1, idObat);
            int obatRowsUpdated = updateObatStatement.executeUpdate();
            if (obatRowsUpdated > 0) {
                // catat di history
                String historySQL = "INSERT INTO history (idpasien, namapasien, keluhan, idobat, namaobat, waktupemberian, hargaobat, uangpasien, kembalian, bpjs) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement insertToHistoryStatement = connection.prepareStatement(historySQL);
                insertToHistoryStatement.setInt(1, idPasien);
                insertToHistoryStatement.setString(2, namaPasien);
                insertToHistoryStatement.setString(3, keluhan);
                insertToHistoryStatement.setInt(4, idObat);
                insertToHistoryStatement.setString(5, namaObat);
                insertToHistoryStatement.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
                insertToHistoryStatement.setFloat(7, hargaObat);
                insertToHistoryStatement.setFloat(8, uangPasien);
                insertToHistoryStatement.setFloat(9, uangPasien - hargaObat);
                insertToHistoryStatement.setString(10, bpjs);

                int historyUpdated = insertToHistoryStatement.executeUpdate();
                if (historyUpdated > 0) {
                    String updateStatusSQL = "UPDATE datapasien SET status_pemberian_obat = 'sudah' WHERE id = ?";
                    PreparedStatement updateStatusStatement = connection.prepareStatement(updateStatusSQL);
                    updateStatusStatement.setInt(1, idPasien);
                    int statusRowsUpdated = updateStatusStatement.executeUpdate();
                    if (statusRowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Pelayanan pemberian obat berhasil!"
                                                            + "\nTercatat di history pelayanan."
                                                            + "\nUang Pasien           : Rp." + uangPasien
                                                            + "\nHarga Obat            : Rp." + hargaObat
                                                            + "\nKembalian uang pasien : Rp." + (uangPasien - hargaObat) , "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Terjadi error saat mengupdate status pemberian obat!" , "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    updateStatusStatement.close();
                } else {
                    JOptionPane.showMessageDialog(this, "Terjadi error saat menulis history!" , "ERROR", JOptionPane.ERROR_MESSAGE);                    
                }
                insertToHistoryStatement.close();
            } else {
                JOptionPane.showMessageDialog(this, "Terjadi error saat mengurangi stock obat!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            updateObatStatement.close();
            populateTableObat();
            populateTablePasien();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi error\n\n" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String namaObat = jTextField1.getText();
            int stok = (Integer) jSpinner3.getValue();
            int harga = (Integer) jSpinner1.getValue();

            String sql = "INSERT INTO obat (namaobat, stok, harga) VALUES (?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, namaObat);
            statement.setInt(2, stok);
            statement.setInt(3, harga);

            
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Obat " + namaObat + " berhasil ditambahkan!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan obat!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi error!\n\n" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        populateTableObat();
        jFrame1.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Klik pada obat yang ingin dipilih!", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int idObat = (Integer) model.getValueAt(selectedRow, 0);
            String namaObat = jTextField6.getText();
            int stok = (Integer)jSpinner4.getValue();
            int harga = (Integer)jSpinner2.getValue();
            String sql = "UPDATE obat SET namaobat = ?, stok = ?, harga = ? WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, namaObat);
            statement.setInt(2, stok);
            statement.setInt(3, harga);
            statement.setInt(4, idObat);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data obat berhasil di update!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(this, "Gagal update data obat!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi error!\n\n" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        populateTableObat();
        jFrame2.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
       
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void populateTableObat() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM obat ORDER BY id");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getInt("id"),
                    resultSet.getString("namaobat"),
                    resultSet.getInt("stok"),
                    resultSet.getInt("harga")
                };
                model.addRow(row);
            }
            
            resultSet.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void populateTablePasien() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, namapasien, keluhan, bpjs FROM datapasien WHERE status_pemberian_obat = 'belum' AND status_pertemuan_dengan_dokter='sudah' ORDER BY id");

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getInt("id"),
                    resultSet.getString("namapasien"),
                    resultSet.getString("keluhan"),
                    resultSet.getString("bpjs")
                };
                model.addRow(row);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
