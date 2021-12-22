package example2;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws CityNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter zip code:");
		int zipCode = sc.nextInt();

		// Find city by Zip code
		City c = new City();
		String city = c.findCityByZipCode(zipCode);
		System.out.println(city);
	}
}