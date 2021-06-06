package week5.day2.datawithexceltorunsingletime;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day2.GetDataFromExcelDynamically;

import java.io.IOException;

public class CreateLead extends BaseClass {
    @Test(dataProvider = "fetchData")
    public void runCreateLead(String cName, String fName, String lName, String pNo) {
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
        driver.findElement(By.name("submitButton")).click();
    }

    @DataProvider(indices = 0)//To run the first set of row data
    public Object[][] fetchData() throws IOException {
        GetDataFromExcelDynamically getDataFromExcel = new GetDataFromExcelDynamically();
        String[][] dataForCreateLead = getDataFromExcel.getDataFromExcel("CreateLeadData");

        return dataForCreateLead;

    }
}






