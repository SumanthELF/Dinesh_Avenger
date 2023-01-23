package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("‪file:///D:/MultipleWindow.html");
		driver.get("file:///D:/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(10000);
		Set<String> allwindowsIds = driver.getWindowHandles();
		System.out.println("Size of set: "+ allwindowsIds.size());
		for(String windowId:allwindowsIds) {
			System.out.println(windowId);
		}
		driver.quit();
		}

}

