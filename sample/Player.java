package sample;
public class Player{
    private String name;
    private int HP, maxMana, actualMana;
    private Hand hand;
    private Deck deck;
    private Field field;

    public Player(String name){
        this.name = name;
        HP = 30;
        maxMana = 1;
        actualMana = 1;
        hand = new Hand();
        deck = new Deck();
        field = new Field();
    }

    //getters
    public Deck deck(){return deck;}
    public Field field(){return field;}
    public int HP(){return HP;}
    public Hand hand(){return hand;}
    public int getMaxMana(){return maxMana;}
    public int getActualMana(){return actualMana;}

    //setters
    public void hit(int HP){this.HP -= HP;}
    public void setMaxMana(int max){maxMana = max;}
    public void setActualMana(int mana){actualMana = mana;}

    @Override
    public String toString(){
        return "--" + name + "--\n" +
                "HP: " + HP + "\n";
    }
    public void setName(String name){
        this.name = name;
    }
}