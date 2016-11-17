package sample;
import javafx.scene.image.Image;
public class AtkSpell extends SpellCard{
	private Image image;
	public AtkSpell(String name, String description, int cost, Spell spell, String url){
		super(name,description,cost,spell);
		image = new Image(url);
	}
}