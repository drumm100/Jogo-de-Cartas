package sample;

import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{
    public TabPane tab;
    public Tab tab_P1;

    @FXML
    public Button passaJogada;
    @FXML
    public Label restaCartas;
    @FXML
    public ImageView H0, H1, H2;
    @FXML
    public ImageView A0, A1, A2, A3, A4, A5;
    @FXML
    public ImageView E0, E1, E2, E3, E4, E5;
    @FXML
    public ImageView enemyImage;
    @FXML
    public Label vida, mana, enemyLife;

    @Override
    public void initialize(java.net.URL arg0, ResourceBundle arg1){
        enemyImage.setImage( Game.getInstance().getEnemyPlayer().getImage() );
        enemyLife.setText( Integer.toString(Game.getInstance().getEnemyPlayer().HP()) );

        vida.setText( Integer.toString(Game.getInstance().getPlayer().HP()) );
        mana.setText( Integer.toString(Game.getInstance().getPlayer().getMana()) );

        H0.setImage( Game.getInstance().getPlayer().hand().card(0).getImage() );
        H1.setImage( Game.getInstance().getPlayer().hand().card(1).getImage() );
        H2.setImage( Game.getInstance().getPlayer().hand().card(2).getImage() );
        restaCartas.setText("Restam " + Game.getInstance().getPlayer().deck().size() +" cartas");
    }

    public void showCards(){
        restaCartas.setText("Restam " + (int)Game.getInstance().getPlayer().deck().size() +" cartas");

        enemyImage.setImage( Game.getInstance().getEnemyPlayer().getImage() );
        enemyLife.setText( Integer.toString(Game.getInstance().getEnemyPlayer().HP()) );

        vida.setText( Integer.toString(Game.getInstance().getPlayer().HP()) );
        mana.setText( Integer.toString(Game.getInstance().getPlayer().getMana()) );

        if( Game.getInstance().getPlayer().hand().hasCard(0) )
		    H0.setImage( Game.getInstance().getPlayer().hand().card(0).getImage() );
        else
            H0.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getPlayer().hand().hasCard(1) )
            H1.setImage( Game.getInstance().getPlayer().hand().card(1).getImage() );
        else
            H1.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getPlayer().hand().hasCard(2) )
            H2.setImage( Game.getInstance().getPlayer().hand().card(2).getImage() );
        else
            H2.setImage( new Image("cartas/invisible.png") );

        if( Game.getInstance().getPlayer().field().hasCard(0) )
            A0.setImage( new Image( getAllyURL(0) ) );
        else
            A0.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getPlayer().field().hasCard(1) )
            A1.setImage( new Image( getAllyURL(1) ) );
        else
            A1.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getPlayer().field().hasCard(2) )
            A2.setImage( new Image( getAllyURL(2) ) );
        else
            A2.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getPlayer().field().hasCard(3) )
            A3.setImage( new Image( getAllyURL(3) ) );
        else
            A3.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getPlayer().field().hasCard(4) )
            A4.setImage( new Image( getAllyURL(4) ) );
        else
            A4.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getPlayer().field().hasCard(5) )
            A5.setImage( new Image( getAllyURL(5) ) );
        else
            A5.setImage( new Image("cartas/invisible.png") );

        if( Game.getInstance().getEnemyPlayer().field().hasCard(0) )
            E0.setImage( new Image( getEnemyURL(0) ) );
        else
            E0.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(1) )
            E1.setImage( new Image( getEnemyURL(1) ) );
        else
            E1.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(2) )
            E2.setImage( new Image( getEnemyURL(2) ) );
        else
            E2.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(3) )
            E3.setImage( new Image( getEnemyURL(3) ) );
        else
            E3.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(4) )
            E4.setImage( new Image( getEnemyURL(4) ) );
        else
            E4.setImage( new Image("cartas/invisible.png") );
        if( Game.getInstance().getEnemyPlayer().field().hasCard(5) )
            E5.setImage( new Image( getEnemyURL(5) ) );
        else
            E5.setImage( new Image("cartas/invisible.png") );
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
        Game game = Game.getInstance();
        Card allyCard = game.getPlayer().field().getSelected();
        if( ((CharacterCard)allyCard).attacked() ) return;

        int wichCard = getIndexFromID( ( (Node)event.getSource() ).getId() );
        game.getEnemyPlayer().field().setSelected(wichCard);
        Card enemyCard = game.getEnemyPlayer().field().getSelected();

        game.attack( allyCard, enemyCard );
        game.checkCards( allyCard, enemyCard );
        ((CharacterCard)allyCard).setAtk(true);
        showCards();
    }

    public void clickedEnemyPlayer(MouseEvent event){
        Game game = Game.getInstance();
        Player enemy = game.getEnemyPlayer();
        Card card = game.getPlayer().field().getSelected();

        game.attack(card, enemy );

        if ( game.didWin() ){
            Alert alert;
            alert = new Alert(AlertType.WARNING);
            alert.setTitle("Atencao !!");
            alert.setHeaderText(null);
            alert.setContentText("Fim de Jogo !!");
            alert.showAndWait();
        }
        showCards();
    }

    public int getIndexFromID(String id){
        return Integer.parseInt( id.substring(1) );
    }

    public void setDone(){
        Game.getInstance().setDone();
        tab_P1.setText(Game.getInstance().getPlayer().toString()); //Faz aquela mogica pra mudar o player certinho
        showCards();
    }
    private String getAllyURL(int whichCard){
        return ((CharacterCard)Game.getInstance().getPlayer().field().card(whichCard)).getURL( Game.getInstance().getPlayer().field().card(whichCard).getHP() );
    }
    private String getEnemyURL(int whichCard){
        return ((CharacterCard)Game.getInstance().getEnemyPlayer().field().card(whichCard)).getURL( Game.getInstance().getEnemyPlayer().field().card(whichCard).getHP() );
    }

}
