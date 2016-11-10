public abstract class Card{
	private Type type;
	private int atk; 
	private int HP;
	private int def;
	
	public Card(int atk, int HP, int def){
		this.atk = atk;
		this.HP = HP;
		this.def = def;
	}
	
	public int getDef(){ return this.def; }
	public int getHP(){ return this.HP; }
	public int getAtk(){ return this.atk; }

	public void setHP(int HP){ this.HP = HP; }

	public abstract Type type();
}
