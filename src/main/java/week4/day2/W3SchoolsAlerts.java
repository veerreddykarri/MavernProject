package week4.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class W3SchoolsAlerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().frame("iframeResult");
        driver.findElementByXPath("//button[text()='Try it']").click();
        driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("Veer");
        driver.switchTo().alert().accept();
        String verify = "Hello Veer! How are you today?";
        Assert.assertEquals(driver.findElementByXPath("//p[@id='demo']").getText(),verify);
    }
}
