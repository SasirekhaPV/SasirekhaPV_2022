package inheritance;
//Hourly Employee class is extended from Employee class means inherited
public class HourlyEmployee extends Employee {

	//Data of HourlyEmployee Class
	double hours;
	double wage;

	//Constructor of the HourlyEmployee Class
	public HourlyEmployee() {

		firstName = "";
		lastName = "";
		hours = 0.0;
		wage = 0.0;
	}
 // Look here we are geeting the value through constructor for all the variables
	public HourlyEmployee(String fName, String lName, double hrs, double sal) {
 
		firstName = fName;
		lastName = lName;
		hours = hrs;
		wage = sal;
	}
    
	public void showSal() {
		super.showName(); //accessing the parent class method by using super keyword
		System.out.println("salary : " + hours * wage);
	}
}
