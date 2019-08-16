package reusableMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CountRowsInTable {
	static List<WebElement> rowsInTableBe; static int rowsInTableCountBefore; static int rowsInTableCountAfter;

	//Fungerar tyvärr bara med tabeller som inte har sidhantering. Alltså tabellerna under exempelvis "ansökningar och bidrag" kommer inte funka eftersom att de skapar nya sidor istället för en lång tabell.
	//Kom ihåg att lägga till /tr efter xpath elementet för att söka fram antalet rader.

	public static WebElement CountTable(WebDriver driver, By By) {

		rowsInTableBe = driver.findElements(By);
		rowsInTableCountBefore = rowsInTableBe.size();

		return null;
	}

	public static WebElement AddedRow(WebDriver driver, By By, By elementTowaitFor) {

		driver.navigate().refresh();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, elementTowaitFor);

		rowsInTableBe = driver.findElements(By);
		rowsInTableCountAfter = rowsInTableBe.size();

		if (rowsInTableCountAfter == rowsInTableCountBefore +1) {

		} 
		else {
			Assert.fail();				
		}

		return null;
	}

	public static WebElement RemovedRow(WebDriver driver, By By, By elementTowaitFor) {

		driver.navigate().refresh();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, elementTowaitFor);

		rowsInTableBe = driver.findElements(By);
		rowsInTableCountAfter = rowsInTableBe.size();

		if (rowsInTableCountAfter == rowsInTableCountBefore -1) {

		} 
		else {
			Assert.fail();				
		}

		return null;
	}
}