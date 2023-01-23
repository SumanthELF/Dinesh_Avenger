package basics;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime systemDateTime = LocalDateTime.now().plusMonths(6);
		String monthName = systemDateTime.getMonth().name();
		int Year = systemDateTime.getYear();
		int day = systemDateTime.getDayOfMonth();
		String month = "" + monthName.charAt(0) + monthName.substring(1, monthName.length()).toLowerCase();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);

		driver.get("https://www.makemytrip.com/");
		actions.click().perform();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for (;;) {
			try {
				driver.findElement(
						By.xpath("//div[text()='" + month + " " + Year + "']/../..//p[text()='" + day + "']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}

		}
	}
}
