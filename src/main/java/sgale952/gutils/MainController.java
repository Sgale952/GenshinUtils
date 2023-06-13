package sgale952.gutils;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button aboutButton, mainButton, calculatorButton, generatorButton, menuCalcButton, menuGenButton;

    Handlers handler = new Handlers();
    public void aboutButtonHandler() throws IOException {
        handler.changeScene(aboutButton, "about.fxml");
    }

    public void mainButtonHandler() throws IOException {
        handler.changeScene(mainButton, "main.fxml");
    }

    public void calculatorButtonHandler() throws IOException {
        handler.changeScene(calculatorButton, "Calculator/calcMenu.fxml");
    }

    public void generatorButtonHandler() throws IOException {
        handler.changeScene(generatorButton, "Generator/genMenu.fxml");
    }

    public void menuCalcButtonHandler() throws IOException {
        handler.changeScene(menuCalcButton, "main.fxml");
    }

    public void menuGenButtonHandler() throws IOException {
        handler.changeScene(menuGenButton, "main.fxml");
    }

}
