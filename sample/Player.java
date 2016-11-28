package sample;
import javafx.scene.image.Image;
public class Player{
    private String name;
    private int HP, mana;
    private Hand hand;
    private Deck deck;
    private Field field;
    private Image image;

    public Player(String name, String url){
        this.name = name;
        HP = 30;
        mana = 1;
        hand = new Hand();
        deck = new Deck();
        field = new Field();
        image = new Image(url);
    }

    //getters
    public Deck deck(){return deck;}
    public Field field(){return field;}
    public int HP(){return HP;}
    public Hand hand(){return hand;}
    public int getMana(){return mana;}
    public Image getImage(){return image;}

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