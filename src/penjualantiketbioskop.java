/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class penjualantiketbioskop extends javax.swing.JFrame {
    int reguler, ultra, gold, harga, beli, total, bayar, kembali;
    private Integer a;
    private Integer b;
    private int c;

    /**
     * Creates new form penjualantiketbioskop
     */
    public penjualantiketbioskop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kursi = new javax.swing.JComboBox<>();
        rb_reguler = new javax.swing.JRadioButton();
        rb_ultraxd = new javax.swing.JRadioButton();
        rb_gold = new javax.swing.JRadioButton();
        txt_harga = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_pembayaran = new javax.swing.JTextField();
        txt_totalbayar = new javax.swing.JTextField();
        txt_jumlahbeli = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        btn_input = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Penjualan Tiket Bioskop");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 240, 20));

        jLabel2.setText("Kursi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setText("Jenis Tiket");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Harga Satuan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        kursi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "A", "B", "C", "D" }));
        kursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiActionPerformed(evt);
            }
        });
        jPanel1.add(kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 60, -1));

        rb_reguler.setText("Reguler");
        rb_reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_regulerActionPerformed(evt);
            }
        });
        jPanel1.add(rb_reguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        rb_ultraxd.setText("Ultra XD");
        rb_ultraxd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ultraxdActionPerformed(evt);
            }
        });
        jPanel1.add(rb_ultraxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        rb_gold.setText("Gold");
        rb_gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_goldActionPerformed(evt);
            }
        });
        jPanel1.add(rb_gold, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));
        jPanel1.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 90, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pembelian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setText("Nama Pembeli");

        jLabel6.setText("Jumlah Beli");

        jLabel7.setText("Total Bayar");

        jLabel8.setText("Pembayaran");

        jLabel9.setText("Kembalian");

        txt_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pembayaranActionPerformed(evt);
            }
        });
        txt_pembayaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pembayaranKeyReleased(evt);
            }
        });

        txt_jumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahbeliActionPerformed(evt);
            }
        });
        txt_jumlahbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahbeliKeyReleased(evt);
            }
        });

        txt_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembalianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(txt_nama))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(50, 50, 50)
                        .addComponent(txt_jumlahbeli, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(53, 53, 53)
                        .addComponent(txt_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addComponent(txt_pembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(50, 50, 50)
                        .addComponent(txt_totalbayar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_jumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 250, 170));

        btn_input.setText("Input Data");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel1.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        btn_print.setText("Print Data");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 280, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_regulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_regulerActionPerformed
        // TODO add your handling code here:
        // Menampilkan harga setelah memilih jenis tiket
        // Reguler
        if(rb_reguler.isSelected())
        {
        txt_harga.setText(String.valueOf(reguler));
        }
        
    }//GEN-LAST:event_rb_regulerActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        txt_harga.setText("");
        kursi.setSelectedItem("Pilih Jenis Tiket");
        txt_nama.setText("");
        txt_totalbayar.setText("");
        txt_jumlahbeli.setText("");
        txt_pembayaran.setText("");
        txt_kembalian.setText("");
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
        btn_print.setText((String)kursi.getSelectedItem());
        txt_area.setText(
                "Nama Pembeli            :"+txt_nama.getText()+"\n"+
                "Jumlah Pembelian        :"+txt_jumlahbeli.getText()+"\n"+
                "Total Pembayaran        :"+txt_totalbayar.getText()+"\n"+
                "Pembayaran              :"+txt_pembayaran.getText()+"\n"+
                "Kembalian               :"+txt_kembalian.getText()+"\n");
                 
        
        
    }//GEN-LAST:event_btn_printActionPerformed

    private void kursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiActionPerformed
        // TODO add your handling code here:
        // Menentukan harga untuk setiap kursi
        if(kursi.getSelectedItem().equals("Pilih Kursi"))
        {
        buttonGroup1.clearSelection();
        txt_harga.setText("");
        }
        else if(kursi.getSelectedItem().equals("A"))
        {
        reguler = 50000;
        ultra = 70000;
        gold = 90000;
        }
        else if(kursi.getSelectedItem().equals("B"))
        {
        reguler = 45000;
        ultra = 65000;
        gold = 85000;
        }
        else if(kursi.getSelectedItem().equals("C"))
        {
        reguler = 40000;
        ultra = 60000;
        gold = 80000;
        }
        
    }//GEN-LAST:event_kursiActionPerformed

    private void rb_ultraxdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ultraxdActionPerformed
        // TODO add your handling code here;
        // menampilkan harga setelah memilih jenis tiket 
        // ultra xd
        if(rb_ultraxd.isSelected())
        {
        txt_harga.setText(String.valueOf("ultra"));
        }
    }//GEN-LAST:event_rb_ultraxdActionPerformed

    private void rb_goldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_goldActionPerformed
        // TODO add your handling code here:
        // menampilkan harga setelah memilih jenis tiket
        // gold
        if(rb_gold.isSelected())
        {
        txt_harga.setText(String.valueOf(gold));
        }
    }//GEN-LAST:event_rb_goldActionPerformed

    private void txt_jumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahbeliActionPerformed
        // TODO add your handling code here:
        // menginputkan jumlah tiket dan total pembayaran
        beli = Integer.parseInt(txt_jumlahbeli.getText());
        harga = Integer.parseInt(txt_harga.getText());
        total = bayar * harga;
        txt_totalbayar.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_jumlahbeliActionPerformed

    private void txt_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pembayaranActionPerformed
        // TODO add your handling code here:
        // menginputkan jumlah tiket dan total pembayaran
        bayar = Integer.parseInt(txt_pembayaran.getText());
        kembali = Integer.parseInt(txt_totalbayar.getText());
        total = bayar - kembali;
        txt_kembalian.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_pembayaranActionPerformed

    private void txt_jumlahbeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahbeliKeyReleased
        // TODO add your handling code here:
        a = Integer.valueOf(txt_harga.getText());
        b = Integer.valueOf(txt_jumlahbeli.getText());
        c = a * b;
        txt_totalbayar.setText(""+c);
        
    }//GEN-LAST:event_txt_jumlahbeliKeyReleased

    private void txt_pembayaranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pembayaranKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        
        a = Integer.valueOf(txt_pembayaran.getText());
        b = Integer.valueOf(txt_totalbayar.getText());
        c = a-b;
        txt_kembalian.setText(""+c);
    }//GEN-LAST:event_txt_pembayaranKeyReleased

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void txt_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kembalianActionPerformed

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
            java.util.logging.Logger.getLogger(penjualantiketbioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penjualantiketbioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penjualantiketbioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penjualantiketbioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penjualantiketbioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_print;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kursi;
    private javax.swing.JRadioButton rb_gold;
    private javax.swing.JRadioButton rb_reguler;
    private javax.swing.JRadioButton rb_ultraxd;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlahbeli;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_pembayaran;
    private javax.swing.JTextField txt_totalbayar;
    // End of variables declaration//GEN-END:variables
}
