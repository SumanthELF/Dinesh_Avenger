package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netmeds.com/");
		Thread.sleep(9000);
		String title = driver.getTitle();
		System.out.println(title);
		 Set<String> windowHandlesOfThePage = driver.getWindowHandles();
		System.out.println(windowHandlesOfThePage);
		driver.get("https://www.hotstar.com/in"); 
		Thread.sleep(5000);
	   String titleofThePage=driver.getTitle();
		System.out.println(titleofThePage);
		 Set<String> windowHandlesOfThePagee = driver.getWindowHandles();
			System.out.println(windowHandlesOfThePagee);
		driver.close();
	}  

}
