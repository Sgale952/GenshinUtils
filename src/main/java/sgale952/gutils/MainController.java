package sgale952.gutils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button aboutButton;

    public void aboutButtonHandler() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("about.fxml"));
        Stage window = (Stage) aboutButton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 670, 405));
    }

}
