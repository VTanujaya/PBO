package goaltest;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.input.MouseEvent;

public class Goal {

    private String dukePath = "Images/Duke.png";
    private Image dukeImage = new Image(getClass().getResource(dukePath).toString());
    private ImageView dukeImageView = new ImageView(dukeImage);
    private String glovePath = "Images/Glove.png";
    private Image gloveImage = new Image(getClass().getResource(glovePath).toString());
    private ImageView gloveImageView = new ImageView(gloveImage);
    private AudioClip tone = new AudioClip(getClass().getResource("Audio/Note5.wav").toString());

    public Goal(double x, double y) {
        dukeImageView.setLayoutX(x);
        dukeImageView.setLayoutY(y);
        gloveImageView.setPreserveRatio(true);
        gloveImageView.setFitWidth(dukeImageView.getFitWidth());
        gloveImageView.setFitHeight(30);
        gloveImageView.setLayoutX(dukeImageView.getLayoutX() + 18);
        gloveImageView.setLayoutY(dukeImageView.getLayoutY() - 5);
        GoalTest.root.getChildren().addAll(dukeImageView, gloveImageView);
        interactions();
    }

    private void interactions() {
        dukeImageView.setOnMousePressed((MouseEvent me) -> tone.play());
        dukeImageView.setOnMouseDragged((MouseEvent me) -> {
            System.out.println("X Cursor: " + me.getSceneX());
            System.out.println("Y Cursor: " + me.getSceneY());
        });
    }
}
