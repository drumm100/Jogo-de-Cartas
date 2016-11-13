import java.util.ArrayList;
public class Field{
    //@ invariant nCards() <= MAX();

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

    //@ requires card <= nCards()
    public Card card(int card){
        return field.get(card-1);
    }

    @Override
    public String toString(){
        String string = "";
        for(Card card : field){
            string += card;
        }
        return string;
    }
}