package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controls.Controls;

public class Frames {

	Controls controls = new Controls();
	
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
		MenuPanel.add(settingsButton);
		MenuPanel.add(exitButton);
		return (MenuPanel);
	}
	
	public JPanel SettingsFrame() {
		JPanel SettingsPanel = new JPanel();
		JTextField WidthTextField = new JTextField();
		JTextField HeightTextField = new JTextField();
		JButton ResizableButtonTrue = new JButton();
		JButton ResizableButtonFalse = new JButton();
		JButton ApplySettingsButton = new JButton();
		SettingsPanel.setVisible(Settings.SettingsFrameVisibility);
		
		WidthTextField.setBounds(0, 0, 0, 0);
		HeightTextField.setBounds(0, 0, 0, 0);
		ResizableButtonTrue.setBounds(0, 0, 0, 0);
		ResizableButtonFalse.setBounds(0, 0, 0, 0);
		ApplySettingsButton.setBounds(0, 0, 0, 0);
		
		ResizableButtonTrue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controls.ControlsSettingsFrameSetResizableTrue();
			}
		});
		
		SettingsPanel.add(WidthTextField);
		SettingsPanel.add(HeightTextField);
		SettingsPanel.add(ResizableButtonTrue);
		SettingsPanel.add(ResizableButtonFalse);
		SettingsPanel.add(ApplySettingsButton);
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
