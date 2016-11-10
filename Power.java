public class Power extends Card{
	private Type type;
	private int atk; 
	private int HP;
	private int def;
	
	public Power(int atk, int HP, int def){
		super(atk, HP, def);
		this.type = Type.POWER;
	}
	@Override
	public Type type(){ return this.type; }
}
