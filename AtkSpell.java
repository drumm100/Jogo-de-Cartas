public class AtkSpell extends SpellCard{
	
	private Spell spell;

	public AtkSpell(String name, String description, int cost, Spell spell){
		super(name,description,cost);
		this.spell = spell;
	}

	public void cast(Player player){
		spell.cast(player);
	}
}