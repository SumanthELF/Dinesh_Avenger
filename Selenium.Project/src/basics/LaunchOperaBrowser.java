package basics;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchOperaBrowser {
	public static void main (String[]args) {
		System.setProperty("webdriver.opera.driver","./drivers/operadriver.exe");
		OperaDriver g=new OperaDriver();
	}

}
