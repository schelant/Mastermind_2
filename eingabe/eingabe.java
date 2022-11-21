package eingabe;

import java.util.Scanner;

public class eingabe {
    public static int einlesen(Scanner einlesen){
        
        System.out.println("Gib was ein Freund!");

        String eingabe = einlesen.nextLine();

        int i;
        i = Integer.parseInt(eingabe);

        //System.out.println(" Du schriebst: " + eingabe);

        return i;
    }
}
