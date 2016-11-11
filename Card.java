public abstract class Card{
	private String name;
	private String description;
	private int cost;
	
	public Card(String name, String description,int cost){
		this.name=name;
		this.description=description;
		this.cost = cost;
	}
	
	public abstract int getHP();//pega o HP de monstros e herois
	public abstract int getAtk();//pega o ataque de monstros e herois
	public abstract void cast();//aplica a magia da carta (spells)
	public int getCost(){return cost;}

	public abstract void setHP(int HP);//define o HP (monstros e herois)
}
