package sample;
import java.util.ArrayList;
public class Field{
    //@ invariant nCards() <= MAX();

    private int nCards;
    private int MAX;
    private ArrayList<Card> cards;

    public Field(){
        MAX = 4;
        cards = new ArrayList<Card>();
    }

    //@ requires nCards() < MAX();
    //@ ensures nCards() == \old(nCards() + 1);
    public void add(Card card){
        cards.add(card);
        nCards+=1;
    }

    public int nCards(){return nCards;}
    public int MAX(){return MAX;}

    //@ requires card <= nCards();
    public Card card(int card){
        return cards.get(card-1);
    }

    public boolean hasCard(int card){
        return card <= cards.size();
    }

    //@ requires hasCard(card);
    //@ ensures nCards() == \old(nCards()-1);
    public Card remove(int card){
        return cards.remove(card-1);
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