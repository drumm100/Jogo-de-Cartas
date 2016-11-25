package sample;
import javafx.scene.image.Image;
public abstract class SpellCard extends Card{

	private Spell spell;
	
	public SpellCard(String name, int cost, Spell spell, String url){
		super(name, cost, url);
		this.spell = spell;
	}

	public Image getImage(){return image;}
	public int getAtk(){return 1;} //isso aqui sepa ta chinelo
	public int getHP(){return 1;}
	public void hit(int HP){}

	public void hit(Player player){
		spell.cast(player);
	}
	public void hit(Card card){
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
