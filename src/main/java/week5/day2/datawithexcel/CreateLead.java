package week5.day2.datawithexcel;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day2.GetDataFromExcel;

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

    @DataProvider
    public Object[][] fetchData() throws IOException {
        GetDataFromExcel getDataFromExcel = new GetDataFromExcel();
        String[][] dataForCreateLead = getDataFromExcel.getDataFromExcel();

        return dataForCreateLead;

    }
}






