package basics;

import java.awt.Checkbox;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedIsSelectedIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://demo.actitime.com/login.do");
	     WebElement checkbox=  driver.findElement(By.id("keepLoggedInCheckBox"));
	      
		System.out.println(checkbox.isDisplayed());
		Thread.sleep(2000);
		System.out.println(checkbox.isSelected());
		Thread.sleep(2000);
		checkbox.click();
		System.out.println("after click");
		Thread.sleep(2000);
		System.out.println(checkbox.isSelected());
		driver.quit();*/
		driver.get("https://demo.actitime.com/login.do");
		
		
	}
}



