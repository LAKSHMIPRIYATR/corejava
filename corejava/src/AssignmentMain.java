import com.lakshmipriyatr.assignment.employee.Manager;
import com.lakshmipriyatr.assignment.employee.Developer;
import com.lakshmipriyatr.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        
        Manager manager = new Manager("Niki", 20, 80000, "Sales");
        Developer developer = new Developer("Pranav", 50, 70000, "Java");

        
        EmployeeUtilities utilities = new EmployeeUtilities();

        System.out.println("Manager Details:");
        utilities.displayEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        utilities.displayEmployeeDetails(developer);

        // Increasing salaries
        System.out.println("\nIncreasing salaries:");
        utilities.increaseSalary(manager, 10);  // Increase manager's salary by 10%
        utilities.increaseSalary(developer, 15);  // Increase developer's salary by 15%
    }
}
