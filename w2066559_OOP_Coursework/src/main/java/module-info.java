module com.example.w2066559_oop_coursework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w2066559_oop_coursework to javafx.fxml;
    exports com.example.w2066559_oop_coursework;
}