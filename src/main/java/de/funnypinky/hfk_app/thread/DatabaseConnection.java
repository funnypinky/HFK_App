package de.funnypinky.hfk_app.thread;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.SessionFactory;

public class DatabaseConnection {
	String currentPath = System.getProperty("user.dir");
	String dataBasePath = currentPath + "\\database\\";
	String dataBaseName = "data.db";
	String url = "jdbc:sqlite:" + dataBasePath+dataBaseName;
	private Connection conn;

	public boolean connect() {
		if(!Files.exists(Paths.get(dataBasePath))) {
			try {
				Files.createDirectories(Paths.get(dataBasePath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try  {
			this.conn = DriverManager.getConnection(url);
			SessionFactory factory;
			System.out.println("Connection to SQLite has been established.");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
