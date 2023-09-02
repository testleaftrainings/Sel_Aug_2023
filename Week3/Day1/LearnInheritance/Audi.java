package week3.day1.LearnInheritance;

public class Audi extends Car{

	public void sunRoof() {
		System.out.println("Sunroof from Audi class");

	}
	
	public static void main(String[] args) {
		Audi au = new Audi();
		au.applyBrake();
		au.soundHorn();
		au.applyGear();
		au.sunRoof();
	}
}
