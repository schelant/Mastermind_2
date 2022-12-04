package SRC;

public class SpielAusgabe {
    // Variable für Anzahl der versuche X X X;
    public static void ausgebenLösung(String[] spiel){
        int i = 0;
        for (i = 0; i < spiel.length; i++) {
            System.out.print(spiel[i]+" | ");
        }
        System.out.print("\n\n");
    }

    public static void ausgebenSpielfeld(SpielObjekt spiel, Auswertung rueckmeldung){
        //System.out.println("Ich bin die FarbenMatrix");
        
        for (int i=0; i<spiel.anzahlRunden; i++){
            for (int j=0; j<spiel.anzahlKugeln; j++){
                System.out.print(spiel.farbenmatrix[i][j] + " ");
            }
            System.out.print("    ");
            ausgebenRückmeldung(rueckmeldung.positionUndFarbeRichtig, i);
        }
    }


    public static void ausgebenRückmeldung(int[][] anzahlRichtige, int runde){
        int i;
        System.out.print("\tTreffer: ");
        for (i=0; i<anzahlRichtige[runde][0]; i++){             // X für "Position und Farbe korrekt"; O für "Farbe korrekt"; in Anleitung schreiben oder so
            System.out.print("X");
        }
        System.out.print("\tFarbe richtig: ");
        for (i=0; i<anzahlRichtige[runde][1]; i++){
            System.out.print("X");
        }
        System.out.println();
    }

    public static void reinigeEingabeaufforderung(){
        try{
            final String os = System.getProperty("os.name");
            
            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }
            else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){
        }
    }

    public static void ausgebenSpielregeln () {
        System.out.print("Spielregeln Mastermind:\n");
        System.out.print("Ziel des Spiels: Errate die richtigen Farben und die richtige Reihenfolge der Kugeln.\n");
        System.out.print("Gib jeweils den ersten Buchstaben von vier Farben getrennt durch Leerzeichen ein.\n");
        System.out.print("Welche Farben es gibt, erfährst du in der unten folgenden Tabelle.\n");
        System.out.print("Die Rückmeldung an dich bedeutet: \n");
        System.out.print("Treffer: Jedes X steht für eine Kugel in der richtigen Farbe an der richtigen Position.  \n");
        System.out.print("Farbe richtig: Jedes X steht für eine Kugel in der richtigen Farbe an der falschen Position.\n");
        System.out.print("Viel Spaß beim Spielen! Du hast 12 Versuche.\n");
    }

    public static void ausgebenFarben () {

        System.out.print(" 1 r (red) \n");
        System.out.print(" 2 b (blue) \n");
        System.out.print(" 3 g (green) \n");
        System.out.print(" 4 a (aqua) \n");
        System.out.print(" 5 w (white) \n");
        System.out.print(" 6 y (yellow) \n");
        System.out.print(" 7 t (teal) \n");
        System.out.print(" 8 c (cyan) \n");
        System.out.print(" 9 p (purple) \n");
        System.out.print("10 l (lima) \n");

    }

    public static void ausgebenTrenner (int aktuellerVersuch) {
        System.out.print("\n\nAktueller Versuch "+aktuellerVersuch+": ----------------------\n");
    }
}
