package week3.day1.LearnInheritance;

public class BMW extends Car{
	
	
	public void airBag() {
		System.out.println("AirBag from BMW class");

	}
	
	public static void main(String[] args) {
		BMW bm = new BMW();
		bm.applyBrake();
		bm.soundHorn();
		bm.applyGear();
		bm.airBag();
		
	}

}
