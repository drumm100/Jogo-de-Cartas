public class Combat{	

	public static void atk(Card c1, Card c2){
		double bonus = 1.;
		if(c1.type()==Type.TIME && c2.type()==Type.POWER ||
		   c1.type()==Type.POWER && c2.type()==Type.MIND )
		   bonus = 1.25;
		   else if(true)
		   bonus = 0.75;

		c2.setHP( (int)( c2.getHP()-( c1.getAtk()*bonus / c2.getDef()/2 ) ));
	}	
	
}
