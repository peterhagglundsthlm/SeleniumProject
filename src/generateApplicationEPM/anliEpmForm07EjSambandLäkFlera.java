package generateApplicationEPM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsAdminLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT_EPM.EPM_applicationForm;

public class anliEpmForm07EjSambandLäkFlera extends anliEpmFormTitle01{

	@Test (dependsOnMethods={"BytFokusTillFormulär"})
	// Ansökan endast personuppgifter, en forskningshuvudman
	public void s1a7_AnsökanFleraFohuvLäkEjSamband() {

		if (driver.getPageSource().contains("Utkast"))

		{
			// anger antal forskningshuvudmän: FLERA
			Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationForm.AntalFoHuvudman))); 
			AntalFoHuvudman.selectByVisibleText("Flera");

			// anger samband med en av fo-huvudmännen: NEJ
			Select Samband = new Select (driver.findElement(By.id(EPM_applicationForm.Samband))); 
			Samband.selectByVisibleText("Nej");

			//Anger läkemedelsprövning: JA (för fler fo-huvudmän) 
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationForm.KliniskLäkemedelsprövningFler)));				
			Select KliniskLäkemedelsPrövning = new Select (driver.findElement(By.id(EPM_applicationForm.KliniskLäkemedelsprövningFler)));
			KliniskLäkemedelsPrövning.selectByVisibleText("Ja");

			// ansökanskategori, spara val2
			WebDriverWait wait2b = new WebDriverWait(driver, 10);
			wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationForm.AnsökanskategoriSparaVal2)));
			driver.findElement(By.id(EPM_applicationForm.AnsökanskategoriSparaVal2)).click();

			// Rådgivande yttrande: NEJ 
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationForm.RådgivandeYttrande)));
			Select RådGivande = new Select (driver.findElement(By.id(EPM_applicationForm.RådgivandeYttrande)));
			RådGivande.selectByVisibleText("Nej");
		}
		else {
			System.out.println("Fail");
		}
	}

	@Test (dependsOnMethods={"s1a7_AnsökanFleraFohuvLäkEjSamband"})
	public void s1b_InfoSökande() {

		if (driver.getPageSource().contains("Utkast"))

		{
			WebDriverWait wait4 = new WebDriverWait(driver, 10);
			wait4.until(ExpectedConditions.elementToBeClickable(By.id("4386ddb6-bee1-4629-8dce-1423f437b7c0")));
			Select Huvudman = new Select (driver.findElement(By.id("4386ddb6-bee1-4629-8dce-1423f437b7c0")));
			Huvudman.selectByVisibleText("MAMO");

			WebDriverWait wait5 = new WebDriverWait(driver, 10);
			wait5.until(ExpectedConditions.elementToBeClickable(By.id("4386ddb6-bee1-4629-8dce-1423f437b7c0_ProjectSite")));
			Select Hemvist = new Select (driver.findElement(By.id("4386ddb6-bee1-4629-8dce-1423f437b7c0_ProjectSite")));
			Hemvist.selectByVisibleText("Avdelningen K");

			WebDriverWait wait6 = new WebDriverWait(driver, 10);
			wait6.until(ExpectedConditions.elementToBeClickable(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_2_0")));
			driver.findElement(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_2_0")).clear();
			driver.findElement(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_2_0")).sendKeys("+467777777");

			WebDriverWait wait7 = new WebDriverWait(driver, 10);
			wait7.until(ExpectedConditions.elementToBeClickable(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_3_0")));
			driver.findElement(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_3_0")).clear();
			driver.findElement(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_3_0")).sendKeys("+467777777");

			WebDriverWait wait8 = new WebDriverWait(driver, 10);
			wait8.until(ExpectedConditions.elementToBeClickable(By.id("a6a0f8c1-aca7-49ca-8733-b4f10aed8083")));
			Select Disp = new Select (driver.findElement(By.id("a6a0f8c1-aca7-49ca-8733-b4f10aed8083")));
			Disp.selectByVisibleText("Ja");

			driver.findElement(By.linkText("3. SYFTE OCH FRÅGESTÄLLNINGAR")).click();	
		}
		else {
			System.out.println("Fail");
		}

	}

	@Test (dependsOnMethods={"s1b_InfoSökande"})
	public void s3_SyfteFrågeställningar() {

		driver.findElement(By.linkText("3. SYFTE OCH FRÅGESTÄLLNINGAR")).click();	

		if (driver.getPageSource().contains("3. Syfte och frågeställningar"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);

			driver.switchTo().frame(0);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("1");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(1);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("2");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(2);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();
		}
	}

	@Test (dependsOnMethods={"s3_SyfteFrågeställningar"})
	public void s4_Metod() throws InterruptedException {

		driver.findElement(By.linkText("4. METOD")).click();

		if (driver.getPageSource().contains("4. Metod"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);

			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("1");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(1);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("2");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(2);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();
		}
	}

	@Test (dependsOnMethods={"s4_Metod"})
	public void s5_Tidsplan() {

		driver.findElement(By.linkText("5. TIDSPLAN")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("bec9bcbd-e842-4c6b-9d80-d8b2d8f57166")));
		driver.findElement(By.id(("bec9bcbd-e842-4c6b-9d80-d8b2d8f57166"))).sendKeys("2019-01-01");

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("ae03f2c5-e9e9-4fba-b546-2d23707ae13f")));
		driver.findElement(By.id(("ae03f2c5-e9e9-4fba-b546-2d23707ae13f"))).sendKeys("2019-12-31");

	}

	@Test (dependsOnMethods={"s5_Tidsplan"})
	public void s6_Datainsamling() throws InterruptedException {

		driver.findElement(By.linkText("6. DATAINSAMLING")).click();

		if (driver.getPageSource().contains("6. Datainsamling"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);

			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("1");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(1);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("2");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(2);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(3);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("4");
			driver.switchTo().parentFrame();
		}
	}

	@Test (dependsOnMethods={"s6_Datainsamling"})
	public void s7_EtiskaÖverväganden() throws InterruptedException {

		driver.findElement(By.linkText("7. ETISKA ÖVERVÄGANDEN")).click();

		if (driver.getPageSource().contains("7. Etiska överväganden"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);

			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("1");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(1);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("2");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(2);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(3);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(4);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();
		}
	}

	@Test (dependsOnMethods={"s7_EtiskaÖverväganden"})
	public void s8_Forskningspersoner() throws InterruptedException {

		driver.findElement(By.linkText("8. FORSKNINGSPERSONER")).click();

		if (driver.getPageSource().contains("8. Forskningspersoner"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);

			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("1");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(1);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("2");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(2);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(3);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();
		}
	}

	@Test (dependsOnMethods={"s8_Forskningspersoner"})
	//s 9 innehåller element som kan behöva skapa olika versioner av
	public void s9_InfoSamtycke() {

		driver.findElement(By.linkText("9. INFORMATION OCH SAMTYCKE")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("e9a630ef-f031-4fdd-bd79-336c68559b2f")));
		Select Disp = new Select (driver.findElement(By.id("e9a630ef-f031-4fdd-bd79-336c68559b2f")));
		Disp.selectByVisibleText("Nej");

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("526a103d-8908-422e-a0ef-e9d21c29d5c8")));
		Select Disp2 = new Select (driver.findElement(By.id("526a103d-8908-422e-a0ef-e9d21c29d5c8")));
		Disp2.selectByVisibleText("Nej");
	}

	@Test (dependsOnMethods={"s9_InfoSamtycke"})
	public void s11_BiologisktMaterial() {

		driver.findElement(By.linkText("11. BIOLOGISKT MATERIAL")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("993a5f8a-c065-4538-8e8b-db49b7c85153")));
		Select Disp = new Select (driver.findElement(By.id("993a5f8a-c065-4538-8e8b-db49b7c85153")));
		Disp.selectByVisibleText("Nej");

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("daaf1f39-d802-4f61-b9a1-49cfc4c05f3a")));
		Select Disp2 = new Select (driver.findElement(By.id("daaf1f39-d802-4f61-b9a1-49cfc4c05f3a")));
		Disp2.selectByVisibleText("Nej");
	}

	@Test (dependsOnMethods={"s11_BiologisktMaterial"})
	public void s12_ResultatDjurförsök() {

		driver.findElement(By.linkText("12. RESULTAT FRÅN DJURFÖRSÖK")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("44ce99dc-8830-4c6a-9980-0ffc1d18d95f")));
		Select Disp2 = new Select (driver.findElement(By.id("44ce99dc-8830-4c6a-9980-0ffc1d18d95f")));
		Disp2.selectByVisibleText("Nej");
	}

	@Test (dependsOnMethods={"s12_ResultatDjurförsök"})
	public void s13_RedovisningResultat() throws InterruptedException {

		driver.findElement(By.linkText("13. REDOVISNING AV RESULTAT")).click();

		if (driver.getPageSource().contains("13. Redovisning av resultat"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);

			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("1");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(1);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("2");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(2);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(3);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("3");
			driver.switchTo().parentFrame();
		}

	}

	@Test (dependsOnMethods={"s13_RedovisningResultat"})
	public void s14_EkonomiskaFörhållanden() throws InterruptedException {

		driver.findElement(By.linkText("14. EKONOMISKA FÖRHÅLLANDEN")).click();

		if (driver.getPageSource().contains("14. Ekonomiska förhållanden"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);

			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("1");
			driver.switchTo().parentFrame();

			driver.switchTo().frame(1);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("2");
			driver.switchTo().parentFrame();
		}
	}

	@Test (dependsOnMethods={"s14_EkonomiskaFörhållanden"})
	public void s15_Bilagor() throws AWTException, InterruptedException, IOException {

		driver.findElement(By.linkText("15. BILAGOR")).click();

		//15.1 bifoga forskningsplan - obligatorisk
		driver.findElement(By.id("select-file")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
		Thread.sleep(3000); 	

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("9e0fb60e-cd29-4208-9561-b9c1d53e946c")));
		Select Disp = new Select (driver.findElement(By.id("9e0fb60e-cd29-4208-9561-b9c1d53e946c")));
		Disp.selectByVisibleText("Nej");

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("7c0cded1-b0b0-4245-8ef6-b5e2591a07bb")));
		Select Disp2 = new Select (driver.findElement(By.id("7c0cded1-b0b0-4245-8ef6-b5e2591a07bb")));
		Disp2.selectByVisibleText("Nej");

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("ff16dfd4-37a5-4f2a-9b22-d151440f0152")));
		Select Disp3 = new Select (driver.findElement(By.id("ff16dfd4-37a5-4f2a-9b22-d151440f0152")));
		Disp3.selectByVisibleText("Nej");
		
		//15.5 Läkemedelsprövning: JA
		WebDriverWait wait4a = new WebDriverWait(driver, 10);
		wait4a.until(ExpectedConditions.elementToBeClickable(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
		Select Disp4a = new Select (driver.findElement(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
		Disp4a.selectByVisibleText("Ja");

		// 15.5.1 EudraCT-nr in med javascript
		WebDriverWait wait4b = new WebDriverWait(driver, 10);
		wait4b.until(ExpectedConditions.elementToBeClickable(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")));
		((JavascriptExecutor) driver).executeScript("scroll(0, 200)"); 
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), "2019-123456-99");

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("47bcd41a-346e-44b7-9d7a-869de0e096b3")));
		Select Disp5 = new Select (driver.findElement(By.id("47bcd41a-346e-44b7-9d7a-869de0e096b3")));
		Disp5.selectByVisibleText("Nej");

		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("78e0e3ef-49b7-4719-b492-53df1b1d65ed")));
		Select Disp6 = new Select (driver.findElement(By.id("78e0e3ef-49b7-4719-b492-53df1b1d65ed")));
		Disp6.selectByVisibleText("Nej");

		WebDriverWait wait7 = new WebDriverWait(driver, 10);
		wait7.until(ExpectedConditions.elementToBeClickable(By.id("5674d283-9e88-4ad0-9b30-0e2c8f16d7be")));
		Select Disp7 = new Select (driver.findElement(By.id("5674d283-9e88-4ad0-9b30-0e2c8f16d7be")));
		Disp7.selectByVisibleText("Nej");
	}

	@Test (dependsOnMethods={"s15_Bilagor"})
	public void KontrolleraRegistrera() {

		driver.findElement(By.linkText("KONTROLLERA OCH REGISTRERA")).click();

		if (driver.getPageSource().contains("Registrera ansökan"))

		{
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
		}

	}

	@Test (dependsOnMethods={"KontrolleraRegistrera"})
	public void Register() {

		driver.findElement(By.linkText("KONTROLLERA OCH REGISTRERA")).click();

		if (driver.getPageSource().contains("Registrera ansökan"))

		{
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			driver.findElement(By.id("Submitter")).click();
		}

	}	
}
