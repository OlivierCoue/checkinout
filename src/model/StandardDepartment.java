package model;

public class StandardDepartment extends VirtualDepartment {

	public StandardDepartment(String name) {
		super(name);
	}
	
	public void setManager(Manager manager) {
		super.setLeader(manager);
	}
	
	public Manager getManager() {
		return (Manager)super.getLeader();
	}
	
	public void addEmployee(Employee employee) {
		super.addPerson(employee);
	}
	
	public Employee getEmployee(int index) {
		return (Employee)super.getPerson(index);
	}
	
	public String toString() {
		return "\nStandardDepartment" + super.toString();
	}
	
}
