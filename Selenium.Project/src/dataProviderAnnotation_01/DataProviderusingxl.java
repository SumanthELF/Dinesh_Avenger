package dataProviderAnnotation_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderusingxl {
	public class DataDrivenFromActiTime {

		@DataProvider
		public String[][] logInUser() throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(new File("./TestData/actitime.xlsx"));  
			Workbook workbook = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet dataSheet = workbook.getSheet("hyy");
			int rowCount = dataSheet.getPhysicalNumberOfRows() - 1;
			int collCount = dataSheet.getRow(0).getPhysicalNumberOfCells();

			String data[][] = new String[rowCount][collCount];
			for (int i = 1, k = 0; i <= rowCount; i++,k++) {
				for (int j = 0; j < collCount; j++) {
					data[k][j] = dataSheet.getRow(i).getCell(j).toString();      
				}
			}
			return data;
		}
		@Test(dataProvider = "logInUser")
		public void lanchApplication(String[] credentials) {
		//	System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys(credentials[0]);
			driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
			driver.findElement(By.id("loginButton")).click();
			driver.quit();
		}

	}

}
