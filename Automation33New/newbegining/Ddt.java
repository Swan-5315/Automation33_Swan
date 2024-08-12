package newbegining;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Ddt {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\91859\\eclipse-workspace\\next_project\\NewExcelSheet\\credentials.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("login");
		Row r1 = s1.getRow(1);
		/*Cell c1 = r1.getCell(0);
		String u1 = c1.getStringCellValue();
		System.out.println(u1);*/
		String u1 =s1.getRow(2).getCell(1).getStringCellValue();
		//String u1 =NumberToTextConverter.toText(s1.getRow(2).getCell(1).getNumericCellValue());//to fetch numeric value
		System.out.println(u1);
		
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);
		String u2 = c2.getStringCellValue();
		System.out.println(u2);
	}

}
