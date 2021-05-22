package VeerAdHocExercises.Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExcercises {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement currencyDropdown =driver.findElementById("ctl00_mainContent_DropDownListCurrency");
        Select currencyDropdownOptions = new Select(currencyDropdown);
        currencyDropdownOptions.selectByValue("USD");
    }
}
