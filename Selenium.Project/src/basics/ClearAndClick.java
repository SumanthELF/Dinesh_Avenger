package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class ClearAndClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");
		Thread.sleep(2000);
		WebElement usernameTextField=driver.findElement(By.xpath("//input[@id='username']"));
		usernameTextField.clear();
		Thread.sleep(1000);
		usernameTextField.sendKeys("Dinesh");
		Thread.sleep(1000);
		WebElement passwordTextField=driver.findElement(By.xpath("//input[@name='password']"));
		passwordTextField.clear();
		Thread.sleep(1000);
		passwordTextField.sendKeys("Testing123");
	   driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}
		
		
		
		
		
		

}
