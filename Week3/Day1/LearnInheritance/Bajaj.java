package week3.day1.LearnInheritance;

public class Bajaj extends Auto{

	public void selfStart() {
		System.out.println("Start from Bajaj class");
	}
	
	public static void main(String[] args) {
		Bajaj bj = new Bajaj();
		bj.applyBrake();
		bj.soundHorn();
		bj.applyMeter();
		bj.selfStart();
	}
	
}
