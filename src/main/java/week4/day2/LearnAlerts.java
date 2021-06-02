package week4.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LearnAlerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Alert.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElementByXPath("//button[text()='Sweet Alert']").click();

        driver.findElementByXPath("//button[text()='OK']").click();



        //driver.findElementByXPath("//button[text()='Alert Box']").click();

        //to switch the control from main page to the alert
        /*
         * Alert alert = driver.switchTo().alert();
         *
         * String text = alert.getText(); System.out.println(text);
         *
         * alert.accept();
         *
         * Thread.sleep(2000);
         *
         * driver.findElementByXPath("//button[text()='Confirm Box']").click();
         *
         * Alert alert2 = driver.switchTo().alert();
         *
         * String text2 = alert2.getText(); System.out.println(text2);
         * //alert2.dismiss(); alert2.accept();
         *
         * //driver.switchTo().alert().dismiss();
         */
        /*
         * driver.findElementByXPath("//button[text()='Prompt Box']").click(); Alert
         * alert3 = driver.switchTo().alert();
         *
         * String text3 = alert3.getText(); System.out.println(text3);
         *
         * alert3.sendKeys("Hari Software Solutions"); Thread.sleep(5000);
         *
         * alert3.accept();
         */
    }
}
