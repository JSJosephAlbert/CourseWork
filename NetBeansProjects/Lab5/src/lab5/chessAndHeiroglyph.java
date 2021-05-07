package lab5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/*
programmer: joseph
date: 3/22/20
description: prints 8x8 board of button with an image of a ches piece on one,
and also displays three random heiroglyphs.
*/

public class chessAndHeiroglyph extends Application {

    private Pane pane = new HBox(10);
    @Override 
    public void start(Stage primaryStage) {
        
        
        pane.setPadding(new Insets(5, 5, 5, 5));
        for (int i = 0; i < 3; i++) {
            Image image = new Image("pics/" + (int) (Math.random() * 60) + ".png");
            pane.getChildren().add(new ImageView(image));
        }
        
        Button btRefresh = new Button("Refresh");
        btRefresh.setOnAction(e -> refresh());
        pane.getChildren().add(0, btRefresh);
        
       
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 

        GridPane pane2 = new GridPane();
        pane2.setAlignment(Pos.CENTER);

        int count2 = 0;
        while (count2 < 8) {
            for (int i = 1; i < 8; i++) {
                if (i == 3) {
                    Image image2 = new Image("chess/king.png", 12, 12, false, false);
                    Button butt = new Button("");
                    butt.setGraphic(new ImageView(image2));
                    pane2.add(butt, 0, i);
                } else {
                    pane2.add(new Button("   "), count2, i + 1);
                }
            }
            count2++;
        }
        pane2.setPadding(new Insets(10, 10, 10, 10));

        Scene scene2 = new Scene(pane2);

        Stage stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.show();
    }
    
    public void refresh(){
        for (int i = 1; i < 4; i++) {
            pane.getChildren().remove(1, 4);
            Image image = new Image("pics/" + (int) (Math.random() * 60) + ".png");
            pane.getChildren().add(i , new ImageView(image));
        }
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
