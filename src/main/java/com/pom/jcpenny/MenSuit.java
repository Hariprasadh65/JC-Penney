package com.pom.jcpenny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenSuit {
	
	public  WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='absolute h-full max-w-full w-full PQkF_ '])[2]")
	private WebElement whitesuit;
	
	public MenSuit(WebDriver bdriver) {

	this.driver=bdriver;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getWhitesuit() {
		return whitesuit;
	}

	public WebElement getNavysuit() {
		return navysuit;
	}

	@FindBy(xpath = "//*[@id=\"gallery-product-list\"]/div/div[5]/div/ul/li[2]/div/div/div/div/div[1]/div/a/div/div/div/img")
	private WebElement navysuit;
	

}
