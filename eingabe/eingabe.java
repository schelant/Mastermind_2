package eingabe;

import java.util.Scanner;

public class eingabe {
    public static String einlesen(){
        
        Scanner einlesen = new Scanner(System.in);
        
        System.out.println("Gib was ein Freund!");

        String eingabe = einlesen.nextLine();

        //System.out.println(" Du schriebst: " + eingabe);

        return eingabe;
    }
}
