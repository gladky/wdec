package wdec.decision_utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;


public class Stage {

	private DataIn stageDataIn;
	private DataOut stageDataTab[];
	private DataOut stageDataOut;
	
	public double[][] prices;

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
	private static final double maxInternet = 500000;
	private static final double minInternet = 10000;
	private static final double stepInternet = 5000;

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
		
		
		double safePrice = 0.0000237614 * (quality*quality*quality) -0.00442492 * (quality*quality) + 0.307912 * quality + 12.6965;

		/**
		 * współczynniki parametrów
		 */

		double priceDifference=price-safePrice;
		//double risk= -0.215081*(priceDifference*priceDifference*priceDifference)+0.560578*(priceDifference*priceDifference)+14.6188*priceDifference+35.0632;
		double risk =0.8*(priceDifference*priceDifference) + 10*priceDifference+30;

		double adToQuantity = internetAd/quantity;
		
		//-0.01 x^2+0.19 x-0.05
		
		double riskPercent = -0.01*(adToQuantity*adToQuantity)+0.19*adToQuantity-0.05;
		if(riskPercent<0.01) riskPercent = 0.01;
		else if(riskPercent>0.8) riskPercent = 0.8;
		risk=risk-risk*riskPercent;
		
		if(risk>100) risk=100;
		else if(risk<0) risk =0;
		
		 tmp[(int)risk] ++;
		
		
		 
		return (int) risk;
	}

	/**
	 * Funkcja liczy zysk dla danych wejsciowych
	 */
	private double countResult(int quantity, double quality, double price,
			double internetAd) {
		double result=0;
		
		result = quantity * price - internetAd - quantity*getPrice(quantity, (int)quality);
		
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
		time = System.currentTimeMillis();
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
	
	public Stage(){
		initPrices();
	}

	public Stage(DataIn dataIn) {
		initPrices();
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
	
	public double getPrice(int quantity, int quality){
		double price;
		int x = (quantity/10000)-1;
		int y = quality-1;
		
		if(x<0) x=0;
		
		price = prices[x][y];
		return price;
	}
	
	private void initPrices(){
		
		File file = new File(Stage.class.getResource("/wdec/decision_utils/wdec-interpolacja.mat").getPath());
		
		try {
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			prices = new double[40][100];
		    for(int i =0; i<40; i++){
		    	for(int j = 0; j < 100; j++){
		    		prices[i][j] = Double.parseDouble(br.readLine());
		    	}
		    }
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	    
	}
}
