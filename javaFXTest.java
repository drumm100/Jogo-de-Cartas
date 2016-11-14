import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.DragEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;


public class javaFXTest extends Application{
    
    Button btnFieldCard1, btnFieldCard2, btnFieldCard3, btnFieldCard4, btnFieldCard5;
    Button btnEnemyFieldCard1, btnEnemyFieldCard2, btnEnemyFieldCard3, btnEnemyFieldCard4, btnEnemyFieldCard5;
    Button btnhandCard1, btnhandCard2, btnhandCard3;
    Button btnPlayer1, btnPlayer2, btnDone;
    Label HP1, HP2;
    Stage fieldStage;
    int selectedCard1 = 0;
    int selectedCard2 = 0;

    
    private void showCards(){
        //Image card1 = new Image("/cartas templates/alfio.jpg", 200, 300, false, true);

        //cartas do seu field
        setAllyFieldCard(btnFieldCard1, 1);
        setAllyFieldCard(btnFieldCard2, 2);
        setAllyFieldCard(btnFieldCard3, 3);
        setAllyFieldCard(btnFieldCard4, 4);
        setAllyFieldCard(btnFieldCard5, 5);

        //cartas do field inimigo
        setEnemyFieldCard(btnEnemyFieldCard1, 1);
        setEnemyFieldCard(btnEnemyFieldCard2, 2);
        setEnemyFieldCard(btnEnemyFieldCard3, 3);
        setEnemyFieldCard(btnEnemyFieldCard4, 4);
        setEnemyFieldCard(btnEnemyFieldCard5, 5);

        //cartas da mão
        setHandCard(btnhandCard1, 1);
        setHandCard(btnhandCard2, 2);
        setHandCard(btnhandCard3, 3);
    }
        
    @Override
    public void start(Stage fieldStage) {
        Game.getInstance().start();
        // Define o grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // grid da mão do jogador, indicadores no campo (ou espaço entre as cartas)
        // botao para confirmar jogada
        // mao do jogador --> cartas com propriedade de hover no mouse

        // Define os botoes
        btnFieldCard1 = new Button();
        btnFieldCard1.setMaxHeight(300);
        btnFieldCard1.setMaxWidth(200);
        btnFieldCard1.setMinHeight(300);
        btnFieldCard1.setMinWidth(200);
        btnFieldCard1.setOnAction((ActionEvent e) -> {
            selectedCard1 = 1;
        });
        grid.add(btnFieldCard1, 0, 1);
        
        btnFieldCard2 = new Button();
        btnFieldCard2.setMaxHeight(300);
        btnFieldCard2.setMaxWidth(200);
        btnFieldCard2.setMinHeight(300);
        btnFieldCard2.setMinWidth(200);
        btnFieldCard2.setOnAction((ActionEvent e) -> {
            selectedCard1 = 2;
        });
        grid.add(btnFieldCard2, 1, 1);

        btnFieldCard3 = new Button();
        btnFieldCard3.setMaxHeight(300);
        btnFieldCard3.setMaxWidth(200);
        btnFieldCard3.setMinHeight(300);
        btnFieldCard3.setMinWidth(200);
        btnFieldCard3.setOnAction((ActionEvent e) -> {
            selectedCard1 = 3;
        });
        grid.add(btnFieldCard3, 2, 1);
        
        btnFieldCard4 = new Button();
        btnFieldCard4.setMaxHeight(300);
        btnFieldCard4.setMaxWidth(200);
        btnFieldCard4.setMinHeight(300);
        btnFieldCard4.setMinWidth(200);
        btnFieldCard4.setOnAction((ActionEvent e) -> {
            selectedCard1 = 4;
        });
        grid.add(btnFieldCard4, 3, 1);
        
        btnFieldCard5 = new Button();
        btnFieldCard5.setMaxHeight(300);
        btnFieldCard5.setMaxWidth(200);
        btnFieldCard5.setMinHeight(300);
        btnFieldCard5.setMinWidth(200);
        btnFieldCard5.setOnAction((ActionEvent e) -> {
            selectedCard1 = 5;
        });
        grid.add(btnFieldCard5, 4, 1);

        btnEnemyFieldCard1 = new Button();
        btnEnemyFieldCard1.setMaxHeight(300);
        btnEnemyFieldCard1.setMaxWidth(200);
        btnEnemyFieldCard1.setMinHeight(300);
        btnEnemyFieldCard1.setMinWidth(200);
        btnEnemyFieldCard1.setOnAction( (ActionEvent e) -> {
            selectedCard2 = 1;
            Game.getInstance().getPlayer().attack(Game.getInstance().getEnemyPlayer(), selectedCard1, selectedCard2);
            showCards();
        } );
        grid.add(btnEnemyFieldCard1, 0, 0);

        btnEnemyFieldCard2 = new Button();
        btnEnemyFieldCard2.setMaxHeight(300);
        btnEnemyFieldCard2.setMaxWidth(200);
        btnEnemyFieldCard2.setMinHeight(300);
        btnEnemyFieldCard2.setMinWidth(200);
        btnEnemyFieldCard2.setOnAction( (ActionEvent e) -> {
            selectedCard2 = 2;
            Game.getInstance().getPlayer().attack(Game.getInstance().getEnemyPlayer(), selectedCard1, selectedCard2);
            showCards();
        } );
        grid.add(btnEnemyFieldCard2, 1, 0);

        btnEnemyFieldCard3 = new Button();
        btnEnemyFieldCard3.setMaxHeight(300);
        btnEnemyFieldCard3.setMaxWidth(200);
        btnEnemyFieldCard3.setMinHeight(300);
        btnEnemyFieldCard3.setMinWidth(200);
        btnEnemyFieldCard3.setOnAction( (ActionEvent e) -> {
            selectedCard2 = 3;
            Game.getInstance().getPlayer().attack(Game.getInstance().getEnemyPlayer(), selectedCard1, selectedCard2);
            showCards();
        } );
        grid.add(btnEnemyFieldCard3, 2, 0);

        btnEnemyFieldCard4 = new Button();
        btnEnemyFieldCard4.setMaxHeight(300);
        btnEnemyFieldCard4.setMaxWidth(200);
        btnEnemyFieldCard4.setMinHeight(300);
        btnEnemyFieldCard4.setMinWidth(200);
        btnEnemyFieldCard4.setOnAction( (ActionEvent e) -> {
            selectedCard2 = 4;
            Game.getInstance().getPlayer().attack(Game.getInstance().getEnemyPlayer(), selectedCard1, selectedCard2);
            showCards();
        } );
        grid.add(btnEnemyFieldCard4, 3, 0);

        btnEnemyFieldCard5 = new Button();
        btnEnemyFieldCard5.setMaxHeight(300);
        btnEnemyFieldCard5.setMaxWidth(200);
        btnEnemyFieldCard5.setMinHeight(300);
        btnEnemyFieldCard5.setMinWidth(200);
        btnEnemyFieldCard5.setOnAction( (ActionEvent e) -> {
            selectedCard2 = 5;
            Game.getInstance().getPlayer().attack(Game.getInstance().getEnemyPlayer(), selectedCard1, selectedCard2);
            showCards();
        } );
        grid.add(btnEnemyFieldCard5, 4, 0);
        
        btnhandCard1 = new Button();
        btnhandCard1.setMinHeight(300);
        btnhandCard1.setMinWidth(200);
        btnhandCard1.setMaxHeight(300);
        btnhandCard1.setMaxWidth(200);
        btnhandCard1.setOnAction((ActionEvent e) -> {
            Game.getInstance().getPlayer().hand().play(1);
            showCards();
        });
        grid.add(btnhandCard1, 1, 2);

        btnhandCard2 = new Button();
        btnhandCard2.setMinHeight(300);
        btnhandCard2.setMinWidth(200);
        btnhandCard2.setMaxHeight(300);
        btnhandCard2.setMaxWidth(200);
        btnhandCard2.setOnAction((ActionEvent e) -> {
            Game.getInstance().getPlayer().hand().play(2);
            showCards();
        });
        grid.add(btnhandCard2, 2, 2);

        btnhandCard3 = new Button();
        btnhandCard3.setMinHeight(300);
        btnhandCard3.setMinWidth(200);
        btnhandCard3.setMaxHeight(300);
        btnhandCard3.setMaxWidth(200);
        btnhandCard3.setOnAction((ActionEvent e) -> {
            Game.getInstance().getPlayer().hand().play(3);
            showCards();
        });
        grid.add(btnhandCard3, 3, 2);

        btnDone = new Button();
        btnDone.setText("Done!");
        btnDone.setOnAction((ActionEvent e) ->{
            Game.getInstance().setDone();
            showCards();
        });
        grid.add(btnDone, 2, 3);

        //players


        showCards();
        // Adiciona o painel a cena e exibe        
        Scene fieldScene = new Scene(grid);
        fieldStage = new Stage();
        fieldStage.setTitle("Field");
        fieldStage.setScene(fieldScene);
        fieldStage.show();
    }

    private void setHandCard(Button btn, int card){
        if(Game.getInstance().getPlayer().hand().hasCard(card))
        btn.setText(Game.getInstance().getPlayer().hand().card(card).toString());
        else
        btn.setText("handCard" + card);
    }

    private void setAllyFieldCard(Button btn, int card){
        if(Game.getInstance().getPlayer().hand().field().hasCard(card))
        btn.setText(Game.getInstance().getPlayer().hand().field().card(card).toString());
        else
        btn.setText("allyFieldCard" + card);
    }

    private void setEnemyFieldCard(Button btn, int card){
        if(Game.getInstance().getEnemyPlayer().hand().field().hasCard(card))
        btn.setText(Game.getInstance().getEnemyPlayer().hand().field().card(card).toString());
        else
        btn.setText("enemyFieldCard" + card);
    }
        
    public static void main(String[] args) {
        launch(args);
    }
}