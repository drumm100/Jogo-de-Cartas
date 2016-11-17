package sample;
import javafx.scene.image.Image;
public class Hero extends CharacterCard{
	private Image image;
	public Hero(String name, String description, int cost, int atk, int HP, String url){
		super(name, description, cost, atk, HP, Type.MONSTER, Type.SPELL);
		image = new Image(url);
	}
}
