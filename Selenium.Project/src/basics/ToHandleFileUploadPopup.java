package basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopup {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		Thread.sleep(2000);
		driver.findElement(By.id("qq-template")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./autoItPrograms/Fresherworld.exe");
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
