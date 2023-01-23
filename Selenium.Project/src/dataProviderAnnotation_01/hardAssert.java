package dataProviderAnnotation_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssert {
	@Test
	public void softassert() {
		String actualpagetitle = "Demo Web Shop";
		String actualattributevalue = "DINESHGOPALINGALAGI";
		
		WebDriver sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		sp.get("https://demowebshop.tricentis.com/");
		String expectedpagetitle = sp.getTitle();
		Assert.assertEquals(actualpagetitle, expectedpagetitle, "Title is wrong");
		//this is soft assert 
		
		SoftAssert sa=new SoftAssert(); 
		sp.findElement(By.partialLinkText("Log in")).click();    
		sp.findElement(By.id("Email")).sendKeys(actualattributevalue); 
		String expectedattributevalue = sp.findElement(By.id("Email")).getAttribute("value");
		sa.assertEquals(actualpagetitle, expectedpagetitle, "The Email is Invalid");
		sa.assertAll();
	    sp.quit(); 
	      } 
} 
