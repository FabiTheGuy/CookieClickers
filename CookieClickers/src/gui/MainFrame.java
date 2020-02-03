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
	
	public int getWidth() {
		int width = Settings.WIDTH;
		return (width);
	}
	
	public void setWidth(int width) {
		width = Settings.WIDTH;
	}
	
	public int getHeight() {
		int height = Settings.HEIGHT;
		return (height);
	}
	
	public void setHeight(int height) {
		height = Settings.HEIGHT;
	}
	
	public boolean getVisibility() {
		boolean visibility = Settings.VISIBILITY;
		return (visibility);
	}
	
	public void setVisibility(boolean visibility) {
		visibility = Settings.VISIBILITY;
	}
	
	public boolean getResizable() {
		boolean resizable = Settings.RESIZABLE;
		return (resizable);
	}
	
	public void setResizable(boolean resizable) {
		resizable = Settings.RESIZABLE;
	}
}
