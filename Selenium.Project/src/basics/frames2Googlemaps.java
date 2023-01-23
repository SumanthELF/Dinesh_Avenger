package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames2Googlemaps {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@role='button']")).click();
	    WebElement iframe = driver.findElement(By.xpath("(//iframe[@role='presentation'])[2]"));
	    driver.switchTo().frame(iframe);//webelement path
	    Thread.sleep(3000);
	    WebElement maps=driver.findElement(By.xpath("//span[text()='Maps']"));
	    maps.click();
	    Thread.sleep(2000);
	    driver.quit();
        
		
}
}
