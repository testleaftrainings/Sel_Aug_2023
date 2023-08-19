package week1.day1;

public class LearnIfCondition {
	
	public static void main(String[] args) {
		
		//Problem Statement
		//Find Whether the given number is positive or negative or neutral
		//input
		int number = 70;
		//type if -> ctrl+space -> enter 
		
		if (number>0) { //if(-35>0) -> false
			System.out.println("The given number :" +number + "is Positive");
		}
		else if(number==0) { // (-35==0) -> false
			System.out.println("The given number :" +number +"is Neutral");
		}
		else  {
			System.out.println("The given number :" +number +"is Negative");
		}
		
		
	}

}
