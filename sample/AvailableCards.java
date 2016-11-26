package sample;
import java.util.ArrayList;

public class AvailableCards{
    private ArrayList<Card> cards;

    public AvailableCards(){
        cards = new ArrayList<Card>();
        //cards.add( new Hero( "Daniel", "paladin", 2, 1, 2 ) ); // nome, custo, ataque, vida
	cards.add( new Monster("Alfio", 1, 1, 500000, "demonios/demonio5/demonio5.png") );
    cards.add( new Monster("Alfio", 1, 1, 500000, "demonios/demonio5/demonio5.png") );
    cards.add( new Monster("Alfio", 1, 1, 500000, "demonios/demonio5/demonio5.png") );
    cards.add( new Monster("Alfio", 1, 1, 500000, "demonios/demonio5/demonio5.png") );
    cards.add( new Monster("Alfio", 1, 1, 500000, "demonios/demonio5/demonio5.png") );
    cards.add( new Monster("Alfio", 1, 1, 500000, "demonios/demonio5/demonio5.png") );
    cards.add( new Monster("Alfio", 1, 1, 500000, "demonios/demonio5/demonio5.png") );
    cards.add( new Monster("Alfio", 1, 1, 500000, "demonios/demonio5/demonio5.png") );
    
    }

    public ArrayList<Card> getCards(){return cards;}
    
}
