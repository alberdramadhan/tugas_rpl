/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrpl;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class transfer extends javax.swing.JFrame {

double hasil;
String answer;
double saldo;
int masukan;
/**
* Creates new form BankATM
*/




    
    public transfer() {
        initComponents();
        setLocationRelativeTo(this);
        transaksi();
        delete();
    }
    public transfer(int saldo) {
    this.saldo =saldo;
    }
     private void transaksi(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("id_barang");
        model.addColumn("nama_barang");
        model.addColumn("total_bayar");
        model.addColumn("nama_toko");
        model.addColumn("jenis_toko");
        model.addColumn("nomor_hp");
        
       
        try {
            int no=1;
            String sql = "select * from bayar_barang";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            tes1.setModel(model);
        } catch (Exception e) {
            
        }
        }
    private void delete(){
        idbarang.setText("");
        namabarang.setText(null);
        totalbayar.setText(null);
        namatoko.setText(null);
        jenistoko.setSelectedItem(null);
        nohp.setText(null);
    }
    
    /**
     * Creates new form transfer
     */
    
            
            
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        idbarang = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ahay = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tes1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        namabarang = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        totalbayar = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        namatoko = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        nohp = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jenistoko = new javax.swing.JComboBox<>();
        tes11 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable1);

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(idbarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id barang");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 122, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUKTI PEMBAYARAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        ahay.setBackground(new java.awt.Color(255, 255, 255));
        ahay.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        ahay.setText("INPUT");
        ahay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahayActionPerformed(evt);
            }
        });
        getContentPane().add(ahay, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton3.setText("KEMBALI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("nama barang");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 20));

        tes1.setModel(new javax.swing.table.DefaultTableModel(
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
        tes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tes1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tes1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 730, 250));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PEMBAYARAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 14)); // NOI18N
        jButton7.setText("TAMPIL");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 14)); // NOI18N
        jButton8.setText("DELETE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        jButton9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton9.setText("BERSIH");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 80, -1));

        jScrollPane7.setViewportView(namabarang);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, -1));

        jScrollPane9.setViewportView(totalbayar);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, -1));

        jScrollPane10.setViewportView(namatoko);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));

        jScrollPane12.setViewportView(nohp);

        getContentPane().add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("total bayar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 20));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("nama toko");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 20));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jenis toko");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 20));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("nomor hp");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 20));

        jenistoko.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "OFFLINE", "ONLINE", " " }));
        getContentPane().add(jenistoko, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        tes11.setText("0");
        tes11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes11ActionPerformed(evt);
            }
        });
        getContentPane().add(tes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 110, 30));

        jButton4.setText("ISI SALDO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Downloads\\a23.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ahayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahayActionPerformed
    masukan = Integer.parseInt(JOptionPane.showInputDialog("MASUKAN SESUAI TOTAL BAYAR!!"));
    if (saldo <= masukan) {
    JOptionPane.showMessageDialog(rootPane,"Maaf Saldo anda kurang !!!!!");
    JOptionPane.showConfirmDialog(null, " Apakah ingin lanjut");
    JOptionPane.showMessageDialog(rootPane,"Tambahkan Saldo pada akun anda");
    System.exit(0);
    } else if (saldo >= masukan) {
    }
    hasil = saldo - masukan;
    saldo=hasil;
    answer = String.format(" %,.2f ", hasil);
    tes11.setText(answer);
    JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ saldo);
        try {
            String sql = "INSERT INTO bayar_barang VALUES ('"+idbarang.getText()+"','"+namabarang.getText()+"','"+totalbayar.getText()+"','"+namatoko.getText()+"','"+jenistoko.getSelectedItem()+"','"+nohp.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "BERHASIL BAYAR");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "ISI DATA DENGAN BENAR" ,"pesan",JOptionPane.WARNING_MESSAGE);
            transaksi();
            delete();
        }
       
    }//GEN-LAST:event_ahayActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     this.setVisible(false);
    new pembayaran ().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    try {
            String sql ="SELECT * from bayar_barang where id_barang='"+idbarang.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        transaksi();
        delete();        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       try {
            String sql ="delete from bayar_barang where id_barang='"+idbarang.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        transaksi();
        delete();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tes1MouseClicked
         int baris = tes1.rowAtPoint(evt.getPoint());
        String id_barang =tes1.getValueAt(baris, 1).toString();
        idbarang.setText(id_barang);
        String nama_barang = tes1.getValueAt(baris,2).toString();
        namabarang.setText(nama_barang);
        String total_bayar = tes1.getValueAt(baris,3).toString();
        totalbayar.setText(total_bayar);
        String nama_toko = tes1.getValueAt(baris, 4).toString();
        namatoko.setText(nama_toko);
        String jenis_toko = tes1.getValueAt(baris, 5).toString();
        jenistoko.setSelectedItem(jenis_toko);
        String nomor_hape = tes1.getValueAt(baris, 6).toString();
        nohp.setText(nomor_hape);
        
    }//GEN-LAST:event_tes1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void tes11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tes11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        masukan = Integer.parseInt(JOptionPane.showInputDialog("TOP UP SALDO : "));
    JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ (saldo + masukan));
    hasil = saldo + masukan;
    saldo=hasil;
    answer = String.format(" %,.2f ",saldo);
    tes11.setText(answer);


    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ahay;
    private javax.swing.JTextPane idbarang;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jenistoko;
    private javax.swing.JTextPane namabarang;
    private javax.swing.JTextPane namatoko;
    private javax.swing.JTextPane nohp;
    private javax.swing.JTable tes1;
    private javax.swing.JTextField tes11;
    private javax.swing.JTextPane totalbayar;
    // End of variables declaration//GEN-END:variables
}
