package sample;
public abstract class Card{
	protected String name;
	protected String description;
	protected int cost;
	
	public Card(String name, String description, int cost){
		this.name=name;
		this.description=description;
		this.cost = cost;
	}
	public int getCost(){return cost;}

	public abstract int getAtk();
	public abstract int getHP();
	public abstract void hit(int HP);
	public abstract void hit(Card card);
	public abstract void hit(Player player);

	public abstract void cast(Player player);
	public abstract void cast(Card card);
}
