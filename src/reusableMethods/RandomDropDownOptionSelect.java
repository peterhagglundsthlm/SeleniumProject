package reusableMethods;

import java.util.Random;

import org.openqa.selenium.support.ui.Select;

public class RandomDropDownOptionSelect {
	static int number;

	public static Select RandomOptionInDropDown (Select NameOfFirstDropDown, int StartFromValue, int SubtractFromMax) {

		Random randomOption = new Random();  
		int startOption = StartFromValue;
		int endOption = NameOfFirstDropDown.getOptions().size(); 
		number = startOption + randomOption.nextInt(endOption - SubtractFromMax - startOption);  
		NameOfFirstDropDown.selectByIndex(number);
		return NameOfFirstDropDown;
	}

	public static void RandomOptionInDropdownPreviousDropDownPlusOne(Select NameofSecondDropDown) {
		
		NameofSecondDropDown.selectByIndex(number +1 );
		
	}
}
