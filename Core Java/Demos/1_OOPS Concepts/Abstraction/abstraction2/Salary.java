package abstraction;

public class Salary extends Employee {

	private double salary;

	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}

	// hard code - receiving a text message from bank
	public void mailCheck() {

		System.out.println("Mailing check to " + getName() + " with salary " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}

	/*
	 * This is the definition of abstract method defined * Employee class.
	 */
	@Override
	public double computePay() {
		System.out.println("Computing salary pay for : " + getName());
		return salary / 52;
	}
}