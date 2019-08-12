import static org.junit.Assert.*;

import org.junit.Test;
import data.Bond;







public class BondTest {

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
		double expectedAdjustedBondIssueAmount = 9756097.56;
		//Actual
		double actualPayment = bond.calcPayment(issueAmount, couponRate, installementPeriodMonths);
		int actualNumPayments = bond.calcNumPayments(termLengthYears, termLengthMonths, installementPeriodMonths);
		boolean actualPremium = bond.isPremium(couponRate, marketRate);
		double actualAdjustedBondIssueAmount = bond.calcAdjustedIssueAmount(issueAmount, couponRate,
																			marketRate, actualPayment, actualNumPayments);
		//Asserts
		assertEquals(expectedPayment, actualPayment);
		assertEquals(expectedNumPayments, actualNumPayments);
		assertEquals(expectedPremium, actualPremium);
		assertEquals(expectedAdjustedBondIssueAmount, actualAdjustedBondIssueAmount);
		
	}

}