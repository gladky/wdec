package wdec.main;

import wdec.decision_utils.*;
import wdec.gui.MainWindow;

public class Main {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainWindow mainWindow = new MainWindow();
		mainWindow.setVisible(true);
		System.out.println("new stage created");
		DecisionUtils decUt = new DecisionUtils();
		
		decUt.newStage(new DataIn(1.0,1.0,1.0));
		decUt.newStage(new DataIn(1.0,1.0,1.0));
	}

}
