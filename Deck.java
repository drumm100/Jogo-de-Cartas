import java.util.ArrayList;
import java.util.Random;
public class Deck{
  private ArrayList<Card> cards;
  private Random random;

  public Deck(){
    cards = AvailableCards.getInstance().getCards();
    random = new Random();
  }

  //@ ensures size() == \old(size() - 1); 
  public Card getRandom(){
    return cards.remove(random.nextInt(cards.size()));
  }

  public int size(){return cards.size();}

}