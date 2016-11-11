public class Space extends Card{
	private Type type;
	private int atk; 
	private int HP;
	private int def;
	
	public Space(int atk, int HP, int def){
		super(atk, HP, def);
		this.type = Type.SPACE;
	}
	@Override
	public Type type(){ return this.type; }
}
