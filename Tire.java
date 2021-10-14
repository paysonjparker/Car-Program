/**
 * This is the Tire class.
 * @author paysonparker
 * 10/13/2021
 */
public class Tire {

	private int tirePressure;
	final int maxTirePressure = 40;
	final int minTirePressure = 0;
	
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
		if(tirePressure < 0) {
			tirePressure = 0;
		} if(tirePressure > 40) {
			tirePressure = 40;
		}
	}
}
