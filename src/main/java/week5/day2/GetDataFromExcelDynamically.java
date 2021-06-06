package week5.day2;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class GetDataFromExcelDynamically {
    public String[][] getDataFromExcel(String fileName) throws IOException {
       // XSSFWorkbook workbook = new XSSFWorkbook("./data/CreateLeadData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
        XSSFSheet sheet =workbook.getSheet("Sheet1");
        int rowCount = sheet.getLastRowNum();//Code doesn't count the first row by default
       // int rowCount = sheet.getPhysicalNumberOfRows(); //code to get all the number of rows including first row
        int cellCount = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowCount][cellCount];
        for (int i=1;i<=rowCount;i++){
            for (int j=0;j<cellCount;j++){
                String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
                System.out.println(cellValue);
                data[i-1][j]= cellValue;

            }
        }
        workbook.close();// We need to close the workbook compulsory
        return data;
    }
}
