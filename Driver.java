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
		Car[] cars = new Car[2]; //array of cars
		Sedan sedan = new Sedan("Honda Accord", 15000);
		Truck truck = new Truck("Ford F-150", 25000);
		cars[0] = sedan;
		cars[1] = truck;
		//runs the methods of each car
		for (Car car : cars){
			car.inflateTires();
			car.start();
			car.accelerate(15);
			car.honk();
			car.accelerate(-10);
			car.stop();
		}
	}

}
