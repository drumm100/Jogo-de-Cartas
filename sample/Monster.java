package sample;
import javafx.scene.image.Image;
public class Monster extends CharacterCard{
	private Image image;
	public Monster(String name, String description, int cost, int atk, int HP, String url){
		super(name, description, cost, atk, HP, Type.SPELL, Type.HERO);
		image = new Image(url);
	}
}
