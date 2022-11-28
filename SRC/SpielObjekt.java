package SRC;
import java.util.Random;        // Random Generator

public class SpielObjekt {
    public String [] [] farbenmatrix;
    public String [] zielArray;
    public int anzahlFarben;       // aus config lesen statt deklarieren
    public int anzahlKugeln;       // wie "breit" das spielfeld ist, name vermutlich ungünstig
    public int anzahlRunden;        // wie viele runden gespielt werden
    
    Random random = new Random();
       

    public String[] Init(int anzahlFarben, int anzahlKugeln, int anzahlRunden)
    {
        this.anzahlFarben = anzahlFarben;
        this.anzahlKugeln = anzahlKugeln;
        this.anzahlRunden = anzahlRunden;
        this.farbenmatrix = new String [anzahlRunden][anzahlKugeln]; 

        String [] ZielArray = new String [anzahlKugeln];
        
        int zufall = 0; 
        // alternativ int zufall2;

        for (int i = 0; i < anzahlKugeln; i++) {
            zufall = random.nextInt(anzahlFarben);
            ZielArray[i] = ConvToColour(zufall+1);
        }

        for (int i=0; i<anzahlRunden; i++){
            for (int j=0; j<anzahlKugeln; j++){
                this.farbenmatrix[i][j] = "-";
            }
            
        }
        return ZielArray;
    }

    public void AddFarbenMatrix(String[] input, int runde){
        int i;
        for (i = 0; i<input.length; i++) {
            this.farbenmatrix[runde][i] = input[i] ;
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
                    Colour = "Aqua";        // das q wird irgendwie nicht angezeigt
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
