package interfaceproject.two;
public class HourlyEmployee extends Employee {
	private double wage; // wage per hour
	private double hours; // hours worked for week

	
	public HourlyEmployee(String first, String last, String ssn, 
			double hourlyWage, double hoursWorked) {
		super(first, last, ssn);
		setWage(hourlyWage); // validate and store hourly wage
		setHours(hoursWorked); // validate and store hours worked
	} // end five-argument HourlyEmployee constructor

	
	public void setWage(double hourlyWage) {
		if (hourlyWage >= 0.0)
			wage = hourlyWage;
		else
			throw new IllegalArgumentException( 
					"Hourly wage must be >= 0.0" );
	} // end method setWage

	
	public double getWage() {
		return wage;
	} // end method getWage

	public void setHours(double hoursWorked)
	{
		if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
			hours = hoursWorked;
		else
			throw new IllegalArgumentException( 
					"Hours worked must be >= 0.0 and <= 168.0" );
	} // end method setHours

	
	public double getHours() {
		return hours;
	} // end method getHours

	
	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) // no overtime
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	} // end method getPaymentAmount

	// return String representation of HourlyEmployee object
	@Override
	public String toString()
	{
		return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
				super.toString(), "hourly wage", getWage(), 
				"hours worked", getHours() );
	} // end method toString
} // end class HourlyEmployee