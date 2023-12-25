/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pizzaria.shop;

import java.awt.Color;
import java.awt.Rectangle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Moham
 */
public class PizzariaShop extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        Pane pane = new Pane();
        Button btn = new Button();
        primaryStage.setTitle("Welcome to Home Style Pizza Shop");
        CheckBox chk = new CheckBox("Tomato");
        CheckBox chk2 = new CheckBox("Green Pepper");
        CheckBox chk3 = new CheckBox("Black Olives");
        CheckBox chk4 = new CheckBox("Mushroms");
        CheckBox chk5 = new CheckBox("Extra cheese");
        CheckBox chk6 = new CheckBox("Pepproni");
        CheckBox chk7 = new CheckBox("Sausage");
        Rectangle frame = new Rectangle(10, 10, 380, 280);
        frame.setStroke(Color.ORANGE); // Set the stroke color to orange
        frame.setFill(null); // Set the fill color to transparent

        // Add the rectangle to the pane
        pane.getChildren().add(frame);
        root.add(chk, 0, 5);
        root.add(chk2, 0, 10);
        root.add(chk3, 0, 15);
        root.add(chk4, 0, 16);
        root.add(chk5, 0, 17);
        root.add(chk6, 0, 18);
        root.add(chk7, 0, 19);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               // System.out.println("");
            }
        });
        
      //  StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
