package newbegining;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Dtf1_Pract {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream loca = new FileInputStream("C:\\Users\\91859\\eclipse-workspace\\next_project\\NewExcelSheet\\credentials.xlsx");
		Workbook yy = WorkbookFactory.create(loca);
		Sheet ss = yy.getSheet("paymentoptions");
		//String usern =ss.getRow(3).getCell(0).getStringCellValue();
		//now to access numeric value we need to do call number to text convertor
		String usern = NumberToTextConverter.toText(ss.getRow(3).getCell(0).getNumericCellValue());
		System.out.println(usern);
		//String pwd =ss.getRow(3).getCell(1).getStringCellValue();
		String pwd = NumberToTextConverter.toText(ss.getRow(3).getCell(8).getNumericCellValue());
		System.out.println(pwd);
	}

}
