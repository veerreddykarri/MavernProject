package week4.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IrctcAlertAndWindowHandlesWithScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementByXPath("//button[@type='submit']").click();
        driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowExtract = new ArrayList<>(windowHandles);
        driver.switchTo().window(windowExtract.get(1));
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        File target = new File("./snaps/IRCTC.png");
        FileUtils.copyFile(screenshot,target);
        driver.switchTo().window(windowExtract.get(0));
        driver.close();
    }
}
