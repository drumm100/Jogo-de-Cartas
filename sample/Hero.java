package sample;
public class Hero extends CharacterCard{
	public Hero(String name, String description, int cost, int atk, int HP, String url){
		super(name, description, cost, atk, HP, Type.MONSTER, Type.SPELL, url);// url sem a vida e .jpg
	}
}
