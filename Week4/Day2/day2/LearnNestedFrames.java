package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

public class LearnNestedFrames {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the parent frame
		WebElement frameEle = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following::iframe"));
		driver.switchTo().frame(frameEle);
		//switch to the nested frame
		driver.switchTo().frame(0);
		//click he button inside this frame
		driver.findElement(By.id("Click")).click();
	}

}
