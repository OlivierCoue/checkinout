package model;

public class Boss extends Person {

	public Boss(String firstname, String lastname) {
		super(firstname, lastname);
	}
	
	public String toString() {
		return "\nBoss"+super.toString();
	}
	
}
