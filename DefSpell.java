public class DefSpell extends SpellCard{
	
	private DefSpell spell;

	public DefSpell(String name, String description, int cost, DefSpell spell){
		super(name,description,cost);
		this.spell = spell;
	}
	
	@Override
	public void cast(Player player){
		spell.cast(player);
	}
}