package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolledIntoView {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		WebElement ElementToBeScrolled=driver.findElement(By.linkText("Returns"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0]. scrollIntoView(true)",ElementToBeScrolled);
		Thread.sleep(30000);
		driver.quit();
		

}
}
