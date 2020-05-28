module de.funnypinky.hfk_app {
    requires javafx.controls;
    requires javafx.fxml;
	requires org.joda.time;
	requires java.desktop;
	requires javafx.base;
	requires javafx.graphics;
	requires java.sql;

    opens de.funnypinky.hfk_app to javafx.fxml;
    exports de.funnypinky.hfk_app;
}