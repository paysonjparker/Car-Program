
/**
 * This is the Car Interface. It is implemented by the Car class and forces the car class
 * to implement each one of these methods.
 * @author paysonparker
 * 10/13/2021
 */
public interface CarInterface {
	
	/**
	 * Starts the car.
	 */
	void start();
	/**
	 * Stops the car.
	 */
	void stop();
	/**
	 * Accelerates the car.
	 * @param increase The car's increase in speed.
	 */
	void accelerate(int increase);
	/**
	 * Makes the car honk its horn.
	 */
	void honk();
}
