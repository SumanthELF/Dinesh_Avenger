package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programming3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		 Dimension sizeOfTheBrowser=new Dimension(100,200);
		 driver.manage().window().setSize(sizeOfTheBrowser);
	}
}
		 
		 
		
		
		
		


