package week3.day1.LearnAbstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserImplementation extends Reporter implements Browser,ELement{

	public ChromeDriver driver;
	
	@Override
	public void locateElement() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
	}

	@Override
	public void takeSnap() {
		System.out.println("Snap taken");
		
	}
	
	@Override
	public void startApp() {
		driver = new ChromeDriver();
	}

	@Override
	public void loadURL(String url) {
		driver.get(url);
		
	}

	
	public void close() {
		driver.close();
		
	}

	
	
	public static void main(String[] args) {
		BrowserImplementation bi = new BrowserImplementation();
		bi.startApp();
		bi.loadURL("http://leaftaps.com/opentaps/control/main");
		bi.locateElement();
		bi.takeSnap();
		bi.close();
		
	}

	

}
