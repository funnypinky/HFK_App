package de.funnypinky.hfk_app;

import java.io.IOException;

import de.funnypinky.hfk_app.thread.DatabaseConnection;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	private Scene scene;

	@Override
	public void start(Stage stage) throws IOException {
		
		stage.centerOnScreen();
		stage.setMaximized(true);
		scene = new Scene(loadFXML("app"));
		stage.setScene(scene);
		stage.show();
	}

	void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));

	}

	private Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}

	public static void main(String[] args) {
		launch();
	}

}