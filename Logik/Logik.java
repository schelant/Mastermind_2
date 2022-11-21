package Logik;

public class Logik {
    private int Position;
    private String ColourCorrect,PositionCorrect;

    public void Set(int Position, String PositionCorrect, String ColourCorrect){
        this.Position = Position;
        this.ColourCorrect = ColourCorrect;
        this.PositionCorrect = PositionCorrect;
    }
    
    public int GetPosition(){
        return Position;
    }

    public String GetColourCorrect(){
        return ColourCorrect;
    }

    public String GetPositionCorrect(){
        return PositionCorrect;
    }
}
