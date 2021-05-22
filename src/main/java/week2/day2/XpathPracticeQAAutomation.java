package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class XpathPracticeQAAutomation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        driver.findElementByXPath("//*[@type='radio'][@value='female']").click();
        driver.findElementByXPath("//*[@value='Car']").click();
        driver.findElementByXPath("//*[@value='audi']").click();
        driver.findElementByXPath("//li[@class ='et_pb_tab_1']").click();
        Assert.assertEquals("Tab 2 content",driver.findElementByXPath("//div[@class ='et_pb_tab et_pb_tab_1 clearfix']").getText());
        driver.findElementByXPath("//h2[contains(text(), 'no id')]/following-sibling::table//td[contains(text(),'$120,000+')]");
    }
}
