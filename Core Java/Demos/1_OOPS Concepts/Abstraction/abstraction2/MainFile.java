package abstraction;
public class MainFile {
public static void main(String[] args)  {
	
		
		/* This instantiation throws error as
		 * abstract class cannot be instantiated*/
	//Employee empObj = new Employee("John","Boulevard",90082);
	
		
	Salary salary = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	Employee emp = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	
	System.out.println("Calling mail check using Salary reference");
	salary.mailCheck();
	
	System.out.println("\nCalling mail check using employee reference");
	emp.mailCheck();
	
	
	}
}