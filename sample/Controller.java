package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

public class Controller {

    // Bbutton dos decks dos jogadores
    public Button deck_P1;
    public Button deck_P2;


    // Referencia das ImagesView da hand do Jogador 1
    public ImageView hand3_P1;
    public ImageView hand2_P1;
    public ImageView hand1_P1;

    // Referencia das ImageVooews da hand do Jogador 2
    public ImageView hand3_P2;
    public ImageView hand2_P2;
    public ImageView hand1_P2;

    // Referencia para as Images e ImagesViews do field de cada jogador
    // O field é o mesmo, porem os id's tem que ser diferentes, entao precisamos sempre garantir que field1_P1 = field1_P2
    public ImageView field1_P1;
    public ImageView field2_P1;
    public ImageView field3_P1;
    public ImageView field4_P1;

    public ImageView field1_P2;
    public ImageView field2_P2;
    public ImageView field3_P2;
    public ImageView field4_P2;

    public ImageView teste;


    public void deckClicked_P1 (MouseEvent event) {/* Este método irá ser chamado quando o deck do player 1 for clicado */
        hand1_P1.setImage(new Image("heroi128.jpg")); // so um exemplo de como funciona
    }

    public void deckClicked_P2(MouseEvent event) {/* Este método irá ser chamado quando o deck do player 2 for clicado */
    }

    public void ClickedHand1_P1(MouseEvent event) {/* Quando clicarem na primeira carta da Hand do player 1*/
    }
    public void ClickedHand2_P1(MouseEvent event) {/* Quando clicarem na segunda carta da Hand do player 1*/}
    public void ClickedHand3_P1(MouseEvent event) {/* Quando clicarem na terceira carta da Hand do player 1*/}

    public void ClickedHand1_P2(MouseEvent event) {/* Quando clicarem na primeira carta da Hand do player 2*/}
    public void ClickedHand2_P2(MouseEvent event) {/* Quando clicarem na segunda carta da Hand do player 2*/}
    public void ClickedHand3_P2(MouseEvent event) {/* Quando clicarem na terceira carta da Hand do player 2*/}

    public void ClickedField1(MouseEvent event) {/*Quando o field for clicado, independente do player*/}
    public void ClickedField2(MouseEvent event) {/*Quando o field for clicado, independente do player*/}
    public void ClickedField3(MouseEvent event) {/*Quando o field for clicado, independente do player*/}
    public void ClickedField4(MouseEvent event) {/*Quando o field for clicado, independente do player*/}



}