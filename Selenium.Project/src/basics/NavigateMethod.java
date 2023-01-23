package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netmeds.com/");
		Thread.sleep(1000);
		driver.get("https://www.hotstar.com/in");
		Navigation naviagte=driver.navigate();
		//System.out.println(naviagte);
		naviagte.back();
		Thread.sleep(1000);
		naviagte.forward();
		Thread.sleep(1000);
		naviagte.refresh();
		URL url=new URL("https://www.edureka.co/");
		naviagte.to(url);
	}
}

