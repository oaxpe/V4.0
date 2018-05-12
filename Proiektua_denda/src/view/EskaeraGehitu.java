/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Oihane Axpe
 * @version 4.0
 */
public class EskaeraGehitu extends javax.swing.JFrame {

    /**
     * Creates new form BezeroaGehitu
     */
    public EskaeraGehitu() {
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

        jPanelOsoa = new javax.swing.JPanel();
        jPanelEskDatuak = new javax.swing.JPanel();
        jLabelHornitzailea = new javax.swing.JLabel();
        jComboBoxHornitzailea = new javax.swing.JComboBox();
        jLabelKopurua = new javax.swing.JLabel();
        jTextFieldKopurua = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        jButtonGorde = new javax.swing.JButton();
        jButtonIrten = new javax.swing.JButton();
        jPanelGoiburua = new javax.swing.JPanel();
        jButtonBerriaGehitu = new javax.swing.JButton();
        jLabelBerriaGehitu = new javax.swing.JLabel();
        jLabelEskGehitu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eskaera berria");

        jLabelHornitzailea.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelHornitzailea.setText("Hornitzailea:");

        jComboBoxHornitzailea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelKopurua.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelKopurua.setText("Kopurua:");

        jTextFieldKopurua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButtonReset.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonReset.setText("Reset");

        jButtonGorde.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonGorde.setText("Gorde");

        javax.swing.GroupLayout jPanelEskDatuakLayout = new javax.swing.GroupLayout(jPanelEskDatuak);
        jPanelEskDatuak.setLayout(jPanelEskDatuakLayout);
        jPanelEskDatuakLayout.setHorizontalGroup(
            jPanelEskDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEskDatuakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEskDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEskDatuakLayout.createSequentialGroup()
                        .addComponent(jButtonReset)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGorde)
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(jPanelEskDatuakLayout.createSequentialGroup()
                        .addGroup(jPanelEskDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHornitzailea)
                            .addComponent(jLabelKopurua))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelEskDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldKopurua)
                            .addComponent(jComboBoxHornitzailea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelEskDatuakLayout.setVerticalGroup(
            jPanelEskDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEskDatuakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEskDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHornitzailea)
                    .addComponent(jComboBoxHornitzailea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEskDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKopurua)
                    .addComponent(jTextFieldKopurua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelEskDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonGorde)))
        );

        jButtonIrten.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonIrten.setText("Irten");
        jButtonIrten.setBorderPainted(false);

        jButtonBerriaGehitu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/berriaGehitu.png"))); // NOI18N
        jButtonBerriaGehitu.setBorder(null);
        jButtonBerriaGehitu.setBorderPainted(false);
        jButtonBerriaGehitu.setOpaque(false);

        jLabelBerriaGehitu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBerriaGehitu.setText("Berria gehitu");

        jLabelEskGehitu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEskGehitu.setText("ESKAERAREN DATUAK:");

        javax.swing.GroupLayout jPanelGoiburuaLayout = new javax.swing.GroupLayout(jPanelGoiburua);
        jPanelGoiburua.setLayout(jPanelGoiburuaLayout);
        jPanelGoiburuaLayout.setHorizontalGroup(
            jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGoiburuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEskGehitu, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabelBerriaGehitu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBerriaGehitu)
                .addContainerGap())
        );
        jPanelGoiburuaLayout.setVerticalGroup(
            jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGoiburuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEskGehitu, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBerriaGehitu)
                    .addComponent(jLabelBerriaGehitu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelOsoaLayout = new javax.swing.GroupLayout(jPanelOsoa);
        jPanelOsoa.setLayout(jPanelOsoaLayout);
        jPanelOsoaLayout.setHorizontalGroup(
            jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOsoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelGoiburua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelOsoaLayout.createSequentialGroup()
                        .addComponent(jPanelEskDatuak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonIrten)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelOsoaLayout.setVerticalGroup(
            jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOsoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGoiburua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonIrten)
                    .addComponent(jPanelEskDatuak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOsoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOsoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(EskaeraGehitu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EskaeraGehitu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EskaeraGehitu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EskaeraGehitu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EskaeraGehitu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonBerriaGehitu;
    public javax.swing.JButton jButtonGorde;
    public javax.swing.JButton jButtonIrten;
    public javax.swing.JButton jButtonReset;
    public javax.swing.JComboBox jComboBoxHornitzailea;
    private javax.swing.JLabel jLabelBerriaGehitu;
    private javax.swing.JLabel jLabelEskGehitu;
    private javax.swing.JLabel jLabelHornitzailea;
    private javax.swing.JLabel jLabelKopurua;
    public javax.swing.JPanel jPanelEskDatuak;
    public javax.swing.JPanel jPanelGoiburua;
    public javax.swing.JPanel jPanelOsoa;
    public javax.swing.JTextField jTextFieldKopurua;
    // End of variables declaration//GEN-END:variables
}

