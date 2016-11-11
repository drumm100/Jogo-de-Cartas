import java.util.*;
public class Cards{
    private Cards instance = new Cards();
    
    private List<Card> mind;
    private List<Card> power;
    private List<Card> reality;
    private List<Card> soul;
    private List<Card> space;
    private List<Card> time;
    private List<Card> copstein;
    
    private Cards(){
        mind = new ArrayList<Card>();
        power = new ArrayList<Card>();
        reality = new ArrayList<Card>();
        soul = new ArrayList<Card>();
        space = new ArrayList<Card>();
        time = new ArrayList<Card>();
        copstein = new ArrayList<Card>();
    }
    
    public Cards getInstance(){ return instance; }


}