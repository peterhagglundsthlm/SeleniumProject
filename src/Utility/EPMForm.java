package Utility;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;



public class EPMForm extends BeforeAfterTestBrowsers {

	@Test
	public void Utlysning() {
		driver.get("https://testaprismaepm.vr.se/EthicalReviewUniqueKeyRow"); 
	}


	@Test (dependsOnMethods={"Utlysning"})
	public void AnsökanOmEtikPrövning() {
		driver.get("https://testaprismaepm.vr.se/EthicalReviewUniqueKeyRow"); 
	}

	@Test (dependsOnMethods={"Utlysning"})
	public void NyAnsökan() {
		driver.findElement(By.xpath("//*[@id=\"UniqueKeyRowGrid\"]/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();
	}

	@Test (dependsOnMethods={"NyAnsökan"})
	public void Projekttitel() {

		String Projekttitel = "Automatansökan";
		driver.findElement(By.id("ProjectTitleSV")).sendKeys(Projekttitel);

		if (driver.findElement(By.id("ProjectTitleSV")).getAttribute("value") != Projekttitel);

		{
			driver.findElement(By.id("ProjectTitleSV")).clear();
			driver.findElement(By.id("ProjectTitleSV")).sendKeys(Projekttitel);
		}
	}

	@Test (dependsOnMethods={"Projekttitel"})
	public void SkapaEtikprövning() {

		driver.findElement(By.id("Submitter")).click();
	}

	@Test (dependsOnMethods={"SkapaEtikprövning"})
	public void BytFokusTillFormulär() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

	}

	@Test (dependsOnMethods={"BytFokusTillFormulär"})
	public void SelectPage1() {

		if (driver.getPageSource().contains("Utkast"))

		{
			Select Forskningshuvudmän = new Select (driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_0")));
			Forskningshuvudmän.selectByVisibleText("En");

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_1")));
			Select KliniskBlabla = new Select (driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_1")));
			KliniskBlabla.selectByVisibleText("Ja");

			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			wait2.until(ExpectedConditions.elementToBeClickable(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_1")));
			driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_1")).click();

			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.elementToBeClickable(By.id("90e1b632-c222-4285-8b77-694f538357f2")));
			Select RådGivande = new Select (driver.findElement(By.id("90e1b632-c222-4285-8b77-694f538357f2")));
			RådGivande.selectByVisibleText("Nej");

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

	@Test (dependsOnMethods={"SelectPage1"})
	public void Page2() {

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


	@Test (dependsOnMethods={"Page2"})
	public void Page3() throws InterruptedException {

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

	@Test (dependsOnMethods={"Page3"})
	public void Page4() {

		driver.findElement(By.linkText("5. TIDSPLAN")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("bec9bcbd-e842-4c6b-9d80-d8b2d8f57166")));
		driver.findElement(By.id(("bec9bcbd-e842-4c6b-9d80-d8b2d8f57166"))).sendKeys("2019-01-01");

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("ae03f2c5-e9e9-4fba-b546-2d23707ae13f")));
		driver.findElement(By.id(("ae03f2c5-e9e9-4fba-b546-2d23707ae13f"))).sendKeys("2019-12-31");

	}

	@Test (dependsOnMethods={"Page4"})
	public void Page5() throws InterruptedException {

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

	@Test (dependsOnMethods={"Page5"})
	public void Page6() throws InterruptedException {

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

	@Test (dependsOnMethods={"Page6"})
	public void Page7() throws InterruptedException {

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

	@Test (dependsOnMethods={"Page7"})
	public void Page8() {

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

	@Test (dependsOnMethods={"Page8"})
	public void Page9() {

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

	@Test (dependsOnMethods={"Page9"})
	public void Page10() {

		driver.findElement(By.linkText("12. RESULTAT FRÅN DJURFÖRSÖK")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("44ce99dc-8830-4c6a-9980-0ffc1d18d95f")));
		Select Disp2 = new Select (driver.findElement(By.id("44ce99dc-8830-4c6a-9980-0ffc1d18d95f")));
		Disp2.selectByVisibleText("Nej");
	}

	@Test (dependsOnMethods={"Page10"})
	public void Page11() throws InterruptedException {

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

	@Test (dependsOnMethods={"Page11"})
	public void Page12() throws InterruptedException {

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

	@Test (dependsOnMethods={"Page12"})
	public void Page13() {

		driver.findElement(By.linkText("15. BILAGOR")).click();

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

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
		Select Disp4 = new Select (driver.findElement(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
		Disp4.selectByVisibleText("Nej");

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

	@Test (dependsOnMethods={"Page13"})
	public void FileUpload1() throws InterruptedException, IOException {

		driver.findElement(By.id("select-file")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\krkl\\Desktop\\FileUpload.exe");
		Thread.sleep(3000);

	}

	@Test (dependsOnMethods={"FileUpload1"})
	public void AcceptTerms() {

		driver.findElement(By.linkText("KONTROLLERA OCH REGISTRERA")).click();

		if (driver.getPageSource().contains("Registrera ansökan"))

		{
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();	
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
			driver.findElement(By.id("AcceptedTermsAndConditions")).click();
		}
		else {
			Assert.fail();
		}
	}

	@Test (dependsOnMethods={"AcceptTerms"})
	public void Register() {

		driver.findElement(By.id("confirmAcceptTermsAndConditions")).click();
		WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

	}
}








