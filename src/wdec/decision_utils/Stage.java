package wdec.decision_utils;

public class Stage {
	
	private DataIn stageDataIn;
	private DataOut stageDataTab[];
	private DataOut stageDataOut;
	
	// Wolumen
	private static final int maxQuantity = 400000;
	private static final int minQuantity = 100;
	private static final int stepQuantity = 1000;
	// Jakoœæ
	private static final double maxQuality = 100;
	private static final double minQuality = 1;
	private static final double stepQuality = 1;
	// Cena
	private static final double maxPrice = 40;
	private static final double minPrice = 10;
	private static final double stepPrice = 1;
	// Reklama
	// Czasopisma
	private static final double maxMagazines = 100000;
	private static final double minMagazines = 10000;
	private static final double stepMagazines = 1000;
	// Telewizja
	private static final double maxTelevision = 100000;
	private static final double minTelevision = 10000;
	private static final double stepTelevision = 1000;
	// Internet
	private static final double maxInternet = 100000;
	private static final double minInternet = 10000;
	private static final double stepInternet = 1000;

	// Kredyt
	private double maxCredit;
	private double minCredit;
	private double stepCredit;

	private int countRisk(int quantity, double quality, double price,
			double magazinesAd, double televisionAd, double internetAd) {

		return quantity
				* 2
				+ (int) (quality * 3 + price * 4 + (magazinesAd + televisionAd + internetAd) * 4);
	}

	private void findDataOut(DataIn dataIn){
		// TODO poplatane petle for dla kazdej wejsciowej danej
		long time;
		System.out.println(time=System.currentTimeMillis());
		for (int quantity = minQuantity; quantity <= maxQuantity; quantity += stepQuantity) {
			for (double quality = minQuality; quality <= maxQuality; quality += stepQuality) {
				for (double price = minPrice; price <= maxPrice; price += stepPrice) {
					for (double magazines = minMagazines; magazines <= maxMagazines; magazines += stepMagazines) {
						for (double television = minTelevision; television <= maxTelevision; television += stepTelevision) {
							for (double internet = minInternet; internet <= maxInternet; internet += stepInternet) {
								countRisk(quantity, quality, price, magazines,
										television, internet);
							}
						}
					}
				}
			}
		
	}
		System.out.println(System.currentTimeMillis()-time);
	
	}

	public DataOut findBestData(int risk){

		return stageDataTab[risk];
	}
	
	public Stage(DataIn dataIn) {
	
		stageDataIn=dataIn;
		stageDataTab = new DataOut[101];
		findDataOut(stageDataIn);
		
	}
	
	public void fillWithSampleData(){
		for (int i=0; i<101; i++)
		{
			DataOut dataOut = new DataOut();
			dataOut.setPrice(15);
			dataOut.setQuality(50);
			dataOut.setQuantity(30000);
			
			stageDataTab[i] = dataOut;
			
		}
	}
}
