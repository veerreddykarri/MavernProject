package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazonWebsite {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.co.uk/");
        chromeDriver.manage().window().maximize();
        chromeDriver.close();
    }
}
