package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void webElementCommand()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessagefield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		showmessagefield.sendKeys("Aswathy");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String message = yourMessage.getText();
		System.out.println(message);
		showmessagefield.clear();
		String bgColor = showmessagebutton.getCssValue("background-color");
		System.out.println(bgColor);
		int xAxis = showmessagebutton.getLocation().getX();
		System.out.println(xAxis);
		int yAxis = showmessagebutton.getLocation().getY();
		System.out.println(yAxis);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.webElementCommand();
		//webelementcommands.driverCloseAndQuit();	

	}



}
