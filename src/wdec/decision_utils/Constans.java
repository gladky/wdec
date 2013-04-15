package wdec.decision_utils;

public class Constans {
		
	//Maxymalna wielkość kredytu
	private double creditMax;
	
	//Oprocentowanie kredytu
	private double interest;
	
	//Zdolność produkcyjna
	private int productionCapacity;

	public double getCreditMax() {
		return creditMax;
	}

	public void setCreditMax(double creditMax) {
		this.creditMax = creditMax;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getProductionCapacity() {
		return productionCapacity;
	}

	public void setProductionCapacity(int productionCapacity) {
		this.productionCapacity = productionCapacity;
	}

	public Constans(double creditMax, double interest, int productionCapacity) {
		super();
		this.creditMax = creditMax;
		this.interest = interest;
		this.productionCapacity = productionCapacity;
	}
	
	
}
