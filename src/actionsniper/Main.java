package actionsniper;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";
	public static final String SNIPER_STATUS_NAME = "sniper status";

	private MainWindow ui;

	public Main() throws Exception {
		startUserInterface();
	}

	public static void main(String... args) throws Exception {
		Main main = new Main();
	}

	private void startUserInterface() throws Exception {
		SwingUtilities.invokeAndWait(new Runnable() {
			public void run() {
				ui = new MainWindow();
			}
		});
	}

	public class MainWindow extends JFrame {
		
		private static final long serialVersionUID = -4274409492013695538L;
		public MainWindow() {
			super("Auction Sniper");
			setName(MAIN_WINDOW_NAME);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
	}

}
