import java.util.ArrayList;
public class Field{
    //@ invariant nCards() <= MAX();

    private int nCards;
    private int MAX;
    private ArrayList<Card> cards;

    public Field(){
        MAX = 5;
        cards = new ArrayList<Card>();
    }

    //@ requires nCards() != MAX();
    public void add(Card card){
        cards.add(card);
        nCards+=1;
    }

    public int nCards(){return nCards;}
    public int MAX(){return MAX;}

    //@ requires card <= nCards()
    public Card card(int card){
        return cards.get(card-1);
    }

    public void remove(int card){
        cards.remove(card-1);
    }

    @Override
    public String toString(){
        String string = "";
        for(Card card : cards){
            string += card;
        }
        return string;
    }
}