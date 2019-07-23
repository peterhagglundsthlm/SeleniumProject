package pageElementsSAT_EPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EPM_applicationFormElements {
	private static WebElement element = null;

	//Dropdown antal forskningshuvudmän
	public static final String AntalFoHuvudman = "4ec91423-1d5a-4d03-86ed-14792a006821_select_0"; 

	public static WebElement AntalFoHuvudman(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_0"));
		return element;
	}

	//Dropdown samband med en av fo-huvudmännen
	public static final String Samband = "4ec91423-1d5a-4d03-86ed-14792a006821_select_1"; 

	public static WebElement Samband(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_1"));
		return element;
	}
	
	//Dropdown läkemedelsprövning eller ej, en fo-huvudman
	public static final String KliniskLäkemedelsprövning = "4ec91423-1d5a-4d03-86ed-14792a006821_select_1"; 

	public static WebElement KliniskLäkemedelsprövning(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_1"));
		return element;
	}

	//Dropdown läkemedelsprövning eller ej, fler fo-huvudman
	public static final String KliniskLäkemedelsprövningFler = "4ec91423-1d5a-4d03-86ed-14792a006821_select_2"; 

	public static WebElement KliniskLäkemedelsprövningFler(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_2"));
		return element;
	}
	//Dropdown endast befintliga personuppgifter eller ej, EN fo-huv
	public static final String BefintligaPersUppg = "4ec91423-1d5a-4d03-86ed-14792a006821_select_2"; 

	public static WebElement BefintligaPersupp(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_2"));
		return element;
	}		

	//Dropdown endast befintliga personuppgifter eller ej, FLERA fo-huv
	public static final String BefintligaPersuppgFler = "4ec91423-1d5a-4d03-86ed-14792a006821_select_3"; 

	public static WebElement BefintligaPersuppgFler(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_3"));
		return element;
	}		
	//Ansökanskategori, spara val: endast en fo-huvudman läkemedelsprövning
	public static final String AnsökanskategoriSparaVal = "4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_1"; 

	public static WebElement AnsökanskategoriSparaVal(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_1"));
		return element;
	}		

	//Ansökanskategori, spara val 2: endast en fo-huvudman, p-uppg ja/nej; flera fo-huvudmän läkemedelsprövning
	public static final String AnsökanskategoriSparaVal2 = "4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_2"; 

	public static WebElement AnsökanskategoriSparaVal2(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_2"));
		return element;
	}		

	//Ansökanskategori, spara val 3: flera fo-huvudmän, p-uppg ja/nej
	public static final String AnsökanskategoriSparaVal3 = "4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_3"; 

	public static WebElement AnsökanskategoriSparaVal3(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_3"));
		return element;
	}		

	//Rådgivande yttrande eller ej
	public static final String RådgivandeYttrande = "90e1b632-c222-4285-8b77-694f538357f2"; 

	public static WebElement RådgivandeYttrande(WebDriver driver){
		element = driver.findElement(By.id("90e1b632-c222-4285-8b77-694f538357f2"));
		return element;
	}

}
