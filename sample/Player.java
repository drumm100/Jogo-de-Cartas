package sample;
public class Player{
    private String name;
    private int HP, mana;
    private Hand hand;
    private Deck deck;
    private Field field;

    public Player(String name){
        this.name = name;
        HP = 30;
        mana = 1;
        hand = new Hand();
        deck = new Deck();
        field = new Field();
    }

    //getters
    public Deck deck(){return deck;}
    public Field field(){return field;}
    public int HP(){return HP;}
    public Hand hand(){return hand;}
    public int getMana(){return mana;}

    //setters
    public void hit(int HP){this.HP -= HP;}
    public void setMana(int mana){this.mana = mana;}

    @Override
    public String toString(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}