package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElement {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
		      WebElement loginLink=driver.findElement(By.linkText("Register"));
		      loginLink.click();
		      System.out.println(loginLink);
		      Thread.sleep(2000);
		      
		      driver.findElement(By.id("gender-male"))  .click();
		      Thread.sleep(2000);
		      driver.findElement(By.id("FirstName")).sendKeys("Dinesh");
		      Thread.sleep(2000);

		      driver.findElement(By.id("LastName")).sendKeys("ingalagi");
		      Thread.sleep(2000);
		    
		      
		      
		      
		      driver.findElement(By.id("Email")).sendKeys("Dinesh");
		      Thread.sleep(2000);
		      driver.findElement(By.id("Password")).sendKeys("Testing123");
		      Thread.sleep(2000);
		      
		      
		      
		      
		

	}

}
