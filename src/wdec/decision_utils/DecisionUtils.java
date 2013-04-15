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

		stageTab[stageCounter] = new Stage(dataIn);
		stageCounter++;
		return stageTab[stageCounter];
	}

	public Stage getStage(int i) {
		return stageTab[i];
	}

	public Stage getCurrentStage() {

		return stageTab[stageCounter];
	}

	public DecisionUtils() {
		stageCounter = 0;
		stageTab = new Stage[6];

	}
}
