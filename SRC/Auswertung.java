package SRC;

public class Auswertung {
    public int[][] positionUndFarbeRichtig;

    public void initPositionsmatrix(SpielObjekt x){
        int [][]posNumberCorrect = new int[x.anzahlRunden][2];
        this.positionUndFarbeRichtig = posNumberCorrect;
        // hier herrscht ein riesen chaos, ich wusste es nicht besser
        for (int i=0; i<x.anzahlRunden; i++){   // initialisierung?!
            this.positionUndFarbeRichtig[i][0] = 0;
            this.positionUndFarbeRichtig[i][1] = 0;
        }
    }

    public int[][] vergleichenEingabeZiel(String[] zielArray, String[] eingabeArray, int rundenzahl){
        int i, j;
        int []allesRichtig = new int[zielArray.length];
        int []farbeRichtig = new int[zielArray.length];
        int []untersucht = new int[zielArray.length];
        //int []PosNumberCorrect = new int[2];
        
        for (i = 0; i<eingabeArray.length; i++){
            if (zielArray[i].equalsIgnoreCase(eingabeArray[i])){
                // pos und farbe richtig = 1
                allesRichtig[i] = 1;
                untersucht[i] = 1;
            }
        }

        for (i = 0; i<eingabeArray.length; i++){
            for (j = 0; j<zielArray.length; j++){
                //System.out.println(ZielArray[j]+" : "+EingabeArray[i]);
                if(untersucht[j] == 0){
                    if (zielArray[j].equalsIgnoreCase(eingabeArray[i])){
                        farbeRichtig[i] = 1;
                        untersucht[j] = 1;
                        // farbe richtig = 2
                        break;
                    }
                }
                
            }
        }

        for (i = 0;i<zielArray.length;i++){
            if (allesRichtig[i] == 1){
                this.positionUndFarbeRichtig[rundenzahl][0]++;
            }
            else if (farbeRichtig[i] == 1){
                this.positionUndFarbeRichtig[rundenzahl][1]++;
            }
        }
        return this.positionUndFarbeRichtig;
    }
}
