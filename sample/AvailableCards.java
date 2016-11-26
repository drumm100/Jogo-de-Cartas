package sample;
import java.util.ArrayList;

public class AvailableCards{
    private ArrayList<Card> cards;

    public AvailableCards(){
        cards = new ArrayList<Card>();
        //cards.add( new Hero( "Daniel", "paladin", 2, 1, 2 ) ); // nome, custo, ataque, vida
	cards.add( new Monster("dem1", 5, 9, 14, "demonios/demonio1/demonio1.png" ) );
    cards.add( new Monster("dem2", 1, 3, 5, "demonios/demonio2/demonio2.png" ) );
    cards.add( new Monster("dem3", 3, 8, 6, "demonios/demonio3/demonio3.png" ) );
    cards.add( new Monster("dem4", 2, 5, 6, "demonios/demonio4/demonio4.png" ) );
    cards.add( new Monster("Alfio", 1, 1, 5000, "demonios/demonio5/demonio5.png") );
    cards.add( new Monster("dem6", 2, 3, 9, "demonios/demonio6/demonio6.png" ) );
    cards.add( new Monster("dem7", 5, 8, 13, "demonios/demonio7/demonio7.png" ) );
    
    cards.add( new Hero("her1", 1, 3, 8, "herois/heroi1/heroi1.png") );
    cards.add( new Hero("her3", 1, 1, 6, "herois/heroi3/heroi3.png") );
    cards.add( new Hero("her4", 2, 6, 7, "herois/heroi4/heroi4.png") );
    cards.add( new Hero("her7", 2, 6, 6, "herois/heroi7/heroi7.png") );
    cards.add( new Hero("her9", 3, 9, 6, "herois/heroi9/heroi9.png") );
    cards.add( new Hero("her12", 4, 9, 14, "herois/heroi12/heroi12.png") );
    cards.add( new Hero("her14", 5, 10, 15, "herois/heroi14/heroi14.png") );
    }

    public ArrayList<Card> getCards(){return cards;}
    
}
