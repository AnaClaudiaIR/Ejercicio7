package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.awt.*;
import javafx.geometry.Pos;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Crear los botones
       Button button1 = new Button("1");
       Button button2 = new Button("2");
       Button button3 = new Button("3");
       Button button4 = new Button("4");
       Button button5 = new Button("5");
       Button button6 = new Button("6");
       Button button7 = new Button("7");
       Button button8 = new Button("8");
       Button button9 = new Button("9");

       //Crear la cuadrícula y posicionar los botones en el centro
       GridPane gridPane = new GridPane();
       gridPane.setAlignment(Pos.CENTER);

       gridPane.setHgap(10);
       gridPane.setVgap(10);

        //Colocar los botones
       gridPane.add(button1,0,0);
       gridPane.add(button4,0,1);
       gridPane.add(button7,0,2);

       gridPane.add(button2,1,0);
       gridPane.add(button5,1,1);
       gridPane.add(button8,1,2);

       gridPane.add(button3,2,0);
       gridPane.add(button6,2,1);
       gridPane.add(button9,2,2);

       Scene scene = new Scene(gridPane,150,150);
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
