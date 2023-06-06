package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E3ExcelReader {
    public static void main(String[] args) throws IOException {
        // String path=System.getProperty("user.dir")+"/Files/Employees.xlsx";
        FileInputStream fileInputStream= new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data form excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(3);
        Cell cell= row.getCell(2);
        System.out.println(cell);




    }
}
