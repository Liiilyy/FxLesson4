module com.example.fxlesson4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxlesson4 to javafx.fxml;
    exports com.example.fxlesson4;
}