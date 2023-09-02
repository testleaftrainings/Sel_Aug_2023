package week3.day1.LearnInheritance;

public class Auto extends Vehicle{
	
	public void applyMeter() {
		System.out.println("Meter applied from Auto class");

	}
	
	public static void main(String[] args) {
		Auto aut = new Auto();
		aut.applyBrake();
		aut.soundHorn();
		aut.applyMeter();
	}

}
