package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class LearnToMouseHoover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement fashion = driver.findElementByLinkText("Fashion");



        //Actions --> Advanced user interactions
        Actions builder  = new Actions(driver);
        //builder.moveToElement(fashion).perform(); // perform() is mandatory at end of the actions
        //builder.contextClick(fashion).perform(); // to do right click
        //builder.doubleClick(fashion).perform(); // to double click
        builder.moveToElement(fashion).doubleClick().perform(); // can have multiple actions together
    }
}
