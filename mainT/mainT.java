// 14.11. 22:46 THIS IS ONLY A TEST 2
// Klaus 15:34 Simon 15:40

package mainT;

import Spielobject.spielobject;
import ausgabe.ausgabe;

// abstract class Spieler{
//     abstract void CreateMap();
//     abstract void SetShip();
//     abstract void ShowMaps();
//     abstract void SeeAndFire();
// }

public class mainT
{
    public static void main (String[] args) 
    {
        int anzahlFarben = 10;       // aus config lesen statt deklarieren
        int anzahlKugeln = 4;       // wie "breit" das spielfeld ist, name vermutlich ungünstig

        spielobject x = new spielobject();
        x.ZielArray = x.Init(anzahlFarben, anzahlKugeln);

        ausgabe.PrintZielArray(x.ZielArray);
    
    }
}

