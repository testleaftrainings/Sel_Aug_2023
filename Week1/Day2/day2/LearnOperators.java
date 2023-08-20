package week1.day2;

public class LearnOperators {
	
	public static void main(String[] args) {
		
		int a=97;
		int b=2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // quotient
		System.out.println(a%b); // remainder
		
		System.out.println("==============================");
		
		System.out.println(a>b && a<b);//true 97>2 ->  T && 97<2 ->false
		System.out.println(a<b || a>b || a==b);//false 97<2 -> f || 97>2 -> T
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println("=================================");
		System.out.println(a);
		System.out.println(a++);//a+1
		System.out.println(a);
		System.out.println(++a);
		
		
		
		
	}

}
