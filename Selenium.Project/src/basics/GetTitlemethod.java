package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netmeds.com/");
		Thread.sleep(2000);
		String titleofThePage=driver.getTitle();
		System.out.println(titleofThePage);
	}

}