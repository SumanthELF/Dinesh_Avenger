package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo_scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		
		JavascriptExecutor sj=(JavascriptExecutor) driver;
		 sj.executeScript("window.scrollTo(0,5300);");
		 //window.scrollTo(0,5300);this is a javascript code written and executed in console of web page 
		 Thread.sleep(30000);
		 driver.quit();

}
}