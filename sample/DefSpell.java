package sample;

import javafx.scene.image.Image;

public class DefSpell extends SpellCard{
	private Image image;
	public DefSpell(String name, String description, int cost, Spell spell, String url){
		super(name,description,cost,spell);
		image = new Image(url);
	}
}