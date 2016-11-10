public class Mind extends Card{
	private Type type;
	private int atk; 
	private int HP;
	private int def;
	
	public Mind(int atk, int HP, int def){
		super(atk, HP, def);
		this.type = Type.MIND;
	}
	@Override
	public Type type(){ return this.type; }
}
