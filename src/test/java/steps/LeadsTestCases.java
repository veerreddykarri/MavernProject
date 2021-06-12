package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadsTestCases extends BaseClass {

    @Given("Click on Create Lead")
    public void clickOnCreateLead() {
        driver.findElementByLinkText("Create Lead").click();
    }

    @And("Enter Mandatory Fields Data on Create Lead Form{string},{string},{string},{string}")
    public void enterMandatoryFieldsDataOnCreateLeadForm(String companyName, String fName, String surname,String phoneNumber) {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(surname);
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
    }

    @When("Clicked on Create Lead Button")
    public void clickedOnCreateLeadButton() {
        driver.findElement(By.name("submitButton")).click();
    }

    @Then("Lead created successfully")
    public void leadCreatedSuccessfully() {
        System.out.println("The Lead Created Successfully");
    }

    @Given("Click on Find Lead")
    public void clickOnFindLead() {
        driver.findElement(By.linkText("Find Leads")).click();
    }

    @And("Click on Edit Lead button")
    public void clickOnEditLeadButton() {
        driver.findElement(By.linkText("Edit")).click();
    }

    @And("Enter Mandatory Fields Data on Edit Lead Form{string}")
    public void enterMandatoryFieldsDataOnEditLeadForm(String editCompanyName) {
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(editCompanyName);
    }

    @And("Search Lead using phone number {string}")
    public void searchLeadUsingPhoneNumber(String phoneNumber1) throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber1);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
    }

    @When("Clicked on Update Button")
    public void clickedOnUpdateButton() {
        driver.findElement(By.name("submitButton")).click();
    }

    @Then("Lead Updated successfully")
    public void leadUpdatedSuccessfully() {
        System.out.println("Lead edited successfully");
    }
    String leadID ="";
    @And("Store the Lead ID")
    public void storeTheLeadID() throws InterruptedException {
        Thread.sleep(2000);
        String getLeadID = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
        leadID = getLeadID.replaceAll("[A-Za-z()]","").trim();
    }

    @When("Click on Delete Lead button")
    public void clickOnDeleteLeadButton() {
        driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[4]").click();
    }

    @Then("Verify the lead has been deleted")
    public void verifyTheLeadHasBeenDeleted() throws InterruptedException {
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        String text = driver.findElement(By.className("x-paging-info")).getText();
        if (text.equals("No records to display")) {
            System.out.println("Text matched");
        } else {
            System.out.println("Text not matched");
        }
    }


}
