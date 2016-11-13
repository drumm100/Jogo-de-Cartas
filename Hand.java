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
    nCards = 0;
	  cards.add(deck.getRandom());
    cards.add(deck.getRandom());
  }

  //@ requires nCards() != max();
  //@ ensures nCards() == \old( nCards()+1 );
  public void pick(){
    cards.add(deck.getRandom());
    nCards += 1;
  }

  public void play(int wichCard, Player against){
    Card card = cards.remove( wichCard-1 );
    if(card instanceof SpellCard){
      card.cast(against);
    }
    else
    field.add( card );
  }

  public Field field(){return field;}
  public byte nCards(){return nCards;}
  public byte max(){return max;}
  public Deck deck(){return deck;}

  @Override
  public String toString(){
    String string = "";
    for(Card card : cards){
      string += card + " ";
    }
    string += "\n -----------field------------ \n" + field + "--------------------\n";
    return string;
  }
}
