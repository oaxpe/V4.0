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
public class DendaInfo extends javax.swing.JFrame {
    
    /**
     * Creates new form BezeroaInformazioa
     */
    public DendaInfo() {
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
        jPanelOsoa = new javax.swing.JPanel();
        jPanelDendTaula = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDendaInfo = new javax.swing.JTable();
        jButtonAldaketaGorde = new javax.swing.JButton();
        jButtonAldaketaEzabatu = new javax.swing.JButton();
        jPanelDendDatuak = new javax.swing.JPanel();
        jLabelIzena = new javax.swing.JLabel();
        jLabelPostKod = new javax.swing.JLabel();
        jLabelHelbidea = new javax.swing.JLabel();
        jLabelHerria = new javax.swing.JLabel();
        jLabelTlf = new javax.swing.JLabel();
        jLabelKodDend = new javax.swing.JLabel();
        jTextFieldKodeDend = new javax.swing.JTextField();
        jTextFieldIzena = new javax.swing.JTextField();
        jTextFieldHelbidea = new javax.swing.JTextField();
        jTextFieldPostKod = new javax.swing.JTextField();
        jTextFieldHerria = new javax.swing.JTextField();
        jTextFieldTlf = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPanelGoiburua = new javax.swing.JPanel();
        jTextFieldBilatu = new javax.swing.JTextField();
        jLabelDendKud = new javax.swing.JLabel();
        bilatuLabel2 = new javax.swing.JLabel();
        jPanelOina = new javax.swing.JPanel();
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

        jTableDendaInfo.setAutoCreateRowSorter(true);
        jTableDendaInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableDendaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableDendaInfo.setToolTipText("");
        jTableDendaInfo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(jTableDendaInfo);

        jButtonAldaketaGorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/gorde.png"))); // NOI18N
        jButtonAldaketaGorde.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonAldaketaEzabatu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/ezeztatu.png"))); // NOI18N
        jButtonAldaketaEzabatu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelDendTaulaLayout = new javax.swing.GroupLayout(jPanelDendTaula);
        jPanelDendTaula.setLayout(jPanelDendTaulaLayout);
        jPanelDendTaulaLayout.setHorizontalGroup(
            jPanelDendTaulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
            .addGroup(jPanelDendTaulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAldaketaGorde)
                .addGap(18, 18, 18)
                .addComponent(jButtonAldaketaEzabatu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDendTaulaLayout.setVerticalGroup(
            jPanelDendTaulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDendTaulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelDendTaulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAldaketaGorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAldaketaEzabatu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabelIzena.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelIzena.setText("Izena:");

        jLabelPostKod.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelPostKod.setText("Posta kodea:");

        jLabelHelbidea.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelHelbidea.setText("Helbidea:");

        jLabelHerria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelHerria.setText("Herria:");

        jLabelTlf.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelTlf.setText("Telefonoa:");

        jLabelKodDend.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelKodDend.setText("Kodea:");

        jTextFieldKodeDend.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldKodeDend.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldIzena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldIzena.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldHelbidea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldHelbidea.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldPostKod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldPostKod.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldHerria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldHerria.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldTlf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldTlf.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelEmail.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelEmail.setText("Emaila:");

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelDendDatuakLayout = new javax.swing.GroupLayout(jPanelDendDatuak);
        jPanelDendDatuak.setLayout(jPanelDendDatuakLayout);
        jPanelDendDatuakLayout.setHorizontalGroup(
            jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDendDatuakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDendDatuakLayout.createSequentialGroup()
                        .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKodDend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTlf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHelbidea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPostKod, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jLabelIzena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldHerria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldKodeDend, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIzena, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHelbidea, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPostKod, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanelDendDatuakLayout.createSequentialGroup()
                        .addComponent(jLabelHerria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(184, 184, 184))))
        );
        jPanelDendDatuakLayout.setVerticalGroup(
            jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDendDatuakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKodDend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldKodeDend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIzena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldIzena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHelbidea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldHelbidea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHerria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldHerria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPostKod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldPostKod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTlf)
                    .addComponent(jTextFieldTlf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDendDatuakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextFieldBilatu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelDendKud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDendKud.setText("DENDA KUDEATU");

        bilatuLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/bilaketaLupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanelGoiburuaLayout = new javax.swing.GroupLayout(jPanelGoiburua);
        jPanelGoiburua.setLayout(jPanelGoiburuaLayout);
        jPanelGoiburuaLayout.setHorizontalGroup(
            jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGoiburuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDendKud, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 653, Short.MAX_VALUE)
                .addComponent(bilatuLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBilatu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelGoiburuaLayout.setVerticalGroup(
            jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGoiburuaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextFieldBilatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGoiburuaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bilatuLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGoiburuaLayout.createSequentialGroup()
                        .addComponent(jLabelDendKud)
                        .addContainerGap())))
        );

        jButtonIrten.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonIrten.setText("Irten");
        jButtonIrten.setBorderPainted(false);

        jButtonGehitu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonGehitu.setText("Gehitu");

        jButtonAldatu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonAldatu.setText("Aldatu");

        jButtonEzabatu.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonEzabatu.setText("Ezabatu");

        javax.swing.GroupLayout jPanelOinaLayout = new javax.swing.GroupLayout(jPanelOina);
        jPanelOina.setLayout(jPanelOinaLayout);
        jPanelOinaLayout.setHorizontalGroup(
            jPanelOinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOinaLayout.createSequentialGroup()
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
        jPanelOinaLayout.setVerticalGroup(
            jPanelOinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOinaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanelOinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEzabatu)
                        .addComponent(jButtonAldatu)
                        .addComponent(jButtonGehitu))
                    .addComponent(jButtonIrten))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelOsoaLayout = new javax.swing.GroupLayout(jPanelOsoa);
        jPanelOsoa.setLayout(jPanelOsoaLayout);
        jPanelOsoaLayout.setHorizontalGroup(
            jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOsoaLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelOina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelOsoaLayout.createSequentialGroup()
                        .addComponent(jPanelDendDatuak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelDendTaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelOsoaLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanelGoiburua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        jPanelOsoaLayout.setVerticalGroup(
            jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOsoaLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDendDatuak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDendTaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelOina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelOsoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelOsoaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelGoiburua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(377, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelOsoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
            java.util.logging.Logger.getLogger(DendaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DendaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DendaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DendaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            public void run() {
                new DendaInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bilatuLabel2;
    private javax.swing.ButtonGroup buttonGroupEmGiz;
    public javax.swing.JButton jButtonAldaketaEzabatu;
    public javax.swing.JButton jButtonAldaketaGorde;
    public javax.swing.JButton jButtonAldatu;
    public javax.swing.JButton jButtonEzabatu;
    public javax.swing.JButton jButtonGehitu;
    public javax.swing.JButton jButtonIrten;
    public javax.swing.JDialog jDialogEzabatuKonfirm;
    private javax.swing.JLabel jLabelDendKud;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelHelbidea;
    private javax.swing.JLabel jLabelHerria;
    private javax.swing.JLabel jLabelIzena;
    private javax.swing.JLabel jLabelKodDend;
    private javax.swing.JLabel jLabelPostKod;
    private javax.swing.JLabel jLabelTlf;
    public javax.swing.JPanel jPanelDendDatuak;
    public javax.swing.JPanel jPanelDendTaula;
    public javax.swing.JPanel jPanelGoiburua;
    public javax.swing.JPanel jPanelOina;
    public javax.swing.JPanel jPanelOsoa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable jTableDendaInfo;
    public javax.swing.JTextField jTextFieldBilatu;
    public javax.swing.JTextField jTextFieldEmail;
    public javax.swing.JTextField jTextFieldHelbidea;
    public javax.swing.JTextField jTextFieldHerria;
    public javax.swing.JTextField jTextFieldIzena;
    public javax.swing.JTextField jTextFieldKodeDend;
    public javax.swing.JTextField jTextFieldPostKod;
    public javax.swing.JTextField jTextFieldTlf;
    // End of variables declaration//GEN-END:variables
    
}
