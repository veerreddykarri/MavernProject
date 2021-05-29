package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ErailExercise {
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
        // Copy List to Set
        Set<String> removeDuplicates = new HashSet<>(extractTrainName);
        if (extractTrainName.size()!=removeDuplicates.size())
            System.out.println("Duplicate values present");
        else System.out.println("Duplicate Vales NOT Present");

        // Print Names of duplicate train names code
        Set<String> displayDuplicateNames = new HashSet<>();
        for (String displayDuplicates:extractTrainName) {
            if (!displayDuplicateNames.add(displayDuplicates)){
                System.out.println(displayDuplicates);
            }
        }
    }
}

