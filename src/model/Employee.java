package model;

public class Employee extends Person{

	private StandardDepartment standardDepartment;
	
	public Employee(String firstname, String lastname, StandardDepartment standardDepartement) {
		super(firstname, lastname);
		this.standardDepartment = standardDepartement;
	}
	
	public StandardDepartment getStandardDepartement() {
		return standardDepartment;
	}

	public void setStandardDepartement(StandardDepartment standardDepartment) {
		this.standardDepartment = standardDepartment;
	}

	public String toString() {
		return "\nEmployee"+super.toString() + "\nDepartment: " + standardDepartment.getName();
	}
}
