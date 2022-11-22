package SRC;

public class rueckmeldung {
    public int[] PosColourCorrect;
    public int[] PosNumberCorrect;

    public void Init(){
        int []PosNumberCorrect = new int[2];

        // hier herrscht ein riesen chaos, ich wusste es nicht besser
        // außerdem muss PosNumberCorrect zwei dimensional, die erste dimension ist dann die runde, sonst wird geht keine individuelle anzeige pro runde
        PosNumberCorrect[0] = 0;
        PosNumberCorrect[1] = 0;
        this.PosNumberCorrect = PosNumberCorrect;
    }

    public int[] Vergleich(String[] ZielArray, String[] EingabeArray){
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
                PosNumberCorrect[0]++;
            }
            else if (PosColourCorrect[i] == 2){
                PosNumberCorrect[1]++;
            }
        }
        return PosNumberCorrect;
    }
}
