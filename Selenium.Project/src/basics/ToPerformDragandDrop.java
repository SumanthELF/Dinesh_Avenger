package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformDragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
	    WebDriverWait explicitWait = new WebDriverWait(driver,15);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		 WebElement trash = driver.findElement(By.id("trash"));
		 
		 Actions actions= new Actions(driver);
		 actions.dragAndDrop(image1, trash).perform(); 
				
		
	}
}
