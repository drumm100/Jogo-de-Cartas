import java.util.ArrayList;
import java.util.Random;

public class Deck{

  private static Deck deck = new Deck();
  private ArrayList<Card> cards;
  private Random random;

  private Deck(){
    cards = new ArrayList<Card>();
    random = new Random();
    cards.add( new Hero( "Daniel", "paladino", 2, 1, 2 ) ); // nome, descricao, custo, ataque, vida
  }
  public static Deck getInstance(){return deck;}

  //@ ensures size() == \old(size() - 1); 
  public Card getRandom(){
    return cards.remove(random.nextInt(cards.size()));
  }

  public int size(){return cards.size();}

}