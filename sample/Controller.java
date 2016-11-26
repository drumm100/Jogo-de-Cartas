package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.Node;

public class Controller{
    public Tab tab_P1;

    public ImageView H0;
    public ImageView H1;
    public ImageView H2;
    
    public ImageView A0;
    public ImageView A1;
    public ImageView A2;
    public ImageView A3;
    public ImageView A4;
    public ImageView A5;
    
    public ImageView E0;
    public ImageView E1;
    public ImageView E2;
    public ImageView E3;
    public ImageView E4;
    public ImageView E5;
    

    public void showCards(){
        if( Game.getInstance().getPlayer().hand().hasCard(0) )
		    H0.setImage( Game.getInstance().getPlayer().hand().card(0).getImage() );
        if( Game.getInstance().getPlayer().hand().hasCard(0) )
            H1.setImage( Game.getInstance().getPlayer().hand().card(1).getImage() );
        if( Game.getInstance().getPlayer().hand().hasCard(0) )
            H2.setImage( Game.getInstance().getPlayer().hand().card(2).getImage() );

        if( Game.getInstance().getPlayer().field().hasCard(0) )
            A0.setImage( Game.getInstance().getPlayer().field().card(0).getImage() );
        if( Game.getInstance().getPlayer().field().hasCard(0) )
            A1.setImage( Game.getInstance().getPlayer().field().card(1).getImage() );
        if( Game.getInstance().getPlayer().field().hasCard(0) )
            A2.setImage( Game.getInstance().getPlayer().field().card(2).getImage() );
        if( Game.getInstance().getPlayer().field().hasCard(0) )
            A3.setImage( Game.getInstance().getPlayer().field().card(3).getImage() );
        if( Game.getInstance().getPlayer().field().hasCard(0) )
            A4.setImage( Game.getInstance().getPlayer().field().card(4).getImage() );
        if( Game.getInstance().getPlayer().field().hasCard(0) )
            A5.setImage( Game.getInstance().getPlayer().field().card(5).getImage() );
        
        if( Game.getInstance().getEnemyPlayer().field().hasCard(0) )
            E0.setImage( Game.getInstance().getEnemyPlayer().field().card(0).getImage() );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(0) )
            E1.setImage( Game.getInstance().getEnemyPlayer().field().card(1).getImage() );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(0) )
            E2.setImage( Game.getInstance().getEnemyPlayer().field().card(2).getImage() );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(0) )
            E3.setImage( Game.getInstance().getEnemyPlayer().field().card(3).getImage() );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(0) )
            E4.setImage( Game.getInstance().getEnemyPlayer().field().card(4).getImage() );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(0) )
            E5.setImage( Game.getInstance().getEnemyPlayer().field().card(5).getImage() );

	}

    public void clickedHand(MouseEvent event){ // joga carta wichCard no campo
    	int wichCard = getIndexFromID( ( (Node)event.getSource() ).getId() );
        Game.getInstance().play( wichCard );
        showCards();
    }

    public void clickedAllyField(MouseEvent event){
    	int wichCard = getIndexFromID( ( (Node)event.getSource() ).getId() );
        Game.getInstance().getPlayer().field().setSelected(wichCard);
    }

    public void clickedEnemyField(MouseEvent event){
        int wichCard = getIndexFromID( ( (Node)event.getSource() ).getId() );

        Game game = Game.getInstance();
        game.getEnemyPlayer().field().setSelected(wichCard);
        Card allyCard = game.getPlayer().field().getSelected();
        Card enemyCard = game.getEnemyPlayer().field().getSelected();

        game.attack( allyCard, enemyCard );
        game.checkCards( allyCard, enemyCard );
        showCards();
    }

    public void clickedEnemyPlayer(MouseEvent event){
        Game game = Game.getInstance();
        Player enemy = game.getEnemyPlayer();
        Card card = game.getPlayer().field().getSelected();

        game.attack(card, enemy );
        
        if ( game.didWin() ){
            System.out.println("parabens por porra nenhuma, vc ganhou");
        }
    }

    public int getIndexFromID(String id){
        return Integer.parseInt( id.substring(1) );
    }
    public void setDone(){
        Game.getInstance().setDone();
    }
}
