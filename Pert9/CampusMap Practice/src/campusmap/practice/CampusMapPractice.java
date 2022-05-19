/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package campusmap.practice;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Vincent Tanujaya
 */
public class CampusMapPractice extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 500, Color.rgb(50, 50, 50));
        ArrayList<Dorm> all = new ArrayList<>();
        ArrayList<CenterPoint> center = new ArrayList<>();
        Dorm dr1 = new Dorm(1, 420, center, 160, 231, 0);
        Dorm dr2 = new Dorm(2, 120, center, 10, 222, 20);
        Dorm dr3 = new Dorm(3, 330, center, 40, 30, 20);
        Dorm dr4 = new Dorm(4, 250, center, 255, 255, 0);
        all.add(dr1);
        all.add(dr2);
        all.add(dr3);
        all.add(dr4);
        CenterPoint cr1 = new CenterPoint(all);
        center.add(cr1);
        CenterPoint cr2 = new CenterPoint(dr1, dr3, dr4);
        center.add(cr2);
        root.getChildren().addAll(dr1.getLabel(), dr2.getLabel(), dr3.getLabel(), dr4.getLabel());
        root.getChildren().addAll(dr1.getPopu(), dr2.getPopu(), dr3.getPopu(), dr4.getPopu());
        root.getChildren().addAll(dr1.getSQ(), dr2.getSQ(), dr3.getSQ(), dr4.getSQ());
        root.getChildren().addAll(cr1.getDistance(), cr1.getCenter(), cr1.getLabel());
        root.getChildren().addAll(cr2.getDistance(), cr2.getCenter(), cr2.getLabel());
        cr1.setCenter(all);
        primaryStage.setTitle("Campus Map");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
