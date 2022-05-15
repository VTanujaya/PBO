/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RockPaperScisors;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Vincent Tanujaya
 */
public class MainMenu {

    Group home = new Group();
    final Scene main = new Scene(home, 600, 500, Color.rgb(50, 50, 50));
    private Button start = new Button();
    private Button credits = new Button();
    private Button exit = new Button();
    private Text title = new Text(0, 40, "Rock Paper Scisors");

    public MainMenu(Stage game, RPS rps, Credits cr) {
        title.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.NORMAL, 60));
        title.setFill(Color.rgb(250, 250, 250));
        title.setLayoutX(50);
        title.setLayoutY(200);
        final DropShadow dropShadow = new DropShadow();
        title.setEffect(dropShadow);
        start.setText("Start");
        start.setLayoutY(370);
        start.setLayoutX(275);
        credits.setText("Credits");
        credits.setLayoutY(400);
        credits.setLayoutX(270);
        exit.setText("Exit");
        exit.setLayoutY(430);
        exit.setLayoutX(277);
        home.getChildren().addAll(start, credits, exit, title);
        Interaction(game, rps, cr);
    }

    public void Interaction(Stage game, RPS rps, Credits cr) {
        start.setOnMouseClicked((MouseEvent me) -> rps.getMenu(game, main, rps));
        credits.setOnMouseClicked((MouseEvent me) -> cr.getMenu(game, main, cr));
        exit.setOnMouseClicked((MouseEvent me) -> System.exit(0));
    }

}
