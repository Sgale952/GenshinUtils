package sgale952.gutils;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class GutilsMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 405);
        stage.setTitle("GenshinUtils");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

        InputStream iconStream = getClass().getResourceAsStream("/sgale952/gutils/Image/icon.png");
        Image image = new Image(iconStream);
        stage.getIcons().add(image);
    }

    public static void main(String[] args) {
        launch();
    }
}