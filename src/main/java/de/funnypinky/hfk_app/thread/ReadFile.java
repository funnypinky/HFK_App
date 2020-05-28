/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.funnypinky.hfk_app.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.joda.time.format.DateTimeFormat;

import de.funnypinky.hfk_app.data.Dataset;

/**
 *
 * @author shaesler
 */
public class ReadFile {

	private final File file;

	public ReadFile(File aFile) throws IOException {
		this.file = aFile;
	}

	public ArrayList<Dataset> reading() {
		try {
			BufferedReader reader = new BufferedReader(
					new java.io.InputStreamReader(new FileInputStream(this.file), "Cp1252"));
			Stream<String> allLines = reader.lines();
			ArrayList<Dataset> dataList = new ArrayList<>();
			allLines.skip(2).forEach(line -> {
				String[] data = line.split("\t");
				Dataset temp = new Dataset();
				temp.setDatum(data[0]);
				temp.setName(data[1]);
				temp.setFirstname(data[2]);
				temp.setKontamination(data[5].equals("x"));
				temp.setNuklid(data[6]);
				temp.setEinheit(data[7]);
				temp.setWertFL(Double.valueOf(data[68]));
				temp.setWertFR(Double.valueOf(data[69]));
				temp.setWertHL(Double.valueOf(data[65]));
				temp.setWertHR(Double.valueOf(data[67]));
				dataList.add(temp);
			});
			reader.close();
			return dataList;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public int countLines() throws IOException {
		try (LineNumberReader reader = new LineNumberReader(new FileReader(this.file))) {
			return reader.getLineNumber();
		} catch (Exception ex) {
			return -1;
		}
	}

}
