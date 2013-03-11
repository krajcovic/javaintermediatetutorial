package cz.java.tutorial2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.beans.Transient;

import javax.swing.JPanel;

/**
 * Class for drawwing resizable oval.
 * 
 * @author "Dusan Krajcovic"
 * 
 */
public class DrawOval extends JPanel {

	/**
	 * Generated UID.
	 */
	private static final long serialVersionUID = 6092280122722496263L;

	/**
	 * Default value of size.
	 */
	private int d = 10;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paintComponents(java.awt.Graphics)
	 */
	// @Override
	// public final void paintComponents(final Graphics g) {
	// super.paintComponents(g);
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	@Override
	public final void paint(final Graphics g) {
		super.paint(g);

		g.fillOval(10, 10, getD(), getD());
	}

	/**
	 * @return Get size of oval.
	 */
	public final int getD() {
		return d;
	}

	/**
	 * Set size of oval.
	 * 
	 * @param newd
	 *            The new value of size.
	 */
	public final void setD(final int newd) {
		this.d = (newd >= 0 ? newd : 10);

		repaint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#getMinimumSize()
	 */
	@Override
	@Transient
	public final Dimension getMinimumSize() {
		return getPreferredSize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#getPreferredSize()
	 */
	@Override
	@Transient
	public final Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}
}
