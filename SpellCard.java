public abstract class SpellCard extends Card{
	public SpellCard(String name, String description, int cost){
		super(name, description, cost);
	}

	public abstract void cast();//aplica a magia da carta
}
