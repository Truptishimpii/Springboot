package cwpc.myapp;


public class App 
{
    public static void main( String[] args )
    {
        Employee emp = new Employee("joy","Mumbai",24000);
        System.out.println("The Employee Name : "+emp.get_EmployeeName());
        System.out.println("The City Name : "+emp.get_city());
        System.out.println("The Salary  : "+emp.get_salary());
        
        emp.set_salary(55000);
        System.out.println("The Employee Name : "+emp.get_EmployeeName());
        System.out.println("The City Name : "+emp.get_city());
        System.out.println("The Salary  : "+emp.get_salary());
    }
}
