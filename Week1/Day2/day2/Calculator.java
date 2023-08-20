package week1.day2;

public class Calculator {

	private int addTwoNumbers(int num1,int num2) {
		return num1+num2;

	}


	public float sub(float num1,int num2) {
		return num1-num2;

	}

	public void mul() {
		int num1=23;
		int num2=45;
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int addTwoNumbers = calc.addTwoNumbers(56, 90);
		System.out.println(addTwoNumbers);
		float sub = calc.sub(34.7f, 67);
		System.out.println(sub);

	}
}
