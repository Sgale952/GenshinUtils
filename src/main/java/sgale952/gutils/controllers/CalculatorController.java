package sgale952.gutils.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CalculatorController {

    @FXML
    private TextField critRateField, critDamageField, resultField;
    @FXML
    private Button backButton, CalculateButton;
    @FXML
    private RadioButton critValueButton, critRatioButton;

    Handlers handler = new Handlers();

    public void backButtonHandler() throws IOException {
        handler.changeScene(backButton, "/sgale952/gutils/calculatorScene/calcMenu.fxml");
    }

    public void CalculateButtonHandler(){
        if(critValueButton.isSelected()){
            double CR = Double.parseDouble(critRateField.getText());
            double CD = Double.parseDouble(critDamageField.getText());
            resultField.setText(String.valueOf(2*CR+CD));
        }
        else if(critRatioButton.isSelected()){
            double CR = Double.parseDouble(critRateField.getText())/100;
            double CD = Double.parseDouble(critDamageField.getText())/100;
            resultField.setText(String.valueOf(1+CR*CD));
        }
    }
}
