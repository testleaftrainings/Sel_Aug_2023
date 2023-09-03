package week3.day2.learnpolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImplementation  implements Browser{

	public RemoteWebDriver driver;
	
	@Override
	public void startApp() {
		driver=new ChromeDriver();
		
	}
	
	@Override
	public void startApp(String browser) {
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
		    break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "ie":
			driver=new InternetExplorerDriver();
			break;

		default:
			break;
		}
		
	}
	

	

	
	
}
