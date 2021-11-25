package com.Comprehensive1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comprehensive1.uiStore.GiftCardui;

public class PageObjectgiftCard extends GiftCardui{
	
	public  WebDriver driver;
	
	public PageObjectgiftCard(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickGift() {
		return driver.findElement(clickGift);
	}
	
	public WebElement getClickMoney() {
		return driver.findElement(clickM);
	}
	
	public WebElement getClickAddtoBag() {
		return driver.findElement(clickAdd);
	}

}
