package com.pom.jcpenny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	public  WebDriver driver;
	
	@FindBy(xpath = "(//button[@id='alternate-FPAC-on-cart'])[2]")
	private WebElement bestCoupon;
	
	public Cart_Page(WebDriver adriver) {
		this.driver=adriver;
		PageFactory.initElements(driver, this);
	
	
	}

	public WebElement getBestCoupon() {
		return bestCoupon;
	}

	public WebElement getCouponApply() {
		return couponApply;
	}

	public WebElement getCharityCheck() {
		return charityCheck;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement couponApply;
	
	@FindBy(xpath = "(//span[@class='roundUpCharityLabel'])[1]")
	private WebElement charityCheck;
	
	@FindBy(xpath = "(//button[@id='checkoutButton'])[1]")
	private WebElement checkout;
	
	

}
