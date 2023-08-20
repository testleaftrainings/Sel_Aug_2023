package week1.day2;

public class LearnBreak {
	
	
	
	public static void main(String[] args) {
	
		//type for -> ctrl+space-> click 2nd one ->click enter
		//datatype variable = starting point; variable operator end point; increase/decrease
		// if i find i==3-> Three ; stop the iteration
		for (int i = 1; i <=10 ; i++) { 
			if(i==3) {//3==3->t
				System.out.println("Three"); //Three
				break;
			}
			
			System.out.println(i); // 1 2 Three 3 4
		}
		System.out.println("Out of For loop");
	}
	

}
