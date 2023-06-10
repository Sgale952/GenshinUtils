module sgale952.gutils {
    requires javafx.controls;
    requires javafx.fxml;


    opens sgale952.gutils to javafx.fxml;
    exports sgale952.gutils;
}