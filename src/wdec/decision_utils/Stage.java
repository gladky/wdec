package wdec.decision_utils;

public class Stage {

	private DataIn stageDataIn;
	private DataOut stageDataTab[];
	private DataOut stageDataOut;

	// Wolumen
	private static final int maxQuantity = 400000;
	private static final int minQuantity = 100;
	private static final int stepQuantity = 5000;
	// Jako��
	private static final double maxQuality = 100;
	private static final double minQuality = 2;
	private static final double stepQuality = 1;
	// Cena
	private static final double maxPrice = 40;
	private static final double minPrice = 10;
	private static final double stepPrice = 1;
	// Reklama

	// Internet
	private static final double maxInternet = 100000;
	private static final double minInternet = 10000;
	private static final double stepInternet = 1000;

	// Kredyt
	private double maxCredit;
	private double minCredit;
	private double stepCredit;
	
	private int tmp[] = new int[101];

	/**
	 * Funkcja liczy ryzyko dla danych wejsciowych
	 * 
	 * Parametry proporcjonalne do ryzka (im wyższa wartość tym większe ryzyko):
	 * - quantity (im więcej wyprodukujemy tym większe ryzyko że nie sprzedamy)
	 * - price
	 * 
	 * Parametry odwrotnie proporcjonalne do ryzka (im wyższa niższa tym większe
	 * ryzyko): - quality - magazinesAd - internetAd - televisionAd
	 * 
	 * Parametry znormaliznowane (tzn które są mają zakres 0-100)
	 * - quality
	 * 
	 * Paramety które należy znormalizować (tzn których zakres należy sprowadzić do 0-100)
	 * - reszta
	 * aby to zrobić należy przyjąć pewne min i max wartości
	 */
	private int countRisk(int quantity, double quality, double price, double internetAd) {
		
		/**
		 * współczynniki parametrów
		 */
		int quantityRate = 1;
		int qualityRate = 300;
		int priceRate = 500;
		int magazinesAdRate = 3;
		int televisionAdRate = 3;
		int internetAdRate = 100;

		double all = quantityRate + qualityRate + priceRate + internetAdRate;

		/**
		 * normalizacja parametrów
		 */
		int normQuantity;
		if(quantity < 100000) normQuantity = quantity/1000;
		else normQuantity = 100;
		
		int normPrice;
		if(price > 50) normPrice = 100;
		else if(price < 0) normPrice = 0;
		else normPrice = (int) price * 2 ;
		
		
		int normInternetAd;
		if(internetAd > 100000) normInternetAd = 100;
		else if(internetAd < 0d) normInternetAd = 0;
		else normInternetAd = (int)internetAd/1000;
		
		
		int normQuality;
		normQuality = (int)(100 - quality);
		
		/**
		 * parametr risk jest w zakresie 0-100 0 oznacza małe ryzyko 100 oznacza
		 * duże ryzyko
		 */
		double risk =  (normQuantity * quantityRate + normQuality * qualityRate + normPrice
				* priceRate + normInternetAd * internetAdRate)/all;
		 tmp[(int)risk] ++;
		return (int) risk;
	}

	/**
	 * Funkcja liczy zysk dla danych wejsciowych
	 */
	private double countResult(int quantity, double quality, double price,
			double internetAd) {
		double result=0;
		
		result = quantity * price - internetAd;
		
		//if(result > 0) System.out.println("curr result bigger than 0 " + result);
		
		return result;
	}

	private void findDataOut(DataIn dataIn) {
		
		/**
		 * aktualnie obliczany zestaw danych
		 */
		DataOut current = new DataOut();
		int risk;
		double result;
		
		// TODO poplatane petle for dla kazdej wejsciowej danej
		long time;
		System.out.println(time = System.currentTimeMillis());
		for (int quantity = minQuantity; quantity <= maxQuantity; quantity += stepQuantity) {
			for (double quality = minQuality; quality <= maxQuality; quality += stepQuality) {
				for (double price = minPrice; price <= maxPrice; price += stepPrice) {

							for (double internet = minInternet; internet <= maxInternet; internet += stepInternet) {
								risk = countRisk(quantity, quality, price, internet);
								result = countResult(quantity, quality, price,
										 internet);
								
								//if(result > 0) System.out.println("curr result bigger than 0 " + result);
								if((stageDataTab[risk].getResult() < result) && dopuszczalne(risk,dataIn)){
									//System.out.println("better solution");
									//stageDataTab[risk].setCredit(credit);
									stageDataTab[risk].setQuantity(quantity);
									stageDataTab[risk].setQuality(quality);
									stageDataTab[risk].setPrice(price);
									stageDataTab[risk].setInternet(internet);
								}
								
								
							}
						
					
				}
			}

		}
		System.out.println(System.currentTimeMillis() - time);
		
		for(int i=0; i<=100; i++){
			//System.out.println(stageDataTab[i].getResult());
		}

		
		
	}

	private boolean dopuszczalne(int risk, DataIn dataIn){
		boolean result = true;
		
		double adv = stageDataTab[risk].getTelevision() + stageDataTab[risk].getMagazines() + stageDataTab[risk].getInternet();
		double prod = stageDataTab[risk].getQuantity() * 10; //TODO cena produkcji jest zmienna
		double wydatki = prod + adv;
		
		if(wydatki > dataIn.getAmountOfMoney()) result = false;
		
		return result;
	}
	
	public DataOut findBestData(int risk) {

		return stageDataTab[risk];
	}

	public Stage(DataIn dataIn) {

		stageDataIn = dataIn;
		this.stageDataTab = new DataOut[101];
		
		for (int i = 0; i < 101; i++) {
			DataOut dataOut = new DataOut();
			this.stageDataTab[i] = dataOut;
		}
		
		findDataOut(stageDataIn);
		
	}

	public void fillWithSampleData() {
		for (int i = 0; i < 101; i++) {
			DataOut dataOut = new DataOut();
			dataOut.setPrice(0);
			dataOut.setQuality(0);
			dataOut.setQuantity(0);

			stageDataTab[i] = dataOut;
			
		}
	}
	
	public void getTmpResult(){
		findDataOut(stageDataIn);
	}
}
