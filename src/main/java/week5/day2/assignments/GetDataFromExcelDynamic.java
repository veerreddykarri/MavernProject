package week5.day2.assignments;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class GetDataFromExcelDynamic {
    public String[][] getDataFromExcel(String fileName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("./data/" + fileName + ".xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowNum = sheet.getLastRowNum();
        int cellNum = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowNum][cellNum];
        for (int i = 1; i <= rowNum; i++) {
            for (int j = 0; j < cellNum; j++) {
                String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
                System.out.println(cellValue);
                data[i - 1][j] = cellValue;
            }
        }
        workbook.close();
        return data;
    }
}
