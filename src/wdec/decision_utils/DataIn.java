package wdec.decision_utils;


public class DataIn {
	
	//Gotówka
	private double amountOfMoney;
	
	//Przychody z odsprzedazy za pol ceny
	private double halfPriceSell;
	
	//Udział w rynku
	private double shares;

	public double getAmountOfMoney() {
		return amountOfMoney;
	}

	public double getHalfPriceSell() {
		return halfPriceSell;
	}

	public double getShares() {
		return shares;
	}
	
	//TODO koszt jednostkowy, amortyzacja


	public DataIn(double amountOfMoney, double halfPriceSell, double shares) {
		super();
		this.amountOfMoney = amountOfMoney;
		this.halfPriceSell = halfPriceSell;
		this.shares = shares;
	}
	


}
