package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.Searchbarui;

public class PageObjectsearchBar extends Searchbarui{

	public WebDriver driver;
		
	public PageObjectsearchBar(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getSearchBar() {
		return driver.findElement(clickSearch);
	}
	
	public WebElement getProduct() {
		return driver.findElement(clickPro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(clickAdd);
	}
	
	public WebElement getCheckout() {
		return driver.findElement(clickCheck);
	}
}
