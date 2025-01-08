package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends Base{
	public void simpleForm() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Aswathy");
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		WebElement valueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		valueA.sendKeys("1");
		WebElement valueB = driver.findElement(By.xpath("//input[@id='value-b']"));
		valueB.sendKeys("2");
		WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal.click();
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputForm inputForm = new InputForm();
		inputForm.initializeBrowser();
		inputForm.simpleForm();
		

	}

}
