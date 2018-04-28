/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioa;

import java.io.IOException;

/**
 *
 * @author Oihane Axpe
 * @version 4.0
 */
public class ProduktuaKudeatu {


    /* Dendan dauden produktuen inbentarioa */
    public static void inbentarioa() {
        System.out.print(""
                + "-------------------------------------------------------------\n"
                + "|        Dendako produktuen inbentarioa (produktuka)        |\n"
                + "-------------------------------------------------------------\n");
        KamisetaKudeatu.kamisetaInbentarioa();
        JertseaKudeatu.jertseaInbentarioa();
        PrakaKudeatu.prakaInbentarioa();
    }
    
    /* Dendan dauden produktu bakoitzaren kantitatea 5 baino txikiagoa bada, produktu hori eskatu egin behar da */
    public static void prodEskatzeko() {
        System.out.print(""
                + "--------------------------------------------\n"
                + "|           Eskatzeko produktuak           |\n"
                + "--------------------------------------------\n");
        KamisetaKudeatu.kamisetaEskatzeko();
        JertseaKudeatu.jertseaEskatzeko();
        PrakaKudeatu.prakaEskatzeko();
    }
    
    public static void prodErakutsi() throws IOException {
        System.out.print(""
                + "------------------------------------------\n"
                + "|        Dendako produktu guztiak        |\n"
                + "------------------------------------------\n");
        KamisetaKudeatu.kamisetaGutztErakutsi();
        JertseaKudeatu.jertsGuztErakutsi();
        PrakaKudeatu.prakaGutztErakutsi();
    }
}