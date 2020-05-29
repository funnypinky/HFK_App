package de.funnypinky.hfk_app;

import java.net.URL;
import java.util.ResourceBundle;

import de.funnypinky.hfk_app.thread.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class AppController implements Initializable {
	
	private DatabaseConnection dbConn = new DatabaseConnection();
	
	private boolean connected;

	@FXML
	private MenuItem exit;

	@FXML
	private BorderPane mainLayout;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		connected = dbConn.connect();
	}

	@FXML
	protected void exitApplication() {
		dbConn.disconnect();
		System.exit(0);
	}

}
