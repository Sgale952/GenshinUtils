package sgale952.gutils.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

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
        MathContext context = new MathContext(3, RoundingMode.HALF_UP);
        double CR = Double.parseDouble(critRateField.getText());
        double CD = Double.parseDouble(critDamageField.getText());

        if(critValueButton.isSelected()){
            BigDecimal value = new BigDecimal(CR*2+CD, context);
            resultField.setText(String.valueOf(value));
        }
        else if(critRatioButton.isSelected()){
            BigDecimal ratio = new BigDecimal(1+(CR/100)*(CD/100), context);
            resultField.setText(String.valueOf(ratio));
        }
    }
}


