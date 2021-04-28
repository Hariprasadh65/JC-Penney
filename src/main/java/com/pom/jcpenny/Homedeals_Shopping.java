package com.pom.jcpenny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homedeals_Shopping {

	public  WebDriver driver;
	
	
	@FindBy(xpath = "//img[@title='Curtains']")
	private WebElement curtains;
	
	public Homedeals_Shopping(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getCurtains() {
		return curtains;
	}

	public WebElement getBedding() {
		return bedding;
	}

	public WebElement getBath() {
		return bath;
	}

	public WebElement getFlowercurtain() {
		return flowercurtain;
	}

	@FindBy(xpath = "//img[@title='Bedding']")
	private WebElement bedding;
	
	@FindBy(xpath = "//img[@title='Bath']")
	private WebElement bath;
	
	@FindBy(xpath = "(//div[@class='absolute h-full max-w-full w-full PQkF_ '])[44]")
	private WebElement flowercurtain;
	
	
	
}
