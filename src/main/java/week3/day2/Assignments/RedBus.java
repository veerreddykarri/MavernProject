package week3.day2.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RedBus {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/");
        driver.findElementByXPath("//input[@data-message='Please enter a source city']").sendKeys("C");
      driver.findElementByXPath("(//ul[@class='autoFill']/li)[2]").click();
        driver.findElementByXPath("//input[@data-message='Please enter a destination city']").sendKeys("V");
        driver.findElementByXPath("(//ul[@class='autoFill']/li)[1]").click();
        driver.findElementByXPath("//body/div[@id='rb-calendar_onward_cal']/table[1]//td[@class='current day']").click();
        driver.findElementById("search_btn").click();
        Thread.sleep(3000);
        driver.findElementByXPath("(//div[@class='sodc-doj-c  m-r-20'])[2]").click();
        String noOfResluts = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
        System.out.println("Number of Total buses found :"+noOfResluts);
        driver.findElementByXPath("(//ul[@class='list-chkbox']/li)[2]/label[@class='custom-checkbox']").click();
        String noOfSleepersResluts = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
        System.out.println("Number of Sleeper buses found :"+noOfSleepersResluts);
        driver.findElementByXPath("(//ul[@class='list-chkbox']/li)[3]/label[@class='custom-checkbox']").click();
        String noOfSleepersAndACResluts = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
        System.out.println("Number of Sleeper and AC buses found :"+noOfSleepersAndACResluts);
        driver.close();
        driver.quit();

    }
}
