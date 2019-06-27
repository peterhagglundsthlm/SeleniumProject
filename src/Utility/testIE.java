package Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.GetCurrentUrl;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class testIE {
	public WebDriver driver;



	@Test



	public void f() throws InterruptedException {

		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://prismaecmvrsat.ad.vr.se/Platina/Modules/InfoHeap/JournalizedCase_Sapphire.aspx?propID=0&topPropID=1000&parentPropID=1000&basedOnPropID=0&objectID=0&typeID=199&typeGroupID=0&moduleID=100&ObjectBrowser=0&isDraged=0&titleBase64Encoded=&uploadedFilePathBase64=&extension=&cardTxt=&hasFullControl=1&phaseID=0&devRowID=0&filter=&groupFilter=&processID=&processShapeID=&processRevision=&fromClient=&businessCodeID=&deedTypeID=&caseTypeID=1&readOnly=&customParam1=&customParam2=&customParam3=&customParam4=&customParam5=&isMultiSelect=&isArchived=&CreatedFromOffice=&requestingInstance=&displayMode=");

		Thread.sleep(500);

		Select Diarium = new Select (driver.findElement(By.id("ddDiary")));
		Diarium.selectByIndex(1);

		Thread.sleep(500);

		Select Tillkomst = new Select (driver.findElement(By.id("ddOrigin")));
		Tillkomst.selectByIndex(1);

		Thread.sleep(500);

		Select Ansökningsmodel = new Select (driver.findElement(By.id("publishingDates_ddlModel")));
		Ansökningsmodel.selectByIndex(1);

		Thread.sleep(500);

		driver.findElement(By.id("title")).sendKeys("TestTitel");

		driver.findElement(By.id("descp")).sendKeys( " " + "TestBeskrivning");

		driver.findElement(By.id("bkStr15")).sendKeys("Test");

		driver.findElement(By.id("bkStr2")).sendKeys("TitelEN");

		driver.findElement(By.id("bkStr9")).sendKeys("TitenSWE");

		driver.findElement(By.id("publishingDates_txtDatePeriodStart")).sendKeys("2018-01-01");

		driver.findElement(By.id("publishingDates_txtDatePeriodEnd")).sendKeys("2018-12-01");


		WebElement VäljHandläggare = driver.findElement(By.id("handlingOfficer_handlingOfficerAlias"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].setAttribute('value', arguments[1])", VäljHandläggare , "Peter Hägglund");

		driver.findElement(By.id("handlingOfficer_handlingOfficerAlias")).sendKeys(Keys.ENTER);
		
		Thread.sleep(500);

		Actions action1 = new Actions(driver);
		action1.sendKeys(Keys.DOWN).build().perform();
		
		Thread.sleep(500);
		
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(500);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(500);

		driver.findElement(By.id("btnApply")).click();
		
		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		driver.findElement(By.id("formOfGrantSupport_btnSaveSupplier")).click();


		






		/*

		driver.switchTo().frame(driver.findElement(By.id("frameMenu")));

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.id("Menu_New"));

		driver.findElement(By.id("Menu_New")).click();

		Thread.sleep(3000);

		new Actions(driver).moveByOffset(30, 30).click().build().perform(); 

		Thread.sleep(5000);

		GetCurrentUrl.GetUrlAndPrintInConsole(driver, null);
		 */


	}
}





























