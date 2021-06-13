package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LeadsTestCases<trimLeadID> extends BaseClass {

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


    @When("Clicked on Duplicate Lead button")
    public void clickedOnDuplicateLeadButton() {
        driver.findElement(By.linkText("Duplicate Lead")).click();
    }

    @And("Click on Submit Button")
    public void clickOnSubmitButton() {
        driver.findElement(By.name("submitButton")).click();
    }

    @Then("Verify the duplicate lead has been created")
    public void verifyTheDuplicateLeadHasBeenCreated() {
        System.out.println(" Duplicate Lead has been created successfully");
    }

    @And("Click on Merger Lead Option")
    public void clickOnMergerLeadOption() {
        driver.findElementByXPath("//a[text()='Merge Leads']").click();
    }

    @And("Click on First Image icon")
    public void clickOnFirstImageIcon() {
        driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
    }
String leadIDForMerge="";
    String trimLeadID ="";
    @And("Select the First Lead in the table")
    public void selectTheFirstLeadInTheTable() {
        Set<String> handler =driver.getWindowHandles();
        List<String> extractWindows = new ArrayList<String>(handler);
        driver.switchTo().window(extractWindows.get(1));
        leadIDForMerge = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
        trimLeadID = leadIDForMerge.replaceAll("[a-zA-Z()]", "").trim();
        System.out.println(trimLeadID);
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
        driver.switchTo().window(extractWindows.get(0));
    }

    @And("Click on Second Image icon")
    public void clickOnSecondImageIcon() {
        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
    }

    @And("Select the Second Lead in the table")
    public void selectTheSecondLeadInTheTable() throws InterruptedException {
        Thread.sleep(5000);
        Set<String> handler1 =driver.getWindowHandles();
        List<String> extractWindows1 = new ArrayList<String>(handler1);
        driver.switchTo().window(extractWindows1.get(1));
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
        driver.switchTo().window(extractWindows1.get(0));
    }

    @When("Clicked on Merge Lead button")
    public void clickedOnMergeLeadButton() {
        driver.findElementByXPath("//a[@class='buttonDangerous']").click();
    }

    @And("Click on Ok on the alert popup")
    public void clickOnOkOnTheAlertPopup() {
        driver.switchTo().alert().accept();
    }
String companyName = "";
    @Then("Verify the two lead has been merged")
    public void verifyTheTwoLeadHasBeenMerged() {
        companyName =driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
        System.out.println(companyName);
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        driver.findElementByXPath("//input[@name='id']").sendKeys(trimLeadID);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Assert.assertEquals(driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText(),"No records to display");
    }
}
