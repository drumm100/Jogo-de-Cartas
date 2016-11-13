public abstract class Card{
	private String name;
	private String description;
	private int cost;
	
	public Card(String name, String description, int cost){
		this.name=name;
		this.description=description;
		this.cost = cost;
	}
	public int getCost(){return cost;}

	public abstract int getAtk();
	public abstract int getHP();
	public abstract void setHP(int HP);
	public abstract void cast();
}
