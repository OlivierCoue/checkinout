package model;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	private static Company INSTANCE = new Company();
	
	private Boss boss;
	private List<Employee> employeeList = new ArrayList<>();
	private ManagementDepartment managementDepartment = new ManagementDepartment();
	private List<StandardDepartment> standardDepartmentsList = new ArrayList<>();
	
	public Company(){}
	
	public static Company getInstance(){
		return INSTANCE;
	}
	
	public void setBoss(Boss boss) {
		this.boss = boss;
		managementDepartment.setBoss(boss);
	}
	
	public void addSandardDepartment(String name) throws Exception {
		if(getStandardDepartmentFromName(name) != null)
			throw new Exception("StandardDepartment with name "+name+" already exist");
		standardDepartmentsList.add(new StandardDepartment(name));
	}
	
	public void addEmployee(String firstname, String lastname, String standardDepartmentName) throws Exception {
		StandardDepartment standardDepartment = getStandardDepartmentFromName(standardDepartmentName);
		if(standardDepartment == null)
			throw new Exception("StandardDepartment with name "+standardDepartmentName+" de not exist");
		Employee employee = new Employee(firstname, lastname, standardDepartment);
		standardDepartment.addEmployee(employee);
		employeeList.add(employee);
	}
	
	public void addManager(String firstname, String lastname, String standardDepartmentName) throws Exception {
		StandardDepartment standardDepartment = getStandardDepartmentFromName(standardDepartmentName);
		if(standardDepartment == null)
			throw new Exception("StandardDepartment with name "+standardDepartmentName+" de not exist");
		if(standardDepartment.getManager() != null)
			throw new Exception("StandardDepartment with name "+standardDepartmentName+" already have a manager");
		Manager manager = new Manager(firstname, lastname, standardDepartment);
		standardDepartment.setManager(manager);
		standardDepartment.addEmployee(manager);
		employeeList.add(manager);
		managementDepartment.addManager(manager);
	}
	
	private StandardDepartment getStandardDepartmentFromName(String name){
		for(StandardDepartment standardDepartment : standardDepartmentsList)
			if(standardDepartment.getName().equals(name))
				return standardDepartment;
		return null;
	}
	
	public Employee getEmployeeById(String id){
		for(Employee employee : employeeList)
			if(employee.getId().equals(id))
				return employee;
		return null;
	}
	
	public void displayBoss(){
		System.out.println(boss);
	}
	
	public void displayEmployees() {
		for(Employee employee : employeeList)
			System.out.println(employee);
	}
	
	public void displayStandardDepartments() {
		for(StandardDepartment standardDepartment: standardDepartmentsList)
			System.out.println(standardDepartment);
	}
	
}
