package week4.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlesAssignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Window.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("home")).click();


        Set<String> windowHandles = driver.getWindowHandles();

        // copy set into list
        List<String> handleList = new ArrayList<String>(windowHandles);

        // to get second item form the list
        String sencondHandle = handleList.get(1);

        // to switch the control to the second window
        driver.switchTo().window(sencondHandle);

        driver.findElementByXPath("//img[@alt='Buttons']").click();

        driver.switchTo().window(handleList.get(0));
        driver.close();
    }
}
