package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keys_Enter_actions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver,15);
		
		
		driver.get("https://www.kalkifashion.com/");
		WebElement a = driver.findElement(By.linkText("Salwar Kameez "));
		//WebElement b = driver.findElement(By.partialLinkText("SAREE"));
	          Actions actions = new Actions(driver);
	          actions.moveToElement(a).click().perform();
	          //actions.moveToElement(b).sendKeys(Keys.ENTER).perform();
	          
		
	}
		

}
