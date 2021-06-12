package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login extends BaseClass{
    @Given("Open the chrome browser")
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @And("Load the URL {string}")
    public void loadURL(String url) {
        driver.get(url);
    }

    @And("Enter the username as {string}")
    public void enterUserName(String userName) {
        driver.findElement(By.id("username")).sendKeys(userName);

    }

    @And("Enter the password as {string}")
    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("Clicked on Login button")
    public void clickOnLogin() {
        driver.findElement(By.className("decorativeSubmit")).click();
    }

    @Then("Home page should be displayed")
    public void verifyHomePage() {
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
        driver.quit();
    }
    @But("Error message should be displayed")
    public void errorMessage()
    {
        System.out.println("Error message");
        driver.close();
        driver.quit();
    }

    @And("Login to CRM Application")
    public void loginToCRMApplication() {
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
    }
}
