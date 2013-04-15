package wdec.decision_utils;

public class Stage {
	
	private DataIn stageDataIn;
	private DataOut stageDataTab[];
	private DataOut stageDataOut;
	
	private void findDataOut(DataIn dataIn){
		
	}
	
	public DataOut findBestData(int risk){
		
		return null;
	}
	
	
	public void Stage(DataIn dataIn){
		stageDataIn=dataIn;
		stageDataTab = new DataOut[100];
		findDataOut(stageDataIn);
		
	}
}
