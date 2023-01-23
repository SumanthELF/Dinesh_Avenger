package basics;

import org.openqa.selenium.chrome.ChromeDriver;


public class CallWebsite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netmeds.com/");
		driver.get("https://www.hotstar.com/in");  

}
}
