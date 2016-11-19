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

    public Player getPlayer(){
        return Table.getInstance().player(turn%2 + 1);
    }

    public Player getEnemyPlayer(){
        int player = turn%2 + 1;
        return table.player(player%2 + 1);
    }

    public static Game getInstance(){
        return instance;
    }

    public void play(int wichCard){// joga a carta da mão no campo
        Card card = getPlayer().field().remove( wichCard-1 );
        getPlayer().field().add(card);
    }

    public void attack(int card1, int card2){//ataca outra carta, ou o player inimigo
        Card card = getPlayer().field().card(card1);
        Card enemyCard = (card2 == -1 ? null : getEnemyPlayer().field().card(card2) );
            
        if( card instanceof CharacterCard ){
            if( card2 == -1 )
                card.hit( getEnemyPlayer() );
            else
                card.hit( enemyCard );
        }
        else{
            if( card2 == -1 )
                card.cast( getEnemyPlayer() );
            else
                card.cast( enemyCard );
        }

        // confere coisa p krl 
        if(card.getHP() <= 0)
            getPlayer().field().remove(card1);
        if(enemyCard.getHP() <= 0)
            getEnemyPlayer().field().remove(card2);

        else if(getEnemyPlayer().getHP() <= 0 ){
            System.out.println("voce ganhou!");
            System.exit(0);
        }

        //condiçoes de jogo terminado
        //opçao de atacar o outro player
    }

    public void start(){//começa o turno, compra cartas
            System.out.println("player" + (turn%2 + 1) + "'s' turn");

            if( getPlayer().deck().size() > 0 && getPlayer().hand().nCards() <= 3 ){
                if(turn == 1 || turn == 0){
                    pick();
                    pick();
                }

                pick();
            }
    }

    //@ requires getPlayer().deck().size() > 0;
    //@ requires getPlayer().hand().nCards() <= 3;
    public void pick(){//pega uma carta do deck, coloca na mao do jogador
            getPlayer().hand().add( getPlayer().deck().getRandom() );
    }

    public void setDone(){//passa a jogada
        turn += 1;
        start();
    }
}