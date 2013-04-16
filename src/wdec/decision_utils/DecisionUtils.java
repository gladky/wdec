package wdec.decision_utils;

/**
 * Klasa odpowiedzialna za wyszukanie paretopotymalnych decyzji
 */
public class DecisionUtils {

	private Stage stageTab[];
	private int stageCounter;

	// Zaczyna nowy etap
	// Pobiera dane wejściowe i dodaje do tablicy etapów nowy etap

	public Stage newStage(DataIn dataIn) {
		stageCounter++;
		stageTab[stageCounter - 1] = new Stage(dataIn);
		//return new Stage(dataIn);
		return stageTab[stageCounter - 1];
	}

	public Stage getStage(int i) {
		return stageTab[i];
	}

	public Stage getCurrentStage() {
		System.out.print(stageCounter-1);
		return stageTab[stageCounter-1];
	}

	public DecisionUtils() {
		stageCounter = 0;
		stageTab = new Stage[100];

	}
}
