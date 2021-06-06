package week5.day2.addingdatanormally;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
    @Test(dataProvider = "fetchData")
    public void runCreateLead(String cName, String fName, String lName, String pNo) {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
        driver.findElement(By.name("submitButton")).click();
    }

    @DataProvider
    public Object[][] fetchData() {
        String[][] dataForCreateLead = new String[2][4];
        dataForCreateLead[0][0] = "TestLeaf";
        dataForCreateLead[0][1] = "Veer";
        dataForCreateLead[0][2] = "Karri";
        dataForCreateLead[0][3] = "99";

        dataForCreateLead[1][0] = "HomeOffice";
        dataForCreateLead[1][1] = "Praveen";
        dataForCreateLead[1][2] = "Madan";
        dataForCreateLead[1][3] = "98";
        return dataForCreateLead;
    }
}






