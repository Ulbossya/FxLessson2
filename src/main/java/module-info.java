module com.example.fxlesssson2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxlesssson2 to javafx.fxml;
    exports com.example.fxlesssson2;
}