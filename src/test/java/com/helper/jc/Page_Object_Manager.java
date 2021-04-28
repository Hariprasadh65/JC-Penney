package com.helper.jc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.jcpenny.Cart_Page;
import com.pom.jcpenny.Home_Page;
import com.pom.jcpenny.Homedeals_Shopping;
import com.pom.jcpenny.MenSuit;
import com.pom.jcpenny.Mensuit_Shopping;
import com.pom.jcpenny.Purchase_Proceed;

public class Page_Object_Manager {

	public WebDriver driver;
	
	private Cart_Page cart;
	
	public Page_Object_Manager(WebDriver adriver) {

		this.driver=adriver;
		PageFactory.initElements(driver, this);
	
	}

	public Cart_Page getCart() {
		
		cart= new Cart_Page(driver);
		return cart;
		
	}

	public Home_Page getHome() {
		
		home= new Home_Page(driver);
		return home;
	}

	public Homedeals_Shopping getHomedeals() {
		
		homedeals = new Homedeals_Shopping(driver);
		return homedeals;
	}

	public Mensuit_Shopping getMensuit() {
	
		mensuit = new Mensuit_Shopping(driver);
		return mensuit;
	}

	public MenSuit getMen() {
		men = new MenSuit(driver);
		return men;
	}

	public Purchase_Proceed getProceed() {
		
		proceed = new Purchase_Proceed(driver);
		return proceed;
	}

	private Home_Page home;
	
	private Homedeals_Shopping homedeals;
	
	private Mensuit_Shopping mensuit;
	
	private MenSuit men;
	
	private Purchase_Proceed proceed;
	
	}


	

