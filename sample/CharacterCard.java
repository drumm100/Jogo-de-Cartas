package sample;
public abstract class CharacterCard extends Card{
	private int atk; 
	private int HP;
	private Type adv; //vantagem contra
	private Type disAdv; //disvantagem contra
	
	public CharacterCard(String name, String description, int cost, int atk, int HP, Type adv, Type disAdv){
		super(name, description, cost);
		this.atk = atk;
		this.HP = HP;
		this.adv = adv;
		this.disAdv = disAdv;
	}

	public int getAtk(){return atk;}
	public int getHP(){return HP;}
	public void hit(Card card){
		this.HP -= card.getAtk();
		card.hit(this.atk);
	}
	
	public void hit(Player player){
		player.hit(this.atk);
	}

	public void hit(int HP){
		this.HP -= HP;
	}
	public void cast(Player player){}
	public void cast(Card card){}

	@Override
	public String toString(){
		return "___________________________\n" +
			   name + "\n" + 
			   description + "\n" + 
			   "custo: " + cost + "\n" +
			   "ataque: " + atk + "\n" +
			   "vida: " + HP + 
			   "\n___________________________\n";
	}
}
