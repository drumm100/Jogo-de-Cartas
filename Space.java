public class Space extends Carta{
	private poderCarta Poder;
	private int Forca; 
	private int Vida;
	private int Defesa;
	
	public Space(int Forca, int Vida, int Defesa){
		super(Forca, Vida, Defesa);
		this.Poder = poderCarta.Space;
	}
	@Override
	public poderCarta Poder(){ return this.Poder; }
}
