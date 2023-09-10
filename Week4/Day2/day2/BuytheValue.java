package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuytheValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to frame
		driver.switchTo().frame("dummy-chat-button-iframe");
		//click chat widjet
		driver.findElement(By.id("dummy-chat-button")).click();
		//enter message in the textbox
		//switch to the frame
		driver.switchTo().frame("ShopifyChat");
		driver.findElement(By.xpath("//div[@class='composer-bar__box']/textarea")).sendKeys("Hai");
		//close chat widjet
		driver.findElement(By.xpath("//button[contains(@class,'chat-app')]")).click();
		//to come out of all frames and switch back to the main window
		driver.switchTo().defaultContent();
		//click a product
		driver.findElement(By.xpath("//div[@class='product-content']/following::a")).click();
		
		
	}

}
