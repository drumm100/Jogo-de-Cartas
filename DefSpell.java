public class DefSpell extends SpellCard{
	
	private DefSpell spell;

	public DefSpell(String name, String description, int cost, DefSpell spell){
		super(name,description,cost);
		this.spell = spell;
	}

	public void cast(){
		spell.cast();
	}
}