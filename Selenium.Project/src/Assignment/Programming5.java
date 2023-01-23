package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programming5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/MultipleWindow.html");
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		 
		Set<String> allWindowHandles=driver.getWindowHandles();
		//System.out.println(allWindowHandles);
		for(String windowId:allWindowHandles) {
			driver.switchTo().window(windowId);
			String titleOfThePage=driver.getTitle();
			System.out.println(titleOfThePage);
		}
	}
}
