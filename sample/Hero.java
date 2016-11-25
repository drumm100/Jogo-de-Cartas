package sample;
public class Hero extends CharacterCard{
	public Hero(String name, int cost, int atk, int HP, String url){
		super(name, cost, atk, HP, Type.MONSTER, Type.SPELL, url);// url sem a vida e .jpg
	}
}
