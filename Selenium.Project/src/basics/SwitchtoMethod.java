package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SetAlertText;

public class SwitchtoMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		
		
		String expectedpagetitle="original Italian Recipes-Giallozafferano";
		Set<String> allWindowIds=driver.getWindowHandles();
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualpageTitle=driver.getTitle();
			if(expectedpagetitle.equals(actualpageTitle)) {
				driver.manage().window().maximize();
				break;
			}
		}
		
		
	}
	
}
