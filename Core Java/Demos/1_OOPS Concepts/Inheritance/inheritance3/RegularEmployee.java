package inheritance;

public class RegularEmployee extends Employee{
	double basic;
	
	public RegularEmployee()
	{
		//Base class can also be initialized
		firstName = "";
		lastName = "";
		basic = 0.0;
	}

	
	public RegularEmployee(String fName,String lName,double sal)
	{
		firstName = fName;
		lastName = lName;
		basic = sal;
	}
	
	public void showSal() {
	    super.showName();// print first name and last name
		System.out.println("Basic salary : "+basic);// customer passed value is salary
		//calculation you can do
	}
}
