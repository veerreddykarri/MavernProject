package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class ClickDragAndDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/drag.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement source = driver.findElementById("draggable");
        //	WebElement target = driver.findElementById("droppable");

        // Actions --> Advanced user interactions
        Actions builder = new Actions(driver);
        //builder.dragAndDrop(source, target).perform();
        //builder.dragAndDropBy(source, 100, 100).perform();

    }
}
