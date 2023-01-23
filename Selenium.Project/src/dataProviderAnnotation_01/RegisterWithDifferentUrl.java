package dataProviderAnnotation_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterWithDifferentUrl {
     @DataProvider
     public String[] data(){
    	 String [] url= {"https://www.woodenstreet.com/?","https://www.ferrari.com/en-IN"};
    	 return url;
    	 }
        @Test(dataProvider="data")       
         public void test(String url) { 
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	 driver.get(url);
    	 driver.quit();  
    	                                                                                   
     }
}                                                                                        
