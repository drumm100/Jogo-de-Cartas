package sample;
import java.util.*;

public class Hand{

  private byte max;
  private List<Card> cards;
  
  public Hand(){
	  max = 3;
    cards = new ArrayList<Card>();
  }

  //@ requires size() != max();
  //@ ensures size() == \old( size()+1 );
  public void add(Card card){
    cards.add(card);
  }
  //@ ensures size() == \old(size()-1);
  public Card remove(int card){
    return cards.remove( card );
  }

  public boolean remove(Card card){
    return cards.remove( card );
  }

  public byte size(){return (byte)cards.size();}
  public byte max(){return max;}

  public Card card(int card){
    return cards.get(card);
  }
  public boolean hasCard(int card){
    return card < cards.size();
  }
  @Override
  public String toString(){
    String string = "";
    for(Card card : cards){
      string += card + " ";
    }
    return string;
  }
}
