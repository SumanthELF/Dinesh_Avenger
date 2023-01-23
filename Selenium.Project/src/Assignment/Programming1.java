package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Programming1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		 String sourceCodeOfThePage=driver.getPageSource();
		String titleofThePage=driver.getTitle();
		System.out.println(sourceCodeOfThePage);
		System.out.println(titleofThePage);
		System.out.println(driver.getCurrentUrl());
		 
		
		 
	}
}
