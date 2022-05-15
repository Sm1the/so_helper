module com.anypixelstudio.ru {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.anypixelstudio.ru to javafx.fxml;
    exports com.anypixelstudio.ru;
}
