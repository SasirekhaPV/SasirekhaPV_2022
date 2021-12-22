package interfacedemo;

public class Dog implements IAnimal{

	@Override
	public void run() {
	System.out.println("Dog runs with 4 legs");
		
	}

	@Override
	public void makesound() {
		System.out.println("UFF ....UFFF");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeps like human being");
	}

}
