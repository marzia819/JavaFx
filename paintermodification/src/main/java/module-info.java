module com.example.paintermodification {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.paintermodification to javafx.fxml;
    exports com.example.paintermodification;
}