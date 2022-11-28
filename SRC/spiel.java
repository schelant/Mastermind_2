package SRC;

import java.util.Scanner;

public class spiel {
    public boolean gameIsOn;
    public int Rundenzahl;      // das wird nirgends null gesetzt oder? wie funktioniert das?

    public void Runde(spielobject x, rueckmeldung rueck){       
        Scanner einlesen = new Scanner(System.in);
        eingabe input = new eingabe();

        
        ausgabe.printInfoZeile(this.Rundenzahl);
        ausgabe.PrintSpielanzeige(x, rueck);
        ausgabe.PrintZielArray(x.GetColourFromChar(x.ZielArray));
        
        input.row = input.einlesen(einlesen);

        ausgabe.PrintZielArray(x.GetColourFromChar(input.row));


        rueck.PosNumberCorrect = rueck.Vergleich(x.ZielArray, input.row, this.Rundenzahl);
        ausgabe.PrintFeedback(rueck.PosNumberCorrect, this.Rundenzahl);

        x.AddFarbenMatrix(input.row, this.Rundenzahl);     
        ausgabe.FlushTerminal();

        if (rueck.PosNumberCorrect[this.Rundenzahl][0] == x.anzahlKugeln){    
            System.out.print("Du hast gewonnen. Bitte Spielende einprogrammieren.");
        }
        //einlesen.close();
    }
}
