public class Soul extends Card{
	private Type type;
	private int atk; 
	private int HP;
	private int def;
	
	public Soul(int atk, int HP, int def){
		super(atk, HP, def);
		this.type = Type.SOUL;
	}
	@Override
	public Type type(){ return this.type; }
}
