package week4.day2.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Myntra {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        Actions builder = new Actions(driver);
        builder
                .moveToElement(driver.findElementByXPath("//a[@data-group='women']"))
                .pause(1000)
                .click(driver.findElementByXPath("//a[text()='Jackets & Coats']"))
                .perform();
        String searchResults = driver.findElementByXPath("//div[@class='title-container']//span").getText().replaceAll("[a-z-]","").trim();
        int searchResultInNum = Integer.parseInt(searchResults);
        System.out.println("The Total Number of Results :"+searchResults);
        String jacketCount = driver.findElementByXPath("(//ul[@class='categories-list']//span)[1]").getText().replaceAll("[()]","").trim();
        int jacketCountInNum = Integer.parseInt(jacketCount);
        System.out.println("The Jacket count is : "+jacketCount);
        String coatCount = driver.findElementByXPath("(//ul[@class='categories-list']//span)[2]").getText().replaceAll("[()]","").trim();
        int coatCountInNum = Integer.parseInt(coatCount);
        System.out.println("The Coat count is : "+coatCount);
        if (searchResultInNum == (jacketCountInNum+coatCountInNum)){
            System.out.println("The sum of Coat Count "+coatCountInNum+" and Jacket Count "+jacketCountInNum+" matches the Total Count "+searchResultInNum);
        }else System.out.println("The Coat Count + Jacket Count is not equal to Total Count");
        driver.findElementByXPath("(//ul[@class='categories-list']//div)[2]").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//div[@class='brand-more']").click();
        driver.findElementByXPath("//input[@placeholder='Search brand']").sendKeys("mango");
        driver.findElementByXPath("//label[@class=' common-customCheckbox']/div").click();
        driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
        Thread.sleep(3000);
        List<WebElement> noOfItemsWithMango = driver.findElementsByXPath("//h3[@class='product-brand']");
        List<String>addNamesOfItems = new ArrayList<String >();
        for (int i=1;i<=noOfItemsWithMango.size();i++){
            addNamesOfItems.add(driver.findElementByXPath("(//h3[@class='product-brand'])["+i+"]").getText());
        }
        boolean mango = !addNamesOfItems.contains("MANGO");
        if (mango==false){
            System.out.println("All the Coats are of brand MANGO");
        }else System.out.println("All the Coats are of not of brand MANGO");
        Actions builder1 = new Actions(driver);
        builder1
                .moveToElement(driver.findElementByXPath("//div[@class='sort-sortBy']"))
                .pause(1000)
                .click(driver.findElementByXPath("(//ul[@class='sort-list']//label)[3]"))
                .perform();
        String firstItemDiscPrice = driver.findElementByXPath("(//span[@class='product-discountedPrice'])[1]").getText();
        System.out.println("The Price of the First Item is : "+firstItemDiscPrice);
        Thread.sleep(3000);
        Actions builder2 = new Actions(driver);
        builder2
                .moveToElement(driver.findElementByXPath("(//span[@class='product-discountedPrice'])[1]"))
                .pause(1000)
                .click(driver.findElementByXPath("(//span[@class='product-wishlistFlex product-actionsButton product-wishlist '])[1]"))
                .perform();
        driver.close();
        driver.quit();
    }
}
