package twoDarray;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practiceexcel2d {
	public static void main(String[] args) throws IOException {
		// step 1:creating the object of input class
		FileInputStream fis=new FileInputStream("./TestData/Play.xlsx");
		// step2:creating object of input stream

		Workbook workbook = WorkbookFactory.create(fis);

		// step3:creating object of file type
		Sheet infosheet = workbook.getSheet("Sheet1");
		int rowcount = infosheet.getPhysicalNumberOfRows();
		int columncount = infosheet.getRow(0).getPhysicalNumberOfCells();

		String[][] sarr = new String[rowcount][columncount];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				sarr[i][j]=infosheet.getRow(i).getCell(j).toString();
			}
		}
		for (String[] array : sarr) {
			for (String data : array) {
				System.out.println(data + " ,");
			}
			System.out.println();
		}

	}

}
