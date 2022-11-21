package SRC;

import java.util.Scanner;

public class spiel {
    public boolean gameIsOn;

    public void Runde(){
        Scanner einlesen = new Scanner(System.in);

        spielobject x = new spielobject();
        eingabe input = new eingabe();


        x.ZielArray = x.Init(10, 4);

        ausgabe.PrintZielArray(x.GetColourFromChar(x.ZielArray));

        input.row = input.einlesen(einlesen);

        ausgabe.PrintZielArray(x.GetColourFromChar(input.row));
        
        //einlesen.close();
    }
}
