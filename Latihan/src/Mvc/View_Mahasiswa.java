/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc;

//import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

/**
 *
 * @author Fuck_Boy
 */
public class View_Mahasiswa extends javax.swing.JFrame {

    private Controller controller = new Controller ();
    
    public View_Mahasiswa() {
        initComponents();
    }
    
    public void TampilData() {
        
//        Header Table
        String[] kolom = {"Nim", "Nama", "Jenis Kelamin", "Prodi", "Tanggal Lahir" };
        
        Object[][] data = new Object [controller.getArrayListSize()][5];
        
        int i = 0;
        
        while (i < controller.getArrayListSize()){
            
            String arrayData[] = {
                
                controller.getDaftarMhs().get(i).getNim(),
                controller.getDaftarMhs().get(i).getNama(),
                controller.getDaftarMhs().get(i).getJk(),
                controller.getDaftarMhs().get(i).getProdi(),
                controller.getDaftarMhs().get(i).getTgl_lahir()
                
            };
            
//            i++;

            data[i] = arrayData;
            i++;
            
            
        }
        
         Table_mhs = new DefaultTableModel(data, kolom){
             
             
            @Override
            public boolean isCellEditable(int i, int i1) {
                
                return super.isCellEditable(i, i1); //To change body of generated methods, choose Tools | Templates.
                
            }
             
         
  
             
         };
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tf_nim = new javax.swing.JTextField();
        Tf_nama = new javax.swing.JTextField();
        Tf_lahir = new javax.swing.JTextField();
        Rb_laki = new javax.swing.JRadioButton();
        Rb_cewek = new javax.swing.JRadioButton();
        Cb_prodi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_mhs = new javax.swing.JTable();
        label1 = new java.awt.Label();
        Btn_insert = new javax.swing.JButton();
        Btn_update = new javax.swing.JButton();
        Btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Nim");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Prodi");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Tgl Lahir ");

        Tf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_namaActionPerformed(evt);
            }
        });

        Rb_laki.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(Rb_laki);
        Rb_laki.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Rb_laki.setText("Laki-laki");

        Rb_cewek.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(Rb_cewek);
        Rb_cewek.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Rb_cewek.setText("Cewek");

        Cb_prodi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Cb_prodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistem Informasi", "Desain Komunikasi Visual", "Desain Produk", "Teknik Komputer" }));

        Table_mhs.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Table_mhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nim", "Nama", "Jenis Kelamin", "Prodi", "Tgl_lahir"
            }
        ));
        jScrollPane1.setViewportView(Table_mhs);

        label1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label1.setText("Data Mahasiswa");

        Btn_insert.setText("Insert");
        Btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_insertActionPerformed(evt);
            }
        });

        Btn_update.setText("Update");
        Btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_updateActionPerformed(evt);
            }
        });

        Btn_delete.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cb_prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Rb_laki)
                                        .addGap(18, 18, 18)
                                        .addComponent(Rb_cewek)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Tf_nim)
                                            .addComponent(Tf_nama)
                                            .addComponent(Tf_lahir, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Btn_delete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn_update)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_insert)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tf_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Rb_laki)
                        .addComponent(Rb_cewek)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cb_prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Tf_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_insert)
                    .addComponent(Btn_update)
                    .addComponent(Btn_delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_namaActionPerformed

    private void Btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_insertActionPerformed
        // TODO add your handling code here:
        
        String jk ;
        
        if (Rb_laki.isSelected()){
            
//            jk = "Laki-Laki";
               
            jk = Rb_laki.getText().toString();
            
        } else {
            
            
//            jk = "Cewek";
            jk = Rb_cewek.getText().toString();


        }
            
        
        controller.insertData(Tf_nim.getText(), Tf_nama.getText(), jk, 
                Cb_prodi.getSelectedItem().toString(), Tf_lahir.getText() );
        
        TampilData ();
        
        
    }//GEN-LAST:event_Btn_insertActionPerformed

    private void Btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(View_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_delete;
    private javax.swing.JButton Btn_insert;
    private javax.swing.JButton Btn_update;
    private javax.swing.JComboBox<String> Cb_prodi;
    private javax.swing.JRadioButton Rb_cewek;
    private javax.swing.JRadioButton Rb_laki;
    private javax.swing.JTable Table_mhs;
    private javax.swing.JTextField Tf_lahir;
    private javax.swing.JTextField Tf_nama;
    private javax.swing.JTextField Tf_nim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}