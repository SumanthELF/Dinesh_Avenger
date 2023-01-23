package basics;

import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchFireFoxBrowser {
	public static void main(String[] args) {
		System.setProperty ("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver h=new FirefoxDriver();
		
	}

}
