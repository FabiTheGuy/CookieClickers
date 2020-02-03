package gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements Settings {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setVisible(Settings.VISIBILITY);
		setSize(Settings.WIDTH, Settings.HEIGHT);
		setResizable(Settings.RESIZABLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setHeight(int height) {
		
	}
	
	public boolean getVisibility() {
		boolean visibility = Settings.VISIBILITY;
		return (visibility);
	}
	
	public void setVisibility(boolean visibility) {
		visibility = Settings.VISIBILITY;
	}
}
