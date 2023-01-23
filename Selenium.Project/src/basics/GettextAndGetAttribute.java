package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextAndGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		      WebElement userNameTextfield=driver.findElement(By.id("userName"));
		      userNameTextfield.sendKeys("Dinesh");
		      Thread.sleep(2000);
		   String  attrValue=userNameTextfield.getAttribute("value");
		    System.out.println(attrValue);*/
		/* driver.get("https://demo.actitime.com/login.do");
		 Thread.sleep(2000);
	    String  toolTip=driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		 System.out.println(toolTip);*/
		/*driver.get("https://www.woodenstreet.com/?gclid=EAIaIQobChMIqOvnirP5-wIVwRErCh0YPw9VEAAYASAAEgL2RvD_BwE");
		String s1 = driver.findElement(By.xpath("//img[@alt='Wooden Sofas']")).getAttribute("title");
		System.out.println(s1);*/
		driver.get("https://www.woodenstreet.com/?gclid=EAIaIQobChMIqOvnirP5-wIVwRErCh0YPw9VEAAYASAAEgL2RvD_BwE");
		
		String  gram=driver.findElement(By.linkText("Living")).getText();
		System.out.println(gram);
		
}
}
