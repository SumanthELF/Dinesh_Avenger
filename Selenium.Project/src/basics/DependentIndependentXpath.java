package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
}
}
