public abstract class SpellCard extends Card{
	public SpellCard(String name, String description, int cost){
		super(name, description, cost);
	}
	public int getAtk(){return 1;} //isso aqui sepa ta chinelo
	public int getHP(){return 1;}
	public void hit(int HP){}
	public void hit(Card card){}

		@Override
	public String toString(){
		return "______________________\n" +
			   name + "\n" + 
			   description + "\n" + 
			   "custo: " + cost + 
			   "\n______________________\n";
	}
}
