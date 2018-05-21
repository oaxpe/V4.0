/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.*; // bista guztiak importatu
import gestioa.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Oihane Axpe
 * @version 4.0
 */
public class menuNagController implements ActionListener, MouseListener{
    /* Bistak */
    private MenuNagusia viewMenuNagusia; 
    private DendaInfo viewDendaInfo;
    private BezeroaInfo viewBezeroaInfo;
    private LangileaInfo viewLangileaInfo;
    private ProduktuaAukeratu viewProduktuaAukeratu;
    private HornitzaileaInfo viewHornitzaileaInfo;
    private EskaeraInfo viewEskaeraInfo;

    /* ERAIKITZAILEA */   
    public menuNagController(DendaInfo viewDendInfo, BezeroaInfo viewBezInfo, 
            LangileaInfo viewLangInfo,  ProduktuaAukeratu viewProdAuk, 
            HornitzaileaInfo viewHornInfo, EskaeraInfo viewEskInfo, MenuNagusia viewMenuNag) {
        this.viewDendaInfo = viewDendInfo;
        this.viewBezeroaInfo = viewBezInfo;
        this.viewLangileaInfo = viewLangInfo;
        this.viewProduktuaAukeratu = viewProdAuk;
        this.viewHornitzaileaInfo = viewHornInfo;
        this.viewEskaeraInfo = viewEskInfo;
        this.viewMenuNagusia = viewMenuNag;
        menuNagEstiloa();
    }

    /* LISTENERS (ActionListener, FocusListener, MouseListener...)  */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object comando = e.getSource();
        /* instantzia berriak, bertako metodoak erabiltzeko */
        Controller ctr = new Controller(); // Controller klasean dauden metodoak erabili ahal izateko
        dendaInfoController dendInfoCtr = new dendaInfoController();
        bezInfoController bezInfoCtr = new bezInfoController();
        langInfoController langInfoCtr = new langInfoController();
        hornInfoController hornInfoCtr = new hornInfoController();
        eskInfoController eskInfoCtr = new eskInfoController();
        
        /* Menu nagusiko aukerak */
        if (comando == viewMenuNagusia.jButtonIrten) {
            System.exit(0);
        }
        else if (comando == viewMenuNagusia.jButtonDenda) {
            viewDendaInfo.setVisible(true);
            viewMenuNagusia.setEnabled(false);
            ctr.enableComponents(viewDendaInfo.jPanelDendDatuak, false);
            dendInfoCtr.dendDatuakErakutsiTaula(viewDendaInfo.jTableDendaInfo, DendaKudeatu.dendGuztiakErakutsi());
        }
        else if (comando == viewMenuNagusia.jButtonProduktua) {
            viewProduktuaAukeratu.setVisible(true);
            viewMenuNagusia.setEnabled(false);
            viewProduktuaAukeratu.jToggleButtonEzkutatu.setSelected(true);
            ctr.enableComponents(viewProduktuaAukeratu.jPanelGoiburua, false);
            ctr.enableComponents(viewProduktuaAukeratu.jPanelAukerak, false);
        }
        else if (comando == viewMenuNagusia.jButtonBezeroa) {
            viewBezeroaInfo.setVisible(true);
            viewMenuNagusia.setEnabled(false);
            ctr.enableComponents(viewBezeroaInfo.jPanelBezDatuak, false);
            bezInfoCtr.bezDatuakErakutsiTaula(viewBezeroaInfo.jTableBezeroaInfo, BezeroaKudeatu.bezeroGuztiakErakutsi());
        }
        else if (comando == viewMenuNagusia.jButtonLangilea) {
            viewLangileaInfo.setVisible(true);
            viewMenuNagusia.setEnabled(false);
            ctr.enableComponents(viewLangileaInfo.jPanelLangDatuak, false);
            langInfoCtr.langDatuakErakutsiTaula(viewLangileaInfo.jTableLangileaInfo, LangileaKudeatu.langileGuztiakErakutsi());
        }
        else if (comando == viewMenuNagusia.jButtonHornitzailea) {
            viewHornitzaileaInfo.setVisible(true); 
            viewMenuNagusia.setEnabled(false);
            ctr.enableComponents(viewHornitzaileaInfo.jPanelHornDatuak, false);
            hornInfoCtr.hornDatuakErakutsiTaula(viewHornitzaileaInfo.jTableHornitzaileaInfo, HornitzaileaKudeatu.hornitzaileGuztiakErakutsi());
        }
        else if (comando == viewMenuNagusia.jButtonEskaera) {
            viewEskaeraInfo.setVisible(true);
            viewMenuNagusia.setEnabled(false);
            ctr.enableComponents(viewEskaeraInfo.jPanelEskDatuak, false);
            eskInfoCtr.eskDatuakErakutsiTaula(viewEskaeraInfo.jTableEskaeraInfo, EskaeraKudeatu.eskaeraGuztiakErakutsi());
        }
    }
        
    /* METODOAK */      
    private void menuNagEstiloa() {
        viewMenuNagusia.setTitle("ATENEA");
        viewMenuNagusia.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        viewMenuNagusia.setLocationRelativeTo(null);
        viewMenuNagusia.jPanelGoiburua.setBackground(new Color(0,0,153));
        viewMenuNagusia.jPanelOina.setBackground(new Color(0,0,153));
        viewMenuNagusia.jPanelGorputza.setBackground(Color.WHITE);
        viewMenuNagusia.jButtonIrten.setBackground(Color.WHITE);
        
        viewMenuNagusia.jButtonDenda.setToolTipText("Denda");
        viewMenuNagusia.jButtonBezeroa.setToolTipText("Bezeroa");
        viewMenuNagusia.jButtonLangilea.setToolTipText("Langilea");
        viewMenuNagusia.jButtonProduktua.setToolTipText("Produktuak");
        viewMenuNagusia.jButtonHornitzailea.setToolTipText("Hornitzailea");
        viewMenuNagusia.jButtonEskaera.setToolTipText("Eskaera");

        botoienFormatoa(viewMenuNagusia.jPanelGorputza); // koloreak definitu
    }
    
    private void botoienFormatoa (Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setBackground(Color.WHITE);
            component.setForeground(Color.BLACK);
            if (component instanceof JButton) {
                ((JButton) component).setOpaque(true);
                ((JButton) component).setIconTextGap(20); // Ikono eta textuaren arteko tartea definitu
                ((JButton) component).setHorizontalAlignment(JButton.LEFT); // Botoi barrukoa ezkerrean alineatzeko
                ((JButton) component).setBorderPainted(false);
            }   
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object comando = e.getSource();
        Color urdinArgia = new Color(102,153,255); // xagua gainetik pasatzen denean jarriko den kolorea
        if (comando == viewMenuNagusia.jButtonIrten)
            viewMenuNagusia.jButtonIrten.setCursor(new Cursor(Cursor.HAND_CURSOR));
        else if (comando == viewMenuNagusia.jButtonDenda) {
            viewMenuNagusia.jButtonDenda.setBackground(urdinArgia);
            viewMenuNagusia.jButtonDenda.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonDenda.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonBezeroa) {
            viewMenuNagusia.jButtonBezeroa.setBackground(urdinArgia);
            viewMenuNagusia.jButtonBezeroa.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonBezeroa.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonLangilea) {
            viewMenuNagusia.jButtonLangilea.setBackground(urdinArgia);
            viewMenuNagusia.jButtonLangilea.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonLangilea.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonHornitzailea) {
            viewMenuNagusia.jButtonHornitzailea.setBackground(urdinArgia);
            viewMenuNagusia.jButtonHornitzailea.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonHornitzailea.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }    
        else if (comando == viewMenuNagusia.jButtonEskaera) {
            viewMenuNagusia.jButtonEskaera.setBackground(urdinArgia);
            viewMenuNagusia.jButtonEskaera.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonEskaera.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonProduktua) {
            viewMenuNagusia.jButtonProduktua.setBackground(urdinArgia);
            viewMenuNagusia.jButtonProduktua.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonProduktua.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonInbentarioa) {
            viewMenuNagusia.jButtonInbentarioa.setBackground(urdinArgia);
            viewMenuNagusia.jButtonInbentarioa.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonInbentarioa.setCursor(new Cursor(Cursor.HAND_CURSOR));
        } 
        else if (comando == viewMenuNagusia.jButtonEskatzeko) {
            viewMenuNagusia.jButtonEskatzeko.setBackground(urdinArgia);
            viewMenuNagusia.jButtonEskatzeko.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonEskatzeko.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonKontsulta) {
            viewMenuNagusia.jButtonKontsulta.setBackground(urdinArgia);
            viewMenuNagusia.jButtonKontsulta.setForeground(Color.WHITE);
            viewMenuNagusia.jButtonKontsulta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object comando = e.getSource();
        if (comando == viewMenuNagusia.jButtonIrten)
            viewMenuNagusia.jButtonIrten.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        else if (comando == viewMenuNagusia.jButtonDenda) {
            viewMenuNagusia.jButtonDenda.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonDenda.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonDenda.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonBezeroa) {
            viewMenuNagusia.jButtonBezeroa.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonBezeroa.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonBezeroa.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonLangilea) {
            viewMenuNagusia.jButtonLangilea.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonLangilea.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonLangilea.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonHornitzailea) {
            viewMenuNagusia.jButtonHornitzailea.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonHornitzailea.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonHornitzailea.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonEskaera) {
            viewMenuNagusia.jButtonEskaera.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonEskaera.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonEskaera.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonProduktua) {
            viewMenuNagusia.jButtonProduktua.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonProduktua.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonProduktua.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonInbentarioa) {
            viewMenuNagusia.jButtonInbentarioa.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonInbentarioa.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonInbentarioa.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }  
        else if (comando == viewMenuNagusia.jButtonEskatzeko) {
            viewMenuNagusia.jButtonEskatzeko.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonEskatzeko.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonEskatzeko.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        else if (comando == viewMenuNagusia.jButtonKontsulta) {
            viewMenuNagusia.jButtonKontsulta.setBackground(Color.WHITE);
            viewMenuNagusia.jButtonKontsulta.setForeground(Color.BLACK);
            viewMenuNagusia.jButtonKontsulta.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
            
    }
}