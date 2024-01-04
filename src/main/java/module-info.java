module com.example.asgn2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires xstream;


    opens com.example.asgn2 to javafx.fxml,xstream;
    exports com.example.asgn2;
    exports model to xstream;
    opens model to xstream;
}