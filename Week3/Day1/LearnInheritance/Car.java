package week3.day1.LearnInheritance;

public class Car extends Vehicle{

	
	public void applyGear() {
		System.out.println("Gear Applied fro Car class");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.applyBrake();
		car.soundHorn();
		car.applyGear();
		
		
	}
}
