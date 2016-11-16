import java.util.ArrayList;

public class AvailableCards{
    private ArrayList<Card> cards;

    public AvailableCards(){
        cards = new ArrayList<Card>();
        cards.add( new Hero( "Daniel", "paladin", 2, 1, 2 ) ); // nome, descricao, custo, ataque, vida
        cards.add( new Monster( "Wolf", "a wolf", 3, 2, 2 ) );
        cards.add( new AtkSpell( "Fireball", "causes fire damage to the enemy player", 5, new Spell(){
            @Override
            public void cast(Player player){
                System.out.println("dei 5 de dano no cara!");
                player.hit(5);
            }
        } ) ); //isso aqui é uma carta de spell com um metodo cast q vai fazer basicamente qualquer coisa
        cards.add( new Hero( "Legolas", "archer", 3, 3, 2 ) );
        cards.add( new Hero( "Jurek", "i aint the sharpest tool in the shed", 4, 5, 4 ) );
    }

    public ArrayList<Card> getCards(){return cards;}
    
}