package com.pom.jcpenny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase_Proceed {
	
	public  WebDriver driver;
	
	
	@FindBy(xpath = "//button[@data-automation-id='at-panel-checkout-button']")
	private WebElement proceeding;
	
	public Purchase_Proceed(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed() {
		return proceeding;
	}

	public WebElement getContinueshop() {
		return continueshop;
	}

	@FindBy(xpath = "//button[@data-automation-id='at-panel-continue-shopping-button']")
	private WebElement continueshop;
	

}
