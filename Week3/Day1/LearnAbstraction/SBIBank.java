package week3.day1.LearnAbstraction;

public class SBIBank implements RBI{

	@Override
	public void knowYourCustomer() {
		System.out.println("AADHAR");
		
	}

	@Override
	public void withDrawalLimit() {
		
		System.out.println("50000");
	}
	
	public void goldLoan() {
		System.out.println("5% interest rate");

	}

}
