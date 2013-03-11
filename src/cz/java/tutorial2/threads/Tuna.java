package cz.java.tutorial2.threads;

import java.util.Random;

/**
 * Learning about threads.
 * 
 * Runnable interface contains run() method.
 * 
 * @author "Dusan Krajcovic"
 * 
 */
public class Tuna implements Runnable {

	/**
	 * The name of thread.
	 */
	private final String name;

	/**
	 * Sleeping time.
	 */
	private final int time;

	/**
	 * 
	 */
	private final Random r = new Random();

	/**
	 * Public constructor.
	 * 
	 * @param x
	 *            Thread name.
	 */
	Tuna(final String x) {
		super();

		name = x;
		time = r.nextInt(999);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		try {
			System.out.printf("%s is sleeping for %d", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
