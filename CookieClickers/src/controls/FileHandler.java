package controls;

import java.io.File;
import java.io.IOException;

public class FileHandler {

	public FileHandler() {
		File saveGame = new File("savegame.txt");
		File savedSettings = new File("settings.txt");
		
		if (savedSettings.exists()) {
			//soll er File lesen
		}
		else if (!savedSettings.exists()) {
			//soll er File erstellen und standard parameter
		}
		
		
		if (saveGame.exists()) {
			//soll er File lesen
		}
		else if(!saveGame.exists()) {
			//soll er File erstellen und standard parameter
			
			
		}

		
	}
	
}
