package week4.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Window.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //To get a screenshot of the whole Page
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        File target = new File("./snaps/leafGround.png");
        FileUtils.copyFile(screenshot,target);
        //To get screenshot of a particular element
        WebElement home = driver.findElementById("home");
        File elementScreenshot = home.getScreenshotAs(OutputType.FILE);
        File target2 = new File("./snaps/leafGroundElement.png");
        FileUtils.copyFile(elementScreenshot,target2);
    }
}
