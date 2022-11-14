package Spielobject;
import java.lang.Math;

public class spielobject {
    public String [] [] Farbenmatrix = new String [4] [10];
    public String [] ZielArray = new String [4];

    public String[] Init()
    {
        String [] ZielArray = new String [4];
        double zufallDouble = Math.random();
        int zufall = (int)(zufallDouble * 6);

        ZielArray[0] = ConvToColour(zufall);
        
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
            default:
                return "err";
        }
    }
}
