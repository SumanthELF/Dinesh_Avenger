package batchExecution02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class lamborghini {
	@Parameters("Name")
	 @Test
		public  void dinesh(@Optional("if not from the xml")String dinesh){
		System.out.println(dinesh);
			//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.lamborghini.com/en-en");
			driver.quit();
			} 
}          
