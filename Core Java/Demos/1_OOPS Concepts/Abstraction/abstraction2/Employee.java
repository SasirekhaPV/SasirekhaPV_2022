/*
 * ABSTRACT CLASS: 
 * Abstract classes cannot be instantiated.
 * All other functionalities like member, methods and constructors still exist and function in same
 * manner. Only difference between regular class and abstract class is that it cannot be instantiated.
 * So that essentially means that their existence is worth less as we cannot create any object.
 * There is one way in which these can be used, by inheriting them. This is just to help a design where
 * a class needs to be created but never instantiated. 
 * 
 * If a method is declared as abstract in this class,
 * any class extending this will have to implement it.
 * Infact, if a method in a class is declared as abstract:
 * 1. class must also be abstract
 * 2. there should be no definition of the class
 * 
 * APPLICATION / USAGE:
 * 1. When you have a requirement where your base class should provide default 
 * implementation of certain methods whereas other methods should be open to 
 * being overridden by child classes use abstract classes.
 * 2. The purpose of an abstract class is to provide a common definition of a 
 * base class that multiple derived classes can share.
 * 3. When creating a class library which will be widely distributed or reused—
 * especially to clients, use an abstract class in preference to an interface;
 * because, it simplifies versioning. 
 * */
package abstraction;
// abstract class
public abstract class Employee {
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number){
		
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	//abstract method without implementation
	public abstract double computePay();
	
	//normal method - concrete methods 
	public void mailCheck(){
		System.out.println("Mailing check to "+this.name+" at "+this.address);
	}
	
	public String toString(){
		return name+" "+address+" "+number;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String newAddress){
		address = newAddress;
	}
	
	public int getNumber(){
		return number;
	}
}