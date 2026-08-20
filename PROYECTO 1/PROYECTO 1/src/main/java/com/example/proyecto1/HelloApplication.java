package com.example.proyecto1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
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
        Label lblNumber1 = new Label("Numero1");
        TextField tfNumber1 = new TextField();
        Label lblNumber2 = new Label("Numero 2");
        TextField tfNumber2 = new TextField();
        Label lblAnswer = new Label("Resultado= 0");





        Button btnSum = new Button ("+");
        Button btnSub = new Button ("-");
        Button btnMul = new Button ("*");
        Button btnDiv = new Button ("/");


        btnSum.setOnAction ( e-> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = HelloController.sum(num1,num2);
            lblAnswer.setText(String.valueOf(resultado));
        });

        btnSub.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = HelloController.sub(num1, num2);
            lblAnswer.setText(String.valueOf(resultado));
        });

        btnMul.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = HelloController.mul(num1, num2);
            lblAnswer.setText(String.valueOf(resultado));
        });

        btnDiv.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());

            if (num2 != 0) {
                int resultado = HelloController.div(num1, num2);
                lblAnswer.setText(String.valueOf(resultado));
            } else {
                lblAnswer.setText("Error: división por cero");
            }
        });

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.setPadding((new Insets(5)));
        buttons.setAlignment(Pos.CENTER);
        buttons.setStyle("-fx-border-radius: 10; -fx-border-color: #ab0036;");
        buttons.getChildren().addAll(btnSum,btnSub,btnMul,btnDiv);




        root.getChildren().addAll(lblTitle,lblNumber1,tfNumber1,lblNumber2,tfNumber2,lblAnswer, buttons);



        Scene scene = new Scene (root);
        stage.setScene(scene);
        stage.setTitle("Ejemplo 1 - Seccion 2");
        stage.show();



    }
}
