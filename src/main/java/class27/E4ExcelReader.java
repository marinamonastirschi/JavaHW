package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {
        // String path=System.getProperty("user.dir")+"/Files/Employees.xlsx";
        FileInputStream fileInputStream= new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data form excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
       // Row row=sheet.getRow(2);
int rowSize=sheet.getPhysicalNumberOfRows();

        for (int rows = 0; rows < rowSize; rows++) {
            Row row=sheet.getRow(rows);
            int columnSize= row.getPhysicalNumberOfCells();
            for (int col = 0; col < columnSize; col++) {
                System.out.print(row.getCell(col)+" ");
            }
            System.out.println();
        }

      //  Cell cell= row.getCell(0);
       // System.out.println(cell);
      //  System.out.print(row.getCell(0)+" ");
       // System.out.print(row.getCell(0));




    }
}
