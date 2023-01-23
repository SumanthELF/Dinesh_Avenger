package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netmeds.com/");
		Thread.sleep(2000);
		Point positionofTheBrowser= new Point(250, 250);
		driver.manage().window().setPosition(positionofTheBrowser);
		Thread.sleep(5000);
		Dimension sizeofThebrowser=new Dimension(0,0);
		driver.manage().window().setSize(sizeofThebrowser);
		driver.manage().window().fullscreen();
		Point positionofTheBrowser1=driver.manage().window().getPosition();
		System.out.println( positionofTheBrowser1.getX());
		Dimension a=driver.manage().window().getSize();
		System.out.println(a.getHeight());
		System.out.println(a.getWidth());  
		}
}    

