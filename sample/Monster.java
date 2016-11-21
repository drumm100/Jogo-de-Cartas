package sample;
<<<<<<< HEAD
import javafx.scene.image.Image;
public class Monster extends CharacterCard{
	private Image image;
	public Monster(String name, String description, int cost, int atk, int HP, String url){
		super(name, description, cost, atk, HP, Type.SPELL, Type.HERO);
		image = new Image(url);
=======
public class Monster extends CharacterCard{
	public Monster(String name, String description, int cost, int atk, int HP, String url){
		super(name, description, cost, atk, HP, Type.SPELL, Type.HERO, url);
>>>>>>> 6b83c8752808a3cf000c5d9337835961b7bdc11e
	}
}
