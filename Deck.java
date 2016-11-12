import java.util.ArrayList;
import java.util.Random;

public class Deck{
  private ArrayList<Card> cards;
  private Random random;

  public Deck(){
    cards = new ArrayList<Card>();
    random = new Random();
    cards.add( new Hero( "Daniel", "paladin", 2, 1, 2 ) ); // nome, descricao, custo, ataque, vida
    cards.add( new Monster( "Wolf", "a wolf", 3, 2, 1 ) );
    cards.add( new AtkSpell( "Fireball", "causes fire damage to the enemy player", 5, new Spell(){
      @Override
      public void cast(){
        System.out.println("dei 5 de dano no cara!");
        //player.setHP(player.getHP()-5);
      }
    } ) );
  }

  //@ ensures size() == \old(size() - 1); 
  public Card getRandom(){
    return cards.remove(random.nextInt(cards.size()));
  }

  public int size(){return cards.size();}

}