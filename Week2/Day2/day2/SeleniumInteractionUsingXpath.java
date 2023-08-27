package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumInteractionUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize window
		driver.manage().window().maximize();
		
		//enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//click on the Login button
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		//click Crmsfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//click Leads Link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//click CreateLead Link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//select source dropdown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Instantiate Select class
		Select sec = new Select(sourceDD);
		
		//Select ColdCall option by using selectByIndex()
		sec.selectByIndex(1);
		
		//Marketing campaign dropdown
		WebElement mcDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select sec1 = new Select(mcDD);
        
        //Select Car and Driver option using selectByValue()
        sec1.selectByValue("CATRQ_CARNDRIVER");
        
        //Industry Dropdown
        WebElement indusDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select sec2 = new Select(indusDD);
        
        //Select Non-profit option using selectByVisibleText
        sec2.selectByVisibleText("Non-profit");
        
        //click CreateLead Button
        driver.findElement(By.name("submitButton")).click();
        
		
		
		
		
		
		
		
		
		
		
	}

}