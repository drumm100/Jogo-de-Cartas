import java.util.*;
public class Hand{

  private Deck deck;
  private byte nCards;
  private byte max;
  private List<Card> cards;
 
  public Hand(Deck deck){
	  max = 3;
	  deck = deck;
    cards = new ArrayList<Card>();
	  cards.add(deck.getRandom());
    cards.add(deck.getRandom());
    cards.add(deck.getRandom());
    nCards = 3;
  }

  //@ requires nCards() != max();
  //@ ensures nCards() == \old( nCards()+1 );
  public void pick(){
    cards.add(deck.getRandom());
    nCards += 1;
  }

  public Card play(int card){
    card -= 1;
    return cards.remove(card);
  }

  public byte nCards(){return nCards;}
  public byte max(){return max;}

}
