package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Statistiche extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistiche frame = new Statistiche();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Statistiche() {
		setBounds(100, 100, 450, 300);

	}

}
