package week4.day1.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableAssignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/table.html");
        List<WebElement> noOfColumns = driver.findElementsByXPath("//table[@id='table_id']//tr/th");
        System.out.println("The count of number of columns is : " + noOfColumns.size());
        List<WebElement> noOfRows = driver.findElementsByXPath("//table[@id='table_id']//tr");
        System.out.println("The count of number of Total rows is : " + noOfRows.size());
        System.out.println("The count of number of rows without header is : " + (noOfRows.size() - 1));
        List<WebElement> row3Values = driver.findElementsByXPath("//table[@id='table_id']//tr[3]/td");
        List<String> row3ValuesExtract = new ArrayList<String>();
        for (int i = 1; i <= row3Values.size(); i++) {
            String names = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[" + i + "]").getText();
            row3ValuesExtract.add(names);
        }
        if (row3ValuesExtract.get(0).equals("Learn to interact with Elements")) {
            System.out.println("The progress value of 'Learn to interact with Elements : " + row3Values.get(1).getText());
        }
        List<WebElement> totalProgressValues = driver.findElementsByXPath("//table[@id='table_id']//tr/td[2]");
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 2; i <= totalProgressValues.size() + 1; i++) {
            String numbersInString = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[2]").getText();
            String stringNumberFilter = numbersInString.replaceAll("%", "");
            int addNumbers = Integer.parseInt(stringNumberFilter);
            numbers.add(addNumbers);
        }
        int minNumber = Collections.min(numbers);
        int index = numbers.indexOf(minNumber);
        driver.findElementByXPath("//table[@id='table_id']//tr[" + (index + 2) + "]/td[" + (index + 1) + "]/input").click();
        driver.close();
        driver.quit();
    }
}
