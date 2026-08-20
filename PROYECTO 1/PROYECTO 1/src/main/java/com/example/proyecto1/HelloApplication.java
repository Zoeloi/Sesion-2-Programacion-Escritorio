package com.example.proyecto1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding (new Insets(20));

        Label lblTitle = new Label ("Calculadora Basica");
        root.getChildren ().add(lblTitle);


        Scene scene = new Scene (root);
        stage.setScene(scene);
        stage.setTitle("Ejemplo 1 - Seccion 2");
        stage.show();
    }
}
