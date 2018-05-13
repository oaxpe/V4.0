/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiektua_denda;

import controller.Controller;
import view.*;
import model.*;

/**
 *
 * @author Oihane Axpe
 * @version 4.0
 */
public class Proiektua_denda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* MODEL */
        Bezeroa bez = new Bezeroa();
        Denda denda = new Denda();
        Eskaera esk = new Eskaera();
        Hornitzailea horn = new Hornitzailea();
        Jertsea jerts = new Jertsea();
        Kamiseta kami = new Kamiseta();
        Langilea lang = new Langilea();
        Praka prak = new Praka();
        Salmenta salm = new Salmenta();

        /* VIEW */
        MenuNagusia viewMenuNag = new MenuNagusia();
        DendaInfo viewDendInfo = new DendaInfo();
        DendaGehitu viewDendGehitu = new DendaGehitu();
        BezeroaInfo viewBezInfo = new BezeroaInfo();
        BezeroaGehitu viewBezGehitu = new BezeroaGehitu();
        LangileaInfo viewLangInfo = new LangileaInfo();
        LangileaGehitu viewLangGehitu = new LangileaGehitu();
        ProduktuaAukeratu viewProdAuk = new ProduktuaAukeratu();
        JertseaGehitu viewJertsGehitu = new JertseaGehitu();
        KamisetaGehitu viewKamGehitu = new KamisetaGehitu();
        PrakaGehitu viewPrakGehitu = new PrakaGehitu();
        HornitzaileaInfo viewHornInfo = new HornitzaileaInfo();
        HornitzaileaGehitu viewHornGehitu = new HornitzaileaGehitu();
        EskaeraInfo viewEskInfo = new EskaeraInfo();
        EskaeraGehitu viewEskGehitu = new EskaeraGehitu();

        /* CONTROLLER */
        Controller ctrl = new Controller(bez, denda, esk, horn, jerts, kami, lang, prak, salm,
                viewDendInfo, viewDendGehitu, viewBezInfo, viewBezGehitu, viewLangInfo, 
                viewLangGehitu, viewProdAuk, viewJertsGehitu, viewKamGehitu, viewPrakGehitu, 
                viewHornInfo, viewHornGehitu, viewEskInfo, viewEskGehitu, viewMenuNag);

    }
    // PAUSA bat egiteko funtzioa
//    public static void pausa() {
//        try {
//            System.out.println("\nSakatu 'Enter' jarraitzeko...");
//            System.in.read();
//        } 
//        catch (IOException gaizki) {
//            System.out.println(Metodoak.printGorriz("Arazoak daude datuak sartzerakoan."));
//        }
//    }
}
