package sgale952.gutils.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button aboutButton, mainButton, calculatorButton, critValueCalcButton, generatorButton, menuCalcButton, menuGenButton, teamGenButton;

    Handlers handler = new Handlers();
    public void aboutButtonHandler() throws IOException {
        handler.changeScene(aboutButton, "/sgale952/gutils/menu/about.fxml");
    }

    public void mainButtonHandler() throws IOException {
        handler.changeScene(mainButton, "/sgale952/gutils/menu/main.fxml");
    }

    public void calculatorButtonHandler() throws IOException {
        handler.changeScene(calculatorButton, "/sgale952/gutils/calculatorScene/calcMenu.fxml");
    }

    public void generatorButtonHandler() throws IOException {
        handler.changeScene(generatorButton, "/sgale952/gutils/generatorScene/genMenu.fxml");
    }

    public void menuCalcButtonHandler() throws IOException {
        handler.changeScene(menuCalcButton, "/sgale952/gutils/menu/main.fxml");
    }

    public void menuGenButtonHandler() throws IOException {
        handler.changeScene(menuGenButton, "/sgale952/gutils/menu/main.fxml");
    }

    public void teamGenButtonHandler() throws IOException {
        handler.changeScene(teamGenButton, "/sgale952/gutils/generatorScene/genCharacter.fxml");
    }

    public void critValueCalcButtonHandler() throws IOException {
        handler.changeScene(critValueCalcButton, "/sgale952/gutils/calculatorScene/critValue.fxml");
    }

}
