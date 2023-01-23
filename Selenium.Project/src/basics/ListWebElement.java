package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		  List<WebElement> digitalDownloads=driver.findElements(By.partialLinkText("Digital"));
		  Thread.sleep(3000);
		  System.out.println(digitalDownloads.size());
		  digitalDownloads.get(0).click();
		//driver.findElement(By.partialLinkText("DIGITAL")).click();
		//Thread.sleep(3000);
	}

}
