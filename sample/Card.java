package sample;
import javafx.scene.image.Image;

public abstract class Card{
	protected String name;
	protected String description;
	protected int cost;
	protected Image image;
	
	public Card(String name, int cost, String url){
		this.name=name;
		this.cost = cost;
		image = new Image(url);
	}
	public int getCost(){return cost;}
	
	public Image getImage(){
		return image;
	}

	public abstract int getAtk();
	public abstract int getHP();
	public abstract void hit(int HP);
	public abstract void hit(Card card);
	public abstract void hit(Player player);
}
