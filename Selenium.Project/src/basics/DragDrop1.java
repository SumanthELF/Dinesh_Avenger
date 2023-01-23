package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver,15);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		WebElement image01 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement targetplace = driver.findElement(By.id("trash"));
		Actions act = new Actions(driver);
		act.dragAndDrop(image01, targetplace).perform();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		
		
		WebElement newbar = driver.findElement(By.id("Propagation"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",newbar);
		newbar.click();
		WebElement child02 = driver.findElement(By.xpath("//iframe[@data-src='../../demosite/practice/droppable/propagation.html']"));
		child02.click();
		driver.switchTo().frame(child02);
		
		
		WebElement image02 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement droppable2 = driver.findElement(By.id("droppable2"));
		act.dragAndDrop(image02, droppable2).perform();
		Thread.sleep(3000);
		System.out.println("Green");
		driver.quit();
		}
}
