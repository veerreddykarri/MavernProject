package week4.day1.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class ErailTrainNamesSortExercise {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://erail.in/");
        driver.findElementById("txtStationFrom").clear();
        driver.findElementById("txtStationFrom").sendKeys("ms", Keys.TAB);
        driver.findElementById("txtStationTo").clear();
        driver.findElementById("txtStationTo").sendKeys("mdu", Keys.TAB);
        driver.findElementById("chkSelectDateOnly").click();
        List<WebElement> trainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
        List<String> extractTrainName = new ArrayList<String>();
        for (int i = 1; i <= trainNames.size(); i++) {
            String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a").getText();
            extractTrainName.add(trainName);
        }
        Collections.sort(extractTrainName);
        System.out.println("The sorted Train Names are : "+extractTrainName);
    }
}

