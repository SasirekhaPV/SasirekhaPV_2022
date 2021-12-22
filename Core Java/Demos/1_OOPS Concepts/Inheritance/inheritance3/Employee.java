package inheritance;

//class called Employee
public class Employee {
	String firstName;
	String lastName;
	
	 //constructor of the class
		public Employee()
		{
			firstName = "";
			lastName = "";
		}
		
	//We have the second contructor - Accept input from the user
		public Employee(String fName,String lName)
		{
			firstName = fName;
			lastName = lName;
		}

		// method to display the fistName and Last Name of employee
		public void showName()
		{
			System.out.println("Name : "+firstName+" "+lastName);
		}
}
