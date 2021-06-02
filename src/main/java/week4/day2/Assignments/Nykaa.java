package week4.day2.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Nykaa {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //1) Go to https://www.nykaa.com/
        driver.get("https://www.nykaa.com/");
        //2) Mouseover on Brands and Mouseover on Popular
        Actions builder = new Actions(driver);
        builder
                .moveToElement(driver.findElementByXPath("//div[@id='brand_arrowUp']/preceding-sibling::a"))
                .pause(1000)
                .moveToElement(driver.findElementByXPath("//a[contains(text(),'Popular')]"))
                //3) Click L'Oreal Paris
                .click(driver.findElementByXPath("(//li[@class='brand-logo menu-links'])[5]"))
                .perform();
        //4) Go to the newly opened window and check the title contains L'Oreal Paris
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windows = new ArrayList<String>(windowHandles);
        driver.switchTo().window(windows.get(1));
        String title = driver.getTitle();
        if (title.contains("L'Oreal Paris")) {
            System.out.println("The title has L'Oreal Paris");
        } else System.out.println("The title doesn't have L'Oreal Paris");
        //5) Click sort By and select customer top rated
        driver.findElementByXPath("//span[@title='POPULARITY']").click();
        driver.findElementByXPath("//span[text()='customer top rated']").click();
        Thread.sleep(2000);
        //6) Click Category and click Shampoo
        driver.findElementByXPath("//div[text()='Category']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//span[text()='Hair']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//span[text()='Hair Care']").click();
        driver.findElementByXPath("//input[@id='chk_Shampoo_undefined']/following-sibling::label").click();
        Thread.sleep(3000);
        //7) check whether the Filter is applied with Shampoo
        String filterText = driver.findElementByXPath("//ul[@class='pull-left applied-filter-lists']/li").getText();
        if (filterText.contains("Shampoo")) {
            System.out.println("The filter is applied for Shampoo");
        } else System.out.println("The filter is not applied for Shampoo");
        //8) Click on L'Oreal Paris Colour Protect Shampoo
        driver.findElementByXPath("//span[contains(text(),'Paris Colour Protect Shampoo')]").click();
        Thread.sleep(3000);
        //9) GO to the new window and select size as 175m
        Set<String> windowHandle = driver.getWindowHandles();
        List<String> windowHandle2 = new ArrayList<String>(windowHandle);
        driver.switchTo().window(windowHandle2.get(2));
        driver.findElementByXPath("//span[text()='175ml']").click();
        //10) Print the MRP of the product
        String shampooPrice = driver.findElementByXPath("(//span[@class='post-card__content-price-offer'])[1]").getText();
        System.out.println("The MRP of the Product is : "+shampooPrice);
        //11) Click on ADD to BAG
        driver.findElementByXPath("//button[@class='combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  ']").click();
        Thread.sleep(3000);
        //12) Go to Shopping Bag
        driver.findElementByXPath("//div[@class='AddBagIcon']").click();
        //13) Print the Grand Total amount
        String grandTotal = driver.findElementByXPath("//div[@class='value medium-strong']").getText();
        System.out.println("The Grand Total amount is :"+grandTotal);
        Thread.sleep(2000);
        //14) Click Proceed
        driver.findElementByXPath("//button[@class='btn full fill no-radius proceed ']").click();
        Thread.sleep(5000);
        //15) Click on Continue as Guest
        driver.findElementByXPath("//button[@class='btn full big']").click();
        //16) Check if this grand total is the same in step 13
        String checkoutGrandTotal = driver.findElementByXPath("//div[text()='Grand Total']/following-sibling::div").getText();
        if (grandTotal==checkoutGrandTotal){
            System.out.println("The Grand Total is same as the Grand Total in Shopping Bag");
        }else System.out.println("The Grand Total is NOT same as the Grand Total in Shopping Bag");
        driver.close();
    }
}
