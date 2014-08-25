package actionsniper;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

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
		
		public static final String SNIPER_STATUS_NAME = "sniper status";

		private static final String STATUS_JOINING = "Joining";
		
		private final JLabel sniperStatus = createLabel(STATUS_JOINING);
		
		public MainWindow() {
			super("Auction Sniper");
			setName(MAIN_WINDOW_NAME);
			add(sniperStatus);
			pack();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}

		private JLabel createLabel(String initialText) {
			JLabel result = new JLabel(initialText);
			result.setName(SNIPER_STATUS_NAME);
			result.setBorder(new LineBorder(Color.BLACK));
			return result;
		}
		
		
	}

}
