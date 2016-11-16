public class Hero extends CharacterCard{
	public Hero(String name, String description, int cost, int atk, int HP){
		super(name, description, cost, atk, HP, Type.MONSTER, Type.SPELL);
	}
}
