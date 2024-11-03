package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {

		// once column is identified then scan entire testcase column identify sample testcase
		// after grab apple testcase row = pull all the data of the row and feed into
		// test

		// FileInputStream argument
		FileInputStream fis = new FileInputStream("C:/Users/Sandy/Downloads/download.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sample")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify the testcase column by scanning the entire 1st row
				Iterator<Row> rows = sheet.iterator();// sheets is collection of rows
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.cellIterator();// row is collection of cells

				int k = 0;
				int coloumn = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("season")) {
						// desire column
						coloumn = k;

					}
					k++;
				}
				System.out.println(coloumn);
				 
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("season"))
					{
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext())
						{
							System.out.println(cv.next().getStringCellValue());
						}
					}
				}

			}
		}

	}

}
