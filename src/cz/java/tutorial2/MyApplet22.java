package cz.java.tutorial2;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 * Init for applets.
 * 
 * @author "Dusan Krajcovic"
 * 
 */
public class MyApplet22 extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3567261306147730426L;

	/**
	 * Sum of numbers.
	 */
	private double sum;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#init()
	 */
	@Override
	public final void init() {
		super.init();

		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");

		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);

		sum = n1 + n2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public final void paint(final Graphics g) {
		super.paint(g);

		g.drawString("The sum is " + sum, 25, 30);
	}

}
