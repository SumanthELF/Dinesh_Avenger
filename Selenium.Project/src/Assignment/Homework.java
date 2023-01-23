package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.industrybuying.com/");
		driver.findElement(By.id("search_input")).clear();
		driver.findElement(By.id("search_input")).sendKeys("microscope"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement path=driver.findElement(By.xpath("(//span[@class='rs'])[3]"));
		String text=path.getText();
		System.out.println("price of third product: "+text);
		String tuned1=text.replace("Rs.","");
		String tuned2=tuned1.replace("Piece","");
		String tuned3=tuned2.replace("/","");
		String tuned4=tuned3.trim();
		String tuned5=tuned4.replace(",","");
		int tuned6 = Integer.parseInt(tuned5);
		if(tuned6>10000) {
			System.out.println("price is high");
		}
		else {
			driver.findElement(By.xpath("(//a[contains(@class,'addToCart AH')])[3]")).click();
			System.out.println("product has been succesfully added to cart");
		}
		System.out.println();
		driver.quit();
		
	  /*  else {
		System.out.println("you cannot go beyond 13");
	}
}
      else {
	   System.out.println("System does not support to search this product");
}*/
}}
