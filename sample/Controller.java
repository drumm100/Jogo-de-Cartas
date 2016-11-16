<<<<<<< HEAD
package sample;
/*
    Essa classe é responsavel por controlar o fxml. Dentro do fxml, quando
    alguma acao é feita o fxml chama algum desses metodos. Toda a funcionalidade
    da interface é feita por meio dessa classe

    Já coloquei todos os Buttons e Images como variaveis de instancias para acessar
    os botoes e imagens na interface, no metodo deckClicked_P1 eu fiz um exemplo de como
    funciona.
 */
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

public class Controller {
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

    //variaveis pra selecionar as cartas
    private byte selectedCard1, selectedCard2;


    public void showCards(){

    }
    public void deckClicked_P1 (MouseEvent event) {/* Este método irá ser chamado quando o deck do player 1 for clicado */
        hand1_P1.setImage(new Image("cartas/heroi128.jpg")); // so um exemplo de como funciona
    }
    public void deckClicked_P2(MouseEvent event) {/* Este método irá ser chamado quando o deck do player 2 for clicado */}

    public void ClickedHand1_P1(MouseEvent event) {
        Game.getInstance().getPlayer().hand().play(1, Game.getInstance().getEnemyPlayer());
    }
    public void ClickedHand2_P1(MouseEvent event) {
        Game.getInstance().getPlayer().hand().play(2, Game.getInstance().getEnemyPlayer());
    }
    public void ClickedHand3_P1(MouseEvent event) {
        Game.getInstance().getPlayer().hand().play(3, Game.getInstance().getEnemyPlayer());
    }

<<<<<<< HEAD
    public void ClickedHand1_P2(MouseEvent event) {
        Game.getInstance().getPlayer().hand().play(1, Game.getInstance().getEnemyPlayer());
    }
    public void ClickedHand2_P2(MouseEvent event) {
        Game.getInstance().getPlayer().hand().play(2, Game.getInstance().getEnemyPlayer());
    }
    public void ClickedHand3_P2(MouseEvent event) {
        Game.getInstance().getPlayer().hand().play(3, Game.getInstance().getEnemyPlayer());
    }
=======

    public void ClickedHand1_P1(MouseEvent event) {/* Quando clicarem na primeira carta da Hand do player 1*/
        
    }

    public void ClickedHand2_P1(MouseEvent event) {/* Quando clicarem na segunda carta da Hand do player 1*/}
    public void ClickedHand3_P1(MouseEvent event) {/* Quando clicarem na terceira carta da Hand do player 1*/}
>>>>>>> 373448fa790c22579be56fc338327b5b865d04ef

    private void setAllyFieldCard(ImagesView cardImage, int card){
        if(Game.getInstance().getPlayer().hand().field().hasCard(card))
            cardImage.setText(Game.getInstance().getPlayer().hand().field().card(card).toString());
        else
            cardImage.setText("allyFieldCard" + card);
    }

    public void ClickedField1(MouseEvent event) {/*Quando o field for clicado, independente do player*/}
    public void ClickedField2(MouseEvent event) {/*Quando o field for clicado, independente do player*/}
    public void ClickedField3(MouseEvent event) {/*Quando o field for clicado, independente do player*/}
    public void ClickedField4(MouseEvent event) {/*Quando o field for clicado, independente do player*/}
}
=======
package sample;
/*
    Essa classe é responsavel por controlar o fxml. Dentro do fxml, quando
    alguma acao é feita o fxml chama algum desses metodos. Toda a funcionalidade
    da interface é feita por meio dessa classe

    Já coloquei todos os Buttons e Images como variaveis de instancias para acessar
    os botoes e imagens na interface, no metodo deckClicked_P1 eu fiz um exemplo de como
    funciona.
 */
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

public class Controller {
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


    public void deckClicked_P1 (MouseEvent event) {/* Este método irá ser chamado quando o deck do player 1 for clicado */
        hand1_P1.setImage(new Image("cartas/heroi128.jpg")); // so um exemplo de como funciona
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
>>>>>>> 373448fa790c22579be56fc338327b5b865d04ef
