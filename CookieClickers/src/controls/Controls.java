package controls;

import gui.MainFrame;

public class Controls {

	MainFrame mainframe = new MainFrame();
	
	public void ControlsMenuFrames() {
		
		
		
	}
	
	public void ControlsSettingsFrameSetResizableTrue() {
		if (mainframe.getResizable() == false) {
			mainframe.setResizable(true);
		}
	}
	
	public void ControlsSettingsFrameSetResizableFalse() {
		
	}
	
	public void ControlsGameFrame() {
		
	}
}
