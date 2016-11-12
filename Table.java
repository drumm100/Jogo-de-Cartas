public class Table{

    private static Table instance = new Table();    
    private Player player1;
    private Player player2;

    private Table(){
        player1 = new Player("");
        player2 = new Player("");
    }

    public static Table getInstance(){return instance;}

    public Player player1(){return player1;}
    public Player player2(){return player2;}
    
}