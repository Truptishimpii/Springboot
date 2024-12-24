package cwpc.myapp;

public class Employee {
	
	String EmployeeName;
	String city;
	int salary;
	
	Employee(String EmployeeName,String city,int salary){
		
		this.EmployeeName = EmployeeName;
		this.city = city;
		this.salary = salary;
		
	}
	
	String get_EmployeeName() {
		return EmployeeName;
	}
	String get_city() {
		return city;
	}
	int get_salary() {
		return salary;
	}
	
	
	void set_EmployeeName(String employeename) {
		EmployeeName = employeename;
	}
	
	void set_city(String City) {
		city = City;
	}
	
	void set_salary(int Salary) {
		salary = Salary;
	}

}
