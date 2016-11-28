package sample;
import java.util.Scanner;

public class Game{
    private static Game instance = new Game();
    private int turn;
    private Table table;

    private Game(){
        turn = 0;
        table = Table.getInstance();
    }

    public void play(int wichCard){// joga a carta da mão no campo
        Card card = getPlayer().hand().card( wichCard );
        if(getPlayer().getMana() < card.getCost())
            return;

        if(card instanceof SpellCard){
                getPlayer().hand().remove(card);
                card.hit( getEnemyPlayer() );
                getPlayer().setMana( getPlayer().getMana() - card.getCost() );
                return;
        }
        if(getPlayer().field().size() < 6){
            getPlayer().hand().remove(card);
            getPlayer().field().add(card);
            getPlayer().setMana( getPlayer().getMana() - card.getCost() );
        }
    }

    public void attack(Card card, Card enemyCard){//ataca outra carta
            card.hit( enemyCard );
    }

    public void attack(Card card, Player enemy){//ataca o player inimigo
            card.hit( enemy );
    }
    
    public void start(){//começa o turno, compra cartas
            System.out.println("player" + (turn%2 + 1) + "'s' turn");

            if( getPlayer().deck().size() > 0 && getPlayer().hand().size() < 3 ){
                if(turn == 1 || turn == 0){
                    pick();
                    pick();
                }
                pick();
            }
            getPlayer().setMana( turn );
    }

    //@ requires getPlayer().deck().size() > 0;
    //@ requires getPlayer().hand().nCards() <= 3;
    public void pick(){//pega uma carta do deck, coloca na mao do jogador
            getPlayer().hand().add( getPlayer().deck().getRandom() );
    }

    public void setDone(){//passa a jogada
        getEnemyPlayer().setMana( getEnemyPlayer().getMana() + 1 );
        getPlayer().field().rstAtk();
        turn += 1;
        start();
    }

    //getters
    public static Game getInstance(){
        return instance;
    }
    public Player getPlayer(){
        return Table.getInstance().player(turn%2 + 1);
    }

    public Player getEnemyPlayer(){
        int player = turn%2 + 1;
        return table.player(player%2 + 1);
    }

    //checks
    public void checkCards(Card card, Card enemyCard){
        if(card.getHP() <= 0)
            getPlayer().field().remove(card);
        if(enemyCard.getHP() <= 0)
            getEnemyPlayer().field().remove(enemyCard);
    }
    public boolean didWin(){
        return ( getEnemyPlayer().HP() <= 0 );
    }
}