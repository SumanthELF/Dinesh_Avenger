package batchExecution_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class bukkati {
	   @Parameters("chromebrowser")
	   @Test
		public  void dinesh(@Optional("from class")String bname){
		   System.out.println(bname);
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bugatti.com/");
			driver.quit();
	   }


}
