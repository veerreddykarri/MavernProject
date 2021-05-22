package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FindLeadWithXpath {
    public static void main(String[] args) throws InterruptedException {
        //Chrome Driver Set-up//
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://leaftaps.com/opentaps/control/main");
        //Login Page//
        chromeDriver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
        WebElement password = chromeDriver.findElementById("password");
        password.clear();
        password.sendKeys("crmsfa");
        chromeDriver.findElementByClassName("decorativeSubmit").click();
        Thread.sleep(5000);
        //Landing Page//
        Assert.assertEquals(chromeDriver.getTitle(), "Leaftaps - TestLeaf Automation Platform");
        chromeDriver.findElementByLinkText("CRM/SFA").click();
        //Create Lead//
        chromeDriver.findElementByLinkText("Leads");
        // //div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a
        // //div[@class='x-grid-7-cell-inner x-grid3-col-partyId']/a
        // (//img[@alt='Lookup'])[1]
        // (//img[@alt='Lookup'])[2]
        // //option[text()='Select your programs']/..
    }
}
