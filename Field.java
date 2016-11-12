public class Field{
    private int MAX;
    private List<Card> field;
    private Field instance = new Field();

    private Field(){
        MAX = 5;
        field = new ArrayList<Card>();
    }

    //aqui vai ser o campo, o jogador joga cartas aqui
}