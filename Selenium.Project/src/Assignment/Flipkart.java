package Assignment;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static int count=1;
	public static int a[]=new int[3];
	public static int pcount=3;
	public static int price;
	public static int i=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver dgi=new ChromeDriver();
		
		try {
			while(count<4) {
				
				dgi.manage().window().maximize();
				dgi.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				dgi.get("https://www.flipkart.com/");
				dgi.switchTo().activeElement().sendKeys(Keys.ESCAPE);
				WebElement Searchbar=dgi.findElement(By.name("q"));
				Searchbar.click();
				
				
				System.out.println("enter your "+ count +"product name to be searched and added to cart");
				String ProductName=sc.nextLine();
				
				//searching for product
				Searchbar.sendKeys(ProductName,Keys.ENTER);
				
				String parentwindowid=dgi.getWindowHandle();
				//click on the product
				dgi.findElement(By.xpath("(//div[contains(@class,'_4rR01T)])[1]")).click();
				Set<String> allwindowids = dgi.getWindowHandles();
				allwindowids.remove(parentwindowid);
				//transfer driver control to child page that is to add to cart page
				for(String windowid:allwindowids) {
					dgi.switchTo().window(windowid);
				}
				//click on add to cart button 
				dgi.findElement(By.xpath("//button[contains(@class,'_2kpZ6l_2u9uOA_3v1-ww')]")).click();
				
				//capture raw price
				Thread.sleep(3000);
				String text = dgi.findElement((By.xpath("(//span[@class,'_2-ut7f _1WpvJ7'])[1]"))).getText();
				
				
				String tuned1 =text.substring(1);
				String tuned2 = tuned1.replace(",","") ;
				price =Integer.parseInt(tuned2);
				a[i]=price;
				i++;
				
				//int a[]=new int[3];
				System.out.println("price of the product:"+tuned2);
				Thread.sleep(3000);
				
				//dgi.quit();
				//system.out.println("GREEN");
				count++;
				
				System.out.println("status of adding to cart : GREEN");
				System.out.println("sorting starts now   :");
				if(i==3) {
					int max=a[0];
					for(int j=0;j<a.length;j++) {
						if(a[j]>max) {
							pcount--;
							max=a[j];
						}
					}
					Thread.sleep(3000);
					WebElement Removebutton=dgi.findElement(By.xpath("(//div[text()='Remove'])["+pcount+"]"));
					
				JavascriptExecutor	jd= (JavascriptExecutor) dgi;
				System.out.println("path identified");
				jd.executeScript("arguments[0].scollIntoview(true),arguments[0].click()",Removebutton);
				System.out.println("scroll and ");
				}
				
				
			}
		
	      catch(Exception e) {
	    	  dgi.quit();
	      }
		
	}

	}
	
	


}
