package util;
import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 

import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

//Main class 
public class ExcellReadUtli { 

public String readExcell(int x,int y)throws IOException
{
			FileInputStream file = new FileInputStream( 
				new File("Input.xlsx")); 
			XSSFWorkbook workbook = new XSSFWorkbook(file); 
			XSSFSheet sheet = workbook.getSheetAt(0); 
			Row r=sheet.getRow(x);
			Cell c=r.getCell(y);
			String stringValue=c.getStringCellValue();
			return stringValue;
}
}
			

			
