package projectDemowebshop;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class General_Actions {
	WebDriver sp;
	Demowebshopelements_Address dr;
	
	SoftAssert sassert=new SoftAssert();
	 //@Test(groups = "smoke")
	
 	//public void login() {
 		String expectedurl = "https://demowebshop.tricentis.com/";
 		String expectedemailname ="suryaprasadmv135@gmail.com";
 		String expectedpasswordname="Newsales@11";
 		String expectedproductname = "Build your own cheap computer";
        String expectedproductcategory = "Desktops";
        
        public void login() {
 		
		sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitwait=new WebDriverWait(sp, 15);
		sp.get("https://demowebshop.tricentis.com/");
		String actualresult = sp.getCurrentUrl();
		assertEquals(expectedurl, actualresult);
		 
		
		
		dr=new Demowebshopelements_Address(sp);
		dr.getLoginlink().click();
		dr.getEmailtextbox().sendKeys("suryaprasadmv135@gmail.com");
		String actualemailname = dr.getEmailtextbox().getText();
		sassert.assertEquals(expectedemailname, actualemailname);
		
		dr.getPasswordtextbox().sendKeys("Newsales@11");
		String actualpasswordname = dr.getPasswordtextbox().getText();
		sassert.assertEquals(expectedpasswordname, actualpasswordname);
		
		
		dr.getLoginbutton().click();
		System.out.println("login was successful");
		
		
	}
 	
 	
 	    public void logout() {
 	    	dr.getLogout().click();
 	    	Reporter.log("logout was successful",true);
 	    }
 	    
	
		//@Test(groups="smoke")
		public void addbooktocart() {
		this.login();
		dr.getBooks().click();
		dr.getComputingandinternetbook().click();
		
		dr.getAddtocartcomputingandinternet().click();
		Reporter.log("product was added to cart successfully",true);
		}
		
				
		@Test
		public void addcomputerstocart() {
			this.login();
			dr.getComputers().click();
			dr.getDesktops().click();
			dr.getBuildyourowncheapcomputer().click();
		    String actualproductname = dr.getBuildyourowncheapcomputertext().getText();
		    sassert.assertEquals(expectedproductname, actualproductname);
		    
			dr.getAddtocartcomputer();
			this.logout();
			
		}
		

}
