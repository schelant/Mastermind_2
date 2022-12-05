package SRC;

import java.util.Scanner;

public class SpielAktion {
    public boolean spielGehtWeiter;
    public int aktuelleRunde;      // das wird nirgends null gesetzt oder? wie funktioniert das?
                        // ich habe die Variable umbenannt, von "anzahlRunden" in "aktuelle Runde",
                        // weil es die gleiche nochmal im Spielobjekt gibt, wo die maximale Anzahl
                        // festgelegt wird. Dann ist es verwirrend, wenn hier die Runden hochgezählt
                        // werden und die Variable gleich heißt (ist zwar Polymorphie, aber trotzdem
                        // verwirrend) 

    public void Runde(SpielObjekt x, Auswertung rueck){       
        Scanner einlesen = new Scanner(System.in);
        SpielEingabe input = new SpielEingabe();

        
        SpielAusgabe.ausgebenTrenner(this.aktuelleRunde);
        SpielAusgabe.ausgebenSpielfeld(x, rueck);
        //SpielAusgabe.ausgebenLösung(x.konvertiereBuchstabeZuFarbe(x.zielArray));
        
        
        input.eingabeReihe = input.einlesen(einlesen);

        SpielAusgabe.ausgebenLösung(x.konvertiereBuchstabeZuFarbe(input.eingabeReihe));


        rueck.positionUndFarbeRichtig = rueck.vergleichenEingabeZiel(x.zielArray, input.eingabeReihe, this.aktuelleRunde);
        SpielAusgabe.ausgebenRückmeldung(rueck.positionUndFarbeRichtig, this.aktuelleRunde);

        x.hinzufügenEingabeZuMatrix(input.eingabeReihe, this.aktuelleRunde);     
        SpielAusgabe.reinigeEingabeaufforderung();

        if (rueck.positionUndFarbeRichtig[this.aktuelleRunde][0] == x.anzahlKugeln){    
            this.spielGehtWeiter = false;
        }
        //einlesen.close();
    }
}
