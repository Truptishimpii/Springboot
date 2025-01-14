package cwpc.project01;


public class App 
{
    public static void main( String[] args )
    {
       
        String employee_name[] = {"trupti","sahil","aniket"};
       int employee_age[] = {12,22,12};
       int employee_salary[] = {12000,22000,23000};
        String employee_city[] = {"mumbai","pune","delhi"};
        
        
        
        System.out.println("Employee Details: ");
        
        for (int i = 0; i < employee_name.length; i++) {
            System.out.println("Name: " + employee_name[i] + ", Age: " + employee_age[i] 
                               + ", Salary: " + employee_salary[i] + ", City: " + employee_city[i]);
        }
      
    }
}
