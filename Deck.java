import java.util.*;
public class Deck{
  private static Deck deck = new Deck();
  private List<Card> cards;

  private Deck(){
    cards = null;
  }

  public static Deck getInstance(){return deck;}
  //add cards
}