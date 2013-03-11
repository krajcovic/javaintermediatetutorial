package cz.java.tutorial2;

import javax.swing.JFrame;

/**
 * Finish the oval slider program.
 * 
 * @author "Dusan Krajcovic"
 * 
 */
public final class MyApplet25 {

	/**
	 * Blocking constructor.
	 */
	private MyApplet25() {
		super();
	}

	/**
	 * Main class for tutorial videos 22-25.
	 * 
	 * @param args
	 *            Input optional arguments.
	 */
	public static void main(final String[] args) {
		TheWindow w = new TheWindow();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(230, 280);
		w.setVisible(true);
	}
}
