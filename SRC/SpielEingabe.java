package SRC;

import java.util.Scanner;

public class SpielEingabe {
    public String[] eingabeReihe;

    public String[] einlesen(Scanner eingabe){
        for (;true;) {
            System.out.println("Gib was ein, Freund!");
            String s = eingabe.nextLine();
            this.eingabeReihe = s.split(" ");
            if (this.eingabeReihe.length == 4){
                break;
            }else{
                System.out.println("das ist die falsche anzahl an farben ...");
            }
        }
        

        //System.out.println(" Du schriebst: " + eingabe);

        return this.eingabeReihe;
    }
}