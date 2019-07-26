package generateApplicationEPM;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;

public class anliEpmFormStandard extends anliEpmFormTitleCategory {

	@Test (dependsOnMethods={"BytFokusTillFormulär"})

	// specifik info som skapar ansökans avgifts
	//	public void s1a_AnsökansKategori(@Optional String applicationType) throws InterruptedException {
	public void s1a_AnsökansKategori() throws InterruptedException {

		System.out.println("Ansökanstypen är " + ansökansKategori + "." );

		// här hämtar jag in koden för den specifika info som behövs för respektive ansökanskategori.


		// om det är en huvudman, endast personuppgifter: 
		if (ansökansKategori.equalsIgnoreCase("Form01")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a_AnsökanEndastPersonuppgifter(driver);
			System.out.print("s1a vald");
		}

		// om det är en huvudman, läkemedelsprövning
		if (ansökansKategori.equalsIgnoreCase("Form02")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a2_AnsökanEnFohuvLäk(driver);
			System.out.print("s1a2 vald");
		}

		// om det är en huvudman, endast personuppgifter
		if (ansökansKategori.equalsIgnoreCase("Form03")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a3_AnsökanEnFohuv(driver);
			System.out.print("s1a3 vald");
		}

		// om det är flera huvudmän, läkemedel, samband
		if (ansökansKategori.equalsIgnoreCase("Form04")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a4_AnsökanFleraFohuvLäk(driver);
			System.out.print("s1a4 vald");
		}

		// om det är flera huvudmän, personuppgifter, samband
		if (ansökansKategori.equalsIgnoreCase("Form05")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a5_AnsökanFleraPersuppg(driver);
			System.out.print("s1a5 vald");
		}

		// om det är flera huvudmän, ej personuppgifter, samband
		if (ansökansKategori.equalsIgnoreCase("Form06")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a6_AnsökanFleraFohuv(driver);
			System.out.print("s1a6 vald");
		}

		// om det är flera huvudmän, läkemedel, ej samband
		if (ansökansKategori.equalsIgnoreCase("Form07")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a7_AnsökanFleraFohuvLäkEjSamband(driver);
			System.out.print("s1a7 vald");
		}

		// om det är flera huvudmän, personuppgifter, ej samband
		if (ansökansKategori.equalsIgnoreCase("Form08")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a8_AnsökanFleraFohuvEjSambandPersuppg(driver);
			System.out.print("s1a8 vald");
		}

		// om det är flera huvudmän, ej personuppgifter, ej samband
		if (ansökansKategori.equalsIgnoreCase("Form09")) {
			generateApplicationEPM.anliEpmAllPage1aMethods.s1a9_AnsökanFleraFohuvEjSambandEjPersuppg(driver);
			System.out.print("s1a9 vald");
		}

		System.out.println(". Sektion 1a är klar.");
	}

	@Test (dependsOnMethods={"s1a_AnsökansKategori"})
	public void s1b_InfoSökande() {

		if (driver.getPageSource().contains("Utkast")){

			// fo-huvudman
			WebDriverWait wait4 = new WebDriverWait(driver, 10);
			wait4.until(ExpectedConditions.elementToBeClickable(By.id("4386ddb6-bee1-4629-8dce-1423f437b7c0")));
			Select Huvudman = new Select (driver.findElement(By.id("4386ddb6-bee1-4629-8dce-1423f437b7c0")));
			Huvudman.selectByVisibleText("MAMO");

			// hemvist
			WebDriverWait wait5 = new WebDriverWait(driver, 10);
			wait5.until(ExpectedConditions.elementToBeClickable(By.id("4386ddb6-bee1-4629-8dce-1423f437b7c0_ProjectSite")));
			Select Hemvist = new Select (driver.findElement(By.id("4386ddb6-bee1-4629-8dce-1423f437b7c0_ProjectSite")));
			Hemvist.selectByVisibleText("Avdelningen K");

			// tel-nr 1
			WebDriverWait wait6 = new WebDriverWait(driver, 10);
			wait6.until(ExpectedConditions.elementToBeClickable(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_2_0")));
			driver.findElement(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_2_0")).clear();
			driver.findElement(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_2_0")).sendKeys("+467777777");

			// tel-nr 2
			WebDriverWait wait7 = new WebDriverWait(driver, 10);
			wait7.until(ExpectedConditions.elementToBeClickable(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_3_0")));
			driver.findElement(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_3_0")).clear();
			driver.findElement(By.id("e5472ec7-f898-4aa6-a552-0e780941b10b_3_0")).sendKeys("+467777777");

			// disputerad
			WebDriverWait wait8 = new WebDriverWait(driver, 10);
			wait8.until(ExpectedConditions.elementToBeClickable(By.id("a6a0f8c1-aca7-49ca-8733-b4f10aed8083")));
			Select Disp = new Select (driver.findElement(By.id("a6a0f8c1-aca7-49ca-8733-b4f10aed8083")));
			Disp.selectByVisibleText("Ja");

			// gå vidare till sektion 3 
			driver.findElement(By.linkText("3. SYFTE OCH FRÅGESTÄLLNINGAR")).click();	
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("sektion 1b är ifylld.");
	}

	@Test (dependsOnMethods={"s1b_InfoSökande"})
	public void s3_SyfteFrågeställningar() {
		//	public static WebElement s3_SyfteFrågeställningar (WebDriver driver){

		driver.findElement(By.linkText("3. SYFTE OCH FRÅGESTÄLLNINGAR")).click();	

		if (driver.getPageSource().contains("3. Syfte och frågeställningar")){

			// alla fält i sektion 3
			int size = driver.findElements(By.tagName("iframe")).size();
			//			System.out.println(size);

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
		System.out.print("sektion 3 är ifylld, ");
	}

	@Test (dependsOnMethods={"s3_SyfteFrågeställningar"})
	public void s4_Metod() throws InterruptedException {
		//	public static WebElement s4_Metod (WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("4. METOD")).click();

		if (driver.getPageSource().contains("4. Metod")){

			// alla fält i sektion 4
			int size = driver.findElements(By.tagName("iframe")).size();
			//			System.out.println(size);

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
		System.out.print("sektion 4 är ifylld, ");
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

		System.out.println("sektion 5 är ifylld.");
	}

	@Test (dependsOnMethods={"s5_Tidsplan"})
	public void s6_Datainsamling() throws InterruptedException {

		driver.findElement(By.linkText("6. DATAINSAMLING")).click();

		if (driver.getPageSource().contains("6. Datainsamling"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			//			System.out.println(size);

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

			System.out.print("Sektion 6 är ifylld, ");
		}
	}

	@Test (dependsOnMethods={"s6_Datainsamling"})
	public void s7_EtiskaÖverväganden() throws InterruptedException {

		driver.findElement(By.linkText("7. ETISKA ÖVERVÄGANDEN")).click();

		if (driver.getPageSource().contains("7. Etiska överväganden"))

		{
			int size = driver.findElements(By.tagName("iframe")).size();
			//			System.out.println(size);

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

		System.out.print("sektion 7 är ifylld, ");
	}

	@Test (dependsOnMethods={"s7_EtiskaÖverväganden"})
	public void s8_Forskningspersoner() throws InterruptedException {

		driver.findElement(By.linkText("8. FORSKNINGSPERSONER")).click();

		if (driver.getPageSource().contains("8. Forskningspersoner")){

			int size = driver.findElements(By.tagName("iframe")).size();

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

		System.out.print("sektion 8 är ifylld, ");
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

		System.out.println("sektion 9 är ifylld, sektion 10 hoppas över.");
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

		System.out.print("Sektion 11 är ifylld, ");
	}

	@Test (dependsOnMethods={"s11_BiologisktMaterial"})
	public void s12_ResultatDjurförsök() {

		driver.findElement(By.linkText("12. RESULTAT FRÅN DJURFÖRSÖK")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("44ce99dc-8830-4c6a-9980-0ffc1d18d95f")));
		Select Disp2 = new Select (driver.findElement(By.id("44ce99dc-8830-4c6a-9980-0ffc1d18d95f")));
		Disp2.selectByVisibleText("Nej");

		System.out.print("sektion 12 är ifylld, ");
	}

	@Test (dependsOnMethods={"s12_ResultatDjurförsök"})
	public void s13_RedovisningResultat() throws InterruptedException {

		driver.findElement(By.linkText("13. REDOVISNING AV RESULTAT")).click();

		if (driver.getPageSource().contains("13. Redovisning av resultat")){

			int size = driver.findElements(By.tagName("iframe")).size();

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

		System.out.print("sektion 13 är ifylld, ");
	}

	@Test (dependsOnMethods={"s13_RedovisningResultat"})
	public void s14_EkonomiskaFörhållanden() throws InterruptedException {

		String keyToSend = "Text i sektion 14";

		driver.findElement(By.linkText("14. EKONOMISKA FÖRHÅLLANDEN")).click();

		if (driver.getPageSource().contains("14. Ekonomiska förhållanden")){

			int size = driver.findElements(By.tagName("iframe")).size();

			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys(keyToSend);
			driver.switchTo().parentFrame();

			driver.switchTo().frame(1);
			driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys(keyToSend);
			driver.switchTo().parentFrame();
		}

		//		if (driver.getPageSource().contains(keyToSend)) {
		//			System.out.println("Sektion 14 är klar.");
		//		}
		//		else {
		//			Assert.fail("Saknas inmatad text.");
		//		}

		System.out.println("sektion 14 är klar.");
	}

	@Test (dependsOnMethods={"s14_EkonomiskaFörhållanden"})
	public void s15_Bilagor() throws AWTException, InterruptedException, IOException {

		String eudraCT = "2019-123456-99";

		System.out.println(ansökansKategori + " ... och nu kommer sektion 15.");
		driver.findElement(By.linkText("15. BILAGOR")).click();

		//15.1 bifoga forskningsplan - obligatorisk -- ALLA BILAGOR LADDAS UPP SIST

		// kontroll att EudraCT-nr inte finns
		if (driver.getPageSource().contains(eudraCT)) {
			System.out.println("Finns EudraCT-nr = AVVIKANDE.");
			Thread.sleep(10000);
		}
		else {
			//			Assert.fail("EudraCT har försvunnit");
			System.out.println("Finns inget EudraCT-nr. Som förväntat.");
		}

		// Frågor om bilagor: 15.2
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("9e0fb60e-cd29-4208-9561-b9c1d53e946c")));
		Select Disp = new Select (driver.findElement(By.id("9e0fb60e-cd29-4208-9561-b9c1d53e946c")));
		Disp.selectByVisibleText("Nej");
		System.out.print("wait1, ");

		// Frågor om bilagor: 15.3
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("7c0cded1-b0b0-4245-8ef6-b5e2591a07bb")));
		Select Disp2 = new Select (driver.findElement(By.id("7c0cded1-b0b0-4245-8ef6-b5e2591a07bb")));
		Disp2.selectByVisibleText("Nej");
		System.out.print("wait2, ");

		// Frågor om bilagor: 15.4
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("ff16dfd4-37a5-4f2a-9b22-d151440f0152")));
		Select Disp3 = new Select (driver.findElement(By.id("ff16dfd4-37a5-4f2a-9b22-d151440f0152")));
		Disp3.selectByVisibleText("Nej");
		System.out.println("wait3.");

		//		Fråga om läkemedel: 15.5
		//		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		//		wait4.until(ExpectedConditions.elementToBeClickable(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
		//		System.out.println("wait4");

		//		om det är en läkemedelsprövning: 
		if 
		(ansökansKategori.equalsIgnoreCase("Form02")
				|| ansökansKategori.equalsIgnoreCase("Form04")
				|| ansökansKategori.equalsIgnoreCase("Form07")){

			//	om parameter ansökanstyp==Form02, Form04 eller Form07 tar jag in kod eudraCT från anliEpmLäkemedel
			WebDriverWait wait4a = new WebDriverWait(driver, 10);
			wait4a.until(ExpectedConditions.elementToBeClickable(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
			System.out.println("wait4a = läkemedelsprövning");
			Select Disp4a = new Select (driver.findElement(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
			Disp4a.selectByVisibleText("Ja");
			System.out.print("Ansökanstyp är " + ansökansKategori);
			System.out.println(". Jag har valt Ja på läkemedelsprövning");

			// 15.5.1 EudraCT-nr in med javascript
			driverAndCommands.GetCurrentUrl.GetUrlAndPrintInConsole(driver);
			generateApplicationEPM.anliEpmLakemedel.eudraCTnr(driver);
		}

		// annars = om det inte är läkemedelsprövning
		else {
			WebDriverWait wait4 = new WebDriverWait(driver, 10);
			wait4.until(ExpectedConditions.elementToBeClickable(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
			System.out.println("wait4 = inte läkemedelsprövning");
			Select Disp4 = new Select (driver.findElement(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
			Disp4.selectByVisibleText("Nej");
			System.out.print("Ansökanstyp är " + ansökansKategori);
			System.out.println(". Jag har valt Nej på läkemedelsprövning");
		}

		// resten av bilagorna etc. 15.6
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("47bcd41a-346e-44b7-9d7a-869de0e096b3")));
		Select Disp5 = new Select (driver.findElement(By.id("47bcd41a-346e-44b7-9d7a-869de0e096b3")));
		Disp5.selectByVisibleText("Nej");
		System.out.print("wait5, ");

		// resten av bilagorna etc. 15.7
		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("78e0e3ef-49b7-4719-b492-53df1b1d65ed")));
		Select Disp6 = new Select (driver.findElement(By.id("78e0e3ef-49b7-4719-b492-53df1b1d65ed")));
		Disp6.selectByVisibleText("Nej");
		System.out.print("wait6, ");

		// resten av bilagorna etc. 15.8
		WebDriverWait wait7 = new WebDriverWait(driver, 10);
		wait7.until(ExpectedConditions.elementToBeClickable(By.id("5674d283-9e88-4ad0-9b30-0e2c8f16d7be")));
		Select Disp7 = new Select (driver.findElement(By.id("5674d283-9e88-4ad0-9b30-0e2c8f16d7be")));
		Disp7.selectByVisibleText("Nej");
		System.out.println("wait7.");

		// tillägg av alla obligatoriska bilagor
		driverAndCommands.GetCurrentUrl.GetUrlAndPrintInConsole(driver);
		generateApplicationEPM.anliEpmLakemedel.bilagorLäkemedel(driver);

		System.out.println("Sektion 15 är klar.");

		//		if (driver.getPageSource().contains(eudraCT)) {
		//			System.out.println("EudraCT är kvar.");
		//			System.out.println("Sektion 15 är klar.");
		//		}
		//		else {
		//			Assert.fail("EudraCT har försvunnit");
		//			driverAndCommands.GetCurrentUrl.GetUrlAndPrintInConsole(driver);
		//		}
	}

	@Test (dependsOnMethods={"s15_Bilagor"})
	public void KontrolleraRegistrera() throws AWTException, InterruptedException, IOException {

		String eudraCT = "2019-123456-99";

		driver.findElement(By.linkText("KONTROLLERA OCH REGISTRERA")).click();
		driverAndCommands.GetCurrentUrl.GetUrlAndPrintInConsole(driver);

		// Om texten "'15.5.1 EudraCT-nummer' krävs" finns på sidan...
		if (driver.getPageSource().contains("'15.5.1 EudraCT-nummer' krävs")){

			Assert.fail("EudraCT-numret har försvunnit.");

			// ...så går vi tillbakak till 15. Bilagor.
			//			driver.findElement(By.linkText("15. BILAGOR")).click();
			//
			//			// kontrollerar EudraCT-nr
			//			// Om EudraCT finns, tillbaka till Kontrollera och registrera. 
			//			if (driver.getPageSource().contains(eudraCT)) {
			//				System.out.println("Kontroll igen från KontrolleraRegistrera. EudraCT är kvar.");
			//
			//				driver.findElement(By.linkText("KONTROLLERA OCH REGISTRERA")).click();
			//
			//				driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			//				driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			//				driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			//			}
			//			
			//			// annars informera och pröva igen.
			//			else {
			//				System.out.println("Kontroll igen från KontrolleraRegistrera. EudraCT har försvunnit.");
			//
			//				generateApplicationEPM.anliEpmLäkemedel.eudraCTnr(driver);
			//
			//				driver.findElement(By.linkText("KONTROLLERA OCH REGISTRERA")).click();
			//
			//				driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			//				driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			//				driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			//			}
			//

			//			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			//			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			//			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
		}
		else {
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
		}
		System.out.println("KontrolleraRegistrera klar.");
	}

	@Test (dependsOnMethods={"KontrolleraRegistrera"})
	public void Register() {

		driver.findElement(By.id("confirmAcceptTermsAndConditions")).click();
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Sektion Register är klar.");
		//		System.out.println("Sista steget är bortkommenterat.");
	} 
}

