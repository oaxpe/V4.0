/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oihane Axpe
 * @version 4.0
 */
public class BezeroaInfo extends javax.swing.JFrame {
    
    /**
     * Creates new form BezeroaInformazioa
     */
    public BezeroaInfo() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroupEmGiz = new javax.swing.ButtonGroup();
        jDialogEzabatuKonfirm = new javax.swing.JDialog();
        jPanelBezTaula = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableBezeroaInfo = new javax.swing.JTable();
        jPanelBezDatuak = new javax.swing.JPanel();
        jLabelIzena = new javax.swing.JLabel();
        jLabelAbizena2 = new javax.swing.JLabel();
        jLabelNan = new javax.swing.JLabel();
        jLabelJaioData = new javax.swing.JLabel();
        jLabelSexua = new javax.swing.JLabel();
        jLabelAbizena1 = new javax.swing.JLabel();
        jLabelHerria = new javax.swing.JLabel();
        jLabelTlf = new javax.swing.JLabel();
        jLabelKodBez = new javax.swing.JLabel();
        jPanelBezTextField = new javax.swing.JPanel();
        jTextFieldKodeBez = new javax.swing.JTextField();
        jTextFieldIzena = new javax.swing.JTextField();
        jTextFieldAbizena1 = new javax.swing.JTextField();
        jTextFieldAbizena2 = new javax.swing.JTextField();
        jTextFieldNan = new javax.swing.JTextField();
        jTextFieldJaioData = new javax.swing.JTextField();
        jRadioButtonEmak = new javax.swing.JRadioButton();
        jRadioButtonGiz = new javax.swing.JRadioButton();
        jTextFieldHerria = new javax.swing.JTextField();
        jTextFieldTlf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldBilatu = new javax.swing.JTextField();
        jLabelBezKud = new javax.swing.JLabel();
        bilatuLabel2 = new javax.swing.JLabel();
        oinaPanel1 = new javax.swing.JPanel();
        jButtonIrten = new javax.swing.JButton();
        jButtonGehitu = new javax.swing.JButton();
        jButtonAldatu = new javax.swing.JButton();
        jButtonEzabatu = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jDialogEzabatuKonfirmLayout = new javax.swing.GroupLayout(jDialogEzabatuKonfirm.getContentPane());
        jDialogEzabatuKonfirm.getContentPane().setLayout(jDialogEzabatuKonfirmLayout);
        jDialogEzabatuKonfirmLayout.setHorizontalGroup(
            jDialogEzabatuKonfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogEzabatuKonfirmLayout.setVerticalGroup(
            jDialogEzabatuKonfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableBezeroaInfo.setAutoCreateRowSorter(true);
        jTableBezeroaInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableBezeroaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableBezeroaInfo.setToolTipText("");
        jTableBezeroaInfo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableBezeroaInfo.setAutoscrolls(false);
        jScrollPane3.setViewportView(jTableBezeroaInfo);

        javax.swing.GroupLayout jPanelBezTaulaLayout = new javax.swing.GroupLayout(jPanelBezTaula);
        jPanelBezTaula.setLayout(jPanelBezTaulaLayout);
        jPanelBezTaulaLayout.setHorizontalGroup(
            jPanelBezTaulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBezTaulaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBezTaulaLayout.setVerticalGroup(
            jPanelBezTaulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBezTaulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelIzena.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelIzena.setText("Izena:");

        jLabelAbizena2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelAbizena2.setText("Bigarren abizena:");

        jLabelNan.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelNan.setText("NAN:");

        jLabelJaioData.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelJaioData.setText("Jaiotze data:");

        jLabelSexua.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelSexua.setText("Sexua:");

        jLabelAbizena1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelAbizena1.setText("Lehenengo abizena:");

        jLabelHerria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelHerria.setText("Herria:");

        jLabelTlf.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelTlf.setText("Telefonoa:");

        jLabelKodBez.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelKodBez.setText("Kodea:");

        buttonGroupEmGiz.add(jRadioButtonEmak);
        jRadioButtonEmak.setText("Emakumea");

        buttonGroupEmGiz.add(jRadioButtonGiz);
        jRadioButtonGiz.setText("Gizona");

        javax.swing.GroupLayout jPanelBezTextFieldLayout = new javax.swing.GroupLayout(jPanelBezTextField);
        jPanelBezTextField.setLayout(jPanelBezTextFieldLayout);
        jPanelBezTextFieldLayout.setHorizontalGroup(
            jPanelBezTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBezTextFieldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBezTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldIzena, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAbizena2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNan, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBezTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBezTextFieldLayout.createSequentialGroup()
                            .addComponent(jRadioButtonEmak)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButtonGiz))
                        .addComponent(jTextFieldJaioData, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldAbizena1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHerria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKodeBez, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelBezTextFieldLayout.setVerticalGroup(
            jPanelBezTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBezTextFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldKodeBez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldIzena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAbizena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAbizena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldJaioData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBezTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEmak)
                    .addComponent(jRadioButtonGiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldHerria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBezDatuakLayout = new javax.swing.GroupLayout(jPanelBezDatuak);
        jPanelBezDatuak.setLayout(jPanelBezDatuakLayout);
        jPanelBezDatuakLayout.setHorizontalGroup(
            jPanelBezDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBezDatuakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBezDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKodBez)
                    .addComponent(jLabelTlf)
                    .addComponent(jLabelHerria)
                    .addComponent(jLabelAbizena1)
                    .addComponent(jLabelJaioData)
                    .addComponent(jLabelSexua)
                    .addComponent(jLabelNan)
                    .addComponent(jLabelIzena)
                    .addComponent(jLabelAbizena2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBezTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanelBezDatuakLayout.setVerticalGroup(
            jPanelBezDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBezDatuakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKodBez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelIzena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAbizena1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAbizena2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelJaioData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSexua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHerria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTlf)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jPanelBezTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabelBezKud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBezKud.setText("BEZEROAK KUDEATU");

        bilatuLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/bilaketaLupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBezKud, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bilatuLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBilatu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextFieldBilatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bilatuLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelBezKud)
                        .addContainerGap())))
        );

        jButtonIrten.setBackground(new java.awt.Color(51, 0, 0));
        jButtonIrten.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonIrten.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIrten.setText("Irten");
        jButtonIrten.setBorderPainted(false);

        jButtonGehitu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonGehitu.setText("Gehitu");

        jButtonAldatu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonAldatu.setText("Aldatu");

        jButtonEzabatu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonEzabatu.setText("Ezabatu");

        javax.swing.GroupLayout oinaPanel1Layout = new javax.swing.GroupLayout(oinaPanel1);
        oinaPanel1.setLayout(oinaPanel1Layout);
        oinaPanel1Layout.setHorizontalGroup(
            oinaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oinaPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEzabatu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAldatu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGehitu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIrten)
                .addContainerGap())
        );
        oinaPanel1Layout.setVerticalGroup(
            oinaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oinaPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(oinaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oinaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEzabatu)
                        .addComponent(jButtonAldatu)
                        .addComponent(jButtonGehitu))
                    .addComponent(jButtonIrten))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oinaPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanelBezDatuak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelBezTaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBezDatuak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBezTaula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oinaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
            java.util.logging.Logger.getLogger(BezeroaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BezeroaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BezeroaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BezeroaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BezeroaInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bilatuLabel2;
    private javax.swing.ButtonGroup buttonGroupEmGiz;
    public javax.swing.JButton jButtonAldatu;
    public javax.swing.JButton jButtonEzabatu;
    public javax.swing.JButton jButtonGehitu;
    public javax.swing.JButton jButtonIrten;
    public javax.swing.JDialog jDialogEzabatuKonfirm;
    private javax.swing.JLabel jLabelAbizena1;
    private javax.swing.JLabel jLabelAbizena2;
    private javax.swing.JLabel jLabelBezKud;
    private javax.swing.JLabel jLabelHerria;
    private javax.swing.JLabel jLabelIzena;
    private javax.swing.JLabel jLabelJaioData;
    private javax.swing.JLabel jLabelKodBez;
    private javax.swing.JLabel jLabelNan;
    private javax.swing.JLabel jLabelSexua;
    private javax.swing.JLabel jLabelTlf;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBezDatuak;
    private javax.swing.JPanel jPanelBezTaula;
    public javax.swing.JPanel jPanelBezTextField;
    public javax.swing.JRadioButton jRadioButtonEmak;
    public javax.swing.JRadioButton jRadioButtonGiz;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable jTableBezeroaInfo;
    public javax.swing.JTextField jTextFieldAbizena1;
    public javax.swing.JTextField jTextFieldAbizena2;
    private javax.swing.JTextField jTextFieldBilatu;
    public javax.swing.JTextField jTextFieldHerria;
    public javax.swing.JTextField jTextFieldIzena;
    public javax.swing.JTextField jTextFieldJaioData;
    public javax.swing.JTextField jTextFieldKodeBez;
    public javax.swing.JTextField jTextFieldNan;
    public javax.swing.JTextField jTextFieldTlf;
    private javax.swing.JPanel oinaPanel1;
    // End of variables declaration//GEN-END:variables
    
}
