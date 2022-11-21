package SRC;

public class rueckmeldung {
    public int[] PosColourCorrect;
    public int[] Vergleich(String[] ZielArray, String[] EingabeArray){
        int i, j;
        int []PosColourCorrect = new int[2];
        for (i = 0; i<EingabeArray.length; i++){
            if (ZielArray[i].equalsIgnoreCase(EingabeArray[i])){
                // pos und farbe richtig = 1
                PosColourCorrect[0]++;
                break;
            }else{
                for (j = 0; j<ZielArray.length; j++){
                    System.out.println(ZielArray[j]+" : "+EingabeArray[i]);
                    if (ZielArray[j].equalsIgnoreCase(EingabeArray[i])){
                        PosColourCorrect[1]++;
                        // farbe richtig = 2
                        break;
                    }
                }
            }
        }
        System.out.println(PosColourCorrect[0]+" "+PosColourCorrect[1]);
        return PosColourCorrect;
    }
}
