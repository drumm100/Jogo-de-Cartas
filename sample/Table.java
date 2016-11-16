package sample;
public class Table{

    private static Table instance = new Table();    
    private Player player1;
    private Player player2;

    private Table(){
        player1 = new Player("player1");
        player2 = new Player("player2");
    }
    public static Table getInstance(){return instance;}
    public Player player(int player){ return ( player == 1 ? player1 : player2 );}
    
    

    @Override
    public String toString(){
        String string = "";
        string += player1 + "\n";
        string += player2 + "\n";
        return string;
    }
}