package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_trelloActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
		driver.get("https://trello.com/en/login");
		Thread.sleep(3000);
		driver.findElement(By.id("user")).sendKeys("dineshgopalingalagi@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("dineshavenger09");
		driver.findElement(By.xpath("//span[@class='css-19r5em7']")).click();
		
		
}
}
