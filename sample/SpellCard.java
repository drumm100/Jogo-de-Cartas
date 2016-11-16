package sample;
public abstract class SpellCard extends Card{

	Spell spell;

	public SpellCard(String name, String description, int cost, Spell spell){
		super(name, description, cost);
		this.spell = spell;
	}

	public int getAtk(){return 1;} //isso aqui sepa ta chinelo
	public int getHP(){return 1;}
	public void hit(int HP){}
	public void hit(Card card){}
	public void hit(Player player){}

	public void cast(Player player){
		spell.cast(player);
	}

	public void cast(Card card){
		spell.cast(card);
	}

		@Override
	public String toString(){
		return "______________________\n" +
			   name + "\n" + 
			   description + "\n" + 
			   "custo: " + cost + 
			   "\n______________________\n";
	}
}
