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

    public void play(){
        int player = (turn  % 2) + 1;
        Player enemy = table.player( (player%2)+1 );

        if(table.player(player).hand().deck().size() > 0 && table.player(player).hand().nCards() <= 3)
            table.player(player).hand().pick();
    }

    public void attack(int card1, int card2){
        int player = (turn  % 2) + 1;
        Player enemy = table.player( (player%2)+1 );

        table.player(player).attack( enemy, card1, card2 );
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

            play();
    }

    public void setDone(){
        turn += 1;
        start();
    }
}