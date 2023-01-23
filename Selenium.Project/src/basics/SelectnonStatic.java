package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectnonStatic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/campaign/landing.php");
		WebElement dayDropDown=driver.findElement(By.id("day"));
		WebElement monthDropdown=driver.findElement(By.id("month"));
		WebElement yeardropDown=driver.findElement(By.id("year"));
		
		
		
		Select  daySelect=new Select(dayDropDown);
		System.out.println("Day dropDown :"+ daySelect.isMultiple());
	    List<WebElement> dayDropDownOptions = daySelect.getOptions();
	    System.out.println(dayDropDownOptions);//it  will print the address in order to print we have to use gettext()
	    for(WebElement a:dayDropDownOptions ) {
	    	System.out.print(a.getText()+",");
	    	}
	       daySelect.selectByIndex(12);
	       System.out.println();
	       System.out.println("=========");
	       
	       
	       
	       Select monthSelect=new Select(monthDropdown);
	       List<WebElement> monthDropDownOptions = monthSelect.getOptions();
	       for(WebElement ele: monthDropDownOptions) {
	    	   System.out.println(ele.getText()+",");
	    	   
	       }
	       System.out.println();
	       monthSelect.selectByValue("1");
	       System.out.println("=========");
	       
	       Select yearSelect=new Select(yeardropDown);
	      List<WebElement> yearDropDownOptions = yearSelect.getOptions();
	      for(WebElement ele: yearDropDownOptions) {
	    	  yearSelect.selectByVisibleText(ele.getText());
	    	  Thread.sleep(500);
	      }
	       yearSelect.selectByVisibleText("2001");
	       
	       
	      }
}
