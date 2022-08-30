module com.example.heredan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.heredan to javafx.fxml;
    exports com.example.heredan;
}