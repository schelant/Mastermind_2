package SRC;

public class rueckmeldung {
    public int[] PosColourCorrect;
    public int[][] PosNumberCorrect;

    public void Init(spielobject x){
        int [][]PosNumberCorrect = new int[x.anzahlRunden][2];
        this.PosNumberCorrect = PosNumberCorrect;
        // hier herrscht ein riesen chaos, ich wusste es nicht besser
        // außerdem muss PosNumberCorrect zwei dimensional, die erste dimension ist dann die runde, sonst wird geht keine individuelle anzeige pro runde
        for (int i=0; i<x.anzahlRunden; i++){   // initialisierung?!
            this.PosNumberCorrect[i][0] = 0;
            this.PosNumberCorrect[i][1] = 0;
        }
    }

    // es gibt unter bestimmten bedingungen noch falsche bewertungen der Eingabe!! (bsp Zielarray A T T A, Eingabe A A T T, ergebnis vier mal falsche position, richtige farbe)
    // immer wenn eine farbe mehrfach auftaucht läuft was schief glaub ich
    // aber hatte auch fälle mikt vier verschiedenen farben wo er mehr richtige farben (falsche position) angibt, als richtig wäre
    public int[][] Vergleich(String[] ZielArray, String[] EingabeArray, int Rundenzahl){
        int i, j;
        int []PosColourCorrect = new int[ZielArray.length];
        //int []PosNumberCorrect = new int[2];
        
        for (i = 0; i<EingabeArray.length; i++){
            if (ZielArray[i].equalsIgnoreCase(EingabeArray[i])){
                // pos und farbe richtig = 1
                PosColourCorrect[i] = 1;
            }
        }

        for (i = 0; i<EingabeArray.length; i++){
            for (j = 0; j<ZielArray.length; j++){
                //System.out.println(ZielArray[j]+" : "+EingabeArray[i]);
                if (ZielArray[j].equalsIgnoreCase(EingabeArray[i]) && (PosColourCorrect[j] != 1)){
                    PosColourCorrect[i] = 2;
                    // farbe richtig = 2
                    break;
                }
            }
        }

        for (i = 0;i<PosColourCorrect.length;i++){
            if (PosColourCorrect[i] == 1){
                this.PosNumberCorrect[Rundenzahl][0]++;
            }
            else if (PosColourCorrect[i] == 2){
                this.PosNumberCorrect[Rundenzahl][1]++;
            }
        }
        return this.PosNumberCorrect;
    }
}
