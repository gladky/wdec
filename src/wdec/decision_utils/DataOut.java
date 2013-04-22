package wdec.decision_utils;


public class DataOut {

	//Wartości wyjsciowe
	
	//Wolumen
	private double quantity;
	//Jakość
	private double quality;
	//Cena
	private double price;
	
	//Reklama
	//Czasopisma
	private double magazines;
	//Telewizja
	private double television;
	//Internet
	private double internet;
	
	//Kredyt
	private double credit;
	//Spłacana rata kredytu
	private double instalment;
	
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getQuality() {
		return quality;
	}
	public void setQuality(double quality) {
		this.quality = quality;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMagazines() {
		return magazines;
	}
	public void setMagazines(double magazines) {
		this.magazines = magazines;
	}
	public double getTelevision() {
		return television;
	}
	public void setTelevision(double television) {
		this.television = television;
	}
	public double getInternet() {
		return internet;
	}
	public void setInternet(double internet) {
		this.internet = internet;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getInstalment() {
		return instalment;
	}
	public void setInstalment(double instalment) {
		this.instalment = instalment;
	}
	
	public DataOut(double quantity, double quality, double price,
			double magazines, double television, double internet,
			double credit, double instalment) {
		super();
		this.quantity = quantity;
		this.quality = quality;
		this.price = price;
		this.magazines = 0;
		this.television = 0;
		this.internet = internet;
		this.credit = credit;
		this.instalment = instalment;
	}
	
	public DataOut(){
		this.quantity = 0;
		this.price = 0;
		this.television = 0;
		this.internet = 0;
		this.magazines = 0;
	}
	
	public double getResult(){
		return quantity * price - television - internet - magazines;
	}

}
