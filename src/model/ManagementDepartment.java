package model;

public class ManagementDepartment extends VirtualDepartment {

	public ManagementDepartment() {
		super("Management Department");
	}
	
	public void setBoss(Boss boss) {
		super.setLeader(boss);
	}
	
	public Boss getBoss() {
		return (Boss)super.getLeader();
	}
	
	public void addManager(Manager manager) {
		super.addPerson(manager);
	}
	
	public Manager getManager(int index) {
		return (Manager)super.getPerson(index);
	}
	
	public String toString() {
		return "ManagementDepartment" + super.toString();
	}
	
}
