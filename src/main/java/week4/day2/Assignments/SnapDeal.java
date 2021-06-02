package week4.day2.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SnapDeal {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/");
        Actions builder = new Actions(driver);
        builder
                .moveToElement(driver.findElementByXPath("//a[@class='menuLinks leftCategoriesProduct ']/span[contains(text(),'Men')]"))
                .pause(1000)
                .click(driver.findElementByXPath("(//span[contains(text(),'Sports Shoes')])[1]"))
                .perform();
        String shoesCount = driver.findElementByXPath("//span[@class='category-count']").getText();
        System.out.println("The count of sports is : "+shoesCount);
        driver.findElementByXPath("//div[text()='Training Shoes']").click();
        driver.findElementByXPath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']").click();
        driver.findElementByXPath("(//ul[@class='sort-value']/li)[2]").click();
        Thread.sleep(3000);
        List<WebElement> products_Price = driver.findElements(By.xpath("(//span[@class='lfloat product-price'])"));
        LinkedList<String> product_price =  new LinkedList<String>();
        for(int i=1;i<=products_Price.size();i++){
            String s = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]")).getText();
            product_price.add(s);
        }
        System.out.println(product_price);
        List copyOfProduct_PriceList = new ArrayList(product_price);
        Collections.sort(copyOfProduct_PriceList);
        System.out.println(copyOfProduct_PriceList);
        boolean sorted = copyOfProduct_PriceList.equals(product_price);
        System.out.println("The items are sorted correctly :"+sorted);
        WebElement firstItemPrice = driver.findElementByXPath("//span[contains(@id,'display-price')]");
        builder.moveToElement(firstItemPrice)
                .pause(500)
                .click(driver.findElementByXPath("//div[contains(text(),'Quick View')]"))
                .perform();
        System.out.println("The Price of the item is Rs.:"+driver.findElementByXPath("//span[@class='payBlkBig']").getText());
        System.out.println("The Discount percentage on the item is :"+(driver.findElementByXPath("//span[@class='percent-desc ']").getText().replaceAll("([OFF])","").trim()));
        WebElement shoesImage = driver.findElementByXPath("//img[@style='user-select: none;']");
        File elementScreenshot = shoesImage.getScreenshotAs(OutputType.FILE);
        File target = new File("./snaps/ShoeSnap.png");
        FileUtils.copyFile(elementScreenshot,target);
        driver.close();
        driver.quit();
    }
}
