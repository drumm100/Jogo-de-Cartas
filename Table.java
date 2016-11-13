public class Table{

    private static Table instance = new Table();    
    private Player player1;
    private Player player2;
    private int turn;

    private Table(){
        player1 = new Player("");
        player2 = new Player("");
        turn = 1; //turno, para decidir qual jogador vai jogar
    }

    public static Table getInstance(){return instance;}

    public Player player(int player){ return ( player == 1 ? player1 : player2 );}
}