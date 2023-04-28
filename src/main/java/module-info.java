module com.example.harrypotter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.harrypotter to javafx.fxml;
    exports com.example.harrypotter;
}