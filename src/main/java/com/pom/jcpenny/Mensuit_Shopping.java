package com.pom.jcpenny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mensuit_Shopping {
	
	public  WebDriver driver;

	@FindBy(xpath = "(//button[@class='_2Pxt1 _1FNYS'])[2]")
	private WebElement leng;
	
	public Mensuit_Shopping(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getLeng() {
		return leng;
	}

	public WebElement getChest() {
		return chest;
	}

	public WebElement getChart1() {
		return chart1;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getChart2() {
		return chart2;
	}

	public WebElement getVest() {
		return vest;
	}

	public WebElement getChart3() {
		return chart3;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	@FindBy (xpath = "(//button[@class='_2Pxt1 _1FNYS'])[5]")
	private WebElement chest;
	
	@FindBy (xpath = "(//select[@name='quantity'])[1]")
	private WebElement chart1;
	
	@FindBy(xpath = "//select[@name='size']")
	private WebElement size;
	
	@FindBy(xpath = "(//select[@name='quantity'])[2]")
	private WebElement chart2;
	
	@FindBy(xpath = "(//button[@class='_2Pxt1 _1FNYS'])[12]")
	private WebElement vest;
	
	@FindBy(xpath = "(//select[@name='quantity'])[3]")
	private WebElement chart3;
	
	@FindBy(xpath = "(//button[@type='button'])[25]")
	private WebElement addcart;
	
	
	
		
}

