package mainT;

import Spielobject.spielobject;

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
        System.out.println("hello");
        spielobject x = new spielobject();
        x.ZielArray = x.Init();

        System.out.print(x.ZielArray[0]);
        System.out.print(x.ZielArray[1]);
    }
}

