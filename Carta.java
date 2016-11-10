public abstract class Carta{
	private poderCarta Poder;
	private int Forca; 
	private int Vida;
	private int Defesa;
	
	public Carta(int Forca, int Vida, int Defesa){
		this.Forca = Forca;
		this.Vida = Vida;
		this.Defesa = Defesa;
	}
	
	public int getDefesa(){ return this.Defesa; }
	
	public int vida(){ return this.Vida; }
	public void setVida(int Vida){ this.Vida = Vida; }
	
	public int forca(){ return this.Forca; }
	
	
	public abstract int poder()
}
