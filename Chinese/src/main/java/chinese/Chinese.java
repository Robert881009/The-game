package chinese;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Chinese extends Application {
    private Pane pane = new Pane();
    private Image imageback = new Image("plansza3.jpg");
    private Pawns pawn = new Pawns();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        pane.setBackground(background);

        ImageView pawn1 = pawn.ImageView();
        pawn1.setLayoutX(90);
        pawn1.setLayoutY(90);

        ImageView pawn2 = pawn.ImageView();
        pawn2.setLayoutX(90);
        pawn2.setLayoutY(140);

        ImageView pawn3 = pawn.ImageView();
        pawn3.setLayoutY(90);
        pawn3.setLayoutX(140);

        ImageView pawn4 = pawn.ImageView();
        pawn4.setLayoutY(140);
        pawn4.setLayoutX(140);

        pane.getChildren().addAll(pawn1, pawn2, pawn3,pawn4);

        Scene scene = new Scene(pane,720,720);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Chinese");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
