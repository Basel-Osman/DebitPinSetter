package com.example.mydebitpinsetter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Main entry point for the JavaFX PIN setter application
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                Main.class.getResource("PinSetter.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 350, 250);

        stage.setTitle("Debit Card PIN Setter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}