package sample;
import java.util.ArrayList;
import javafx.scene.image.Image;
public abstract class CharacterCard extends Card{
	private int atk; 
	private int HP;
	private Type adv; //vantagem contra
	private Type disAdv; //disvantagem contra
	private ArrayList<Image> image;

	public CharacterCard(String name, String description, int cost, int atk, int HP, Type adv, Type disAdv, String url){
		super(name, description, cost);
		this.atk = atk;
		this.HP = HP;
		this.adv = adv;
		this.disAdv = disAdv;
		this.image = new ArrayList<Image>();
		for(int i=1; i<=HP; i+=1){
			image.add( new Image( url + i + ".jpg" ) );
		}
	}

	public Image getCardImage(int HP){return image.get( HP-1 ); }
	public int getAtk(){return atk;}
	public int getHP(){return HP;}
	public void hit(Card card){
		this.HP -= card.getAtk();
		card.hit(this.atk);
	}
	
	public void hit(Player player){
		player.hit(this.atk);
	}

	public void hit(int HP){
		this.HP -= HP;
	}

	@Override
	public String toString(){
		return "___________________________\n" +
			   name + "\n" + 
			   description + "\n" + 
			   "custo: " + cost + "\n" +
			   "ataque: " + atk + "\n" +
			   "vida: " + HP + 
			   "\n___________________________\n";
	}
}
