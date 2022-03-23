package edu.ntnu.idatt2001.magnulal.oblig3.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * TODO:COMMENT
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cardgame");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * TODO:COMMENT
     * @param args comment
     */
    public static void main(String[] args) {
        launch();
    }
}