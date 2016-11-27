package sample;
import java.util.ArrayList;
public class Field{
    //@ invariant size() <= MAX();

    private int MAX;
    private ArrayList<Card> cards;
    private Card selected;

    public Field(){
        MAX = 5;
        cards = new ArrayList<Card>();
        selected = null;
    }

    public void rstAtk(){
        for(Card card : cards)
            ((CharacterCard)card).setAtk(false);
    }
    //@ requires size() < MAX();
    //@ ensures size() == \old(size() + 1);
    public void add(Card card){
        cards.add(card);
    }

    //@ requires card <= size();
    public Card card(int card){
        return cards.get(card);
    }
    public boolean hasCard(int card){
        return card < cards.size();
    }

    //@ requires hasCard(card);
    //@ ensures size() == \old(size()-1);
    public Card remove(int card){
        return cards.remove(card);
    }
    //@ ensures size() == \old(size()-1);
    public boolean remove(Card card){
        return cards.remove(card);
    }

    @Override
    public String toString(){
        String string = "";
        for(Card card : cards){
            string += card;
        }
        return string;
    }

    //getters
    public Card getSelected(){return selected;}
    public int size(){return cards.size();}
    public int MAX(){return MAX;}

    //set

    //@ requires hasCard(i);
    public void setSelected(int i){ 
        selected = cards.get(i); 
    }
}