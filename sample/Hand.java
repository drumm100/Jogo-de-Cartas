package sample;
import java.util.*;

public class Hand{

  private byte nCards;
  private byte max;
  private List<Card> cards;
 
  public Hand(){
	  max = 3;
    cards = new ArrayList<Card>();
    nCards = 0;
  }

  //@ requires nCards() != max();
  //@ ensures nCards() == \old( nCards()+1 );
  public void add(Card card){
    cards.add(card);
    nCards += 1;
  }

  public byte nCards(){return nCards;}
  public byte max(){return max;}

  public Card card(int card){
    return cards.get(card-1);
  }
  public boolean hasCard(int card){
    return card <= cards.size();
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
