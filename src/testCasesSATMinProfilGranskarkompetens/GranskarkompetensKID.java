package testCasesSATMinProfilGranskarkompetens;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class GranskarkompetensKID extends BeforeAfterTestBrowsers {
	

	@Test
	public void LoginAsUser() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickGranskarkompetens() {

		PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens(driver).click();
	}
	
	@Test (dependsOnMethods={"ClickGranskarkompetens"})
	public void Forskningsområde1() {

		Select Forskningsområde1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde1)));
		Random randomOptionForskningsområde1 = new Random();  
		int startOptionForskningsområde1 = 1;
		int endOptionForskningsområde1 = Forskningsområde1.getOptions().size(); 
		int numberForskningsområde1 = startOptionForskningsområde1 + randomOptionForskningsområde1 .nextInt(endOptionForskningsområde1 - startOptionForskningsområde1);  
		Forskningsområde1.selectByIndex(numberForskningsområde1);

		WebElement ForskningsområdeEtt = Forskningsområde1.getFirstSelectedOption();
		String Value = ForskningsområdeEtt.getText();
		System.out.println("Forskingsområde1 = " + Value ); 

	}
	
	@Test (dependsOnMethods={"Forskningsområde1"})
	public void Forskningsområde2() {

		Select Forskningsområde2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde2)));
		Random randomOptionForskningsområde2 = new Random();  
		int startOptionForskningsområde2 = 1;
		int endOptionForskningsområde2 = Forskningsområde2.getOptions().size(); 
		int numberForskningsområde2 = startOptionForskningsområde2 + randomOptionForskningsområde2 .nextInt(endOptionForskningsområde2 - startOptionForskningsområde2);  
		Forskningsområde2.selectByIndex(numberForskningsområde2);
		
		WebElement ForskningsområdeTvå = Forskningsområde2.getFirstSelectedOption();
		String Value = ForskningsområdeTvå.getText();
		System.out.println("Forskningsområde2 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Forskningsområde2"})
	public void Forskningsområde3() {

		Select Forskningsområde3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde3)));
		Random randomOptionForskningsområde3 = new Random();  
		int startOptionForskningsområde3 = 1;
		int endOptionForskningsområde3 = Forskningsområde3.getOptions().size(); 
		int numberForskningsområde3 = startOptionForskningsområde3 + randomOptionForskningsområde3 .nextInt(endOptionForskningsområde3 - startOptionForskningsområde3);  
		Forskningsområde3.selectByIndex(numberForskningsområde3);
		
		WebElement ForskningsområdeTre = Forskningsområde3.getFirstSelectedOption();
		String Value = ForskningsområdeTre.getText();
		System.out.println("Forskningsområde3 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Forskningsområde3"})
	public void Forskningsområde4() {

		Select Forskningsområde4 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde4)));
		Random randomOptionForskningsområde4 = new Random();  
		int startOptionForskningsområde4 = 1;
		int endOptionForskningsområde4 = Forskningsområde4.getOptions().size(); 
		int numberForskningsområde4 = startOptionForskningsområde4 + randomOptionForskningsområde4 .nextInt(endOptionForskningsområde4 - startOptionForskningsområde4);  
		Forskningsområde4.selectByIndex(numberForskningsområde4);
		
		WebElement ForskningsområdeFyra = Forskningsområde4.getFirstSelectedOption();
		String Value = ForskningsområdeFyra.getText();
		System.out.println("Forskningsområde4 = " + Value ); 
		
		
	}
	
	@Test (dependsOnMethods={"Forskningsområde4"})
	public void Forskningsområde5() {

		Select Forskningsområde5 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde5)));
		Random randomOptionForskningsområde5 = new Random();  
		int startOptionForskningsområde5 = 1;
		int endOptionForskningsområde5 = Forskningsområde5.getOptions().size(); 
		int numberForskningsområde5 = startOptionForskningsområde5 + randomOptionForskningsområde5 .nextInt(endOptionForskningsområde5 - startOptionForskningsområde5);  
		Forskningsområde5.selectByIndex(numberForskningsområde5);
		
		WebElement ForskningsområdeFem = Forskningsområde5.getFirstSelectedOption();
		String Value = ForskningsområdeFem.getText();
		System.out.println("Forskningsområde5 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Forskningsområde5"})
	public void Metod1() {

		Select Metod1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod1)));
		Random randomOptionMetod1 = new Random();  
		int startOptionMetod1 = 1;
		int endOptionMetod1 = Metod1.getOptions().size(); 
		int numberMetod1 = startOptionMetod1 + randomOptionMetod1 .nextInt(endOptionMetod1 - startOptionMetod1);  
		Metod1.selectByIndex(numberMetod1);
		
		WebElement MetodEtt = Metod1.getFirstSelectedOption();
		String Value = MetodEtt.getText();
		System.out.println("Metod1 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod1"})
	public void Metod2() {

		Select Metod2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod2)));
		Random randomOptionMetod2 = new Random();  
		int startOptionMetod2 = 1;
		int endOptionMetod2 = Metod2.getOptions().size(); 
		int numberMetod2 = startOptionMetod2 + randomOptionMetod2 .nextInt(endOptionMetod2 - startOptionMetod2);  
		Metod2.selectByIndex(numberMetod2);
		
		WebElement MetodTvå = Metod2.getFirstSelectedOption();
		String Value = MetodTvå.getText();
		System.out.println("Metod2 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod2"})
	public void Metod3() {

		Select Metod3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod3)));
		Random randomOptionMetod3 = new Random();  
		int startOptionMetod3 = 1;
		int endOptionMetod3 = Metod3.getOptions().size(); 
		int numberMetod3 = startOptionMetod3 + randomOptionMetod3 .nextInt(endOptionMetod3 - startOptionMetod3);  
		Metod3.selectByIndex(numberMetod3);
		
		WebElement MetodTre = Metod3.getFirstSelectedOption();
		String Value = MetodTre.getText();
		System.out.println("Metod3 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod3"})
	public void Metod4() {

		Select Metod4 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod4)));
		Random randomOptionMetod4 = new Random();  
		int startOptionMetod4 = 1;
		int endOptionMetod4 = Metod4.getOptions().size(); 
		int numberMetod4 = startOptionMetod4 + randomOptionMetod4 .nextInt(endOptionMetod4 - startOptionMetod4);  
		Metod4.selectByIndex(numberMetod4);
		
		WebElement MetodFyra = Metod4.getFirstSelectedOption();
		String Value = MetodFyra.getText();
		System.out.println("Metod4 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod4"})
	public void Metod5() {

		Select Metod5 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod5)));
		Random randomOptionMetod5 = new Random();  
		int startOptionMetod5 = 1;
		int endOptionMetod5 = Metod5.getOptions().size(); 
		int numberMetod5 = startOptionMetod5 + randomOptionMetod5 .nextInt(endOptionMetod5 - startOptionMetod5);  
		Metod5.selectByIndex(numberMetod5);
		
		WebElement MetodFem = Metod5.getFirstSelectedOption();
		String Value = MetodFem.getText();
		System.out.println("Metod5 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod5"})
	public void Nyckelord1() {

		Select Nyckelord1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord1)));
		Random randomOptionNyckelord1 = new Random();  
		int startOptionNyckelord1 = 1;
		int endOptionNyckelord1 = Nyckelord1.getOptions().size(); 
		int numberNyckelord1 = startOptionNyckelord1 + randomOptionNyckelord1 .nextInt(endOptionNyckelord1 - startOptionNyckelord1);  
		Nyckelord1.selectByIndex(numberNyckelord1);
		
		WebElement NyckelordEtt = Nyckelord1.getFirstSelectedOption();
		String Value = NyckelordEtt.getText();
		System.out.println("Nyckelord1 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord1"})
	public void Nyckelord2() {

		Select Nyckelord2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord2)));
		Random randomOptionNyckelord2 = new Random();  
		int startOptionNyckelord2 = 1;
		int endOptionNyckelord2 = Nyckelord2.getOptions().size(); 
		int numberNyckelord2 = startOptionNyckelord2 + randomOptionNyckelord2 .nextInt(endOptionNyckelord2 - startOptionNyckelord2);  
		Nyckelord2.selectByIndex(numberNyckelord2);
		
		WebElement NyckelordTvå = Nyckelord2.getFirstSelectedOption();
		String Value = NyckelordTvå.getText();
		System.out.println("Nyckelord2 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord2"})
	public void Nyckelord3() {

		Select Nyckelord3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord3)));
		Random randomOptionNyckelord3 = new Random();  
		int startOptionNyckelord3 = 1;
		int endOptionNyckelord3 = Nyckelord3.getOptions().size(); 
		int numberNyckelord3 = startOptionNyckelord3 + randomOptionNyckelord3 .nextInt(endOptionNyckelord3 - startOptionNyckelord3);  
		Nyckelord3.selectByIndex(numberNyckelord3);
		
		WebElement NyckelordTre = Nyckelord3.getFirstSelectedOption();
		String Value = NyckelordTre.getText();
		System.out.println("Nyckelord3 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord3"})
	public void Nyckelord4() {

		Select Nyckelord4 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord4)));
		Random randomOptionNyckelord4 = new Random();  
		int startOptionNyckelord4 = 1;
		int endOptionNyckelord4 = Nyckelord4.getOptions().size(); 
		int numberNyckelord4 = startOptionNyckelord4 + randomOptionNyckelord4 .nextInt(endOptionNyckelord4 - startOptionNyckelord4);  
		Nyckelord4.selectByIndex(numberNyckelord4);
		
		WebElement NyckelordFyra = Nyckelord4.getFirstSelectedOption();
		String Value = NyckelordFyra.getText();
		System.out.println("Nyckelord4 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord4"})
	public void Nyckelord5() {

		Select Nyckelord5 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord5)));
		Random randomOptionNyckelord5 = new Random();  
		int startOptionNyckelord5 = 1;
		int endOptionNyckelord5 = Nyckelord5.getOptions().size(); 
		int numberNyckelord5 = startOptionNyckelord5 + randomOptionNyckelord5 .nextInt(endOptionNyckelord5 - startOptionNyckelord5);  
		Nyckelord5.selectByIndex(numberNyckelord5);
		
		WebElement NyckelordFem = Nyckelord5.getFirstSelectedOption();
		String Value = NyckelordFem.getText();
		System.out.println("Nyckelord5 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord5"})
	public void Spara() {
		
		PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDSpara(driver).click();
	}
	
	@Test (dependsOnMethods={"Spara"})
	public void ConfirmSave() {
		
		driver.switchTo().alert().accept();
	}
	
	
}