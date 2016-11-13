import java.util.*;
public class Hand{

  private Deck deck;
  private Field field;
  private byte nCards;
  private byte max;
  private List<Card> cards;
 
  public Hand(){
	  max = 3;
	  deck = new Deck();
    field = new Field();
    cards = new ArrayList<Card>();
	  cards.add(deck.getRandom());
    cards.add(deck.getRandom());
    //cards.add(deck.getRandom());
    nCards = 3;
  }

  //@ requires nCards() != max();
  //@ ensures nCards() == \old( nCards()+1 );
  public void pick(){
    cards.add(deck.getRandom());
    nCards += 1;
  }

  public void play(int card){
    card -= 1;
    field.add( cards.remove(card) );
  }

  public byte nCards(){return nCards;}
  public byte max(){return max;}

  @Override
  public String toString(){
    String string = "";
    for(Card card : cards){
      string += card + " ";
    }
    return string;
  }

}
