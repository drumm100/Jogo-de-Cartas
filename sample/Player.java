package sample;
public class Player{
    private String name;
    private int HP;
    private Hand hand;
    private Deck deck;
    private Field field;

    public Player(String name){
        this.name = name;
        HP = 30;
        hand = new Hand();
        deck = new Deck();
        field = new Field();
    }

    public Deck deck(){return deck;}
    public Field field(){return field;}
    public int getHP(){return HP;}
    public Hand hand(){return hand;}
    public void hit(int HP){this.HP -= HP;}
    
    @Override
    public String toString(){
        return "--" + name + "--\n" +
                "HP: " + HP + "\n";
    }
    public void setName(String name){
        this.name = name;
    }
}