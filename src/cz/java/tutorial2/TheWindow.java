package cz.java.tutorial2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Building the window for slider.
 * 
 * @author "Dusan Krajcovic"
 * 
 */
public final class TheWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -671447581033000205L;

	/**
	 * Slider for change a size of oval.
	 */
	private JSlider slider;

	/**
	 * Drawed oval.
	 */
	private DrawOval myPanel;

	/**
	 * Constructor of TheWindow class.
	 * 
	 */
	TheWindow() {
		super("The title");

		myPanel = new DrawOval();
		myPanel.setBackground(Color.orange);

		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);

		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(final ChangeEvent e) {

				myPanel.setD(slider.getValue());

			}
		});

		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);

	}
}
