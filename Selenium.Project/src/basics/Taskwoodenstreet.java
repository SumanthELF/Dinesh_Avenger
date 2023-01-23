package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskwoodenstreet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Study Tables']")).click();
	String	cost =driver.findElement(By.xpath("//strong[contains(text(),'Rs')])[2]")).getText();
		
		
       
		
}
}
