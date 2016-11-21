package sample;
public class Monster extends CharacterCard{
	public Monster(String name, String description, int cost, int atk, int HP, String url){
		super(name, description, cost, atk, HP, Type.SPELL, Type.HERO, url);
	}
}
