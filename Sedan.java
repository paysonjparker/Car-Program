
/**
 * This is the Sedan class, which extends the car class. I overrode the 
 * honk() method from the car class to give the Sedan its own special behavior.
 * @author paysonparker
 * 10/13/2021
 */
public class Sedan extends Car {

	/**
	 * Creates a new Sedan object.
	 * @param carName The car's name.
	 * @param price The car's price.
	 */
	public Sedan(String carName, double price) {
		super(carName, price);
	}

	/**
	 * makes the Sedan honk its horn.
	 */
	public void honk() {
		System.out.println(getCarName() + " honked: BEEP BEEP!");
	}
}
