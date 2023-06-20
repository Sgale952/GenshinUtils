module sgale952.gutils {
    requires javafx.controls;
    requires javafx.fxml;


    opens sgale952.gutils to javafx.fxml;
    exports sgale952.gutils;
    exports sgale952.gutils.controllers;
    opens sgale952.gutils.controllers to javafx.fxml;
}