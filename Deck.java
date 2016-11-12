import java.util.ArrayList;
import java.util.Random;
public class Deck{
  private ArrayList<Card> cards;
  private Random random;

  public Deck(){
    cards = AvailableCards.getInstance().getCards();
    random = new Random();
  }

  //@ size() != 0;
  //@ ensures size() == \old(size() - 1);
  public Card getRandom(){
    int index = random.nextInt( cards.size()+1 );
    if(index <= 0) index = 1;

    return  cards.remove( index-1 );
  }

  public int size(){return cards.size();}

}