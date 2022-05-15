package RockPaperScisors;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Credits {

    private Text coder = new Text(0, 40, "Programmer: Vincent Tanujaya");
    private Text graphics = new Text(0, 40, "Illustration: Irasutoya(いらすとや)");
    Group cred = new Group();
    Scene credit = new Scene(cred, 600, 500, Color.rgb(50, 50, 50));
    private Button exit = new Button("Exit");

    public Credits() {
        coder.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 20));
        coder.setFill(Color.rgb(250, 250, 250));
        graphics.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 20));
        graphics.setLayoutY(30);
        graphics.setFill(Color.rgb(250, 250, 250));
        exit.setText("Exit");
        exit.setLayoutX(565);
        cred.getChildren().addAll(coder, graphics, exit);
    }

    public void getMenu(Stage st, Scene sc, Credits cr) {
        st.setScene(cr.credit);
        interaction(st, sc);
    }

    public void interaction(Stage st, Scene sc) {
        exit.setOnMousePressed((MouseEvent me)
                -> st.setScene(sc));
    }
}
