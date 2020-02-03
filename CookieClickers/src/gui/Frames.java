package gui;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Frames {

	public JPanel MenuFrame() {
		JPanel MenuPanel = new JPanel();
		JButton startGameButton = new JButton();
		JButton settingsButton = new JButton();
		JButton exitButton = new JButton();
		MenuPanel.setVisible(Settings.MenuFrameVisibility);
		
		startGameButton.setBounds(0,0,0,0);	//Noch eintragen!
		settingsButton.setBounds(0, 0, 0, 0);
		exitButton.setBounds(0, 0, 0, 0);
		
		MenuPanel.add(startGameButton);
		return (MenuPanel);
	}
	
	public JPanel SettingsFrame() {
		JPanel SettingsPanel = new JPanel();
		SettingsPanel.setVisible(Settings.SettingsFrameVisibility);
		
		return (SettingsPanel);
	}
	
	public JPanel GameFrame() {
		JPanel GamePanel = new JPanel();
		GamePanel.setVisible(Settings.GameFrameVisibility);
		
		return (GamePanel);
	}
	
	public boolean getMenuFrameVisibility() {
		boolean visibility = Settings.MenuFrameVisibility;
		return (visibility);
	}
	
	public void setMenuFrameVisibility(boolean visibility) {
		visibility = Settings.MenuFrameVisibility;
	}
	
	public boolean getSettingsFrameVisibility() {
		boolean visibility = Settings.SettingsFrameVisibility;
		return (visibility);
	}
	
	public void setSettingsFrameVisibility(boolean visibility) {
		visibility = Settings.SettingsFrameVisibility;
	}
	
	public boolean getGameFrameVisibility() {
		boolean visibility = Settings.GameFrameVisibility; 
		
		return (visibility);
	}
	
	public void setGameFrameVisibility(boolean visibility) {
		visibility = Settings.GameFrameVisibility;
	}
	
}
