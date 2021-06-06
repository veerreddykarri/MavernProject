package week5.day2.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import week5.day1.testcase.BaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MergeLeads extends BaseClass {
    @Test(priority = 4)
    public void runMergeLead() throws InterruptedException {
        driver.findElementByXPath("//a[text()='Merge Leads']").click();
        driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
        Set<String> handler =driver.getWindowHandles();
        List<String> extractWindows = new ArrayList<String>(handler);
        driver.switchTo().window(extractWindows.get(1));
        String leadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
        System.out.println(leadID);
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
        driver.switchTo().window(extractWindows.get(0));
        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
        Thread.sleep(5000);
        Set<String> handler1 =driver.getWindowHandles();
        List<String> extractWindows1 = new ArrayList<String>(handler1);
        driver.switchTo().window(extractWindows1.get(1));
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
        driver.switchTo().window(extractWindows1.get(0));
        driver.findElementByXPath("//a[@class='buttonDangerous']").click();
        driver.switchTo().alert().accept();
        String companyName =driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
        System.out.println(companyName);
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Assert.assertEquals(driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText(),"No records to display");
    }
}
