package week1.day2;

public class Bicycle {
	
	//accessmodifier returntype methodname inputarguments
	public int getCycleCount() {
		return 2;
	}
	
	// type methodname -> ctrl+space -> enter
	public String getCycleColor(int brandNum,String color) {
		return brandNum +" "+color ; 

	}
	
	public int addTwoNumbers(int num1,int num2) {
		return num1+num2;
	}
    
	public void getOtp() {
		System.out.println("No!!");
		
	}
	
	public static void main(String[] args) {
		//Classname objectname = new ClassName();
		Bicycle bc = new Bicycle();
		System.out.println(bc.getCycleCount());
		System.out.println(bc.getCycleColor(235, "Red"));
		bc.getOtp();
		System.out.println(bc.addTwoNumbers(23, 45));
		
		
		
	}
}
