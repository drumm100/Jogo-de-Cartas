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
        return "--" + name + "--\n" +
                "HP: " + HP + "\n" + 
               "-----Hand-----\n" + 
               hand + 
               "--------------\n";
    }
    public void setName(String name){
        this.name = name;
    }
}