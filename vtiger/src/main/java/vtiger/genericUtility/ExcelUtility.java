package vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class is used to fetch data from Excel Sheets
 * @author Akash
 *
 */
public class ExcelUtility {
	/**
	 * This method fetches data from excel sheet
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String fetchDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(IPathConstant.EXCELFILEPATH);
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
		
	}

}
