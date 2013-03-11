/**
 * 
 */
package cz.java.tutorial2.threads;

/**
 * @author "Dusan Krajcovic"
 * 
 */
public final class App {

	/**
	 * Blocking constructor.
	 */
	private App() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 *            Input optional arguments.
	 */
	public static void main(final String[] args) {

		tutorial27();

	}

	/**
	 * What do I look like a thread?
	 */
	private static void tutorial27() {
		Thread t1 = new Thread(new Tuna("one"));
		Thread t2 = new Thread(new Tuna("second"));
		Thread t3 = new Thread(new Tuna("three"));
		Thread t4 = new Thread(new Tuna("four"));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
