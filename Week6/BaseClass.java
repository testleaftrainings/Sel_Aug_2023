package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public RemoteWebDriver driver ;
	public String excelFileName;
	
	@Parameters({"browser","username","url","password"})
	@BeforeMethod
	public void preCondition(String browser, String uName,String url, String pWord) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new InternetExplorerDriver();
		}
	    
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	@DataProvider(name="fetchData",indices = 1)
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel(excelFileName);

	}

	
	@AfterMethod
	public void postCondition() {
		driver.quit();

	}

}
