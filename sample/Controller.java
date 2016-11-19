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

public class Controller{
    public Tab tab_P1;
    public Tab tab_P2;
    public TabPane tab;

    // Bbutton dos decks dos jogadores
    public Button deck_P1;
    public Button deck_P2;

    public Label mana_P1;
    public Label vida_P1;

    public Label mana_P2;
    public Label vida_P2;

    // Referencia das ImagesView da hand do Jogador 1
    public ImageView hand3_P1;
    public ImageView hand2_P1;
    public ImageView hand1_P1;

    // Referencia das ImageVooews da hand do Jogador 2
    public ImageView hand3_P2;
    public ImageView hand2_P2;
    public ImageView hand1_P2;

    // Referencia para as Images e ImagesViews do field de cada jogador
    public ImageView field1_P1;
    public ImageView field2_P1;
    public ImageView field3_P1;
    public ImageView field4_P1;
    public ImageView field5_P1;
    public ImageView field6_P1;

    public ImageView field1_P1_enemy;
    public ImageView field2_P1_enemy;
    public ImageView field3_P1_enemy;
    public ImageView field4_P1_enemy;
    public ImageView field5_P1_enemy;
    public ImageView field6_P1_enemy;

    public ImageView field1_P2;
    public ImageView field2_P2;
    public ImageView field3_P2;
    public ImageView field4_P2;
    public ImageView field5_P2;
    public ImageView field6_P2;

    public ImageView field1_P2_enemy;
    public ImageView field2_P2_enemy;
    public ImageView field3_P2_enemy;
    public ImageView field4_P2_enemy;
    public ImageView field5_P2_enemy;
    public ImageView field6_P2_enemy;

    public void showCards(){}

    public void ClickedHand(int wichCard, MouseEvent event){ // joga carta wichCard no campo
        Game.getInstance().play( wichCard );
        showCards();
    }
}