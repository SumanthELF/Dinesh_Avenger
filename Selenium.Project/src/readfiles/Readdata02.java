package readfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata02 {
     public static String frompropertyfile(String key) {
    	 FileInputStream fis=null;
    	 Properties properties=null;
    	 try {
    		fis=new FileInputStream(new File("./TestData/configuration.properties"));
    		properties=new Properties();
    		try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	 }
    	
    	 catch(FileNotFoundException e) {
    		 e.printStackTrace();
    	 }
    	 return properties.getProperty(key);
    	 
    	 
   }
  public static String  fromExcel(String sheetName, int rollNo, int cellNo){
	  FileInputStream fis =null;
	  Workbook workbook=null;
	  try {
		  fis=new FileInputStream(new File("./TestData/TestData.xlsx"));
		  workbook=WorkbookFactory.create(fis);
		  }
	   catch(FileNotFoundException e) {
		   e.printStackTrace();
		   
	   } catch(EncryptedDocumentException e) {
		   e.printStackTrace();
		   
	   }catch (IOException e) {
		   e.printStackTrace();
	   }
    	 return workbook.getSheet(sheetName).getRow(rollNo).getCell(cellNo).getStringCellValue();
  }
  }


