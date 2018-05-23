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
public class MenuNagusia extends javax.swing.JFrame {

    /**
     * Creates new form menuNagusia
     */
    public MenuNagusia() {
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

        jPanelGoiburua = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelGorputza = new javax.swing.JPanel();
        jButtonDenda = new javax.swing.JButton();
        jButtonHornitzailea = new javax.swing.JButton();
        jButtonEskaera = new javax.swing.JButton();
        jButtonBezeroa = new javax.swing.JButton();
        jButtonLangilea = new javax.swing.JButton();
        jButtonProduktua = new javax.swing.JButton();
        jButtonEskatzeko = new javax.swing.JButton();
        jButtonInbentarioa = new javax.swing.JButton();
        jSeparatorEzker = new javax.swing.JSeparator();
        jSeparatorEskum = new javax.swing.JSeparator();
        jButtonKontsulta = new javax.swing.JButton();
        jButtonSalmenta = new javax.swing.JButton();
        jPanelOina = new javax.swing.JPanel();
        jButtonIrten = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATENEA");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelGoiburua.setForeground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Toledo", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atenea");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/logoAtenea.png"))); // NOI18N

        javax.swing.GroupLayout jPanelGoiburuaLayout = new javax.swing.GroupLayout(jPanelGoiburua);
        jPanelGoiburua.setLayout(jPanelGoiburuaLayout);
        jPanelGoiburuaLayout.setHorizontalGroup(
            jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGoiburuaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGoiburuaLayout.setVerticalGroup(
            jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGoiburuaLayout.createSequentialGroup()
                .addGroup(jPanelGoiburuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGoiburuaLayout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanelGoiburuaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jButtonDenda.setFont(jButtonDenda.getFont().deriveFont(jButtonDenda.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonDenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/denda.png"))); // NOI18N
        jButtonDenda.setText("Denda");

        jButtonHornitzailea.setFont(jButtonHornitzailea.getFont().deriveFont(jButtonHornitzailea.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonHornitzailea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/hornitzailea.png"))); // NOI18N
        jButtonHornitzailea.setText("Hornitzailea");
        jButtonHornitzailea.setToolTipText("");

        jButtonEskaera.setFont(jButtonEskaera.getFont().deriveFont(jButtonEskaera.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonEskaera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/eskaera.png"))); // NOI18N
        jButtonEskaera.setText("Eskaerak");

        jButtonBezeroa.setFont(jButtonBezeroa.getFont().deriveFont(jButtonBezeroa.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonBezeroa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/bezeroa.png"))); // NOI18N
        jButtonBezeroa.setText("Bezeroak");

        jButtonLangilea.setFont(jButtonLangilea.getFont().deriveFont(jButtonLangilea.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonLangilea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/langileak.png"))); // NOI18N
        jButtonLangilea.setText("Langileak");

        jButtonProduktua.setFont(jButtonProduktua.getFont().deriveFont(jButtonProduktua.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonProduktua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/produktua.png"))); // NOI18N
        jButtonProduktua.setText("Produktuak");
        jButtonProduktua.setToolTipText("");

        jButtonEskatzeko.setFont(jButtonEskatzeko.getFont().deriveFont(jButtonEskatzeko.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonEskatzeko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/eskatzeko.png"))); // NOI18N
        jButtonEskatzeko.setText("Eskatzekoak");
        jButtonEskatzeko.setToolTipText("");

        jButtonInbentarioa.setFont(jButtonInbentarioa.getFont().deriveFont(jButtonInbentarioa.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonInbentarioa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/inbentarioa.png"))); // NOI18N
        jButtonInbentarioa.setText("Inbentarioa");
        jButtonInbentarioa.setToolTipText("");

        jSeparatorEzker.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparatorEskum.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonKontsulta.setFont(jButtonKontsulta.getFont().deriveFont(jButtonKontsulta.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonKontsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/kontsulta.png"))); // NOI18N
        jButtonKontsulta.setText("Kontsulta");
        jButtonKontsulta.setToolTipText("");

        jButtonSalmenta.setFont(jButtonSalmenta.getFont().deriveFont(jButtonSalmenta.getFont().getStyle() | java.awt.Font.BOLD, 20));
        jButtonSalmenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/argazkiak/salmenta.png"))); // NOI18N
        jButtonSalmenta.setText("Salmenta");
        jButtonSalmenta.setToolTipText("");

        javax.swing.GroupLayout jPanelGorputzaLayout = new javax.swing.GroupLayout(jPanelGorputza);
        jPanelGorputza.setLayout(jPanelGorputzaLayout);
        jPanelGorputzaLayout.setHorizontalGroup(
            jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGorputzaLayout.createSequentialGroup()
                .addGroup(jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBezeroa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLangilea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHornitzailea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEskaera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparatorEzker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                .addComponent(jSeparatorEskum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProduktua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInbentarioa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEskatzeko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGorputzaLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonKontsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalmenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanelGorputzaLayout.setVerticalGroup(
            jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGorputzaLayout.createSequentialGroup()
                .addGroup(jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelGorputzaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalmenta))
                    .addComponent(jSeparatorEzker, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGorputzaLayout.createSequentialGroup()
                        .addGroup(jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGorputzaLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButtonBezeroa)
                                .addGap(0, 0, 0)
                                .addGroup(jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonLangilea)
                                    .addComponent(jButtonEskatzeko)))
                            .addGroup(jPanelGorputzaLayout.createSequentialGroup()
                                .addGroup(jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonDenda)
                                    .addComponent(jButtonProduktua))
                                .addComponent(jButtonInbentarioa)))
                        .addGroup(jPanelGorputzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGorputzaLayout.createSequentialGroup()
                                .addComponent(jButtonHornitzailea)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonEskaera))
                            .addComponent(jButtonKontsulta))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparatorEskum, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        jButtonIrten.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButtonIrten.setText("Irten");
        jButtonIrten.setBorderPainted(false);

        javax.swing.GroupLayout jPanelOinaLayout = new javax.swing.GroupLayout(jPanelOina);
        jPanelOina.setLayout(jPanelOinaLayout);
        jPanelOinaLayout.setHorizontalGroup(
            jPanelOinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOinaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIrten)
                .addGap(14, 14, 14))
        );
        jPanelOinaLayout.setVerticalGroup(
            jPanelOinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOinaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jButtonIrten)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGoiburua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelOina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelGorputza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelGoiburua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelGorputza, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelOina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
            java.util.logging.Logger.getLogger(MenuNagusia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuNagusia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuNagusia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuNagusia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MenuNagusia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonBezeroa;
    public javax.swing.JButton jButtonDenda;
    public javax.swing.JButton jButtonEskaera;
    public javax.swing.JButton jButtonEskatzeko;
    public javax.swing.JButton jButtonHornitzailea;
    public javax.swing.JButton jButtonInbentarioa;
    public javax.swing.JButton jButtonIrten;
    public javax.swing.JButton jButtonKontsulta;
    public javax.swing.JButton jButtonLangilea;
    public javax.swing.JButton jButtonProduktua;
    public javax.swing.JButton jButtonSalmenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanelGoiburua;
    public javax.swing.JPanel jPanelGorputza;
    public javax.swing.JPanel jPanelOina;
    public javax.swing.JSeparator jSeparatorEskum;
    public javax.swing.JSeparator jSeparatorEzker;
    // End of variables declaration//GEN-END:variables
}
