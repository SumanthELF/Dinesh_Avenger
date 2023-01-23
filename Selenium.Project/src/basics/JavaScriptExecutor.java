package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 for(;;) {
			 try {
				 driver.findElement(By.linkText("National Voter Registration Day 2022")).click();
				  break;
				 }
			 catch(ElementClickInterceptedException e) {
				 js.executeScript("window.scrollBy(0,200);");
			
	

}
}
