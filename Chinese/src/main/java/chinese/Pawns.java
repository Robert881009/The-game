package chinese;

import javafx.scene.image.*;

public class Pawns {
    private Image blue = new Image("blue.png");

    public ImageView ImageView () {
        ImageView imageView = new ImageView(blue);
        imageView.setFitWidth(40);
        imageView.setFitHeight(40);
        return imageView;


    }
}
