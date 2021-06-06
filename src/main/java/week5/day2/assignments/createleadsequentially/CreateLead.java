package week5.day2.assignments.createleadsequentially;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
    @Test(invocationCount = 3)
    public void runCreateLead() {
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Veer");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karri");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
        driver.findElement(By.name("submitButton")).click();
    }
}






