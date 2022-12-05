package SRC;

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

        spiel.zielArray = spiel.initZielArray();
        rueckmeldung.initPositionsmatrix(spiel);

        while (MainGame.spielGehtWeiter == true){
            MainGame.rundeSpielen(spiel, rueckmeldung);
            MainGame.aktuelleRunde++;
            MainGame.kontroliereSpielende();
        }
    }
}

