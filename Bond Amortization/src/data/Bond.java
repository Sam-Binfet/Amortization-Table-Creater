package src.data;

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
		this.adjustedIssueAmount = issueAmount;
		this.termLengthYears = termLengthYears;
		this.termLengthMonths = termLengthMonths;
		this.couponRate = couponRate;
		this.marketRate = marketRate;
		this.installementPeriodMonths = installementPeriodMonths;
		calcAdjustedCouponRate();
		calcAdjustedMarketRate();
		calcNumPayments();
		calcAdjustedIssueAmount();
		
		calcPayment();
		
		
		
	}


	public boolean isPremium(double couponRate, double marketRate) {
		return couponRate > marketRate;
	}


	public void calcAdjustedIssueAmount() {
		
		adjustedIssueAmount = issueAmount / Math.pow(1 + adjustedMarketRate, numPayments) + payment *
								(1 - (Math.pow(1 + adjustedMarketRate, (numPayments * -1))) / adjustedMarketRate);
	}


	private void calcPayment() {
		payment = issueAmount * adjustedCouponRate;
	}


	public void calcNumPayments() {
		int totalMonths = termLengthYears * 12 + termLengthMonths;
		numPayments = totalMonths / installementPeriodMonths;
	}


	public double getPayment() {
		return payment;
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
}

