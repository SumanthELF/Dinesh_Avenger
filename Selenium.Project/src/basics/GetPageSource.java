package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netmeds.com/");
		String sourceCodeofPage=driver.getPageSource();
		System.out.println(sourceCodeofPage);

}
}