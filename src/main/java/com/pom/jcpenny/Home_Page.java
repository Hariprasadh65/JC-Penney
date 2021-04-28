package com.pom.jcpenny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public  WebDriver driver;
	
	
	public Home_Page(WebDriver adriver) {

		this.driver=adriver;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getHomedeals() {
		return homedeals;
	}

	public WebElement getJewel() {
		return jewel;
	}

	@FindBy(id="menu-item-link-4")
	private WebElement men;
	
	@FindBy(xpath = "//img[@title='Deals for Home']")
	private WebElement homedeals;
	
	@FindBy(xpath = "//img[@title='Jewelry']")
	private WebElement jewel;
	
	@FindBy(xpath = "//img[@title='Outdoor']")
	private WebElement outdoorfurniture;
	
	@FindBy(xpath = "(//img[@loading='lazy'])[17]")
	private WebElement mensuit;
	

	public WebElement getMensuit() {
		return mensuit;
	}

	public WebElement getOutdoorfurniture() {
		return outdoorfurniture;
	}

	@FindBy(xpath = "(//h4[@id='sub-menu-level2:1'])[2]")
	private WebElement homedecor;


	public WebElement getHomedecor() {
		return homedecor;
	}
	
	

}
