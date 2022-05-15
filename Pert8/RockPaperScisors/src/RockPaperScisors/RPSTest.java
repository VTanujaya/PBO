/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package RockPaperScisors;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Vincent Tanujaya
 */
public class RPSTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        RPS game = new RPS();
        Credits cr = new Credits();
        MainMenu menu = new MainMenu(primaryStage, game, cr);
        primaryStage.setTitle("Rock Paper Scisors");
        primaryStage.setResizable(false);
        primaryStage.setScene(menu.main);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
