package SRC;
import java.util.Random;        // Random Generator

public class spielobject {
    public String [] [] Farbenmatrix;
    public String [] ZielArray;
    public int anzahlFarben;       // aus config lesen statt deklarieren
    public int anzahlKugeln;       // wie "breit" das spielfeld ist, name vermutlich ungünstig
    
    Random random = new Random();   // ist das automatisch private? ja

    public String[] Init(int anzahlFarben, int anzahlKugeln)
    {
        this.anzahlFarben = anzahlFarben;
        this.anzahlKugeln = anzahlKugeln;
        
        String [] ZielArray = new String [anzahlFarben];
        int zufall = 0; // deklariert man variablen = 0 in java?
        // alternativ int zufall2;

        for (int i = 0; i < this.anzahlKugeln; i++) {
            zufall = random.nextInt(anzahlFarben);
            ZielArray[i] = ConvToColour(zufall);
        }

        return ZielArray;
    }

    public String ConvToColour(int x)
    {
        switch(x){
            case 0:
                return "Red";
            case 1:
                return "Blue";
            case 2:
                return "Green";
            case 3:
                return "Aqua";
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
