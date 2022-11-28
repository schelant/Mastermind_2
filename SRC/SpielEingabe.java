package SRC;

import java.util.Scanner;

public class SpielEingabe {
    public String[] eingabeReihe;

    public String[] einlesen(Scanner einlesen){
        
        System.out.println("Gib was ein, Freund!");

        String s = einlesen.nextLine();

        
        this.eingabeReihe = s.split(" ");

        //System.out.println(" Du schriebst: " + eingabe);

        return this.eingabeReihe;
    }
}