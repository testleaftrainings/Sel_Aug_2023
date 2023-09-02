package week3.day1.LearnAbstraction;

public abstract class Reporter implements Browser{
    
	//abstract method of abstrct class
	public abstract void takeSnap();
	
	//own implemented method of abstract class
	public void startReport() {
		System.out.println("Report started");

	}
	
	//implemented method of Interface
	@Override
	public void quit() {
		
		
	}
	
	
}
