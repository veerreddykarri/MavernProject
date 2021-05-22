package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {
    public static void main(String[] args) throws InterruptedException {
        //setup the driver path
        WebDriverManager.chromedriver().setup();
        //open chrome driver
        ChromeDriver chromeDriver = new ChromeDriver();
        //load the application
        chromeDriver.get("http://leaftaps.com/opentaps/control/main");
        //to maximize
        chromeDriver.manage().window().maximize();
        // find element and pass keys
        chromeDriver.findElementById("username").sendKeys("demosalesmanager");
        // find password element and pass keys
        WebElement password = chromeDriver.findElementByName("PASSWORD");
        password.clear();
        password.sendKeys("crmsfa");
        // find login element and click
        chromeDriver.findElementByClassName("decorativeSubmit").click();
        chromeDriver.findElementByLinkText("CRM/SFA").click();
        Thread.sleep(5000);
        chromeDriver.findElementByLinkText("Leads").click();
        chromeDriver.findElementByLinkText("Create Lead").click();
        chromeDriver.findElementById("createLeadForm_companyName").sendKeys("Jiya Technologies Ltd1");
        chromeDriver.findElementById("createLeadForm_firstName").sendKeys("Veer1");
        chromeDriver.findElementById("createLeadForm_lastName").sendKeys("Karri1");
        WebElement industry = chromeDriver.findElementById("createLeadForm_industryEnumId");
        Select industryDropdown = new Select(industry);
        industryDropdown.selectByValue("IND_HEALTH_CARE");
    //    chromeDriver.findElementByClassName("smallSubmit").click();
        //to close
     //   chromeDriver.close();

    }
}
