package week5.day2.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day1.testcase.BaseClass;

import java.io.IOException;

public class DuplicateLead extends BaseClass {
@Test(dataProvider = "fetchData",priority = 3)
	public void runDuplicateLead(String pNo) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
}
	@DataProvider
	public Object[][] fetchData() throws IOException {
		GetDataFromExcelDynamic getDataFromExcel = new GetDataFromExcelDynamic();
		String[][] dataForDuplicateLead = getDataFromExcel.getDataFromExcel("DuplicateLeadData");
		return dataForDuplicateLead;

	}
}






