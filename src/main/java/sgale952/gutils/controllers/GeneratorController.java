package sgale952.gutils.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import sgale952.gutils.generator.Team;

public class GeneratorController {

    @FXML
    private ScrollBar scroll;
    @FXML
    private AnchorPane pane;
    @FXML
    private Button backButton;
    @FXML
    private CheckBox Kirara, Baizhu, Kaveh, Mika, Dehya, Alhaitham, Yaoyao, Wanderer;

    @FXML
    void initialize() {
        scroll.setMin(0);
        scroll.setMax(270);
        scroll.setValue(0);

        scroll.valueProperty().addListener(event->{pane.setTranslateY(-10-scroll.getValue());});
    }

    Handlers handler = new Handlers();
    public void backButtonHandler() throws IOException {
        handler.changeScene(backButton, "/sgale952/gutils/Generator/genMenu.fxml");
    }

    Team t = new Team();
    public void characterCheck(CheckBox cb) {
        if (cb.isSelected()) {
            t.characterList.add(cb.getId());
            System.out.println(t.characterList.size());
        }
        else {
            t.characterList.remove(cb.getId());
            System.out.println(t.characterList.size());
        }
    }
    public void kiraraCheck(){
        characterCheck(Kirara);
    }
    public void baizhuCheck(){
        characterCheck(Baizhu);
    }
    public void kavehCheck(){
        characterCheck(Kaveh);
    }
    public void mikaCheck(){
        characterCheck(Mika);
    }
    public void dehyaCheck(){
        characterCheck(Dehya);
    }
    public void alhaithamCheck(){
        characterCheck(Alhaitham);
    }
    public void yaoyaoCheck(){
        characterCheck(Yaoyao);
    }
    public void wandererCheck(){
        characterCheck(Wanderer);
    }
}

