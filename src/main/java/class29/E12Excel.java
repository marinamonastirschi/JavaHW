package class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class E12Excel {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/Files/Employees.xlsx";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");

            int noOfRows = sheet.getLastRowNum();
            List<Map<String, String>> allExcelData = new ArrayList<>();
            Row row0 = sheet.getRow(0);

            for (int i = 0; i <= noOfRows; i++) {
                Row row = sheet.getRow(i);
                int noOfCells = row.getLastCellNum();
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                for (int j = 0; j < noOfCells; j++) {
                    String key = row0.getCell(j).toString();
                    String value = row.getCell(j).toString();
                    linkedHashMap.put(key, value);
                }
               allExcelData.add(linkedHashMap);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
