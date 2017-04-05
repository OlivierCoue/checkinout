package model;

import java.util.UUID;

public abstract class Person {
	
	private String id;
	private String firstname;
	private String lastname;
	
	public Person(String firstname, String lastname) {		
		this.id = generateId();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	private String generateId(){
		return UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFullname(){
		return firstname + " " + lastname;
	}
	
	public String toString() {
		return "\nid: " + id + "\nfirtsname: " + firstname + "\nlastname: " + lastname;
	}
	
}
