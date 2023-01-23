package Assignment;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programming2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		Navigation navigate=driver.navigate();
		System.out.println(navigate);
		Thread.sleep(3000);
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		navigate.refresh();		
		}
}