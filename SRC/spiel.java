package SRC;

import java.util.Scanner;

public class spiel {
    public boolean gameIsOn;

    public void Runde(spielobject x, rueckmeldung rueck){
        Scanner einlesen = new Scanner(System.in);
        eingabe input = new eingabe();

        ausgabe.PrintZielArray(x.GetColourFromChar(x.ZielArray));
        
        input.row = input.einlesen(einlesen);

        ausgabe.PrintZielArray(x.GetColourFromChar(input.row));

        rueck.PosNumberCorrect = rueck.Vergleich(x.ZielArray, input.row);
        System.out.println(rueck.PosNumberCorrect[0]+" "+rueck.PosNumberCorrect[1]);
        //einlesen.close();
    }
}
