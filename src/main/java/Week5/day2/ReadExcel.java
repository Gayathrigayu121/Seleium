package Week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		//step 1:set the path of the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead1.xlsx");
		//step2:get into the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		//step 3:get into the row
		XSSFRow row = ws.getRow(2);	
		//step4:get into the cell
		XSSFCell cell = row.getCell(1);
		 //step5:to read the data
		 String text = cell.getStringCellValue();
		System.out.println(text);
		//Step6:close the wb
		wb.close();
		
	}
	
	
}
