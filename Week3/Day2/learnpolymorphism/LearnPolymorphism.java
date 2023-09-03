package week3.day2.learnpolymorphism;

public class LearnPolymorphism {
	
	public void add() {
		int a=9;
		int b=90;
		System.out.println(a+b);

	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a,int b,float c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a,int b,float c,int d) {
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) {
		LearnPolymorphism lp = new LearnPolymorphism();
		lp.add();
		lp.add(23, 34, 90);
		lp.add(34, 90, 7.2f);
		lp.add(23, 56, 7.8f, 67);
	}

}
