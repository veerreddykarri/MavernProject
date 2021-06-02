package week4.day1.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Calender {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Calendar.html");
        driver.findElementById("datepicker").click();
        Actions select = new Actions(driver);
        select.moveToElement(driver.findElementByXPath("//a[contains(text(),'10')]"))
                .click()
                .perform();
        driver.close();
        driver.quit();
    }

}
