package week3.day2.learnpolymorphism;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "TestLeaf";
		//output="faeLtseT"
		
//		a)Convert the String to character array (use toCharArray)
		char[] ch = str.toCharArray();
//		b)Use for loop to iterate through each character (from end to go to the first)
		for (int i = ch.length-1; i >=0; i--) {
			
			System.out.print(ch[i]);
		}
//		

	}

}
