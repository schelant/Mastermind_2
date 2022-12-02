package SRC;

public class Mastermind
{
    public static void main (String[] args) 
    {   
        new Gui();
        //Gui Screen = new Gui();
        SpielAktion MainGame = new SpielAktion();
        MainGame.spielGehtWeiter = true;

        SpielObjekt x = new SpielObjekt();
        Auswertung rueck = new Auswertung();

        x.zielArray = x.initMastermind(10, 4, 12);
        rueck.initPositionsmatrix(x);
        
        SpielAusgabe.ausgebenSpielregeln(); //einmal am Anfang zeigen
        System.out.print("Wähle aus den folgenden Farben:\n");
        SpielAusgabe.ausgebenFarben();//einmal am Anfang zeigen
        

        while (MainGame.spielGehtWeiter == true){
            MainGame.Runde(x, rueck);
            MainGame.aktuelleRunde++;
        }
    }
}

