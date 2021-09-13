module com.example.passwordgenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.passwordgenerator to javafx.fxml;
    exports com.example.passwordgenerator;
}