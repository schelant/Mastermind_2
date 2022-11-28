package SRC;

import java.util.Scanner;

public class SpielAktion {
    public boolean spielGehtWeiter;
    public int anzahlRunden;      // das wird nirgends null gesetzt oder? wie funktioniert das?

    public void Runde(SpielObjekt x, Auswertung rueck){       
        Scanner einlesen = new Scanner(System.in);
        SpielEingabe input = new SpielEingabe();

        
        SpielAusgabe.ausgebenTrenner(this.anzahlRunden);
        SpielAusgabe.ausgebenSpielfeld(x, rueck);
        SpielAusgabe.ausgebenLösung(x.konvertiereBuchstabeZuFarbe(x.zielArray));
        
        input.eingabeReihe = input.einlesen(einlesen);

        SpielAusgabe.ausgebenLösung(x.konvertiereBuchstabeZuFarbe(input.eingabeReihe));


        rueck.positionUndFarbeRichtig = rueck.vergleichenEingabeZiel(x.zielArray, input.eingabeReihe, this.anzahlRunden);
        SpielAusgabe.ausgebenRückmeldung(rueck.positionUndFarbeRichtig, this.anzahlRunden);

        x.hinzufügenEingabeZuMatrix(input.eingabeReihe, this.anzahlRunden);     
        SpielAusgabe.reinigeEingabeaufforderung();

        if (rueck.positionUndFarbeRichtig[this.anzahlRunden][0] == x.anzahlKugeln){    
            this.spielGehtWeiter = false;
        }
        //einlesen.close();
    }
}
