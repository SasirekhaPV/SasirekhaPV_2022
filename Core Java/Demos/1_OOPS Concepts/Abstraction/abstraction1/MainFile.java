package abstraction2;

public class MainFile {

	public static void main(String[] args) {
		Domestic d=new Domestic();
		float bill1=d.computeBill();
		System.out.println(bill1);
		
		Commericial c=new Commericial();
		float bill2=c.computeBill();
		System.out.println(bill2);

	}

}
