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

        String [] ZielArray = new String [anzahlKugeln];
        int zufall = 0; // deklariert man variablen = 0 in java?
        // alternativ int zufall2;

        for (int i = 0; i < anzahlKugeln; i++) {
            zufall = random.nextInt(anzahlFarben);
            ZielArray[i] = ConvToColour(zufall+1);
        }

        return ZielArray;
    }

    public void AddFarbenMatrix(String[] input, int runde){
        int i;
        System.out.print(input.length);
        for (i = 0; i<input.length; i++) {
            //Farbenmatrix[runde][i] = input[i]; HIER FUNKTIONIERT WAS NICHT
        }
    }

    public String ConvToColour(int zufall){
        switch(zufall){
            case 1:
                return "r";
            case 2:
                return "b";
            case 3:
                return "g";
            case 4:
                return "a";
            case 5:
                return "w";
            case 6:
                return "y";
            case 7:
                return "t";
            case 8:
                return "c";
            case 9:
                return "p";
            case 10:
                return "l";
            default:
                return "err";
        }
    }

    public String[] GetColourFromChar(String[] x){
        int i;
        String[] sReturn = new String[x.length];
        String Colour;
        for (i = 0; i<x.length; i++) {
            switch(x[i]){
                case "r":
                    Colour = "Red";
                    break;
                case "b":
                    Colour = "Blue";
                    break;
                case "g":
                    Colour = "Green";
                    break;
                case "a":
                    Colour = "Aqua";
                    break;
                case "w":
                    Colour = "White";
                    break;
                case "y":
                    Colour = "Yellow";
                    break;
                case "t":
                    Colour = "Teal";
                    break;
                case "c":
                    Colour = "Cyan";
                    break;
                case "p":
                    Colour = "Purple";
                    break;
                case "l":
                    Colour = "Lime";
                    break;
                default:
                    Colour = "err";
                    break;
            }
            sReturn[i] = Colour;
        }
        return sReturn;
    }
}
