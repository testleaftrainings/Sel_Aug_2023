package week1.day2;

public class PrintEvenNumbers {
	
	public static void main(String[] args) {
		Bicycle bi = new Bicycle();
		bi.getOtp();
		
		//loop from 1 till 20
		// check for the condition to get even numbers
		// Print the output
		
		for (int i = 1; i <=20; i++) {// 5<=20 -> t 
			if(i%2==0) {// 5%2==1->t
				System.out.println(i);//1 3 5  
			}
			
		}
	}

}
