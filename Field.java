import java.util.ArrayList;
public class Field{

    private int nCards;
    private int MAX;
    private ArrayList<Card> field;

    public Field(){
        MAX = 5;
        field = new ArrayList<Card>();
    }

    //@ requires nCards() != MAX();
    public void add(Card card){
        field.add(card);
    }

    public int nCards(){return nCards;}
    public int MAX(){return MAX;}
    
    //aqui vai ser o campo, o jogador joga cartas aqui
}