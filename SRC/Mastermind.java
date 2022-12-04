package SRC;

public class Mastermind
{
    public static void main (String[] args) 
    {   
        new Gui();
        //Gui Screen = new Gui();
        SpielAktion MainGame = new SpielAktion();
        MainGame.spielGehtWeiter = true;

        SpielObjekt spiel = new SpielObjekt();
        Auswertung rueckmeldung = new Auswertung();

        spiel.zielArray = spiel.initMastermind(10, 4, 12);
        rueckmeldung.initPositionsmatrix(spiel);
        
        SpielAusgabe.ausgebenSpielregeln(); //einmal am Anfang zeigen
        System.out.print("Wähle aus den folgenden Farben:\n");
        SpielAusgabe.ausgebenFarben();//einmal am Anfang zeigen
        

        while (MainGame.spielGehtWeiter == true){
            MainGame.rundeSpielen(spiel, rueckmeldung);
            MainGame.aktuelleRunde++;
        }
    }
}

