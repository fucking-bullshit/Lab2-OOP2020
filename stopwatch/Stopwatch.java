package stopwatch;

/**
 * Stopwatch to compute elapsed time.
 */
public class Stopwatch {
	private boolean running;
	private long startTime;
	private long stopTime;

	public Stopwatch() {
		this.running = false;
	}

	/**
	 * Start the stopwatch if it is not already running.
	 */
	public void start() {
		if (this.running == false) {
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}

	/**
	 * Stop the stopwatch if it is running.
	 */
	public void stop() {
		if (this.running) {
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}

	/**
	 * Compute the elapsed time while stopwatch is running.
	 * 
	 * @return the elapsed time in seconds
	 */
	public double getElapsed() {
		this.stop();
		return (this.stopTime - this.startTime) * 1.0E-9;
	}

	/**
	 * Test if the stopwatch is running.
	 * 
	 * @return true if stopwatch is running
	 */
	public boolean isRunning() {
		return this.running;
	}

	/**
	 * Describe the stopwatch.
	 */
	public String toString() {
		return "Stopwatch is " + (running ? "running" : "stopped");
	}
}