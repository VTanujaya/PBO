package RockPaperScisors;

import java.util.ArrayList;
import java.util.Random;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RPS {

    Random rand = new Random();
    static Group root = new Group();
    final Scene scene = new Scene(root, 600, 500, Color.rgb(50, 50, 50));
    private int scores;
    private int human;
    private int computer = rand.nextInt(3);
    private Timeline time;
    private Image rock = new Image(getClass().getResource("Image/Rock.png").toString());
    private ImageView rockView = new ImageView(rock);
    private Image paper = new Image(getClass().getResource("Image/Paper.png").toString());
    private ImageView paperView = new ImageView(paper);
    private ArrayList<Image> images = new ArrayList<>();
    private Image scisors = new Image(getClass().getResource("Image/Scisors.png").toString());
    private ImageView scisorsView = new ImageView(scisors);
    private Image smoke = new Image(getClass().getResource("Image/Smoke.png").toString());
    private ImageView smokeView = new ImageView(smoke);
    private ImageView hiddenView = new ImageView();
    private Text score = new Text(0, 40, "Score: " + scores);
    private Text status = new Text();
    private Button exit = new Button("Exit");

    public RPS() {
        images.add(rock);
        images.add(paper);
        images.add(scisors);
        rockView.setLayoutX(50);
        rockView.setLayoutY(350);
        rockView.setPreserveRatio(true);
        rockView.setFitHeight(100);
        paperView.setLayoutX(250);
        paperView.setLayoutY(350);
        paperView.setPreserveRatio(true);
        paperView.setFitHeight(100);
        scisorsView.setLayoutX(450);
        scisorsView.setLayoutY(350);
        scisorsView.setPreserveRatio(true);
        scisorsView.setFitHeight(100);
        score.setLayoutX(225);
        score.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.NORMAL, 50));
        score.setFill(Color.rgb(250, 250, 250));
        status.setLayoutX(255);
        status.setLayoutY(275);
        status.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.NORMAL, 30));
        status.setFill(Color.rgb(250, 250, 250));
        hiddenView.setPreserveRatio(true);
        hiddenView.setFitHeight(100);
        hiddenView.setLayoutX(250);
        hiddenView.setLayoutY(130);
        hiddenView.setImage(images.get(this.computer));
        smokeView.setPreserveRatio(true);
        smokeView.setFitHeight(150);
        smokeView.setLayoutX(220);
        exit.setLayoutX(565);
        smokeView.setLayoutY(100);
        root.getChildren().addAll(rockView, paperView, scisorsView, exit, score, hiddenView, smokeView, status);
    }

    public void getMenu(Stage game, Scene sc, RPS rps) {
        game.setScene(rps.scene);
        smokeView.setImage(smoke);
        status.setOpacity(0);
        Interaction(game, sc);
    }

    public void Interaction(Stage st, Scene sc) {
        smokeView.setOpacity(100);
        exit.setOnMouseClicked((MouseEvent me) -> {
            this.scores = 0;
            score.setText("Score: " + scores);
            st.setScene(sc);
        });
        rockView.setOnMousePressed((MouseEvent me) -> {
            human = 0;
            Comparison(st, sc);
        });
        paperView.setOnMousePressed((MouseEvent me) -> {
            human = 1;
            Comparison(st, sc);
        });
        scisorsView.setOnMousePressed((MouseEvent me) -> {
            human = 2;
            Comparison(st, sc);
        });

    }

    private void Timeline(Stage st, Scene sc) {
        smokeView.setImage(null);
        status.setOpacity(100);
        Interaction(st, sc);
    }
    private void Comparison(Stage st, Scene sc) {
        this.computer = rand.nextInt(3);
        this.hiddenView.setImage(images.get(computer));
        if (human == computer) {
            status.setText("It's a Tie");
        } else if (human - computer == -1 || human - computer == 2) {
            status.setText("You Lose");
        } else if (human - computer == 1 || human - computer == -2) {
            status.setText("You Win");
            this.scores++;
            score.setText("Score: " + scores);
        }
        Timeline(st, sc);
    }

    public Scene getScene() {
        return scene;
    }
}
