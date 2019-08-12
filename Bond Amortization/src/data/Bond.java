package data;

public class Bond {
	
	private String client;
	private double issueAmount;
	private int termLengthYears;
	private int termLengthMonths;
	private double couponRate;
	private double marketRate;
	private int installementPeriodMonths;
	private int payment;
	private boolean premium;
	private int numPayments;
	private double adjustedIssueAmount;
	
	
	public Bond(String client, double issueAmount, int termLengthYears, 
				int termLengthMonths, double couponRate, double marketRate,
				int installmentPeriodMonths) {
		
	}


	public boolean isPremium(double couponRate, double marketRate) {
		// TODO Auto-generated method stub
		return false;
	}


	public double calcAdjustedIssueAmount(double issueAmount, double couponRate, double marketRate,
											double payment, int numPayments) {
		// TODO Auto-generated method stub
		return 0;
	}


	public double calcPayment(double issueAmount2, double couponRate2, int installementPeriodMonths2) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int calcNumPayments(int termLengthYears2, int termLengthMonths2, int installementPeriodMonths2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
