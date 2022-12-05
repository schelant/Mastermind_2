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
    public void kontrolliereSpielende(){
        if (this.aktuelleRunde >= 12){
            this.spielGehtWeiter = false;
        }
    }

    public void rundeSpielen(SpielObjekt spiel, Auswertung rueckmeldung){       
        Scanner einlesen = new Scanner(System.in);
        SpielEingabe input = new SpielEingabe();
        SpielAusgabe output = new SpielAusgabe();
        //PCEingabe pcinput = new PCEingabe();

        
        output.ausgebenTrenner(this.aktuelleRunde);
        output.ausgebenSpielfeld(spiel, rueckmeldung);
        //SpielAusgabe.ausgebenLösung(spiel.konvertiereBuchstabeZuFarbe(spiel.zielArray));
        
        
        input.eingabeReihe = input.einlesen(einlesen);
        //input.eingabeReihe = pcinput.generate();

        output.ausgebenLösung(spiel.konvertiereBuchstabeZuFarbe(input.eingabeReihe));


        rueckmeldung.positionUndFarbeRichtig = rueckmeldung.vergleichenEingabeZiel(spiel.zielArray, input.eingabeReihe, this.aktuelleRunde);
        output.ausgebenRückmeldung(rueckmeldung.positionUndFarbeRichtig, this.aktuelleRunde);

        spiel.hinzufügenEingabeZuMatrix(input.eingabeReihe, this.aktuelleRunde);     
        output.reinigeEingabeaufforderung();

        if (rueckmeldung.positionUndFarbeRichtig[this.aktuelleRunde][0] == spiel.anzahlKugeln){    
            this.spielGehtWeiter = false;
        }
        //einlesen.close();
    }
}
