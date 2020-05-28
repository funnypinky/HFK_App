package de.funnypinky.hfk_app.data;

import org.joda.time.DateTime;

public class HFKentry {

	private DateTime datum;
	private boolean kontamination = false;
	private String nuklid;
	private String einheit;
	private double wertHR;
	private double wertHL;
	private double wertFL;
	private double wertFR;

	public HFKentry(DateTime datum) {
		super();
		this.datum = datum;
	}

	public DateTime getDatum() {
		return datum;
	}

	public void setDatum(DateTime datum) {
		this.datum = datum;
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
