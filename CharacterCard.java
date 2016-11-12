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
	public void setHP(int HP){this.HP = HP;}
}
