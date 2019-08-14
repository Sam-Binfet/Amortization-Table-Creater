package data;

public class Bond {



	
	private String client;
	private double issueAmount;
	private int termLengthYears;
	private int termLengthMonths;
	private double couponRate;
	private double marketRate;
	private int installementPeriodMonths;
	private double payment;
	private boolean premium;
	private int numPayments;
	private double adjustedIssueAmount;
	private double adjustedMarketRate;
	private double adjustedCouponRate;
	
	
	public Bond(String client, double issueAmount, int termLengthYears, 
				int termLengthMonths, double couponRate, double marketRate,
				int installementPeriodMonths) {
		this.client = client;
		this.issueAmount = issueAmount;
		this.termLengthYears = termLengthYears;
		this.termLengthMonths = termLengthMonths;
		this.couponRate = couponRate;
		this.marketRate = marketRate;
		this.installementPeriodMonths = installementPeriodMonths;
		this.premium = isPremium(couponRate, marketRate);
		calcAdjustedCouponRate();
		calcAdjustedMarketRate();
		calcNumPayments();
		calcPayment();
		calcAdjustedIssueAmount();
		
		
		
		
		
	}


	public boolean isPremium(double couponRate, double marketRate) {
		return couponRate > marketRate;
	}


	public void calcAdjustedIssueAmount() {
		double a = issueAmount / (Math.pow(1.0 + adjustedMarketRate, numPayments));
		double b = (1.0 - (Math.pow(1.0 + adjustedMarketRate, -1.0 * numPayments))) / adjustedMarketRate;
		
		adjustedIssueAmount = Math.round((a + payment * b) * 100.00) / 100.00;
	}


	private void calcPayment() {
		payment = issueAmount * adjustedCouponRate;

	}


	public void calcNumPayments() {
		int totalMonths = termLengthYears * 12 + termLengthMonths;
		numPayments = totalMonths / installementPeriodMonths;
	}


	

	private void calcAdjustedMarketRate() {
		adjustedMarketRate = (marketRate / 100.000) * (installementPeriodMonths / 12.00);
	}
	
	private void calcAdjustedCouponRate() {
		adjustedCouponRate = (couponRate / 100.000) * (installementPeriodMonths / 12.00);		
	}


	public double getAdjustedIssueAmount() {
		return adjustedIssueAmount;
	}
	
	public int getNumPayments() {
		return numPayments;
	}
	
	public double getPayment() {
		return payment;
	}
	
	public String getClient() {
		return client;
	}
	
	public boolean getPremium() {
		return premium;
	}
	
}

