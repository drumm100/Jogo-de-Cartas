public abstract class SpellCard extends Card{
	public SpellCard(String name, String description, int cost){
		super(name, description, cost);
	}

	public abstract void cast();//aplica a magia da carta

	public int getAtk(){return 1;} //isso aqui sepa ta chinelo
	public int getHP(){return 1;}
	public void setHP(int HP){}
}
