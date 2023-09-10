package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get the title of the parent window
		String pTitle = driver.getTitle();
		System.out.println("Parent Title is : "+pTitle);
		//get the window handle
		String pWindowHandle = driver.getWindowHandle();
		System.out.println(pWindowHandle);
		//to get all window handles
		Set<String> windowHandles = driver.getWindowHandles();
		//to switch to a particular index
		List<String> handles = new ArrayList<>(windowHandles);
		//switch to the particular window using index
		driver.switchTo().window(handles.get(1));
		//to print all the window handles
		for (String each : windowHandles) {
			System.out.println(each);
		}
		//child window title
		String cTitle = driver.getTitle();
		System.out.println(cTitle);
		driver.quit();
//		driver.close();
//		driver.switchTo().window(pWindowHandle);
//		System.out.println(driver.getTitle());
		
		
		//verify
//		if (!pTitle.equals(cTitle)) {
//			System.out.println("Control Switched to the new Window");
//		}
//		else {
//			System.out.println("Control stays in the same window");
//		}
	}

}
