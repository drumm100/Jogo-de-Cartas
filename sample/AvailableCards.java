package sample;
import java.util.ArrayList;

public class AvailableCards{
    private ArrayList<Card> cards;

    public AvailableCards(){
        cards = new ArrayList<Card>();
        //cards.add( new Hero( "Daniel", "paladin", 2, 1, 2 ) ); // nome, custo, ataque, vida
	cards.add( new Monster("demonio1", 5, 9, 14, "demonios/demonio1/demonio1_14.png" ) );
    cards.add( new Monster("demonio2", 1, 3, 5, "demonios/demonio2/demonio2_5.png" ) );
    cards.add( new Monster("demonio3", 3, 8, 6, "demonios/demonio3/demonio3_6.png" ) );
    cards.add( new Monster("demonio4", 2, 5, 6, "demonios/demonio4/demonio4_6.png" ) );
    cards.add( new Monster("demonio5", 1, 1, 1, "demonios/demonio5/demonio5_1.png") );
    cards.add( new Monster("demonio6", 2, 3, 9, "demonios/demonio6/demonio6_9.png" ) );
    cards.add( new Monster("demonio7", 5, 8, 13, "demonios/demonio7/demonio7_13.png" ) );
    
    cards.add( new Hero("heroi1", 1, 3, 8, "herois/heroi1/heroi1_8.png") );
    cards.add( new Hero("heroi3", 1, 1, 6, "herois/heroi3/heroi3_6.png") );
    cards.add( new Hero("heroi4", 2, 6, 7, "herois/heroi4/heroi4_7.png") );
    cards.add( new Hero("heroi7", 2, 6, 6, "herois/heroi7/heroi7_6.png") );
    cards.add( new Hero("heroi9", 3, 9, 6, "herois/heroi9/heroi9_6.png") );
    cards.add( new Hero("heroi12", 4, 9, 14, "herois/heroi12/heroi12_14.png") );
    cards.add( new Hero("heroi14", 5, 10, 15, "herois/heroi14/heroi14_15.png") );

    cards.add( new AtkSpell( "Super Massive BlackHole",
                             10, 
                             new Spell(){
                                @Override
                                public void cast(Player player){
                                    for(int i=5; i>=0; i-=1)
                                        if(player.field().hasCard(i))
                                            player.field().remove(i);
                             }},
                             "magias/ataque/BuracoNegro.png" ) );//String name, int cost, Spell spell, String url
    
    cards.add( new AtkSpell( "Chao mortal",
                             2, 
                             new Spell(){
                                @Override
                                public void cast(Player player){
                                    for(int i=5; i>=0; i-=1)
                                        if(player.field().hasCard(i))
                                            player.field().card(i).hit(1);
                             }},
                             "magias/ataque/ChaoMortal.png" ) );
    cards.add( new AtkSpell( "Raio Da Morte",
                             5, 
                             new Spell(){
                                @Override
                                public void cast(Player player){
                                        int i = (int)Math.random()*(player.field().size())+1;
                                        player.field().remove(i-1);
                             }},
                             "magias/ataque/RaioMorte.png" ) );
    cards.add( new DefSpell( "Barreira",
                             5, 
                             new Spell(){
                                @Override
                                public void cast(Player player){
                                    Player allyPlayer = Game.getInstance().getPlayer();
                                    int i = (int)Math.random()*(allyPlayer.field().size())+1;
                                    allyPlayer.field().card(i-1).hit(-8);
                             }},
                             "magias/defesa/Barreira.png" ) );
    
    cards.add( new DefSpell( "Escudo",
                             2, 
                             new Spell(){
                                @Override
                                public void cast(Player player){
                                    Player allyPlayer = Game.getInstance().getPlayer();
                                    int i = (int)Math.random()*(allyPlayer.field().size())+1;
                                    allyPlayer.field().card(i-1).hit(-4);
                             }},
                             "magias/defesa/Escudo.png" ) );
    
    cards.add( new DefSpell( "Pocao",
                             2, 
                             new Spell(){
                                @Override
                                public void cast(Player player){
                                    Player allyPlayer = Game.getInstance().getPlayer();
                                    for(int i=5; i>=0; i-=1)
                                        if(allyPlayer.field().hasCard(i))
                                            allyPlayer.field().card(i).hit(-4);
                             }},
                             "magias/defesa/pocao.png" ) );
    }
    public ArrayList<Card> getCards(){return cards;}
}
