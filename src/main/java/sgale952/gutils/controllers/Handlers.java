package sgale952.gutils.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

import static sgale952.gutils.generator.Team.characterCheckList;

public class Handlers {

    public void changeScene(Button btn, String res) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(res));
        Stage window = (Stage) btn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 670, 405));
    }

    //List characters in Generator
    public void characterCheck(CheckBox cb) {
        if (cb.isSelected()) {
            characterCheckList.add(cb.getId());
        } else {
            characterCheckList.remove(cb.getId());
        }
    }

    //Checking selected characters in Generator for selectAll button
    public void checkSelected(CheckBox selectAll, CheckBox cb) {
        if (selectAll.isSelected() && !cb.isSelected()) {
            cb.fire();
        } else if (!selectAll.isSelected() && cb.isSelected()) {
            cb.fire();
        }
    }
}
