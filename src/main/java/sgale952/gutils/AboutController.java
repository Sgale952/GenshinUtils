package sgale952.gutils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class AboutController {

    public Hyperlink sgaleLink;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button mainButton;


    public void mainButtonHandler() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        Stage window = (Stage) mainButton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 670, 405));
    }

/*    @FXML
    void initialize() {
        sgaleLink.setOnAction(e -> {
            Application.getHostServices().showDocument("https://www.openai.com");
        });

    }*/
}
