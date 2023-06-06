package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {
        // String path=System.getProperty("user.dir")+"/Files/Employees.xlsx";
        FileInputStream fileInputStream = new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data form excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        // Row row=sheet.getRow(2);
        List<Map<String, String>> excelData= new ArrayList<>();
        Row headerRow=sheet.getRow(0);


        int rowSize = sheet.getPhysicalNumberOfRows();

        for (int rows = 1; rows < rowSize; rows++) {
            Row row = sheet.getRow(rows);
            Map<String,String> rowMap= new LinkedHashMap<>();
            int columnSize = row.getPhysicalNumberOfCells();
            for (int col = 0; col < columnSize; col++) {
               String key= headerRow.getCell(col).toString();
               String value=row.getCell(col).toString();
               rowMap.put(key,value);
            }
            excelData.add(rowMap);

        }
        System.out.println(excelData);

        //  Cell cell= row.getCell(0);
        // System.out.println(cell);
        //  System.out.print(row.getCell(0)+" ");
        // System.out.print(row.getCell(0));


    }
}
