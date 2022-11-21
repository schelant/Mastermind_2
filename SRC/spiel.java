package SRC;

import java.util.Scanner;

public class spiel {
    public boolean gameIsOn;

    public void Runde(){
        Scanner einlesen = new Scanner(System.in);

        spielobject x = new spielobject();
        x.ZielArray = x.Init(10, 4);

        ausgabe.PrintZielArray(x.ZielArray);

        int inputNumber = eingabe.einlesen(einlesen);

        String inputColour;
        inputColour = x.ConvToColour(inputNumber);

        System.out.println("Gewählte Farbe: " + inputColour);
        
        //einlesen.close();
    }
}
