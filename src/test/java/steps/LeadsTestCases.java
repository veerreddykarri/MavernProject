package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LeadsTestCases extends BaseClass{

    @Given("Click on Create Lead")
    public void clickOnCreateLead() {
        driver.findElementByLinkText("Create Lead").click();
    }

    @And("Enter Mandatory Fields Data on Create Lead Form{string},{string},{string}")
    public void enterMandatoryFieldsDataOnCreateLeadForm(String companyName,String fName, String surname) {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(surname);
    }

    @When("Clicked on Create Lead Button")
    public void clickedOnCreateLeadButton() {
        driver.findElement(By.name("submitButton")).click();
    }

    @Then("Lead created successfully")
    public void leadCreatedSuccessfully() {
        System.out.println("The Lead Created Successfully");
        driver.close();
        driver.quit();
    }


}
