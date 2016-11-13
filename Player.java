public class Player{
    private String name;
    private int HP;
    private Hand hand;

    public Player(String name){
        this.name = name;
        HP = 30;
        hand = new Hand();
    }

    public Hand hand(){return hand;}
    public void hit(int HP){this.HP -= HP;}

    @Override
    public String toString(){
        return name + "\n" + 
               hand;
    }
    public void setName(String name){
        this.name = name;
    }
}