import java.util.*;
public class Hand{

  private Deck deck;
  private byte nCards;
  private byte max;
  private List<Card> cards;
 
  public Hand(Deck deck){
	  max = 3;
	  deck = Deck.getInstance();
	  pick();
    pick();
    pick();
    nCards = 3;
  }

  //@ requires nCards() != max();
  //@ ensures nCards() == \old( nCards()+1 );
  public void pick(){
    cards.add(deck.getRandom());
    nCards += 1;
  }

  public byte nCards(){return nCards;}
  public byte max(){return max;}

}
