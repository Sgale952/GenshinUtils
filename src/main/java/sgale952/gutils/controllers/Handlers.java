package sgale952.gutils.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

import sgale952.gutils.generator.Team;

public class Handlers {

    public void changeScene (Button btn, String res) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(res));
        Stage window = (Stage) btn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 670, 405));
    }


}
