/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gestioa.Metodoak;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oihane Axpe
 * @version 4.0
 */
public class Eskaera implements Serializable {
    private String eskZenb; 
    private String hornitzailea;
    private String data;
    private int kopurua;    
    
    public Eskaera () {
//        setHornitzailea();
//        setData();
//        setKopurua();
//        setEskZenb();
    }
    
    public Eskaera (String hornitzailea, int kopurua) {
        this.hornitzailea = hornitzailea;
        this.kopurua = kopurua;
        setData();
        setEskZenb();
    }
    
    public Eskaera (String kodea, String hornitzailea, String data, int kopurua) {
        this.eskZenb = kodea; 
        this.hornitzailea = hornitzailea;
        this.data = data;
        this.kopurua = kopurua;
    }
    
    /* METODOAK */
    public void printDatuak() {
        System.out.println("Eskaera zenbakia: "+this.eskZenb);
        System.out.println("Hornitzailea: "+this.hornitzailea);
        System.out.println("Data: "+this.data);
        System.out.println("Kopurua: "+this.kopurua);
    }

    public void printEskaera() {
        System.out.printf("\t%1$-15s    %2$-15s    %3$-10s    %4$-15s\n", this.eskZenb, this.hornitzailea, this.kopurua, this.data);
    }

    
    /* GETTER and SETTER */
    transient BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    public String getHornitzailea() {
        return hornitzailea;
    }

    public void setHornitzailea() {
        try {
            System.out.print("Sartu Hornitzailea: ");
            this.hornitzailea = br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println(Metodoak.printGorriz("Arazoak daude datuak sartzerakoan."));
        }
    }

    public String getData() {
        return data;
    }

    public void setData() {
        Calendar c1 = new GregorianCalendar();
        String egun = Integer.toString(c1.get(Calendar.DATE)); // eguna gorde
        String hilabete = Integer.toString(c1.get(Calendar.MONTH)+1); // hilabetea gorde
        String urte = Integer.toString(c1.get(Calendar.YEAR)); // urtea gorde
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date fetx = null;
        try {
            fetx = df.parse(urte+"/"+hilabete+"/"+egun); // data hori Date formatura parseatu
        } catch (ParseException ex) {
            Logger.getLogger(Eskaera.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.data = Metodoak.dataGorde(fetx); // sartutako data, uuuu/hh/ee formatuan bueltatuko du
    }

    public int getKopurua() {
        return kopurua;
    }

    public void setKopurua() {
        try {
            System.out.print("Sartu kopurua: ");
            this.kopurua = Integer.parseInt(br.readLine());
        }
        catch (IOException gaizki) {
            System.out.println(Metodoak.printGorriz("Arazoak daude datuak sartzerakoan."));
        }
        catch (NumberFormatException datuOkerrak) {
            System.out.println(Metodoak.printGorriz("\tZenbaki bat sartu behar zenuen."));
            setKopurua();
        }
    }

    public String getEskZenb() {
        return eskZenb;
    }

    public void setEskZenb() {
        this.eskZenb = Metodoak.kodeakAldatuEtaGorde("Eskaera"); // Eskaera zenbakia automatikoki hartu kodeak.txt fitxategitik
    }
}
