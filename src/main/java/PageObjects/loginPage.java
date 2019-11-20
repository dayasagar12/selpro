package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Initialize.base_myselpro;

public class loginPage extends base_myselpro {
	
	public WebDriver driver;
	
	public loginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//By FlightsBtn = By.xpath("//a[contains(@class,'text-center flights')]");
	By DestFld = By.xpath("//div[@id='s2id_autogen1']//a[@class='select2-choice']");
	By DestFldOpt = By.xpath("//div[contains(text(),'ai, India')]");
	By ChckInFld = By.xpath("//input[@id='checkin']");
	By ChckOtFld = By.xpath("//input[@id='checkout']");
	By SearchBtn = By.xpath("//div[@class='col-md-2 col-xs-12 o1']//button[@class='btn btn-primary btn-block'][contains(text(),'Search')]");

	
	
	

	public void searchHotel() {
		
		driver.findElement(DestFld).click();
		driver.findElement(ChckInFld).sendKeys(prop.getProperty("checkindate"));
		driver.findElement(ChckOtFld).sendKeys(prop.getProperty("checkoutdate"));
		driver.findElement(SearchBtn).click();
	
	}

	
	public void searchFlight() {
		
		
	}
	
}