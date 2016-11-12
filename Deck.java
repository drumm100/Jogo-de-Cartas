import java.util.*;
public class Deck{
  private static Deck deck = new Deck();
  private List<Card> cards;
  private Deck(){
    cards = new ArrayList<Card>();
    cards.add( new Hero( "Daniel", "paladino", 2, 1, 2 ) ); // nome, descricao, custo, ataque, vida
  }
  public static Deck getInstance(){return deck;}

}