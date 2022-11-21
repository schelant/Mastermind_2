package SRC;

public class maingame
{
    public static void main (String[] args) 
    {
        spiel MainGame = new spiel();
        MainGame.gameIsOn = true;

        while (MainGame.gameIsOn == true){
            MainGame.Runde();
        }
    }
}

