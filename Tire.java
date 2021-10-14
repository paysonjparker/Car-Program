/**
 * This is the Tire class.
 * @author paysonparker
 * 10/13/2021
 */
public class Tire {

	private int tirePressure;
	private final int MAX_PRESSURE = 40;
	private final int MIN_PRESSURE = 0;
	
	/**
	 * Creates a new Tire object and initializes the tire's air pressure.
	 */
	public Tire() {
		tirePressure = 32;
	}
	
	/**
	 * Gets the tire's air pressure.
	 * @return The tire's air pressure.
	 */
	public int checkPressure() {
		return tirePressure;
	}
	
	/**
	 * Changes the tire's air pressure by a given amount.
	 * @param amount The amount the tire's air pressure is increasing or decreasing.
	 */
	public void changeTirePressure(int amount) {
		tirePressure += amount;
		if(tirePressure < MIN_PRESSURE) {
			tirePressure = 0;
		} if(tirePressure > MAX_PRESSURE) {
			tirePressure = 40;
		}
	}
}
