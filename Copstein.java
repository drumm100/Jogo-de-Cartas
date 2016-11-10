public class Copstein extends Card{
	private Type type;
	private int atk; 
	private int HP;
	private int def;
	
	public Copstein(int atk, int HP, int def){
		super(atk, HP, def);
		this.type = Type.COPSTEIN;
	}
	@Override
	public Type type(){ return this.type; }
}
