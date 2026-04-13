module com.example.mydebitpinsetter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mydebitpinsetter to javafx.fxml;
    exports com.example.mydebitpinsetter;
}