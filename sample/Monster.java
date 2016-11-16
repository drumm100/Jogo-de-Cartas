public class Monster extends CharacterCard{
	public Monster(String name, String description, int cost, int atk, int HP){
		super(name, description, cost, atk, HP, Type.SPELL, Type.HERO);
	}
}
