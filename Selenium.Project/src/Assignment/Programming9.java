package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Programming9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String windowHandleofThePage=driver.getWindowHandle();
		System.out.println( windowHandleofThePage);  
	}
}
