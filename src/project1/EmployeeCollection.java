package project1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection {
	static List<Employee> employeeList= new ArrayList<Employee>();	
	
	public List<Employee> getEmployeeList(){
		employeeList.add(new Employee("AAA","HR",30000));
		employeeList.add(new Employee("BBB","HR",40000));
		employeeList.add(new Employee("ccc","IT",320000));
		employeeList.add(new Employee("DDD","IT",320000));
		employeeList.add(new Employee("EEE","CLOUD",30000));
		employeeList.add(new Employee("FFF","DEVOPS",130000));
		employeeList.add(new Employee("GGG","DEVELOPMENT",300000));
		employeeList.add(new Employee("HHH","DEVELOPMENT",300000));
		return employeeList;
		
	}

}
