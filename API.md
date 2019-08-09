# **Amortization Table Creator**
*Public Interface*

*Sam Binfet*

### **Debt**
The Debt class is an class and is designed to encapsulate the fundamental information regarding the issuance of debt. Each debt object 
contains information regarding the terms of the debt. These terms include the name of the client, debt amount, length of the term in 
in years and  months,coupon rate, and market rate, and installment period in months. All of the following are variables that are stored in the class and are passed into the constructor. 

#### Variables #####
* clientName (String)
* debtAmount (int)
* termLengthYears (int)
* termLenthMonths (int)
* couponRate (double)
* marketRate (double)
* installmentPeriod (int)
* balance (double)
* payment (double)
* principle (double)
* interest (double)
* premium (boolean)
* numPayments (int)

#### Methods ####
* getClient - is a public method that takes in no parameters and returns a String name of the client.
* getDebtAmount - is a public method that takes in no parameters and returns an int amount of debt issued.
* getTermLengthYears - is a public method that takes in no parameters and returns an int number of years of the term.
* getTermLengthMonths - is a public method that takes in no parameters and returns an int number of months of the term.
* getCouponRate - is a public method that takes in no parameters and returns a double rate of the debt.
* getMarketRate - is a public method that takes in no parameters and retruns a double market rate for similar debt.
* getInstallmentPeriod - is a public method that takes in no parameters and retruns an int number of months between installments.

### ScheduleCalculator ###


* getBalance - is a public method that takes in no parameters and retruns a double of the current balance after payments. 
* getPaymentAmount - getPrinciple
