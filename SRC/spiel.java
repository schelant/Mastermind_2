package SRC;

import java.util.Scanner;

public class spiel {
    public boolean gameIsOn;
    public int Rundenzahl;

    public void Runde(spielobject x, rueckmeldung rueck){
        Scanner einlesen = new Scanner(System.in);
        eingabe input = new eingabe();

        ausgabe.printInfoZeile(this.Rundenzahl);
        ausgabe.PrintZielArray(x.GetColourFromChar(x.ZielArray));
        
        input.row = input.einlesen(einlesen);

        ausgabe.PrintZielArray(x.GetColourFromChar(input.row));

        rueck.PosNumberCorrect = rueck.Vergleich(x.ZielArray, input.row);
        ausgabe.PrintFeedback(rueck.PosNumberCorrect);

        //System.out.print(input.row[0]);

        x.AddFarbenMatrix(input.row, this.Rundenzahl);     // macht noch keinen sinn, überschreibt sich selbst mit jedem aufruf
        ausgabe.FlushTerminal();
        //einlesen.close();
    }
}
