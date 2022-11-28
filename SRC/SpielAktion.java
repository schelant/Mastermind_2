package SRC;

import java.util.Scanner;

public class SpielAktion {
    public boolean spielGehtWeiter;
    public int anzahlRunden;      // das wird nirgends null gesetzt oder? wie funktioniert das?

    public void Runde(SpielObjekt x, Auswertung rueck){       
        Scanner einlesen = new Scanner(System.in);
        Eingabe input = new Eingabe();

        
        Ausgabe.ausgebenTrenner(this.anzahlRunden);
        Ausgabe.ausgebenSpielfeld(x, rueck);
        Ausgabe.ausgebenLösung(x.GetColourFromChar(x.zielArray));
        
        input.eingabeReihe = input.einlesen(einlesen);

        Ausgabe.ausgebenLösung(x.GetColourFromChar(input.eingabeReihe));


        rueck.positionUndFarbeRichtig = rueck.vergleichenEingabeZiel(x.zielArray, input.eingabeReihe, this.anzahlRunden);
        Ausgabe.ausgebenRückmeldung(rueck.positionUndFarbeRichtig, this.anzahlRunden);

        x.AddFarbenMatrix(input.eingabeReihe, this.anzahlRunden);     
        Ausgabe.reinigeEingabeaufforderung();

        if (rueck.positionUndFarbeRichtig[this.anzahlRunden][0] == x.anzahlKugeln){    
            System.out.print("Du hast gewonnen. Bitte Spielende einprogrammieren.");
        }
        //einlesen.close();
    }
}
