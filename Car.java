/**
 * This is the Car base class. It is an abstract class, so it can not be instantiated that implements the CarInterface.
 * It is abstract because it only needs to be used as a base class and does not need 
 * to be instantiated. The Car class also implements CarInterface so that the Car class 
 * is forced to implement each method in the interface.
 * @author paysonparker
 * 10/13/2021
 */
public abstract class Car implements CarInterface{
	
	private boolean isRunning = false; //car is initialized not running
	private int speed; //car's speed
	private final int MAX_SPEED = 60; //max speed
	private Engine carEngine; //car engine
	private Tire[] carTires; //array length 4 storing each car tire
	private String carName; //car's name
	private double carPrice; //car price
	
	/**
	 * Creates a new car object.
	 * @param carName The car's name.
	 * @param price The car's price.
	 */
	public Car(String carName, double price) {
		this.carName = carName;
		this.carPrice = price;
		carEngine = new Engine();
		carTires = new Tire[4]; //gives car four tires
		for(int i = 0;i< carTires.length;i++) {
			carTires[i] = new Tire();
		}
	}
	
	/**
	 * Starts the car.
	 */
	public void start() {
		if(isRunning == false) {
			carEngine.start();
			isRunning = true;
			System.out.println(carName + " is running.");
		} 
	}
	
	/**
	 * Stops the car.
	 */
	public void stop() {
		if(isRunning == true) {
			carEngine.stop();
			isRunning = false;
			System.out.println(carName + " is not running.");
		}
	}
	
	/**
	 * Accelerates the car.
	 * @param increase The car's increase in speed.
	 */
	public void accelerate(int increase) {
		speed += increase;
		if(speed > MAX_SPEED) {
			speed = MAX_SPEED;
		} if(speed < 0) {
			speed = 0;
		}
		System.out.println(carName + " is now going " + speed + " mph.");
	}

	/**
	 * Makes the car honk its horn.
	 */
	public void honk() {
		System.out.println("Beeeepppp!");
	}
	
	/**
	 * Fully inflates each tire on car.
	 */
	public void inflateTires(){
		for(int i = 0; i < carTires.length; i++) {
			carTires[i].changeTirePressure(40);
		}
	}

	/**
	 * @return The car's price.
	 */
	public double getCarPrice() {
		return carPrice;
	}

	/**
	 * @return The car's name.
	 */
	public String getCarName() {
		return carName;
	}
}
