package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("interface.fxml"));
        primaryStage.setTitle("Jogo Super Master de Cartas");
        primaryStage.setScene(new Scene(root, 815, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Game.getInstance().start();
        launch(args);
    }
}
