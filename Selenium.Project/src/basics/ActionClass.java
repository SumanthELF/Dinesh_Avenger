package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Thread.sleep(5000);
		WebElement passwordTextField = driver.findElement(By.id("password"));
		 passwordTextField.sendKeys("unequivocally@2021");
		 Thread.sleep(2000);
		 Actions actions = new Actions(driver);
		 actions.moveToElement(passwordTextField, 0, 240).click().perform();
		 }

}
