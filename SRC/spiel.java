package SRC;

import java.util.Scanner;

public class spiel {
    public boolean gameIsOn;
    public int Rundenzahl;

    public void Runde(spielobject x, rueckmeldung rueck){       
        Scanner einlesen = new Scanner(System.in);
        eingabe input = new eingabe();

        
        ausgabe.printInfoZeile(this.Rundenzahl);
        ausgabe.PrintSpielanzeige(x, rueck);
        ausgabe.PrintZielArray(x.GetColourFromChar(x.ZielArray));
        
        input.row = input.einlesen(einlesen);

        ausgabe.PrintZielArray(x.GetColourFromChar(input.row));

        rueck.PosNumberCorrect = rueck.Vergleich(x.ZielArray, input.row);
        ausgabe.PrintFeedback(rueck.PosNumberCorrect);

        //System.out.print(input.row[0]);

        x.AddFarbenMatrix(input.row, this.Rundenzahl);     
        ausgabe.FlushTerminal();

        if (rueck.PosNumberCorrect[0] == x.anzahlKugeln){    
            System.out.print("Du hast gewonnen. Bitte Spielende einprogrammieren.");
        }
        //einlesen.close();
    }
}
