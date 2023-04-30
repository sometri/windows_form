package windows_form;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void initialize() {
		setTitle("Welcome");
		setSize(450,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		MainFrame myFram = new MainFrame();
		myFram.initialize();
	}

}
