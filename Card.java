public abstract class Card{
	private String name;
	private String description;
	private int cost;
	
	public Card(String name, String description,int cost){
		this.name=name;
		this.description=description;
		this.cost = cost;
	}
	public int getCost(){return cost;}
}
