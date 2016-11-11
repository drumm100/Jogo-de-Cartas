public class Time extends Card{
	private Type type;
	private int atk; 
	private int HP;
	private int def;
	
	public Time(int atk, int HP, int def){
		super(atk, HP, def);
		this.type = Type.TIME;
	}
	@Override
	public Type type(){ return this.type; }
}
