package SRC;

public class Auswertung {
    public int[][] positionUndFarbeRichtig;

    public void initPositionsmatrix(SpielObjekt x){
        int [][]PosNumberCorrect = new int[x.anzahlRunden][2];
        this.positionUndFarbeRichtig = PosNumberCorrect;
        // hier herrscht ein riesen chaos, ich wusste es nicht besser
        for (int i=0; i<x.anzahlRunden; i++){   // initialisierung?!
            this.positionUndFarbeRichtig[i][0] = 0;
            this.positionUndFarbeRichtig[i][1] = 0;
        }
    }

    public int[][] vergleichenEingabeZiel(String[] ZielArray, String[] EingabeArray, int Rundenzahl){
        int i, j;
        int []allesRichtig = new int[ZielArray.length];
        int []farbeRichtig = new int[ZielArray.length];
        int []untersucht = new int[ZielArray.length];
        //int []PosNumberCorrect = new int[2];
        
        for (i = 0; i<EingabeArray.length; i++){
            if (ZielArray[i].equalsIgnoreCase(EingabeArray[i])){
                // pos und farbe richtig = 1
                allesRichtig[i] = 1;
                untersucht[i] = 1;
            }
        }

        for (i = 0; i<EingabeArray.length; i++){
            for (j = 0; j<ZielArray.length; j++){
                //System.out.println(ZielArray[j]+" : "+EingabeArray[i]);
                if(untersucht[j] == 0){
                    if (ZielArray[j].equalsIgnoreCase(EingabeArray[i])){
                        farbeRichtig[i] = 1;
                        untersucht[j] = 1;
                        // farbe richtig = 2
                        break;
                    }
                }
                
            }
        }

        for (i = 0;i<ZielArray.length;i++){
            if (allesRichtig[i] == 1){
                this.positionUndFarbeRichtig[Rundenzahl][0]++;
            }
            else if (farbeRichtig[i] == 1){
                this.positionUndFarbeRichtig[Rundenzahl][1]++;
            }
        }
        return this.positionUndFarbeRichtig;
    }
}
