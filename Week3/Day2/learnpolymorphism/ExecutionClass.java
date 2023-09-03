package week3.day2.learnpolymorphism;

public class ExecutionClass {
	
	public static void main(String[] args) {
		BrowserImplementation bi = new BrowserImplementation();
		bi.startApp();
		bi.startApp("firefox");
	}

}
