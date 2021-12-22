package interfacedemo;

public class Cat implements IAnimal{

	@Override
	public void run() {
		System.out.println("Cat runs very fast");
		
	}

	@Override
	public void makesound() {
		System.out.println(" meaow... meaw");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep at home");
		
	}

}
