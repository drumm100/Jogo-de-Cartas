public class Hand{

  private byte ncards;
  private Arraylist<Card> cards;
 
  public Hand(Deck deck){
	  ncards = 3;
	  Deck c = deck.getInstance();
	  cards.add(c.getCard());
	  cards.add(c.getCard());
	  cards.add(c.getCard());
  }

  public getHand(){}

  public setHand(){}
 
}
