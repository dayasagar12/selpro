package PageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Initialize.base_myselpro;

public class loginPage extends base_myselpro {
	
	public WebDriver driver;
	
	public loginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//HOTEL XPATH
	By DestFld = By.xpath("//div[@id='s2id_autogen1']//a[@class='select2-choice']");
	By DestFldOpt = By.xpath("//div[contains(text(),'ai, India')]");
	By ChckInFld = By.xpath("//input[@id='checkin']");
	By ChckOtFld = By.xpath("//input[@id='checkout']");
	By SearchBtn = By.xpath("//div[@class='col-md-2 col-xs-12 o1']//button[@class='btn btn-primary btn-block'][contains(text(),'Search')]");

	//Flight XPATH
	
	By FlightsBtn = By.xpath("//a[contains(text(),'Flights')]");
	By FromOpt = By.xpath("//div[@id='s2id_location_from']//a[contains(@class,'select2-choice')]");
	By ToOpt = By.xpath("//div[@id='s2id_location_to']//a[contains(@class,'select2-choice')]");
	By DepartDate = By.xpath("//input[@id='FlightsDateStart']");
	By SelctDate = By.xpath("//div[contains(@class,'datepicker--cell datepicker--cell-day -selected-')]");
	By FlightSearchBtn = By.xpath("//div[contains(@class,'col-xs-12 col-md-1')]//button[contains(@class,'btn-primary btn btn-block')][contains(text(),'Search')]");

	public void searchHotel() throws IOException {
		
		WebDriverWait wd = new WebDriverWait(driver, 10);
		wd.until(ExpectedConditions.elementToBeClickable(DestFld)).click();
		wd.until(ExpectedConditions.elementToBeClickable(DestFld)).sendKeys("Chennai");
		wd.until(ExpectedConditions.elementToBeClickable(DestFld)).sendKeys(Keys.DOWN);
		wd.until(ExpectedConditions.elementToBeClickable(DestFld)).sendKeys(Keys.ENTER);
		wd.until(ExpectedConditions.elementToBeClickable(DestFld)).sendKeys(Keys.TAB);
		wd.until(ExpectedConditions.elementToBeClickable(ChckInFld)).click();
		wd.until(ExpectedConditions.elementToBeClickable(ChckInFld)).sendKeys("23/12/2019");
		wd.until(ExpectedConditions.elementToBeClickable(ChckOtFld)).click();
		wd.until(ExpectedConditions.elementToBeClickable(ChckOtFld)).sendKeys("28/12/2019");
		wd.until(ExpectedConditions.elementToBeClickable(SearchBtn)).click();

	}

	
	public void searchFlight() {
		
		WebDriverWait wd = new WebDriverWait(driver,10);
		wd.until(ExpectedConditions.elementToBeClickable(FlightsBtn)).click();
		wd.until(ExpectedConditions.elementToBeClickable(FromOpt)).click();
		wd.until(ExpectedConditions.elementToBeClickable(FromOpt)).sendKeys("Chennai");
		wd.until(ExpectedConditions.elementToBeClickable(FromOpt)).sendKeys(Keys.DOWN);
		wd.until(ExpectedConditions.elementToBeClickable(FromOpt)).sendKeys(Keys.ENTER);
		wd.until(ExpectedConditions.elementToBeClickable(FromOpt)).sendKeys(Keys.TAB);

		wd.until(ExpectedConditions.elementToBeClickable(ToOpt)).click();
		wd.until(ExpectedConditions.elementToBeClickable(ToOpt)).sendKeys("Bangalore");
		wd.until(ExpectedConditions.elementToBeClickable(ToOpt)).sendKeys(Keys.DOWN);
		wd.until(ExpectedConditions.elementToBeClickable(ToOpt)).sendKeys(Keys.ENTER);
		wd.until(ExpectedConditions.elementToBeClickable(ToOpt)).sendKeys(Keys.TAB);
		wd.until(ExpectedConditions.elementToBeClickable(DepartDate)).click();		
		wd.until(ExpectedConditions.elementToBeClickable(SelctDate)).click();
		wd.until(ExpectedConditions.elementToBeClickable(FlightSearchBtn)).click();

	
	}
		
	}
