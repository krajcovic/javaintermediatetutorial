import java.awt.Graphics;

import javax.swing.JApplet;

/**
 * Example class for JApplet.
 * 
 * @author "Dusan Krajcovic"
 * 
 */
public class MyApplet extends JApplet {

	/**
	 * Generated UID.
	 */
	private static final long serialVersionUID = 9194254163642555734L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public final void paint(final Graphics g) {
		super.paint(g);
		g.drawString("wow this actually worked?", 25, 25);
	}
}
