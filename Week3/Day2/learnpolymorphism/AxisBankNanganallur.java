package week3.day2.learnpolymorphism;

public class AxisBankNanganallur extends AxisBank {
	
	@Override
	public void knowYourCustomer() {
		System.out.println("PAN Card");
		
	}
	
	public static void main(String[] args) {
		AxisBankNanganallur ab = new AxisBankNanganallur();
		ab.knowYourCustomer();
		
		
	}

}
