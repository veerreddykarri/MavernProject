package week5.day2.datawithexceldynamically;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day1.testcase.BaseClass;
import week5.day2.GetDataFromExcelDynamically;

import java.io.IOException;

public class EditLead extends BaseClass {
@Test(dataProvider = "fetchData")
	public void runEditLead(String cName, String pNo) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
}
	@DataProvider
	public Object[][] fetchData() throws IOException {
		GetDataFromExcelDynamically getDataFromExcel = new GetDataFromExcelDynamically();
		String[][] dataForCreateLead = getDataFromExcel.getDataFromExcel("EditLeadData");

		return dataForCreateLead;

	}
}






