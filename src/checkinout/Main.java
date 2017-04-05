package checkinout;

import model.Boss;
import model.Company;

public class Main {
	public static void main(String[] args){
		Company company = Company.getInstance();
		company.setBoss(new Boss("Julien", "Cheny"));
		try {
			company.addSandardDepartment("standard-dep-0");
			company.addSandardDepartment("standard-dep-1");
			company.addSandardDepartment("standard-dep-2");
			company.addManager("manager-fn-0", "manager-ln-0", "standard-dep-0");
			company.addManager("manager-fn-1", "manager-ln-2", "standard-dep-1");
			company.addManager("manager-fn-1", "manager-ln-2", "standard-dep-2");
			company.addEmployee("employee-fn-0", "employee-ln-0", "standard-dep-0");
			company.addEmployee("employee-fn-1", "employee-ln-1", "standard-dep-1");
			company.addEmployee("employee-fn-2", "employee-ln-2", "standard-dep-2");
			company.addEmployee("employee-fn-3", "employee-ln-3", "standard-dep-2");
			company.displayBoss();
			company.displayEmployees();
			company.displayStandardDepartments();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
