package sample;
import java.util.ArrayList;
import javafx.scene.image.Image;
public abstract class CharacterCard extends Card{
	private int atk; 
	private int HP, max;
	private boolean attacked;

	public CharacterCard(String name, int cost, int atk, int HP, String url){
		super(name, cost, url);
		this.atk = atk;
		this.HP = HP;
		max = HP;
		attacked = false;
	}

	public boolean attacked(){return attacked;}
	public int getAtk(){return atk;}
	public int getHP(){return (HP < max ? HP : max);}
	public void hit(Card card){
		this.HP -= card.getAtk();
		card.hit(this.atk);
	}
	public void setAtk(boolean atk){
		attacked = atk;
	}
	public void hit(Player player){
		player.hit(this.atk);
	}
	public void hit(int HP){
		this.HP -= HP;
	}
	public String getURL(int hp){
		return name + "_" + (HP < max ? HP : max) + ".png";
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