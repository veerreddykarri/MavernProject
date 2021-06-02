package week4.day2.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ServiceNow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dev103117.service-now.com/");
        driver.switchTo().frame("gsft_main");
        driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
        driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123");
        driver.findElementByXPath("//button[@id='sysverb_login']").click();
        driver.findElementByXPath("//input[@id='filter']").sendKeys("incident");
        driver.findElementByXPath("(//div[@class='sn-widget-list-title' and text()='All'])[2]").click();
        driver.switchTo().frame("gsft_main");
        driver.findElementByXPath("//button[@id='sysverb_new']").click();
        driver.findElementByXPath("//button[@id='lookup.incident.caller_id']").click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowID = new ArrayList<>(windowHandles);
        driver.switchTo().window(windowID.get(1));
        driver.findElementByXPath("//table[@id='sys_user_table']//td/a").click();
        driver.switchTo().window(windowID.get(0));
        driver.switchTo().frame("gsft_main");
        driver.findElementByXPath("//input[@id='incident.short_description']").click();
        driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Veer Added some description");
        String incidentID = driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
        driver.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.switchTo().frame("gsft_main");
        driver.findElementByXPath("(//input[@placeholder='Search'])[2]").sendKeys(incidentID, Keys.ENTER);
        String incidentIDForCheck = driver.findElementByXPath("(//table[@id='incident_table']//td[@class='vt']/a)[1]").getText();
        Assert.assertEquals(incidentID,incidentIDForCheck);
        driver.close();
        driver.quit();
    }
}
