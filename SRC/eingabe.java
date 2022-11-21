package SRC;

import java.util.Scanner;

public class eingabe {
    public String[] row;

    public String[] einlesen(Scanner einlesen){
        
        System.out.println("Gib was ein Freund!");

        String eingabe = einlesen.nextLine();

        
        this.row = eingabe.split(" ");

        //System.out.println(" Du schriebst: " + eingabe);

        return this.row;
    }
}
