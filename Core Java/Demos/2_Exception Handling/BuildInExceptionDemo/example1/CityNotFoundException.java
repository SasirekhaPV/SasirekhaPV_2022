package example2;

public class CityNotFoundException extends Exception {

	public CityNotFoundException(String messageForUser) {

		super(messageForUser);
	}
}