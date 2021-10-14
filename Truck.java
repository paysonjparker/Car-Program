
/**
 * This is the Truck class, which extends the car class. This is an example of inheritance 
 * and shows an "IS-A" relationship between Truck and Car. I overrode the 
 * honk() method from the car class to give the Truck its own special behavior.
 * @author paysonparker
 * 10/13/2021
 */
public class Truck extends Car {

	/**
	 * Creates a new Truck object.
	 * @param carName The car's name.
	 * @param price The car's price.
	 */
	public Truck(String carName, double price) {
		super(carName, price);
	}
	
	/**
	 * Makes the truck honk its horn.
	 */
	public void honk() {
		System.out.println(getCarName() + " honked: HOOOOONNNNNKKK!");
	}

}
