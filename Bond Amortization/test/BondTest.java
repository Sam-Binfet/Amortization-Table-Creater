import static org.junit.Assert.*;

import org.junit.Test;
import data.Bond;







public class BondTest {

	
	
	@Test
	public void testPremium_true() {
		//Setup
		String client = "Guild One";
		double issueAmount = 10000000;
		int termLengthYears = 5;
		int termLengthMonths = 0;
		double couponRate = 6;
		double marketRate = 5;
		int installementPeriodMonths = 6;
				
		Bond bond = new Bond(client, issueAmount, termLengthYears, termLengthMonths, couponRate, 
							marketRate, installementPeriodMonths);
		//Expected
		boolean expectedPremium = true;
		//Actual
		boolean actualPremium = bond.getPremium();
		//Asserts
		assertEquals(expectedPremium, actualPremium);
		
	}
	
	@Test
	public void testBondConstructor() {
		//Setup
		String client = "Guild One";
		double issueAmount = 10000000;
		int termLengthYears = 5;
		int termLengthMonths = 0;
		double couponRate = 4;
		double marketRate = 5;
		int installementPeriodMonths = 6;
				
		Bond bond = new Bond(client, issueAmount, termLengthYears, termLengthMonths, couponRate, 
							marketRate, installementPeriodMonths);
		//Expected
		double expectedPayment = 200000; 
		int expectedNumPayments = 10;
		boolean expectedPremium = false;
		double expectedAdjustedBondIssueAmount = 9562396.80;
		//Actual
		double actualPayment = bond.getPayment();
		int actualNumPayments = bond.getNumPayments();
		boolean actualPremium = bond.getPremium();
		double actualAdjustedBondIssueAmount = bond.getAdjustedIssueAmount();
		//Asserts
		assertEquals(expectedPayment, actualPayment, 00);
		assertEquals(expectedNumPayments, actualNumPayments);
		assertEquals(expectedPremium, actualPremium);
		assertEquals(expectedAdjustedBondIssueAmount, actualAdjustedBondIssueAmount, 00);
		
	}

}