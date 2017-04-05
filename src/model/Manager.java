package model;

public class Manager extends Employee {
	
	public Manager(String firstname, String lastname, StandardDepartment standardDepartement) {
		super(firstname, lastname, standardDepartement);
	}
	
	public String toString() {
		return "\nManager " + super.toString();
	}
	
}
