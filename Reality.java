public class Reality extends Card{
	private Type type;
	private int atk; 
	private int HP;
	private int def;
	
	public Reality(int atk, int HP, int def){
		super(atk, HP, def);
		this.type = Type.REALITY;
	}
	@Override
	public Type type(){ return this.type; }
}
