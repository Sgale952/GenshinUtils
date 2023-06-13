package sgale952.gutils;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button aboutButton, mainButton, calculatorButton, generatorButton, menuCalcButton, menuGenButton;

    //not work
    public void aboutButtonHandler() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("about.fxml"));
        Stage window = (Stage) aboutButton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 670, 405));
    }

    public void mainButtonHandler() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        Stage window = (Stage) mainButton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 670, 405));
    }

    public void calculatorButtonHandler() throws IOException {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Calculator/calculator.fxml"));
        Stage window = (Stage) calculatorButton.getScene().getWindow();
        window.setScene(new Scene(fxmlloader.load(), 670, 405));
    }

    public void generatorButtonHandler() throws IOException {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Generator/generator.fxml"));
        Stage window = (Stage) generatorButton.getScene().getWindow();
        window.setScene(new Scene(fxmlloader.load(), 670, 405));
    }

    public void menuCalcButtonHandler() throws IOException {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("main.fxml"));
        Stage window = (Stage) menuCalcButton.getScene().getWindow();
        window.setScene(new Scene(fxmlloader.load(), 670, 405));
    }

    public void menuGenButtonHandler() throws IOException {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("main.fxml"));
        Stage window = (Stage) menuGenButton.getScene().getWindow();
        window.setScene(new Scene(fxmlloader.load(), 670, 405));
    }

}
