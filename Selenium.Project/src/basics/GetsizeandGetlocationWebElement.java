package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetsizeandGetlocationWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(2000);
		WebElement  emailAddresstextfield  = driver.findElement(By.id("email"));
		WebElement  emailAddresstextfield1  = driver.findElement(By.xpath("//input[@id='pass']/.."));
		
		
		Point  emailtextfieldlocation =emailAddresstextfield.getLocation();
		Point passwordtextfieldlocation= emailAddresstextfield1.getLocation();
		Dimension emailtextfieldsize =emailAddresstextfield.getSize();
		Dimension passwordtextfieldsize =emailAddresstextfield.getSize();
		
		int xlocationofEmailTextfield=emailtextfieldlocation.getX();
		int xlocationofPasswordTextfield=passwordtextfieldlocation.getX();
		int xlocationpluswidthofEmailTextfield=emailtextfieldsize.getWidth()+xlocationofEmailTextfield;
		int xlocationpluswidthofPasswordTextfield=passwordtextfieldsize.getWidth()+xlocationofPasswordTextfield;
		
		System.out.println("xlocationofEmailTextfield:"+xlocationofEmailTextfield);
		System.out.println("xlocationofPasswordTextfield:"+xlocationofPasswordTextfield);
		System.out.println("widthofEmailTextfield:"+emailtextfieldsize.getWidth());
		System.out.println("widthofPasswordTextfield:"+passwordtextfieldsize.getWidth());
		
		//left allignment check
		if(xlocationofEmailTextfield==xlocationofPasswordTextfield) {
			System.out.println("Email textfield and password textfield are properly alligned towards left ");
		}
	
		else {
			System.out.println("Email textfield and password textfield are not alligned towards left ");
		}
		//right allignment check
		if(xlocationpluswidthofEmailTextfield==xlocationpluswidthofPasswordTextfield) {
			System.out.println("Email textfield and password textfield are properly alligned towards right ");
		}
		else {
			System.out.println("Email textfield and password textfield are not alligned towards right ");

		}
			
		}
		
			
			
			
			
		
		
		
		
		    
		
		
		
		
}
