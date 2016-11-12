import java.util.ArrayList;

public class AvailableCards{
    private static AvailableCards instance = new AvailableCards();
    private ArrayList<Card> cards;
    private AvailableCards(){
        cards = new ArrayList();

        cards.add( new Hero( "Daniel", "paladin", 2, 1, 2 ) ); // nome, descricao, custo, ataque, vida
        cards.add( new Monster( "Wolf", "a wolf", 3, 2, 1 ) );
        cards.add( new AtkSpell( "Fireball", "causes fire damage to the enemy player", 5, new Spell(){
        @Override
        public void cast(Player player){
            System.out.println("dei 5 de dano no cara!");
            player.hit(5);
        }
        } ) ); //isso aqui é uma carta de spell com um metodo cast q vai fazer basicamente qualquer coisa
        
    }
    public static AvailableCards getInstance(){return instance;}
    public ArrayList<Card> getCards(){return cards;}
    
}