package sample;
public class Monster extends CharacterCard{
	public Monster(String name, int cost, int atk, int HP, String url){
		super(name, cost, atk, HP, Type.SPELL, Type.HERO, url);
	}
	@Override
	public String getURL(int hp){
		return "demonios/" + name + "/" + super.getURL(hp);
	}
}
