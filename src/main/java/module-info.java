module com.example.hashtool {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.bouncycastle.provider;
    requires java.desktop;


    opens com.example.hashtool to javafx.fxml;
    exports com.example.hashtool;
}