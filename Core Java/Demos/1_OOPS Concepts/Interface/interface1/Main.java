package interfacedemo;

public class Main {

	public static void main(String[] args) {
		
      IAnimal ia; // you can create a reference variable for interface.
      ia=new Dog();
      ia.sleep();
      ia.run();
      ia.makesound();
      
      //---------cat
      System.out.println("@@@@@@@@@@@@@@@");
      ia=new Cat();
      ia.sleep();
      ia.run();
      ia.makesound();
      
      
  
	}

}
