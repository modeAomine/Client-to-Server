module com.example.client1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires okhttp3;
    requires static lombok;
    requires com.google.gson;
    requires org.controlsfx.controls;
    requires annotations;
    opens com.example.client1.response;
    opens com.example.client1.Entity;



    opens com.example.client1 to javafx.fxml;
    exports com.example.client1;
    exports com.example.client1.Entity;
    exports com.example.client1.response;
}