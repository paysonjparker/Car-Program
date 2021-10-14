/**
 * Driver class to run the program.
 * @author paysonparker
 * 10/13/2021
 */
public class Driver {

	/**
	 * Creates two new car objects, a sedan and truck. Goes through a few different methods
	 * from the car class to show some of the cars' functions.
	 * @param args args
	 */
	public static void main(String[] args) {
		Sedan sedan = new Sedan("Honda Accord", 15000);
		Truck truck = new Truck("Ford F-150", 25000);
		//run the sedan
		sedan.inflateTires();
		sedan.start();
		sedan.accelerate(15);
		sedan.honk();
		sedan.accelerate(-10);
		sedan.stop();
		//run the truck
		truck.inflateTires();
		truck.start();
		truck.accelerate(20);
		truck.honk();
		truck.accelerate(-15);
		truck.stop();
	}

}
