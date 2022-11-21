package SRC;

public class ausgabe {
    // Variable für Anzahl der versuche XXX;
    public static void PrintZielArray(String[] x){
        int i = 0;
        
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i]+" | ");
        }
        System.out.print("\n");

    }
    public static void PrintFeedback(int[] x){
        System.out.println("Position und Farbe Korrekt: "+x[0]);
        System.out.println("Position und Farbe Korrekt: "+x[1]+"\n\n");
    }

    public static void printSpielregeln () {
        System.out.print("Spielregeln Mastermind \n");
        System.out.print("Ziel des Spiels: Errate die richtigen Farben und die richtige Reihenfolge der Kugeln.\n");
        System.out.print("Wähle die Anzahl der Farben und die Anzahl der Kugeln, die du setzen möchtest. \n");
        System.out.print("Belege die freien Plätze mit Kugeln. Dann bekommst du eine Rückmeldung.\n");
        System.out.print("Die erste Zahl gibt dir die Anzahl an gesetzten Kugeln mit richtiger Position und Farbe an.\n");
        System.out.print("Die zweite Zahl gibt dir die Anzahl an gesetzten Kugeln mit der richtigen Farbe, aber an falscher Position, an.\n");
        System.out.print("Viel Spaß beim Spielen! Du hast XXX Versuche.\n");
    }

    public static void printTabelleFarben () {

        System.out.print(" 1 r (red) \n");
        System.out.print(" 2 b (blue) \n");
        System.out.print(" 3 g (green) \n");
        System.out.print(" 4 a (aqua) \n");
        System.out.print(" 5 w (white) \n");
        System.out.print(" 6 y (yellow) \n");
        System.out.print(" 7 t (teal) \n");
        System.out.print(" 8 c (cyan) \n");
        System.out.print(" 9 p (purple) \n");
        System.out.print("10 l (lima) \n");

    }

}
