/**
 * 
 */
package de.funnypinky.hfk_app.data;

import java.util.ArrayList;

import org.joda.time.DateTime;

/**
 * @author shaesler
 *
 */
public class Employee {

	private String name;
	private String firstname;
	private DateTime birthday;
	private final long uniqueID = DateTime.now().getMillis();
	private final ArrayList<HFKentry> hfkList = new ArrayList<>();

	public Employee(String name, String firstname) {
		super();
		this.name = name;
		this.firstname = firstname;
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

	public DateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(DateTime birthday) {
		this.birthday = birthday;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public ArrayList<HFKentry> getHfkList() {
		return hfkList;
	}

}
