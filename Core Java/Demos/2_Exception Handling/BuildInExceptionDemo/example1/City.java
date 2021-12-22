package example2;

import java.util.HashMap;
import java.util.Map;

class City {
	Map<Integer, String> list;

	City() {
		list = new HashMap<Integer, String>();
		list.put(400019, "Mumbai");
		list.put(700002, "Kolkata");
		list.put(100025, "Delhi");
		list.put(500004, "Hyderabad");

	}

	// find city by zip code. If no city found throw
	// a user defined exception
	public String findCityByZipCode(int zipCode) throws CityNotFoundException {

		if (list.containsKey(zipCode)) {

			String value = list.get(zipCode);

			return value;
		} else {
			throw new CityNotFoundException("City not found");

		}

	}
}