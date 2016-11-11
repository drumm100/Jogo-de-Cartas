public class Combat{	

	public static void atk(Card c1, Card c2){
		double bonus = 1.0;
		if( c1.type()==Type.TIME && c2.type()==Type.POWER ||
		    c1.type()==Type.POWER && c2.type()==Type.MIND ||
		    c1.type()==Type.MIND && c2.type()==Type.REALITY ||
		    c1.type()==Type.REALITY && c2.type()==Type.SPACE ||
		    c1.type()==Type.SPACE && c2.type()==Type.SOUL ||
		    c1.type()==Type.SOUL && c2.type()==Type.REALITY )
		   		bonus = 1.25;
		else if( c1.type()==Type.POWER && c2.type()==Type.TIME ||
		   		 c1.type()==Type.MIND && c2.type()==Type.POWER ||
			     c1.type()==Type.REALITY && c2.type()==Type.MIND ||
		    	 c1.type()==Type.SPACE && c2.type()==Type.REALITY ||
		    	 c1.type()==Type.SOUL && c2.type()==Type.SPACE ||
		    	 c1.type()==Type.REALITY && c2.type()==Type.SOUL )
		   		bonus = 0.75;

		c2.setHP( (int)( c2.getHP()-( c1.getAtk()*bonus - c2.getDef()/4 ) ));
	}	
	
}
