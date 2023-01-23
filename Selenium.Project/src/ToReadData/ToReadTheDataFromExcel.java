package ToReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadTheDataFromExcel {

	public static void main(String[] args) throws IOException {
		//step 1: creating input stream type object 
				File absPath=new File("./TestData/TestData.hyyy.xlsx");
				FileInputStream fis = new FileInputStream(absPath);
				
				//step2: creating object of file type
				
				Workbook workbook=new XSSFWorkbook(fis);
			
			   
			    //step3: Read methods
			    String value=workbook.getSheet("First").getRow(5).getCell(1).getStringCellValue();
			    System.out.println(value);

	}

}
