package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames1 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
         Thread.sleep(3000);
       /*  driver.switchTo().frame(0);
         driver.findElement(By.id("regEmail")).sendKeys("6360671055");
         driver.quit();*/
         driver.switchTo().frame(iframe);
         driver.findElement(By.id("regEmail")).sendKeys("6360671055");
        
}
}