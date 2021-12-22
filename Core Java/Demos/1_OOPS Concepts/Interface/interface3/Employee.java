package interfaceproject.two;
public abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public Employee(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	} // end three-argument Employee constructor

	public void setFirstName(String first) {
		firstName = first; // should validate
	} // end method setFirstName

	
	public String getFirstName() {
		return firstName;
	} // end method getFirstName

	
	public void setLastName(String last) {
		lastName = last; // should validate
	} 
	
	public String getLastName() {
		return lastName;
	}
	
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn; // should validate
	} // end method setSocialSecurityNumber

	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber

	
	@Override
	public String toString() {
		return String.format( "%s %s\nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
	} // end method toString

	
} // end abstract class Employee