package mainT;

import Spielobject.spielobject;
import java.util.Scanner;
import ausgabe.ausgabe;
import eingabe.eingabe;

public class mainT
{
    public static void main (String[] args) 
    {
        int anzahlFarben = 10;       // aus config lesen statt deklarieren
        int anzahlKugeln = 4;       // wie "breit" das spielfeld ist, name vermutlich ungünstig

        Scanner einlesen = new Scanner(System.in);

        spielobject x = new spielobject();
        x.ZielArray = x.Init(anzahlFarben, anzahlKugeln);

        ausgabe.PrintZielArray(x.ZielArray);

        int inputNumber = eingabe.einlesen(einlesen);

        String inputColour;
        inputColour = x.ConvToColour(inputNumber);

        System.out.println("Gewählte Farbe: " + inputColour);
        
        einlesen.close();
    }
}

