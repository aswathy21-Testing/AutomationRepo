package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base{
	
	public void handlingDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(dropDown1);
		select.selectByIndex(2);//to choose first option from dropdown
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown dropDown = new DropDown();
		dropDown.initializeBrowser();
		dropDown.handlingDropDown();
		//dropDown.driverCloseAndQuit();
		

	}

}
