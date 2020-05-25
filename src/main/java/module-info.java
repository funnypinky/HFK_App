module de.funnypinky.hfk_app {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.funnypinky.hfk_app to javafx.fxml;
    exports de.funnypinky.hfk_app;
}