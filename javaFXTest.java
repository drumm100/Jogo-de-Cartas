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

public class javaFXTest extends Application{
    
    Button btnFieldCard1, btnFieldCard2, btnFieldCard3, btnFieldCard4, btnFieldCard5;
    Button btnEnemyFieldCard1, btnEnemyFieldCard2, btnEnemyFieldCard3, btnEnemyFieldCard4, btnEnemyFieldCard5;
    Stage player1Stage;
    int selectedCard1 = 0;
    int selectedCard2 = 0;

    private void ShowCards(){
        Image card1 = new Image("/cartas templates/alfio.jpg", 200, 300, false, true);
        btnFieldCard1.setGraphic(new ImageView(card1));
    }
        
    @Override
    public void start(Stage player1Stage) {
        // Define o fieldGrid
        GridPane fieldGrid = new GridPane();
        fieldGrid.setAlignment(Pos.CENTER);
        fieldGrid.setHgap(20);
        fieldGrid.setVgap(10);
        fieldGrid.setPadding(new Insets(25, 25, 25, 25));

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
        fieldGrid.add(btnFieldCard1, 0, 0);
        
        btnFieldCard2 = new Button();
        btnFieldCard2.setMaxHeight(300);
        btnFieldCard2.setMaxWidth(200);
        btnFieldCard2.setMinHeight(300);
        btnFieldCard2.setMinWidth(200);
        btnFieldCard2.setOnAction((ActionEvent e) -> {
            selectedCard1 = 2;
        });
        fieldGrid.add(btnFieldCard2, 1, 0);

        btnFieldCard3 = new Button();
        btnFieldCard3.setMaxHeight(300);
        btnFieldCard3.setMaxWidth(200);
        btnFieldCard3.setMinHeight(300);
        btnFieldCard3.setMinWidth(200);
        btnFieldCard3.setOnAction((ActionEvent e) -> {
            selectedCard1 = 3;
        });
        fieldGrid.add(btnFieldCard3, 2, 0);
        
        btnFieldCard4 = new Button();
        btnFieldCard4.setMaxHeight(300);
        btnFieldCard4.setMaxWidth(200);
        btnFieldCard4.setMinHeight(300);
        btnFieldCard4.setMinWidth(200);
        btnFieldCard4.setOnAction((ActionEvent e) -> {
            selectedCard1 = 4;
        });
        fieldGrid.add(btnFieldCard4, 3, 0);
        
        btnFieldCard5 = new Button();
        btnFieldCard5.setMaxHeight(300);
        btnFieldCard5.setMaxWidth(200);
        btnFieldCard5.setMinHeight(300);
        btnFieldCard5.setMinWidth(200);
        btnFieldCard5.setOnAction((ActionEvent e) -> {
            selectedCard1 = 5;
        });
        fieldGrid.add(btnFieldCard5, 4, 0);

        btnEnemyFieldCard1 = new Button();
        btnEnemyFieldCard1.setMaxHeight(300);
        btnEnemyFieldCard1.setMaxWidth(200);
        btnEnemyFieldCard1.setMinHeight(300);
        btnEnemyFieldCard1.setMinWidth(200);
        btnEnemyFieldCard1.setOnAction((ActionEvent e) -> {
            selectedCard2 = 1;
        });
        fieldGrid.add(btnEnemyFieldCard1, 0, 1);

        btnEnemyFieldCard2 = new Button();
        btnEnemyFieldCard2.setMaxHeight(300);
        btnEnemyFieldCard2.setMaxWidth(200);
        btnEnemyFieldCard2.setMinHeight(300);
        btnEnemyFieldCard2.setMinWidth(200);
        btnEnemyFieldCard2.setOnAction((ActionEvent e) -> {
            selectedCard2 = 2;
        });
        fieldGrid.add(btnEnemyFieldCard2, 1, 1);

        btnEnemyFieldCard3 = new Button();
        btnEnemyFieldCard3.setMaxHeight(300);
        btnEnemyFieldCard3.setMaxWidth(200);
        btnEnemyFieldCard3.setMinHeight(300);
        btnEnemyFieldCard3.setMinWidth(200);
        btnEnemyFieldCard3.setOnAction((ActionEvent e) -> {
            selectedCard2 = 3;
        });
        fieldGrid.add(btnEnemyFieldCard3, 2, 1);

        btnEnemyFieldCard4 = new Button();
        btnEnemyFieldCard4.setMaxHeight(300);
        btnEnemyFieldCard4.setMaxWidth(200);
        btnEnemyFieldCard4.setMinHeight(300);
        btnEnemyFieldCard4.setMinWidth(200);
        btnEnemyFieldCard4.setOnAction((ActionEvent e) -> {
            selectedCard2 = 4;
        });
        fieldGrid.add(btnEnemyFieldCard4, 3, 1);

        btnEnemyFieldCard5 = new Button();
        btnEnemyFieldCard5.setMaxHeight(300);
        btnEnemyFieldCard5.setMaxWidth(200);
        btnEnemyFieldCard5.setMinHeight(300);
        btnEnemyFieldCard5.setMinWidth(200);
        btnEnemyFieldCard5.setOnAction((ActionEvent e) -> {
            selectedCard2 = 5;
        });
        fieldGrid.add(btnEnemyFieldCard5, 4, 1);
        
        ShowCards();
        // Adiciona o painel a cena e exibe        
        Scene scene = new Scene(fieldGrid);
        player1Stage = new Stage();
        player1Stage.setTitle("jogador 1");
        player1Stage.setScene(scene);
        player1Stage.show();
    }
        
    public static void main(String[] args) {
        launch(args);
    }
}