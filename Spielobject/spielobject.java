package Spielobject;
import java.lang.Math;
import java.util.Random;        // Random Generator

public class spielobject {
    public String [] [] Farbenmatrix = new String [4] [10];
    public String [] ZielArray = new String [4];
    Random random = new Random();   // ist das automatisch private?

    public String[] Init(int anzahlFarben, int anzahlKugeln)
    {
        String [] ZielArray = new String [anzahlFarben];
        int zufall = 0; // deklariert man variablen = 0 in java?

        for (int i = 0; i < anzahlKugeln; i++) {
            zufall = random.nextInt(anzahlFarben);
            ZielArray[i] = ConvToColour(zufall);
        }

        return ZielArray;
    }

    private String ConvToColour(int x)
    {
        switch(x){
            case 0:
                return "Red";
            case 1:
                return "Blue";
            case 2:
                return "Green";
            case 3:
                return "Black";
            case 4:
                return "White";
            case 5:
                return "Yellow";
            case 6:
                return "Teal";
            case 7:
                return "Cyan";
            case 8:
                return "Purple";
            case 9:
                return "Lime";
            default:
                return "err";
        }
    }
}
