module com.simon.simonsmemberform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.simon.simonsmemberform to javafx.fxml;
    exports com.simon.simonsmemberform;
}