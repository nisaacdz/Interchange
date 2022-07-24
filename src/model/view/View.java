package model.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class View extends JFrame {

	protected static View mainView;

	private static final long serialVersionUID = 1L;

	public static void call() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				mainView = new View();
				mainView.setSize(ReadFromFile.recentSize());
				mainView.setVisible(true);
				mainView.setLayout(null);
				mainView.getContentPane().setBackground(Color.CYAN);
				mainView.setDefaultCloseOperation(View.DISPOSE_ON_CLOSE);
			}
		});
	}

	public View() {
		super();
		design();
	}
	
	public void design() {
		
	}
}
