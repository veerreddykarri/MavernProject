package VeerAdHocExercises.Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BBCWeather {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.bbc.co.uk/weather");
        driver.findElementById("ls-c-search__input-label").sendKeys("Reading");
        Thread.sleep(5000);
        //Today Pressure Value
        driver.findElementByXPath("(//li[@class='ls-c-locations-list-item'])[1]").click();
        driver.findElementByXPath("//a[@id='daylink-0']").click();
        List<WebElement> time = driver.findElementsByXPath("//span[@class='wr-time-slot-primary__hours wr-u-font-weight-500']");
        List<String> addTime = new ArrayList<String>();
        for (int i = 1; i <= time.size(); i++) {
            addTime.add(driver.findElementByXPath("(//span[@class='wr-time-slot-primary__hours wr-u-font-weight-500'])[" + i + "]").getText());
        }
        if (addTime.contains("22")) {
            int indexOf22 = addTime.indexOf("22");
            driver.findElementByXPath("(//span[@class='wr-time-slot-primary__hours wr-u-font-weight-500'])[" + (indexOf22 + 1) + "]").click();
            List<WebElement> values = driver.findElementsByXPath("(//dl[@class='wr-time-slot-secondary__list'])[" + (indexOf22 + 1) + "]/dd");
            List<String> addValues = new ArrayList<String>();
            for (int i = 1; i <= values.size(); i++) {
                addValues.add(driver.findElementByXPath("(//dl[@class='wr-time-slot-secondary__list'])[" + (indexOf22 + 1) + "]/dd[" + i + "]").getText());
            }
            String pressureString = addValues.get(1).replaceAll("[mb]", "").trim();
            int pressureTodayAt10 = Integer.parseInt(pressureString);
            System.out.println("The Pressure value for Today at 10 PM is : " + pressureTodayAt10);
            //Tomorrow Pressure Value
            driver.findElementByXPath("//a[@id='daylink-1']").click();
            List<WebElement> timeForTomorrow = driver.findElementsByXPath("(//span[@class='wr-time-slot-primary__hours wr-u-font-weight-500'])");
            List<String> addTime1 = new ArrayList<String>();
            for (int i = 1; i <= timeForTomorrow.size(); i++) {
                addTime1.add(driver.findElementByXPath("(//span[@class='wr-time-slot-primary__hours wr-u-font-weight-500'])[" + i + "]").getText());
            }
            int indexOf22ForTom = addTime1.indexOf("22");
            driver.findElementByXPath("(//span[@class='wr-time-slot-primary__hours wr-u-font-weight-500'])[" + (indexOf22ForTom + 1) + "]").click();
            List<WebElement> values1 = driver.findElementsByXPath("(//dl[@class='wr-time-slot-secondary__list'])[" + (indexOf22ForTom + 1) + "]/dd");
            List<String> addValues1 = new ArrayList<String>();
            for (int i = 1; i <= values1.size(); i++) {
                addValues1.add(driver.findElementByXPath("(//dl[@class='wr-time-slot-secondary__list'])[" + (indexOf22ForTom + 1) + "]/dd[" + i + "]").getText());
            }
            String pressureString1 = addValues1.get(1).replaceAll("[mb]", "").trim();
            int pressureTomorrowAt10 = Integer.parseInt(pressureString1);
            System.out.println("The Pressure value for Tomorrow at 10 PM is : " + pressureTomorrowAt10);
            System.out.println("The difference between Today's and Tomorrow's pressure is: " + (pressureTodayAt10 - pressureTomorrowAt10));
        } else System.out.println("The time has passed 10PM try again tomorrow");
        driver.close();
        driver.quit();
    }
}
