package SRC;

public class maingame
{
    public static void main (String[] args) 
    {
        spiel MainGame = new spiel();
        MainGame.gameIsOn = true;

        spielobject x = new spielobject();
        rueckmeldung rueck = new rueckmeldung();

        x.ZielArray = x.Init(10, 4);

        int Zeile = 1;
        while (MainGame.gameIsOn == true){
            MainGame.Runde(x, rueck,Zeile);
            Zeile++;

            if (Zeile == 12 ){

                
            }


        }
    }
}

