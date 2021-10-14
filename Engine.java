
public class Engine {

	private boolean isRunning = false;
	
	/**
	 * creates new Engine
	 */
	public Engine() {
		
	}
	
	/**
	 * engine starts
	 */
	public void start() {
		isRunning = true;
	}
	
	/**
	 * engine stops
	 */
	public void stop() {
		isRunning = false;
	}
}
