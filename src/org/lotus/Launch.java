package org.lotus;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				JFrame f = new JFrame("Swing JFrame"); //title
				f.setSize(300, 200); // size
				f.setLocationRelativeTo(null); //location on screen
				f.setVisible(true); // show
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // how to close
			}
		};

		// create thread for this work(optional but recommended)
		SwingUtilities.invokeLater(work);
    }
}
