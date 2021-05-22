package VeerAdHocExercises.Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BBCWeather {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.co.uk/weather");
        driver.findElementById("ls-c-search__input-label").sendKeys("Did");
        Thread.sleep(5000);
        List<WebElement> options=driver.findElementsByClassName("ls-u-hidden");
        for (WebElement option : options){
            System.out.println(option.getText());
            }
        }
    }
