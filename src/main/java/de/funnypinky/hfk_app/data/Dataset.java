/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.funnypinky.hfk_app.data;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author shaesler
 */
public class Dataset {

	private DateTime datum;
	private String name;
	private String firstname;
	private boolean kontamination = false;
	private String nuklid;
	private String einheit;
	private double wertHR;
	private double wertHL;
	private double wertFL;
	private double wertFR;

	public void setDatum(String date) {
		String[] tempDate = date.split(" ");
		DateTimeFormatter dateFormat = DateTimeFormat.forPattern("dd.MM.yyyyHH:mm:ss");
		this.datum = dateFormat.parseDateTime(tempDate[0]+tempDate[2]);
	}

	public DateTime getDatum() {
		return datum;
	}

	public void setDatum(DateTime datum) {
		this.datum = datum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isKontamination() {
		return kontamination;
	}

	public void setKontamination(boolean kontamination) {
		this.kontamination = kontamination;
	}

	public String getNuklid() {
		return nuklid;
	}

	public void setNuklid(String nuklid) {
		this.nuklid = nuklid;
	}

	public String getEinheit() {
		return einheit;
	}

	public void setEinheit(String einheit) {
		this.einheit = einheit;
	}

	public double getWertHR() {
		return wertHR;
	}

	public void setWertHR(double wertHR) {
		this.wertHR = wertHR;
	}

	public double getWertHL() {
		return wertHL;
	}

	public void setWertHL(double wertHL) {
		this.wertHL = wertHL;
	}

	public double getWertFL() {
		return wertFL;
	}

	public void setWertFL(double wertFL) {
		this.wertFL = wertFL;
	}

	public double getWertFR() {
		return wertFR;
	}

	public void setWertFR(double wertFR) {
		this.wertFR = wertFR;
	}

}
