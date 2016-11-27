package sample;
public class Hero extends CharacterCard{
	public Hero(String name, int cost, int atk, int HP, String url){
		super(name, cost, atk, HP, url);// url sem a vida e .jpg
	}
	@Override
	public String getURL(int hp){
		return "herois/" + name + "/" + super.getURL(hp);
	}
}
