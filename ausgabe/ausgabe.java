package ausgabe;

public class ausgabe {
    public void PrintZielArray(String[] x){
        int i = 0;
        
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i]+" | ");
        }
        System.out.print("\n");

    }
}
