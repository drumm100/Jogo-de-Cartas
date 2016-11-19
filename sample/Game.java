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

    public void play(int wichCard){

        int player = (turn  % 2) + 1;
        Player enemy = table.player( (player%2)+1 );

        Card card = table.player(player).field().remove( wichCard-1 );
        
        if (card instanceof SpellCard)
            card.cast(enemy);
        else 
            table.player(player).field().add(card);
    }


    public void attack(int card1, int card2){
        int player = (turn  % 2) + 1;
        Player enemy = table.player( (player%2)+1 );

        Card card = table.player(player).field().card(card1);
        Card enemyCard = (card2 == -1 ? null : enemy.field().card(card2) );
            
        if( card instanceof CharacterCard ){
            if( card2 == -1 )
                card.hit( enemy );
            else
                card.hit( enemyCard );
        }
        else{
            if( card2 == -1 )
                card.cast( enemy );
            else
                card.cast( enemyCard );
        }

        if(card.getHP() <= 0){
            table.player(player).field().remove(card1);
            System.out.println("sua carta morreu");
        }
        if(enemyCard.getHP() <= 0){
            System.out.println("a carta dele morreu");
            enemy.field().remove(card2);
        }
        //condiçoes de jogo terminado
        //opçao de atacar o outro player
    }

    public void start(){
            int player = (turn  % 2) + 1;
            Player enemy = table.player( (player%2)+1 );
            
            System.out.println("player" +player+ "'s' turn");

            if(table.player(player).getHP() <= 0 ){
                System.out.println("voce perdeu!");
                System.exit(0);
            }
            else if(enemy.getHP() <= 0 ){
                System.out.println("voce ganhou!");
                System.exit(0);
            }

            if(turn == 1 || turn == 0){
                pick();
                pick();
            }

            pick();
    }

    public void pick(){
        Player player = table.player( (turn  % 2) + 1 );

        if(player.deck().size() > 0 && player.hand().nCards() <= 3){
            player.hand().add( player.deck().getRandom() );
        }
    }

    public void setDone(){
        turn += 1;
        start();
    }
}