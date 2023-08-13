module com.javafx.bomberman {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.bomberman.main to javafx.graphics;
    exports com.javafx.bomberman.main;
}