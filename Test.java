public class Test{
    public static void main(String[] args){
        Deck deck1 = new Deck();
        Hand hand = new Hand(deck1);

        Card card = hand.play(1);
        //tenq fazer um ToString da carta
        if (card instanceof AtkSpell){
            card.cast();
        }
        else
        System.out.println("eae");
    }
}