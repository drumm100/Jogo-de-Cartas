import java.util.Scanner;

public class Game{
    private int turn;
    private Table table;
    public Game(){
        turn = 0;
        table = Table.getInstance();
    }

    public void play(){
        int player = (turn  % 2) + 1;
        Player enemy = table.player( (player%2)+1 );

        if(table.player(player).hand().deck().size() > 0)
            table.player(player).hand().pick();

        System.out.println(table.player(player));
        
        Scanner in = new Scanner(System.in);
        int card = in.nextInt();
        
        table.player(player).hand().play(card, enemy);

        attack( enemy );
    }

    public void attack(Player player){
        //temporario
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println(table.player((turn%2)+1).hand() );
            System.out.println("----enemyField------");
            System.out.println(player.hand().field() );
            
            int card1 = in.nextInt();
            int card2 = in.nextInt();
            if (card1 == 100 || card2 == 100){ 
                turn +=1; 
                break;
            }

            table.player( (turn%2)+1 ).attack( player, card1, card2 );
            turn += 1;
            
            play();
        }
        play();
    }

}