package SRC;

public class ausgabe {
    public static void PrintZielArray(String[] x){
        int i = 0;
        
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i]+" | ");
        }
        System.out.print("\n");

    }
}
