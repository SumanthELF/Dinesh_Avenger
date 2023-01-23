package Assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
	public static void main(String[] args) throws InterruptedException{
		String ExpectedPageTitle="Free Music online : play & Download MP3 Songs | Wynk Music ";
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("which song you want to listen...?");
		String songname=sc.nextLine();
		String songnamegiven=songname;
		System.out.println("taking input for the song to be played: successful");
		// step 1: open chrome browser and enter the test url
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("launch empty chrome browser : succesfull");
		driver.get("https://wynk.in/music");
		String ActualpageTitle=driver.getTitle();
		if(ExpectedPageTitle.equals(ActualPageTitle)) {
			System.out.println("0pen Wynkmusic web page: successful");
		}
		else {
			System.out.println("open wynkmusic web page : unsuccesful");
		}
		WebElement searchbar= driver.findElement(By.xpath("(//div[contains))"ar.click();
		Thread.sleep(3000);
		System.out.println("click on search bar : successful");
		
		WebElement searchbar2=driver.findElement(By.xpath("(//input[@type))"
	  searchbar2.sendKeys(songname);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("(//span[@class"))
	  Thread.sleep(3000);
	  System.out.println("click on expected song:successful");
	  
	  System.out.println("");
	  String songreview=driver.nextLine();
	  Thread.sleep(10000);
	  driver.quit();
		
			
		}
	
		
}
