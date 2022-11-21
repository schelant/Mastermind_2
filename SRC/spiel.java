package SRC;

import java.util.Scanner;

public class spiel {
    public boolean gameIsOn;

    public void Runde(spielobject x, rueckmeldung rueck, int Zeile){
        Scanner einlesen = new Scanner(System.in);
        eingabe input = new eingabe();

        ausgabe.printInfoZeile(Zeile);
        ausgabe.PrintZielArray(x.GetColourFromChar(x.ZielArray));
        
        input.row = input.einlesen(einlesen);

        ausgabe.PrintZielArray(x.GetColourFromChar(input.row));

        rueck.PosNumberCorrect = rueck.Vergleich(x.ZielArray, input.row);
        ausgabe.PrintFeedback(rueck.PosNumberCorrect);

        //einlesen.close();
    }
}
