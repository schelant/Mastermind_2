package SRC;

//import java.nio.file.FileAlreadyExistsException;

public class Mastermind
{
    public static void main (String[] args) 
    {   
        //new Gui();

        //Gui Screen = new Gui();
        // Maingame ist ein Object von der Klasse SpielAktion
        // Die Funktionen von Maingame sind die Methoden

        SpielAktion MainGame = new SpielAktion();
        MainGame.spielGehtWeiter = true;

        SpielObjekt spiel = new SpielObjekt(10,4,12);
        Auswertung rueckmeldung = new Auswertung();
        SpielEingabe input = new SpielEingabe();
        SpielAusgabe output = new SpielAusgabe();

        spiel.zielArray = spiel.initZielArray();
        rueckmeldung.initPositionsmatrix(spiel);


        output.ausgebenSpielregeln();
        System.out.println("Farben, aus denen du wählen kannst:");
        output.ausgebenFarben();

        while (MainGame.spielGehtWeiter == true){
            MainGame.rundeSpielen(spiel, rueckmeldung, input, output);
            MainGame.aktuelleRunde++;
            MainGame.kontrolliereSpielende();
        }
        if (MainGame.spielGehtWeiter == false){
            System.out.println("Leider verloren! Die richtige Lösung ist:");
            output.ausgebenLösung(spiel.zielArray);
        }
    }
}

