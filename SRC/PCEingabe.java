package SRC;

class PCEingabe extends SpielEingabe{
    public String[] generate(){
        String s = "r r r r";
        super.eingabeReihe = s.split(" ");
        return super.eingabeReihe;
    }
}