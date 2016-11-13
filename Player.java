public class Player{
    private String name;
    private int HP;
    private Hand hand;

    public Player(String name){
        this.name = name;
        HP = 30;
        hand = new Hand();
    }

    public int getHP(){return HP;}
    public Hand hand(){return hand;}
    public void hit(int HP){this.HP -= HP;}

    public void attack(Player player, int card1, int card2){
        Card card = this.hand.field().card(card1);
        Card enemyCard = player.hand().field().card(card2);
        card.hit(enemyCard);

        if(card.getHP() <= 0) {
            this.hand.field().remove(card1);
            System.out.println("sua carta morreu");
            }
        if(enemyCard.getHP() <= 0){
            System.out.println("a carta dele morreu");
            player.hand().field().remove(card2);
        } 
    }

    public void attack(Player player, int card1){
        Card card = this.hand.field().card(card1);
        card.hit(player);
    }

    @Override
    public String toString(){
        return "--" + name + "--\n" +
                "HP: " + HP + "\n" + 
               "-----Hand-----\n" + 
                    hand;
    }
    public void setName(String name){
        this.name = name;
    }
}